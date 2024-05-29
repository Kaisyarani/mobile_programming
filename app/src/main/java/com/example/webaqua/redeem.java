package com.example.webaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class redeem extends AppCompatActivity {

    ImageView increment, decrement;
    TextView display;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeem);

        increment=findViewById(R.id.iconplus);
        decrement=findViewById(R.id.iconminus);
        display=findViewById(R.id.txtview);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                display.setText(""+count);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count <=0) count=0;
                else
                    count --;
                display.setText(""+count);
            }
        });
    }

    public void backagain(View v) {
        Intent intent = new Intent(redeem.this, inweb.class);
        startActivity(intent);
    }
    public void redeemsis(View v) {
        Intent intent = new Intent(redeem.this, redeemvaganza.class);
        startActivity(intent);
    }
}