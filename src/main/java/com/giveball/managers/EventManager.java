package com.giveball.managers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.giveball.dao.EventDao;
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
    EventDao eventDao;

    @Autowired
    public EventManager(ServletContext context, ObjectMapper mapper, EventDao eventDao) {
        this.context = context;
        this.mapper = mapper;
        this.eventDao = eventDao;
    }

    public List<Object> getUsers() {
        try {
            EventList events = mapper.readValue(new File(context.getRealPath("/events.json")), EventList.class);
//            eventDao.getEvents();


            return events.getEvents();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
