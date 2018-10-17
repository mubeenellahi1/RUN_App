package com.example.it.run;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by IT on 10/15/2018.
 */

@Entity(tableName = "Team")
public class Team {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private Integer id;

    @ColumnInfo(name = "word")
    private String teamName;

    @ColumnInfo(name = "word")
    private Bitmap logo;


    public Team(Integer id, String teamName,Bitmap logo) {
        this.id = id;
        this.teamName = teamName;
        this.logo = logo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Bitmap getLogo() {
        return logo;
    }

    public void setLogo(Bitmap logo) {
        this.logo = logo;
    }
}
