package com.eshwarne.springbackend.Models;

public class TeamModel {
    private int id;
    private String name;
    private String slogan;
    private int wins;
    private int losses;
    private double NRR;
    

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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    

    public TeamModel() {
    }

    public double getNRR() {
        return NRR;
    }

    public void setNRR(double nRR) {
        NRR = nRR;
    }

    public TeamModel(int id, String name, String slogan, int wins, int losses, double nRR) {
        this.id = id;
        this.name = name;
        this.slogan = slogan;
        this.wins = wins;
        this.losses = losses;
        NRR = nRR;
    }
    
    
    
}
