package com.example.about_dart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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

    }

    private void openThemesListActivity() {
        Intent openThemesListActivity = new Intent(this, ThemesListActivity.class);
        startActivity(openThemesListActivity);
    }
}
