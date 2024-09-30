package com.intuit.players.service;

import com.intuit.players.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    Player getPlayerById(String playerId);
}
