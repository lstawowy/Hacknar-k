package com.example.admin.hacknark;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void createPUT(View view) throws IOException {

        URL url = new URL("https://hacknarock.release.commandcentral.com/");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setRequestMethod("PUT");
        httpCon.setDoOutput(true);
        String authorization = "Basic dmZWdHZnRVI2YjlvN3Zn";
        String contentType = "application/json";
        httpCon.setRequestProperty("Content-Type", contentType);
        httpCon.setRequestProperty("Authorization", authorization);

        //Meta Header:
        String EventTypelabel = "Janusz";

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss");
        Date date = new Date();
        String actualDate=dateFormat.format(date);


        //Event Header:
        String uniqueID = "oficer-janusz";
        String label = "Oficer Janusz";
        String longitude = "19.54237";
        String latitude = "50.034290";
        String detailedDescription = "Oficer Janusz - cos tam sobie zrobil.";
        String icon = "ic_unit_police_sirens";
        String expirationTime = actualDate;
        String priority = "unknown";




        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        String event=String.format("{" +
                "  \"metaHeader\": {\n" +
                "    // Date, when event really occured\n" +
                "    \"metaTimeStamp\": \""+actualDate+".000Z\", \n" +
                "     // Label\n" +
                "    \"metaEventTypeLabel\": \""+EventTypelabel+"\"\n" +
                "  },\n" +
                "  \"eventHeader\": {\n" +
                "    // Unique event ID\n" +
                "    \"id\": \""+uniqueID+"-1\",\n" +
                "    // Descriptive Label\n" +
                "    \"label\": \""+label+"\",\n" +
                "    // Event reported\n" +
                "    \"timeStamp\": \""+actualDate+".000Z\",\n" +
                "    \"location\": {\n" +
                "      // map coordinates - latitude\n" +
                "      \"latitude\": "+latitude+",\n" +
                "      // map coordinates - longitude\n" +
                "      \"longitude\": "+longitude+"\n" +
                "    },\n" +
                "    // detailed description - visible in map popup\n" +
                "    \"detailedDescription\": \""+detailedDescription+"\",\n" +
                "    \"icon\": {\n" +
                "      // icon url - could be custom source, or predefined (format MsiIcon://{name})\n" +
                "      \"url\": \"MsiIcon://"+icon+"\"  \n" +
                "    },\n" +
                "    // timestamp, when event will expire (gone from map and layers panel)\n" +
                "    \"expirationTimeStamp\": \""+expirationTime+"\",\n" +
                "    // available priorities: 'emergency' | 'high' | 'medium' | 'low' | 'diagnostic' | 'unknown'\n" +
                "    // emergency priority is treated specially (events are marked red)\n" +
                "    \"priority\": \""+priority+"\",\n" +
                "    // an array of attachments\n" +
                "    \"attachments\": [\n" +
                "      {\n" +
                "        // Title of Attachment\n" +
                "        \"name\": \"Incident Location (external)\",\n" +
                "        // content type\n" +
                "        // see https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types\n" +
                "        \"contentType\": \"application/link\",\n" +
                "        // url to source\n" +
                "        \"url\": \"https://goo.gl/maps/Yiz4TLDBF3L2\"\n" +
                "      }, {\n" +
                "        \"name\": \"Incident image\",\n" +
                "        \"contentType\": \"image/jpeg\",\n" +
                "        \"url\": \"https://www.motorolasolutions.com/content/dam/msi/images/en-xw/brand_stories/lte-broadband-lex-brandstory-1160x308.jpg\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "};");
        out.write(event);
        out.close();
        httpCon.getInputStream();

    }
}
