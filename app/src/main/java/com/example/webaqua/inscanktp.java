package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inscanktp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inscanktp);
    }

    public void backtoscan (View view) {
        Intent intent = new Intent(inscanktp.this, inscan.class);
        startActivity(intent);
    }

    public void savesimpan (View view) {
        Intent intent = new Intent(inscanktp.this, inweb.class);
        startActivity(intent);
    }

    public void cancelan (View view) {
        Intent intent = new Intent(inscanktp.this, inweb.class);
        startActivity(intent);
    }


}