package com.intuit.players.service;

import com.intuit.players.entity.Player;
import com.intuit.players.repository.PlayerRepository;
import com.intuit.players.service.exception.PlayerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerById(String playerId) {
        return playerRepository.findById(playerId).orElseThrow(() -> new PlayerNotFoundException(playerId));
    }
}
