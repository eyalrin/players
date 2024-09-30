package com.intuit.players.api;

import com.intuit.players.entity.Player;
import com.intuit.players.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

//    @GetMapping
//    public ResponseEntity<List<Player>> getAllPlayers() {
//        List<Player> allPlayers = playerService.getAllPlayers();
//        return new ResponseEntity<>(allPlayers, HttpStatus.OK);
//
//    }
//
//    @GetMapping("/{playerId}")
//    public ResponseEntity<Player> getPlayerById(@PathVariable String playerId) {
//        Player player = playerService.getPlayerById(playerId);
//        return new ResponseEntity<>(player, HttpStatus.OK);
//    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();

    }

    @GetMapping("/{playerId}")
    public Player getPlayerById(@PathVariable String playerId) {
        return playerService.getPlayerById(playerId);
    }
}
