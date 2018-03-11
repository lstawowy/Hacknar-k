package com.example.admin.hacknark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * Created by usuryjskij on 11.03.18.
 */

public class StartMission extends AppCompatActivity {
    public static Mission mission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmission);

        mission = GameData.NameToObjectMode.get(ModesActivity.chosenMode).NameToObjectMission.
                get(ModesActivity.chosenMission);

        EditText text = (EditText) findViewById(R.id.editText8);
        text.setText(mission.missionDescription);
    }

    public void ShowMission(){
        Intent jump = new Intent(this, MissionRunning.class);
        startActivity(jump);

    }
}
