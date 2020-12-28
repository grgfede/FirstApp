package com.frarisstudio.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ic_logo = findViewById(R.id.ic_logo);
        Button btn_emailLogin;
        btn_emailLogin = findViewById(R.id.btnEmailLogin);
        btn_emailLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Login.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, ic_logo, ViewCompat.getTransitionName(ic_logo));
                startActivity(intent, options.toBundle());
            }
        });

    }
}