package com.example.callisto.testmaterial1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SuddenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        ((TextView)findViewById(R.id.textView)).setShadowLayer(4, 0, 4, Color.DKGRAY);
    }
}
