package com.example.davidpham_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);LinearLayout linearLayout =  (LinearLayout) findViewById(R.id.linearLayout);
        TextView textView = new TextView(this);
        textView.setText(R.string.onCreate);
        linearLayout.addView(textView);

    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayout linearLayout =  (LinearLayout) findViewById(R.id.linearLayout);
        TextView startView = new TextView(this);
        startView.setText(R.string.onStart);
        linearLayout.addView(startView);

    }
    @Override
    protected void onStop() {
        super.onStop();
        LinearLayout linearLayout =  (LinearLayout) findViewById(R.id.linearLayout);
        TextView stopView = new TextView(this);
        stopView.setText(R.string.onStop);
        linearLayout.addView(stopView);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        LinearLayout linearLayout =  (LinearLayout) findViewById(R.id.linearLayout);
        TextView destroyView = new TextView(this);
        destroyView.setText(R.string.onDestroy);
        linearLayout.addView(destroyView);

    }



}