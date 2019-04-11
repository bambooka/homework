package com.example.about_dart;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThemesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        LinearLayout myLayout = findViewById(R.id.aboutSpeaker);


        TextView tv = new TextView(this);
        tv.setText(R.string.speaker);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        tv.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

        LinearLayout.LayoutParams linearLayoutparams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        linearLayoutparams.gravity = Gravity.CENTER_HORIZONTAL;
        tv.setLayoutParams(linearLayoutparams);

        myLayout.addView(tv);
    }
}

