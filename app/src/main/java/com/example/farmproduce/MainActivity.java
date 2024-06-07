package com.example.farmproduce;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.viewCategories);
        textView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CategoriesPageActivity.class));
        });

    }
}