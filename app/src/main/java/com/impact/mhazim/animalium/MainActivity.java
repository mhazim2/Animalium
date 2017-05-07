package com.impact.mhazim.animalium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNama = (TextView) findViewById(R.id.mTextNama);

        String namadarifront = getIntent().getStringExtra("NAMA");

        mNama.setText(namadarifront);
    }
}
