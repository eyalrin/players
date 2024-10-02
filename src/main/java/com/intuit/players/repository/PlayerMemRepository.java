package com.intuit.players.repository;

import com.intuit.players.entity.Player;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.Repository;

import java.io.FileReader;
import java.util.*;

@org.springframework.stereotype.Repository
@Qualifier("PlayerMemRepository")
public class PlayerMemRepository implements Repository<Player, String>, PlayerRepository<Player, String> {

    private final Map<String, Player> players;

    public PlayerMemRepository() {
        this.players = new HashMap<>();

        String path = Objects.requireNonNull(this.getClass().getResource("/player.csv")).getPath();

        int lineNum = 0;
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(path)).withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS).withSkipLines(1).build()) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                lineNum++;

                if (lineInArray.length < 24) {
                    System.out.println("PlayerMemRepository: Invalid record on line " + lineNum);
                    continue;
                }

                Player player = Player.builder()
                        .playerId(lineInArray[0])
                        .birthYear(lineInArray[1])
                        .birthMonth(lineInArray[2])
                        .birthDay(lineInArray[3])
                        .birthCountry(lineInArray[4])
                        .birthState(lineInArray[5])
                        .birthCity(lineInArray[6])
                        .deathYear(lineInArray[7])
                        .deathMonth(lineInArray[8])
                        .deathDay(lineInArray[9])
                        .deathCountry(lineInArray[10])
                        .deathState(lineInArray[11])
                        .deathCity(lineInArray[12])
                        .nameFirst(lineInArray[13])
                        .nameLast(lineInArray[14])
                        .nameGiven(lineInArray[15])
                        .weight(lineInArray[16])
                        .height(lineInArray[17])
                        .bats(lineInArray[18])
                        .throwingArm(lineInArray[19])
                        .debut(lineInArray[20])
                        .finalGame(lineInArray[21])
                        .retroId(lineInArray[22])
                        .bbrefId(lineInArray[23])
                        .build();

                this.players.put(player.getPlayerId(), player);
            }
        } catch (Exception e) {
            System.out.println("PlayerMemRepository: lineNum is " + lineNum);
            throw new RuntimeException(e);
        }

        System.out.println("PlayerMemRepository: Processed " + lineNum + " records, created " + this.players.size() + " players");
    }

    public Optional<Player> findById(String playerId) {
        Player player = players.get(playerId);

        if (player == null) {
            return Optional.empty();
        }

        return Optional.of(player);
    }

    public List<Player> findAll() {
        return new ArrayList<>(players.values());
    }
}
