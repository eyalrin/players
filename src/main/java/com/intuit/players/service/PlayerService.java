package com.intuit.players.service;

import com.intuit.players.entity.PlayerEntity;

import java.util.List;

public interface PlayerService {

    List<PlayerEntity> getAllPlayers();

    PlayerEntity getPlayerById(String playerId);
}
