package com.cozyclean.laundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void btnlogin(View view) {
       Intent intent = new Intent(MainActivity.this, Login.class);
       startActivity(intent);
    }
    public void btnreg(View view) {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }

//    public void btnreg (View view) {
//        Intent intent = new Intent(MainActivity.this, Home.class);
//        startActivity(intent);
    }


