package com.example.jopoty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void showAdultMenu (View view) {
        Intent intent = new Intent(this, MenuJsonActivity.class);
        startActivity(intent);
    }
    public void showKidsMenu (View view) {
        Intent intent = new Intent(this, MenuJsonActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
