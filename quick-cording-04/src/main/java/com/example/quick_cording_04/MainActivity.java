package com.example.quick_cording_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread depositMan = new Thread()
        {

        };
        Thread withdrawMan = new Thread() {

        };
        depositMan.start();
        withdrawMan.start();
    }
}
