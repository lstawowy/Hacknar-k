package com.example.admin.hacknark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketPermission;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    public static GameData game;
    boolean userIsLogged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.userIsLogged = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new GameData();
    }



    public class PUTThread extends Thread {
        public String latitude;
        public String longitude;
        public String priority;
        public String id;
        public String label;
        public String icon;
        public String description;
        public String attachmentName;
        public String attachmentContentType;
        public String attachmentUrl;


        public void run(){
            String url = "https://hacknarock.release.commandcentral.com";
            URL obj = null;
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
            Date date = new Date();
            String acDate = dateFormat.format(date);
            String actDate = acDate.replace('_','T');
            String actualDate = actDate.concat(".000Z");
            System.out.print(actualDate);

            try {
                obj = new URL(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpsURLConnection con = null;
            try {
                con = (HttpsURLConnection) obj.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }

            con.setRequestProperty("Authorization", "Basic " + "dmZWdHZnRVI2YjlvN3Zn");
            con.setRequestProperty("Content-Type", "application/json");

            try {
                con.setRequestMethod("PUT");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            con.setDoOutput(true);
            DataOutputStream wr = null;
            try {
                wr = new DataOutputStream(con.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }

            JSONObject js = null;
            try {
                js = new JSONObject("{\n" +
                        " \"metaHeader\":\n" +
                        " {\n" +
                        "   \"metaTimeStamp\": \""+actualDate+"\"\n" +
                        " },\n" +
                        " \"eventHeader\":\n" +
                        " {\n" +
                        "   \"id\": \""+id+"\",\n" +
                        "   \"label\": \""+label+"\",\n" +
                        "   \"timeStamp\": \""+actualDate+"\",\n" +
                        "   \"location\": {\n" +
                        "     \"latitude\": "+latitude+",\n" +
                        "     \"longitude\": "+longitude+"\n" +
                        "   },\n" +
                        "\"detailedDescription\": \""+description+"\","+
                        "   \"icon\":\n" +
                        "   {\n" +
                        "     \"url\": \"MsiIcon://"+icon+"\"\n" +
                        "   },\n" +
                        "   \"expirationTimeStamp\": \"2018-03-11T02:52:56.618Z\",\n" +
                        "   \"priority\": \""+priority+"\",\n" +
                        "    \"attachments\": [\n" +
                        "      {\n" +
                        "        // Title of Attachment\n" +
                        "        \"name\": \""+attachmentName+"\",\n" +
                        "        \"contentType\": \""+attachmentContentType+"\",\n" +
                        "        \"url\": \""+attachmentUrl+"\"\n" +
                        "      }\n" +
                        "    ]" +
                        " }\n" +
                        "}");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                wr.writeBytes(js.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                wr.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int responseCode = 0;
            try {
                responseCode = con.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\nSending 'POST' request to URL : " + url);
            //        System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = null;
            try {
                in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String inputLine;
            StringBuffer response = new StringBuffer();

            try {
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //print result
            System.out.println(response.toString());


        }
    }

    public void createPUT(View view) throws IOException, JSONException {
        PUTThread thread = new PUTThread();
        thread.latitude="50.9261";
        thread.longitude="19.9261";
        //priorities = ['emergency' | 'high' | 'medium' | 'low' | 'diagnostic' | 'unknown']
        thread.priority="emergency";
        thread.id="id6";
        thread.label="label5";
        //iconsAvailable https://codepen.io/anon/pen/LQodbY
        thread.icon="ic_unit_police_sirens";
        thread.description="jakis opis";
        thread.attachmentName="Incident location";
        thread.attachmentContentType="application/link";
        thread.attachmentUrl="https://goo.gl/maps/Yiz4TLDBF3L2";
        thread.start();
    }




    public void JumpTo(View View) {
        String button_text;
        String button_id;
        button_text = ((Button) View).getText().toString();

        if (button_text.equals("Profil")) {
            if (userIsLogged) {
                Intent jump = new Intent(this, Profile.class);
                startActivity(jump);
            } else {
                Intent jump = new Intent(this, LoginActivity.class);
                startActivity(jump);
            }

        } else if (button_text.equals("Ranking")) {
            Intent jump = new Intent(this, Ranking.class);
            startActivity(jump);
        }
    }


}
