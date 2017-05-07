package com.impact.mhazim.animalium;

/**
 * Created by mhazi on 07/05/2017.
 */

public class AnimalModel {

    String namaIndo, namaEng;
    int gambar;

    public String getNamaIndo() {
        return namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public AnimalModel (String namaIndo, String namaEng, int gambar) {
        this.namaIndo = namaIndo;
        this.namaEng = namaEng;
        this.gambar = gambar;


    }

}
