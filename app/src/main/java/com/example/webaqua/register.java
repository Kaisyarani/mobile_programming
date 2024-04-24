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

public class register extends AppCompatActivity {

    private ImageButton panah1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
    } public void kembali(View v) {
        Intent intent = new Intent(register.this, masuk.class);
        startActivity(intent);
    }

    public void regis(View v) {
        Intent intent = new Intent(register.this, login.class);
        startActivity(intent);
    }
}