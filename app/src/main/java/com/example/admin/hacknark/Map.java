package com.example.admin.hacknark;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://inform.release.commandcentral.com/#/");
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




    public void refreshPUT(View view) throws IOException {
        /*        String mapURL = "https://inform.release.commandcentral.com/#/";
        Uri webaddress = Uri.parse(mapURL);

        Intent gotoMaps = new Intent(Intent.ACTION_VIEW, webaddress);
        if (gotoMaps.resolveActivity(getPackageManager()) != null){
            startActivity(gotoMaps);
        }*/
    }
}
