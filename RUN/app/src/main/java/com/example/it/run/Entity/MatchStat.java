package com.example.it.run.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by IT on 10/15/2018.
 */

@Entity(tableName = "MatchStat",
        foreignKeys ={
                @ForeignKey(entity = com.example.it.run.Entity.Match.class,
                        parentColumns = "id",
                        childColumns = "matchID"),
                @ForeignKey(entity = com.example.it.run.Entity.Player.class,
                        parentColumns = "id",
                        childColumns = {"playerID"})
        }
)
public class MatchStat {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "matchID")
    private int matchID;

    @ColumnInfo(name = "playerID")
    private int playerID;

    @ColumnInfo(name = "eventID")
    private int eventID;

    @ColumnInfo(name = "minutes")
    private int minutes;


    public MatchStat(int id, int matchID, int playerID, int eventID, int minutes) {
        this.id = id;
        this.matchID = matchID;
        this.playerID = playerID;
        this.eventID = eventID;
        this.minutes = minutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
