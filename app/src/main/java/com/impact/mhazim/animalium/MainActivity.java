package com.impact.mhazim.animalium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView mNama;
    RecyclerView recyclerView;
    AnimalModel animalModel;
    AnimalAdapter animalAdapter;
    List<AnimalModel> animalModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNama = (TextView) findViewById(R.id.mTextNama);

        String namadarifront = getIntent().getStringExtra("NAMA");

        mNama.setText(namadarifront);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        animalAdapter = new AnimalAdapter(getApplicationContext(), animalModelList);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(animalAdapter);

        persiapanData();
    }

    void persiapanData() {
        String [] namaIndo = {"Banteng","Ayam","Kepiting","Rubah", "Landak", "Kuda Nil", "Koala", "Lemur", "Babi", "Harimau", "Ikan Paus", "Zebra"};
        String [] namaEng = {"Bull","Chick","Crab","Fox", "Hedgehog", "Hippopotamus", "Koala", "Lemur", "Pig", "Tiger", "Whale", "Zebra"};
        int [] gambar = {R.drawable.anbull, R.drawable.anchick, R.drawable.ancrab, R.drawable.anfox, R.drawable.anhedgehog, R.drawable.anhippopotamus, R.drawable.ankoala, R.drawable.anlemur, R.drawable.anpig, R.drawable.antiger, R.drawable.anwhale, R.drawable.anzebra};

        for(int i=0; i<namaIndo.length; i++){
            animalModel = new AnimalModel(namaIndo[i], namaEng[i], gambar[i]);
            animalModelList.add(animalModel);
        }


    }
}
