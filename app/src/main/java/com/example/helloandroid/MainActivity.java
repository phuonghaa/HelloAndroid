package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.helloandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
//        ImageView imageView = findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.paris);
        binding.imageView.setImageResource(R.drawable.paris);
        Toast.makeText(this, "You have clicked!", Toast.LENGTH_LONG).show();
    }
}