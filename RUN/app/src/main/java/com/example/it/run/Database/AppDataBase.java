package com.example.it.run.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.example.it.run.DAO.MatchDAO;
import com.example.it.run.DAO.MatchStatDAO;
import com.example.it.run.DAO.NewsFeedDAO;
import com.example.it.run.DAO.PlayerDAO;
import com.example.it.run.DAO.TeamDAO;
import com.example.it.run.DAO.TournamentDAO;
import com.example.it.run.Entity.Converters;
import com.example.it.run.Entity.Match;
import com.example.it.run.Entity.MatchStat;
import com.example.it.run.Entity.NewsFeed;
import com.example.it.run.Entity.Player;
import com.example.it.run.Entity.Team;
import com.example.it.run.Entity.Tournament;
import com.example.it.run.Entity.Venue;


import com.example.it.run.DAO.VenueDAO;

/**
 * Created by IT on 10/17/2018.
 */

@Database   (entities = {Player.class, Tournament.class, Venue.class, Match.class, MatchStat.class, NewsFeed.class, Team.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
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
