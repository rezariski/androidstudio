package com.example.gaugeeeebelajar;

import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity
import android.os.Bundle;
import com.example.gaugeeeebelajar.ui.main.MainFragment


public class MainActivity extends AppCompatActivity {

    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.main_activity)
            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, MainFragment.newInstance())
                        .commitNow()
            }
        }

    }