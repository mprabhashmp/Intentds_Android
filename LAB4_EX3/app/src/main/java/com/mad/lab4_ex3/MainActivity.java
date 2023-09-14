package com.mad.lab4_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView link;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link = (TextView) findViewById(R.id.link);
        link.setText("Android.com is the official website for android");
        Linkify.addLinks(link,Linkify.WEB_URLS);
    }
}