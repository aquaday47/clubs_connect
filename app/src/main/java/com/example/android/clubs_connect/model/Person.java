package com.example.android.clubs_connect.model;

/**
 * Created by ProfessorTaha on 3/3/2018.
 */

class Person {
    private String mUserName;

    public Person(String name){
        this.mUserName = name;
    }
    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }
}
