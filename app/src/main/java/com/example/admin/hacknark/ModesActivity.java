package com.example.admin.hacknark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

/**
 * Created by usuryjskij on 11.03.18.
 */

public class ModesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);
/*
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        params.addRule(RelativeLayout.BELOW, R.id.textView1);
        params.addRule(RelativeLayout.RIGHT_OF, R.id.textView1);

// left, top, right, bottom to wartosci marginesow w pikselach, wiec przelicz z dp na piksele
        params.setMargins(left, top, right, bottom);

        tv1.setLayoutParams(params);*/
    }
}
