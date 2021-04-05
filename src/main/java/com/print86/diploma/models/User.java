package com.print86.diploma.models;

public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    private int id;

    public User(int id, String name, String surname, String contactNumber, String eMail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
        this.eMail = eMail;
    }

    private String name;
    private String surname;
    private String contactNumber;
    private String eMail;

}
