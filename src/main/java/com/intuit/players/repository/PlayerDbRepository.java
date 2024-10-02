package com.intuit.players.repository;

import com.intuit.players.entity.Player;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
@Qualifier("PlayerDbRepository")
public interface PlayerDbRepository extends JpaRepository<Player, String>, PlayerRepository<Player, String> {

}
