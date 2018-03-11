package com.example.admin.hacknark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by usuryjskij on 10.03.18.
 */

public class CarrierPath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier);
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
