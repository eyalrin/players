package com.intuit.players.service;

import com.intuit.players.entity.PlayerEntity;
import com.intuit.players.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public PlayerEntity getPlayerById(String playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }
}
