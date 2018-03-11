package com.example.admin.hacknark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by usuryjskij on 11.03.18.
 */

public class ModesActivity extends AppCompatActivity {
    public static String chosenMode;

    View.OnClickListener l = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            String button_text;
            //String button_id;
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

        for(GameMode g:MainActivity.game.modes){
            RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.layout);
            Button b = new Button(this);
            b.setText(g.name);
            b.setWidth(500);
            b.setHeight(200);
            b.setTop(80+MainActivity.game.modes.indexOf(g)*95);
            b.setLeft(115);
            b.setOnClickListener(l);
            b.layout(115,80+MainActivity.game.modes.indexOf(g)*95,10,10);
            //TextView v = (TextView) findViewById(R.id.textView);
            rLayout.addView(b);
        }


/*        for(GameMode g:MainActivity.game.modes){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            RelativeLayout rLayout = (RelativeLayout) findViewById(R.id.textView);
            Button tv1 =  new Button(this);
            tv1.setText("Button");
            tv1.setId(1);
            tv1.setHeight(50);
            tv1.setWidth(100);
            rLayout.addView(tv1);

            params.addRule(RelativeLayout.BELOW, R.id.textView1);
            params.addRule(RelativeLayout.RIGHT_OF, R.id.textView1);

// left, top, right, bottom to wartosci marginesow w pikselach, wiec przelicz z dp na piksele
            params.setMargins(left, top, right, bottom);

            tv1.setLayoutParams(params);
        }*/
    }
}
