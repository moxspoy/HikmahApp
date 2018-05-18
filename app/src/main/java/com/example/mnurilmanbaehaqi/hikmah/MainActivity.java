package com.example.mnurilmanbaehaqi.hikmah;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recylerView);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void tambahData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Ketuhanan", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Aqidah", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Syariah", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Akhlak", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Akhlak", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Akhlak", "1214378098", "098758124"));
    }
}
