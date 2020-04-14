package com.example.finalproject_mad3125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView textView1;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView1 = (TextView)findViewById(R.id.textView1);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        
    }
}
