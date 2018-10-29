package com.example.it.run.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Entity.Player;

/**
 * Created by IT on 10/17/2018.
 */
@Dao
public interface PlayerDAO {

    @Insert
    void insert(Player... players);

    @Update
    void update(Player... players);

    @Delete
    void delete(Player... players);

    @Query("Select * FROM Player")
    Player[] loadAll();

}
