package com.cozyclean.laundry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void btnreg (View view) {
        Intent intent = new Intent(Register.this, Home.class);
        startActivity(intent);
    }
}