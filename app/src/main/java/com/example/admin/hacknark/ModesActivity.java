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

public class ModesActivity extends AppCompatActivity {
    public static String chosenMode;
    public static String chosenMission;

    View.OnClickListener l = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            String button_text;
            button_text = ((Button) view).getText().toString();
            ModesActivity.chosenMode = button_text;

            Intent jump = new Intent(ModesActivity.this, MissionActivity.class);
            startActivity(jump);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);
        int ilosc = 0;
        for(GameMode g:MainActivity.game.modes){
            RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.layout);
            Button b = new Button(this);
            b.setText(g.name);
            b.setWidth(500);
            b.setHeight(200);
            b.setY(100+ilosc*220);
            b.setOnClickListener(l);
            rLayout.addView(b);
            ilosc++;
        }
    }
}
