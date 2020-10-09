package com.eshwarne.springbackend.Models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PointsTableModel {
    ArrayList<TeamModel> teams = new ArrayList<TeamModel>();

    public PointsTableModel(ArrayList<TeamModel> teams) {
        this.teams = teams;
    }

    public PointsTableModel() {
        this.teams.add(new TeamModel(1,"Mumbai Indians","Akha Mumbai Khelege",0,0,0));
        this.teams.add(new TeamModel(2,"Rajasthan Royals","Hala Bol",0,0,0));
        this.teams.add(new TeamModel(3,"Chennai Super Kings","Whistle Podu",0,0,0));

    }
    
    

    
}
