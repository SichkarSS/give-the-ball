package com.giveball.managers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.giveball.entities.Event;
import com.giveball.entities.EventList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
@Component
public class EventManager {
    ServletContext context;
    ObjectMapper mapper;

    @Autowired
    public EventManager(ServletContext context, ObjectMapper mapper) {
        this.context = context;
        this.mapper = mapper;
    }

    public List<Event> getUsers() {
        try {
            EventList events = mapper.readValue(new File(context.getRealPath("/events.json")), EventList.class);

            return events.getEvents();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
