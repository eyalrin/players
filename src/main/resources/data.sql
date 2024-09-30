INSERT INTO players(player_id, birth_year, birth_month, birth_day, birth_country, birth_state, birth_city, death_year, death_month, death_day, death_country, death_state, death_city, name_first, name_last, name_given, weight, height, bats, throws, debut, final_game, retro_id, bbref_id)
SELECT "playerID" ,
       "birthYear" ,
       "birthMonth",
       "birthDay",
       "birthCountry",
       "birthState",
       "birthCity",
       "deathYear",
       "deathMonth",
       "deathDay",
       "deathCountry",
       "deathState",
       "deathCity",
       "nameFirst",
       "nameLast",
       "nameGiven",
       "weight",
       "height",
       "bats",
       "throws",
       "debut",
       "finalGame",
       "retroID",
       "bbrefID"
FROM CSVREAD( 'classpath:/player.csv', NULL, 'charset=UTF-8 fieldSeparator=,');