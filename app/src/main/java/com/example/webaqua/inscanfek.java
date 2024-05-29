package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inscanfek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inscanfek);

    }

    public void subcancel (View view) {
        Intent intent = new Intent(inscanfek.this, inscanril.class);
        startActivity(intent);
    }

    public void bekbek (View view) {
        Intent intent = new Intent(inscanfek.this, inscan.class);
        startActivity(intent);
    }
}