package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    private ImageButton panah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable( this);
        setContentView(R.layout.activity_login);

    } public void back(View v) {
        Intent intent = new Intent(login.this, masuk.class);
        startActivity(intent);
    }

    public void logloginn(View v) {
        Intent intent = new Intent(login.this, inweb.class);
        startActivity(intent);
    }
}