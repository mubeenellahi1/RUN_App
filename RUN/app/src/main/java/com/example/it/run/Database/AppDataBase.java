package com.example.it.run.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.it.run.DAO.MatchDAO;
import com.example.it.run.DAO.MatchStatDAO;
import com.example.it.run.DAO.NewsFeedDAO;
import com.example.it.run.DAO.PlayerDAO;
import com.example.it.run.DAO.TeamDAO;
import com.example.it.run.DAO.TournamentDAO;
import com.example.it.run.Match;
import com.example.it.run.MatchStat;
import com.example.it.run.NewsFeed;
import com.example.it.run.Player;
import com.example.it.run.Team;
import com.example.it.run.Tournament;
import com.example.it.run.Venue;


import com.example.it.run.DAO.VenueDAO;

/**
 * Created by IT on 10/17/2018.
 */

@Database(entities = {Player.class, Tournament.class, Venue.class, Match.class, MatchStat.class, NewsFeed.class, Team.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase instance;


    public abstract PlayerDAO PlayerDAO();
    public abstract TournamentDAO TournamentDAO();
    public abstract NewsFeedDAO NewsFeedDAO();
    public abstract TeamDAO TeamDAO();
    public abstract MatchDAO MatchDAO();
    public abstract MatchStatDAO MatchStatDAO();
    public abstract VenueDAO VenueDAO();


    public static AppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDataBase.class,
                    "run-db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
