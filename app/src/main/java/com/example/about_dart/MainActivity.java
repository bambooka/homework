package com.example.about_dart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showThemesList = findViewById(R.id.themesList);
        showThemesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThemesListActivity();
            }
        });

        TextView aboutSpeaker = findViewById(R.id.speaker);
        aboutSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutSpeakerActivity();
            }
        });

    }

    // open topic list
    private void openThemesListActivity() {
        Intent openThemesListActivity = new Intent(this, ThemesListActivity.class);
        startActivity(openThemesListActivity);
    }

    // open info about speaker
    private void openAboutSpeakerActivity() {
        Intent openAboutSpeakerActivity = new Intent(this, About_Speaker.class);
        startActivity(openAboutSpeakerActivity);
    }
}
