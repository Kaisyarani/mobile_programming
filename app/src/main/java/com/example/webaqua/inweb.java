package com.example.webaqua;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class inweb extends AppCompatActivity {

    int hitung=1;
    TextView angkanotif;


    private ImageButton scanaja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inweb);
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);;
        NavigationView navigationView =findViewById(R.id.nav_menu);

        angkanotif=findViewById(R.id.angkanotif);

        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.logout) {
                // Buka halaman pertama jika item menu 1 diklik
                Intent intent1 = new Intent(inweb.this, login.class);
                startActivity(intent1);
            }

            if (item.getItemId() == R.id.notif) {
                hitung ++;
                angkanotif.setText(""+hitung);
            }

            drawerLayout.closeDrawers();
            return true;
        });


    } public void pencetscan(View view) {
        Intent intent = new Intent(inweb.this, inscan.class);
        startActivity(intent);
    }

    public void redeem(View view) {
        Intent intent = new Intent(inweb.this, redeem.class);
        startActivity(intent);
    }

    public void supresgift(View view) {
        Intent intent = new Intent(inweb.this, penutupan.class);
        startActivity(intent);
    }

        public void openDrawer(View view){
            DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
            if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
                drawerLayout.closeDrawer(GravityCompat.END);
            } else {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        }
    }