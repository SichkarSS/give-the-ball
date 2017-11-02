package com.giveball.entities;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
public class Event {
    private long id;
    private String title;
    private String type;
    private String date;
    private int allPeopleNumber;
    private int bookedPeopleNumber;
    private String address;
    private String description;

    public Event(long id, String title, String type, String date, int allPeopleNumber, int bookedPeopleNumber, String address, String description) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.date = date;
        this.allPeopleNumber = allPeopleNumber;
        this.bookedPeopleNumber = bookedPeopleNumber;
        this.address = address;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAllPeopleNumber() {
        return allPeopleNumber;
    }

    public void setAllPeopleNumber(int allPeopleNumber) {
        this.allPeopleNumber = allPeopleNumber;
    }

    public int getBookedPeopleNumber() {
        return bookedPeopleNumber;
    }

    public void setBookedPeopleNumber(int bookedPeopleNumber) {
        this.bookedPeopleNumber = bookedPeopleNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
