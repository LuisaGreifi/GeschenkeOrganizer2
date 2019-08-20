package com.example.geschenkeorganizer.database;

import androidx.room.Insert;

public interface DaoAccess {
    // Person Access
     @Insert
     void insertPerson(Person person);
    //Event Access
    @Insert
     void insertEvent(Event event);

    //PersonEventJoin Access
    @Insert
    void insertPersonEventJoin(PersonEventJoin personEventJoin);

    //Present Access
    @Insert
    void insertPresent(Present present);
}