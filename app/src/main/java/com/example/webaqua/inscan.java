package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.journeyapps.barcodescanner.ScanOptions;

public class inscan extends AppCompatActivity {
    private ImageButton scanan;


    private ActivityResultLauncher<Intent> scanBarcodeLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent nextIntent = new Intent(inscan.this, inscanfek.class);
                    startActivity(nextIntent);
                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inscan);

        scanan = findViewById(R.id.scanan);

        scanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inscan.this, ScannerActivity.class);
                scanBarcodeLauncher.launch(intent);
            }
        });


}

    public void submitan (View view) {
        Intent intent = new Intent(inscan.this, inscanfek.class);
        startActivity(intent);
    }


    public void balikan (View view) {
        Intent intent = new Intent(inscan.this, inweb.class);
        startActivity(intent);
}

    public void cancelajah (View view) {
        Intent intent = new Intent(inscan.this, inweb.class);
        startActivity(intent);
    }


}



