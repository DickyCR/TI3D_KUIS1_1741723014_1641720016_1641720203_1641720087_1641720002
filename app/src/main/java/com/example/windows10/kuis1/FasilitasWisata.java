package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FasilitasWisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas_wisata);
    }

    public void umum(View view) {
        Intent intent = new Intent(FasilitasWisata.this, Umum.class);
        startActivity(intent);
    }

    public void utama(View view) {
        Intent intent = new Intent(FasilitasWisata.this, HallUtama.class);
        startActivity(intent);
    }

    public void wahana(View view) {
        Intent intent = new Intent(FasilitasWisata.this, Zona.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(FasilitasWisata.this, Home.class);
        startActivity(intent);
    }
}
