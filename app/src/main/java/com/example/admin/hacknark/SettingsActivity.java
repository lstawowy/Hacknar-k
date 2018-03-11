package com.example.admin.hacknark;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.support.v7.app.ActionBar;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;

import java.util.List;
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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

    public void goToDevelop(View View) {
        Intent jump = new Intent(this, Developer.class);
        startActivity(jump);
    }

}