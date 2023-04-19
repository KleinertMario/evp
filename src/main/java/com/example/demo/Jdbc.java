package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Jdbc {
    JdbcTemplate jdbcTemplate;
    ArrayList<UUID> ids = new ArrayList<>();
    ArrayList<Signal> signale = new ArrayList<>();

    public void insertIntoDatabase(boolean signal){
        UUID uuid = UUID.randomUUID();
        jdbcTemplate.update("""
                INSERT INTO Signale (id,signal, timestamp) VALUES(?,?,?""",
                uuid, signal, LocalDate.now());
        ids.add(uuid);
    }
    public ArrayList<Signal> getFromDatabase(){
        for(int i = 0; i<ids.size(); i++){
            var query = "SELECT * FROM Signal WHERE id='" + ids.get(i) + "'";
            signale.add(jdbcTemplate.queryForObject(query, Signal.class));
        }
        return signale;
    }

    public void deleteStuff(){
        jdbcTemplate.execute("""
                DELETE * FROM Signal""");
        ids = new ArrayList<>();
        signale = new ArrayList<>();
    }
}
