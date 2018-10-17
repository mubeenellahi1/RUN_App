package com.example.it.run.DAO;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Tournament;

/**
 * Created by IT on 10/17/2018.
 */

public interface TournamentDAO {

    @Insert
    void insert(Tournament... tournaments);

    @Update
    void update(Tournament... tournaments);

    @Delete
    void delete(Tournament... tournaments);

    @Query("Select * FROM Tournament")
    Tournament[] loadAll();

}
