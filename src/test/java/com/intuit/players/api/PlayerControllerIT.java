package com.intuit.players.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPlayerById() throws Exception {
        // Arrange
        String playerId = "abernbi01";

        // Act
        ResultActions result = mockMvc.perform(get("/api/player/{id}", playerId));

        // Assert
        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.playerId").value(playerId))
                .andExpect(jsonPath("$.nameGiven").value("William Edward"));
    }

    @Test
    public void testGetPlayerById_Fail() throws Exception {
        // Arrange
        String playerId = "ggggggg";

        // Act
        ResultActions result = mockMvc.perform(get("/api/player/{id}", playerId));

        // Assert
        result.andExpect(status().is4xxClientError());
    }

    @Test
    public void testGetPlayers() throws Exception {
        // Act
        ResultActions result = mockMvc.perform(get("/api/player"));

        // Assert
        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
