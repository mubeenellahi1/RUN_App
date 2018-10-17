package com.example.it.run;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by IT on 10/15/2018.
 */

@Entity(foreignKeys = @ForeignKey(entity = com.example.it.run.Venue.class,
        parentColumns = "id",
        childColumns = "venueID"))
public class Tournament {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "date")
    private Date date;

    @ColumnInfo(name = "organizerName")
    private String organizerName;

    @ColumnInfo(name = "organizerContact")
    private String organizerContact;

    @ColumnInfo(name = "prizeMoney")
    private int prizeMoney;

    @ColumnInfo(name = "regFees")
    private int regFees;

    @ColumnInfo(name="desc")
    private String desc;

    @ColumnInfo(name = "venueID")
    private int venueID;


    public Tournament(int id, Date date,int venueID ,String organizerName, String organizerContact, int prizeMoney, int regFees, String desc) {
        this.id = id;
        this.date = date;
        this.organizerName = organizerName;
        this.organizerContact = organizerContact;
        this.prizeMoney = prizeMoney;
        this.regFees = regFees;
        this.desc = desc;
        this.venueID = venueID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerContact() {
        return organizerContact;
    }

    public void setOrganizerContact(String organizerContact) { this.organizerContact = organizerContact; }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getRegFees() {
        return regFees;
    }

    public void setRegFees(int regFees) {
        this.regFees = regFees;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getVenueID() { return venueID; }

    public void setVenueID(int venueID) { this.venueID = venueID; }
}
