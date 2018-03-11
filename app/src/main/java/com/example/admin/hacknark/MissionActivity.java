package com.example.admin.hacknark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by usuryjskij on 11.03.18.
 */

public class MissionActivity extends AppCompatActivity {
    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String button_text;
            button_text = ((Button) view).getText().toString();
            ModesActivity.chosenMission = button_text;

            Intent jump = new Intent(MissionActivity.this, StartMission.class);
            startActivity(jump);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
        int ilosc = 0;
        for(Mission m:GameData.NameToObjectMode.get(ModesActivity.chosenMode).missions){
            RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.layout);
            Button b = new Button(this);
            b.setText(m.name);
            b.setWidth(500);
            b.setHeight(200);
            b.setY(100+ilosc*220);
            b.setOnClickListener(l);
            rLayout.addView(b);
            ilosc++;
        }
    }
}
