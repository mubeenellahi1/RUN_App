package com.example.it.run.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by IT on 10/15/2018.
 */

@Entity(tableName = "Match",
        foreignKeys ={
            @ForeignKey(entity = com.example.it.run.Entity.Venue.class,
            parentColumns = {"id"},
            childColumns = {"venueID"}),
            @ForeignKey(entity = com.example.it.run.Entity.Team.class,
            parentColumns = {"id"},
            childColumns = {"team1ID"}),
            @ForeignKey(entity = com.example.it.run.Entity.Team.class,
            parentColumns = {"id"},
            childColumns = {"team2ID"})

        }
)
public class Match {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "venueID")
    private int venueID;

    @ColumnInfo(name = "team1ID")
    private int team1ID;

    @ColumnInfo(name = "team2ID")
    private int team2ID;

    @ColumnInfo(name = "possTeam1")
    private int possTeam1;

    @ColumnInfo(name = "possTeam2")
    private int possTeam2;

    @ColumnInfo(name = "attemptsTeam1")
    private int attemptsTeam1;

    @ColumnInfo(name = "attemptsTeam2")
    private int attemptsTeam2;


    public Match(int id, String name, int venueID, int team1ID, int team2ID, int possTeam1, int possTeam2, int attemptsTeam1, int attemptsTeam2) {
        this.id = id;
        this.name = name;
        this.venueID = venueID;
        this.team1ID = team1ID;
        this.team2ID = team2ID;
        this.possTeam1 = possTeam1;
        this.possTeam2 = possTeam2;
        this.attemptsTeam1 = attemptsTeam1;
        this.attemptsTeam2 = attemptsTeam2;
    }

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

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public int getTeam1ID() {
        return team1ID;
    }

    public void setTeam1ID(int team1ID) {
        this.team1ID = team1ID;
    }

    public int getTeam2ID() {
        return team2ID;
    }

    public void setTeam2ID(int team2ID) {
        this.team2ID = team2ID;
    }

    public int getPossTeam1() {
        return possTeam1;
    }

    public void setPossTeam1(int possTeam1) {
        this.possTeam1 = possTeam1;
    }

    public int getPossTeam2() {
        return possTeam2;
    }

    public void setPossTeam2(int possTeam2) {
        this.possTeam2 = possTeam2;
    }

    public int getAttemptsTeam1() {
        return attemptsTeam1;
    }

    public void setAttemptsTeam1(int attemptsTeam1) {
        this.attemptsTeam1 = attemptsTeam1;
    }

    public int getAttemptsTeam2() {
        return attemptsTeam2;
    }

    public void setAttemptsTeam2(int attemptsTeam2) {
        this.attemptsTeam2 = attemptsTeam2;
    }
}