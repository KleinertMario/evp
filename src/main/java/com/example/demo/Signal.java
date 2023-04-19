package com.example.demo;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Signal {
    private String id;
    private boolean signal;
    private Timestamp timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSignal() {
        return signal;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Signal(String id, boolean signal, Timestamp timestamp) {
        this.id = id;
        this.signal = signal;
        this.timestamp = timestamp;
    }
    public Signal() {
    }
}
