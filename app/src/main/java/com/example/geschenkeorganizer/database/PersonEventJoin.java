package com.example.geschenkeorganizer.database;

import androidx.room.Entity;
import androidx.room.ForeignKey;

/** https://developer.android.com/training/data-storage/room/relationships
many-to-many relationship*/
@Entity(tableName = "person_event_join",
        primaryKeys = {"personId", "eventId"},
        foreignKeys = {@ForeignKey(entity=Person.class, parentColumns="personId", childColumns = "personId"), @ForeignKey(entity= Event.class, parentColumns = "eventId", childColumns = "eventId")})
public class PersonEventJoin {
    // bei android developers public
    private int personId;
    private int eventId;
}
