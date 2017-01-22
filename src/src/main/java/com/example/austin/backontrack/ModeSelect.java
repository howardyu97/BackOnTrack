package com.example.austin.backontrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModeSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_select);
    }
    public void openZoneTwo (View v){
        Intent i = new Intent(this, ZoneTwo.class);
        startActivity(i);
    }
    public void openPathTwo (View v){
        Intent i = new Intent(this, PathTwo.class);
        startActivity(i);
    }

    public void openViewTwo (View v){
        Intent i = new Intent(this, ViewTwo.class);
        startActivity(i);
    }
}
