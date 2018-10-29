package com.example.it.run.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Entity.Team;

/**
 * Created by IT on 10/17/2018.
 */
@Dao
public interface TeamDAO {

    @Insert
    void insert(Team... teams);

    @Update
    void update(Team... teams);

    @Delete
    void delete(Team... teams);

    @Query("Select * FROM Team")
    Team[] loadAll();
}
