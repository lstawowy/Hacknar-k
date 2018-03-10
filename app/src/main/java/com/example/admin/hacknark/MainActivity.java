package com.example.admin.hacknark;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {


    boolean userIsLogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.userIsLogged = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createPUT(View view) throws IOException {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        String authorization = "Basic dmZWdHZnRVI2YjlvN3Zn";
        String contentType = "application/json";


        HttpsURLConnection httpCon;
        URL url = new URL("https://hacknarock.release.commandcentral.com/");
        httpCon = (HttpsURLConnection) url.openConnection();
        httpCon.setRequestMethod("PUT");
        httpCon.setDoOutput(true);
        httpCon.setDoInput(true);
        httpCon.setRequestProperty("Content-Type", contentType);
        httpCon.setRequestProperty("Authorization", authorization);
        //System.out.println("Response Code : " + httpCon.getResponseCode());


        //Meta Header:
        String EventTypelabel = "Janusz";

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //String actualDate = dateFormat.format(date);

        String actualDate = "2018-03-10T15:00:00.000Z";
        //Event Header:
        String uniqueID = "oficer-janusz";
        String label = "Oficer Janusz";
        String longitude = "19.54237";
        String latitude = "50.034290";
        String detailedDescription = "Oficer Janusz - cos tam sobie zrobil.";
        String icon = "ic_unit_police_sirens";
        String expirationTime = "2018-12-01T15:00:00.000Z";
        String priority = "unknown";


        httpCon.connect();
        String event1 = String.format("{}");
        OutputStream os = httpCon.getOutputStream();
        OutputStreamWriter out = new OutputStreamWriter(os,"UTF-8");
        String event = String.format("{" +
                "  \"metaHeader\": {\n" +
                "    \"metaTimeStamp\": \"" + actualDate + "\", \n" +
                "    \"metaEventTypeLabel\": \"" + EventTypelabel + "\"\n" +
                "  },\n" +
                "  \"eventHeader\": {\n" +
                "    \"id\": \"" + uniqueID + "-1\",\n" +
                "    \"label\": \"" + label + "\",\n" +
                "    \"timeStamp\": \"" + actualDate + "\",\n" +
                "    \"location\": {\n" +
                "      \"latitude\": " + latitude + ",\n" +
                "      \"longitude\": " + longitude + "\n" +
                "    },\n" +
                "    \"detailedDescription\": \"" + detailedDescription + "\",\n" +
                "    \"icon\": {\n" +
                "      \"url\": \"MsiIcon://" + icon + "\"  \n" +
                "    },\n" +
                "    \"expirationTimeStamp\": \"" + expirationTime + "\",\n" +
                "    \"priority\": \"" + priority + "\",\n" +
                "    \"attachments\": [\n" +
                "      {\n" +
                "        \"name\": \"Incident Location (external)\",\n" +
                "        \"contentType\": \"application/link\",\n" +
                "        \"url\": \"https://goo.gl/maps/Yiz4TLDBF3L2\"\n" +
                "      }, {\n" +
                "        \"name\": \"Incident image\",\n" +
                "        \"contentType\": \"image/jpeg\",\n" +
                "        \"url\": \"https://www.motorolasolutions.com/content/dam/msi/images/en-xw/brand_stories/lte-broadband-lex-brandstory-1160x308.jpg\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "};");


        out.write(event1);
        //System.out.println("Response Code : " + httpCon.getResponseCode());
        //System.out.println(event);
        out.close();

    }


    public void JumpTo(View View)
    {
        String button_text;
        String button_id;
        button_text =((Button)View).getText().toString();

        if(button_text.equals("Profil")){
            if(userIsLogged) {
                Intent jump = new Intent(this, Profile.class);
                startActivity(jump);
            }else{
                Intent jump = new Intent(this, LoginActivity.class);
                startActivity(jump);
            }

        }else if(button_text.equals("Ranking")){
            Intent jump = new Intent(this,Ranking.class);
            startActivity(jump);
        }
    }



}
