package com.example.admin.hacknark;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Achievements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void JumpTo(View view){

    }
    public void JumpToSettings(View View) {
        Intent jump = new Intent(this, SettingsActivity.class);
        startActivity(jump);
    }

    public void JumpToMain(View View) {
        Intent jump = new Intent(this, MainActivity.class);
        startActivity(jump);
    }

    public void JumpToProfil(View View) {
        Intent jump = new Intent(this, Profile.class);
        startActivity(jump);
    }

}
