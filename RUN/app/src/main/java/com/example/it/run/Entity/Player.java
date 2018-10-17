package com.example.it.run;

/**
 * Created by IT on 10/15/2018.
 */
import android.arch.persistence.room.ColumnInfo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.support.annotation.NonNull;
import java.util.Date;


@Entity(tableName = "Player")
public class Player{

    @ColumnInfo(name = "id")
    @PrimaryKey
    private Integer id;

    @ColumnInfo(name = "firstName")
    private String firstName;

    @NonNull
    @ColumnInfo(name = "lastName")
    private String lastName;

    @ColumnInfo(name = "age")
    private int age;

    @ColumnInfo(name = "birthday")
    private Date birthday;

    @ColumnInfo(name = "gender")
    private char gender;


    public Player(String fistName,String lastName,int age,Date birthday,char gender,int id) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
