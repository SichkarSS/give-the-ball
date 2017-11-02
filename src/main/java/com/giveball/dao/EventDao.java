package com.giveball.dao;

import com.giveball.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
@Component
public class EventDao {

    @Autowired
    private DataSource dataSource;

    public List getEvents() {
        ArrayList<Event> output = new ArrayList<Event>();

        try (Connection connection = dataSource.getConnection()) {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT e.id, e.name, t.name as type, p.photo, e.min_num_particip, e.max_num_particip, e.description, d.date, e.demands " +
                    "FROM events as e " +
                    "LEFT JOIN type as t ON e.type_id = t.id " +
                    "LEFT JOIN date as d on e.date_id = d.id " +
                    "LEFT JOIN picture as p ON e.picture_id = p.id"
            );

            while (rs.next()) {
                long id = rs.getLong("id");
                String title = rs.getString("name");
                String description = rs.getString("description");
                Timestamp date = rs.getTimestamp("date");
                int allPeopleNumber = rs.getInt("min_num_particip");
                int  bookedPeopleNumber = rs.getInt("max_num_particip");
                String type = rs.getString("type");
                String adress = rs.getString("demands");

                Event event = new Event(id, title, type, date.toLocalDateTime().toString(), allPeopleNumber, bookedPeopleNumber, adress, description);
                output.add(event);
            }

            return output;
        } catch (Exception e) {
            System.err.println(e);
            return output;
        }
    }
}
