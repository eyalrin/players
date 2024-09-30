create table players
(
    player_id VARCHAR(300) PRIMARY KEY,
    birth_year INTEGER DEFAULT NULL,
    birth_month INTEGER DEFAULT NULL,
    birth_day INTEGER DEFAULT NULL,
    birth_country VARCHAR(300) DEFAULT NULL,
    birth_state VARCHAR(300) DEFAULT NULL,
    birth_city VARCHAR(300) DEFAULT NULL,
    death_year INTEGER DEFAULT NULL,
    death_month INTEGER DEFAULT NULL,
    death_day INTEGER DEFAULT NULL,
    death_country VARCHAR(300) DEFAULT NULL,
    death_state VARCHAR(300) DEFAULT NULL,
    death_city VARCHAR(300) DEFAULT NULL,
    name_first VARCHAR(300) DEFAULT NULL,
    name_last VARCHAR(300) DEFAULT NULL,
    name_given VARCHAR(300) DEFAULT NULL,
    weight INTEGER DEFAULT NULL,
    height INTEGER DEFAULT NULL,
    bats VARCHAR(300) DEFAULT NULL,
    throws VARCHAR(300) DEFAULT NULL,
    debut DATE DEFAULT NULL,
    final_game DATE DEFAULT NULL,
    retro_id VARCHAR(300) DEFAULT NULL,
    bbref_id VARCHAR(300) DEFAULT NULL
);