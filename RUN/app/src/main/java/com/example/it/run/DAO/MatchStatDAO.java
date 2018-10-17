package com.example.it.run.DAO;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Match;
import com.example.it.run.MatchStat;

/**
 * Created by IT on 10/17/2018.
 */

public interface MatchStatDAO {

    @Insert
    void insert(MatchStat... matchStats);

    @Update
    void update(MatchStat... matchStats);

    @Delete
    void delete(MatchStat... matchStats);

    @Query("Select * FROM MatchStat")
    MatchStat[] loadAll();

}
