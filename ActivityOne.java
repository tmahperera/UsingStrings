package com.example.usingstrings;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView txtView2;
        txtView2 = findViewById(R.id.TvMsg2);
        txtView2.setText("Here, I am the text message 2");

        Log.i(  "Lifecycle",  "OnCreate() invoked");

    }

    protected void onStart() {
        super.onStart();
        Log.i(  "Lifecycle",  "OnStart() invoked");
    }

    protected void onResume() {
        super.onResume();
        Log.i(  "Lifecycle",  "OnResume() invoked");
    }

    protected void onPause() {
        super.onPause();
        Log.i(  "Lifecycle",  "OnPause() invoked");
    }

    protected void onStop() {
        super.onStop();
        Log.i(  "Lifecycle",  "OnStop() invoked");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(  "Lifecycle",  "OnDestroy() invoked");
    }
}
