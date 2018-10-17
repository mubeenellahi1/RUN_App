package com.example.it.run.DAO;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Venue;

/**
 * Created by IT on 10/17/2018.
 */

public interface VenueDAO {

    @Insert
    void insert(Venue... venues);

    @Update
    void update(Venue... venues);

    @Delete
    void delete(Venue... venues);

    @Query("Select * FROM Venue")
    Venue[] loadAll();
}
