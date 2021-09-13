package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.paris);
        Toast.makeText(this, "You have clicked!", Toast.LENGTH_LONG).show();
    }
}