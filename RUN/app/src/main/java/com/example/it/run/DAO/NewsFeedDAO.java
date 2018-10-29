package com.example.it.run.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.it.run.Entity.NewsFeed;

/**
 * Created by IT on 10/17/2018.
 */
@Dao
public interface NewsFeedDAO {

    @Insert
    void insert(NewsFeed... newsFeeds);

    @Update
    void update(NewsFeed... newsFeeds);

    @Delete
    void delete(NewsFeed... newsFeeds);

    @Query("Select * FROM NewsFeed")
    NewsFeed[] loadAll();

}
