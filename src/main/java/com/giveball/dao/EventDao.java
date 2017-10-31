package com.giveball.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
@Component
public class EventDao {

    @Autowired
    private DataSource dataSource;

    public String getEvents() {
        try (Connection connection = dataSource.getConnection()) {
            Statement stmt = connection.createStatement();
//            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
//            stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
            ResultSet rs = stmt.executeQuery("SELECT * FROM tables");

            ArrayList<String> output = new ArrayList<String>();
            while (rs.next()) {
                output.add("Read from DB: " + rs.getTimestamp("tick"));
            }

//            model.put("records", output);
            return "db";
        } catch (Exception e) {

            return "error";
        }
    }
}
