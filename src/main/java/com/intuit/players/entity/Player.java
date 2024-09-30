package com.intuit.players.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @Column(name = "player_id")
    private String playerId;

    @Column(name = "birth_year")
    private String birthYear;

    @Column(name = "birth_month")
    private String birthMonth;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "birth_country")
    private String birthCountry;

    @Column(name = "birth_state")
    private String birthState;

    @Column(name = "birth_city")
    private String birthCity;

    @Column(name = "death_year")
    private String deathYear;

    @Column(name = "death_month")
    private String deathMonth;

    @Column(name = "death_day")
    private String deathDay;

    @Column(name = "death_country")
    private String deathCountry;

    @Column(name = "death_state")
    private String deathState;

    @Column(name = "death_city")
    private String deathCity;

    @Column(name = "name_first")
    private String nameFirst;

    @Column(name = "name_last")
    private String nameLast;

    @Column(name = "name_given")
    private String nameGiven;

    @Column(name = "weight")
    private String weight;

    @Column(name = "height")
    private String height;

    @Column(name = "bats")
    private String bats;

    @Column(name = "throws")
    private String throwingArm;

    @Column(name = "debut")
    private String debut;

    @Column(name = "final_game")
    private String finalGame;

    @Column(name = "retro_id")
    private String retroID;

    @Column(name = "bbref_id")
    private String bbrefID;
}
