package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultMapper implements RowMapper<Signal> {

    @Override
    public Signal mapRow(ResultSet rs, int rowNum) throws SQLException {
        Signal s = new Signal();
        s.setId(rs.getString("id"));
        s.setSignal(rs.getBoolean("signal"));
        s.setTimestamp(rs.getTimestamp("timestamp"));
        return s;
    }
}
