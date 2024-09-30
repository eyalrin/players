package com.intuit.players.service.exception;

public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(String playerId) {
        super("Player with id " + playerId + " not found");
    }
}
