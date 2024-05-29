package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inscanril extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inscanril);

    }


    public void begbeg (View view) {
        Intent intent = new Intent(inscanril.this, inscanfek.class);
        startActivity(intent);
    }

    public void subril (View view) {
        Intent intent = new Intent(inscanril.this, inweb.class);
        startActivity(intent);
    }
}