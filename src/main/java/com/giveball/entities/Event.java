package com.giveball.entities;

/**
 * Created by stepan.sichkar on 10/31/2017.
 */
public class Event {
    private String id;
    private String title;
    private String type;
    private String date;
    private String allPeopleNumber;
    private String bookedPeopleNumber;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAllPeopleNumber() {
        return allPeopleNumber;
    }

    public void setAllPeopleNumber(String allPeopleNumber) {
        this.allPeopleNumber = allPeopleNumber;
    }

    public String getBookedPeopleNumber() {
        return bookedPeopleNumber;
    }

    public void setBookedPeopleNumber(String bookedPeopleNumber) {
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

    private String description;
}
