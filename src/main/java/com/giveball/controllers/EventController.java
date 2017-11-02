package com.giveball.controllers;

import com.giveball.entities.Event;
import com.giveball.managers.EventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
@RestController
public class EventController {

    @Autowired
    EventManager manager;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Object> getAllUsers() {

        List<Object> events = manager.getUsers();

        return events;
    }
}
