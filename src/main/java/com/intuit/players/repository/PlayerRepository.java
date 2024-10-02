package com.intuit.players.repository;

import com.intuit.players.entity.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository<T, ID>  {

    Optional<T> findById(ID id);

    List<T> findAll();
}
