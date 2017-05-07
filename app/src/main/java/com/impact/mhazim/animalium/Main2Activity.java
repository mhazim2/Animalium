package com.impact.mhazim.animalium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText mNama;
    Button mMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mNama = (EditText) findViewById(R.id.mEditTextNama);
        mMasuk = (Button) findViewById(R.id.btnMasuk);

        mMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j;
                j = new Intent(Main2Activity.this, MainActivity.class);
                j.putExtra("NAMA", mNama.getText().toString());
                startActivity(j);
                finish();
            }
        });
    }
}
