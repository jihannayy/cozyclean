package com.cozyclean.laundry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Login extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void btnlog (View view) {
        Intent intent = new Intent(Login.this, Home.class);
        startActivity(intent);
    }
}
