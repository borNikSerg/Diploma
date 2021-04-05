package com.print86.diploma.models;

public class Request {
    private int id;

    public Request(int id, User user, String dueTo, String workToDo, float totalCost) {
        this.id = id;
        this.user = user;
        this.dueTo = dueTo;
        this.workToDo = workToDo;
        this.totalCost = totalCost;
    }

    private User user;
    private String dueTo;
    private String workToDo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDueTo() {
        return dueTo;
    }

    public void setDueTo(String dueTo) {
        this.dueTo = dueTo;
    }

    public String getWorkToDo() {
        return workToDo;
    }

    public void setWorkToDo(String workToDo) {
        this.workToDo = workToDo;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    private float totalCost;
}
