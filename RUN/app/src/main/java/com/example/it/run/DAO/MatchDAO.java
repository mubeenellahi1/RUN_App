package com.example.it.run.DAO;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Match;

/**
 * Created by IT on 10/17/2018.
 */

public interface MatchDAO {

    @Insert
    void insert(Match... matches);

    @Update
    void update(Match... matches);

    @Delete
    void delete(Match... matches);

    @Query("Select * FROM `Match`")
    Match[] loadAll();

}
