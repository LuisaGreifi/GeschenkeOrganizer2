package com.example.geschenkeorganizer.PersonsFile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geschenkeorganizer.R;

public class PersonsAddActivity extends AppCompatActivity implements PersonsAddFragment.OnListItemChangedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_persons);
    }

    @Override
    public void onListItemChanged() {
        //todo
    }
}
