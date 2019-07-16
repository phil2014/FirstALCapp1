package com.example.firstalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {
 private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
 displayimage();
    }
    public void displayimage() {
        image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.wakaba);
    }
}
