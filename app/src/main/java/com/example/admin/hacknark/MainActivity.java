package com.example.admin.hacknark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean userIsLogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.userIsLogged = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void JumpTo(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("Profil"))
        {
            Intent jump = new Intent(this,Profile.class);
            startActivity(jump);
        }else if(button_text.equals("Ranking")){
            Intent jump = new Intent(this,Profile.class);
            startActivity(jump);
        }
/*        else if (button_text.equals("click third activity"))
        {
            Intent mass = new Intent(this,ThirdActivity.class);
            startActivity(mass);

        }*/
    }



}
