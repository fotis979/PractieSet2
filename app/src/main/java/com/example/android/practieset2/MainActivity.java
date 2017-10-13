package com.example.android.practieset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE


    }

    int healthLevel;
    String message;


    public void yes(View view) {
        healthLevel = healthLevel + 1;
        message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        message = "You answered no, current health level is + " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        //healthLevel = healthLevel + 0;
        message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    private void display(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.displayMessage);
        priceTextView.setText(message);
    }


    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */



    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.displayMessage);
        t.setText(text + " ");
    }


}
