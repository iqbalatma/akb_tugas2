package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Almost_There extends AppCompatActivity {
    /*
        NIM     : 10117124
        Nama    : Iqbal Atma Muliawan
        Kelas   : IF4
        Matkul  : AKB
        Tugas   : Tugas 2

        Pengerjaan
        Tanggal 16 April Membuat Tampilan layout
        Tanggal 17 April Membuat Logic Pindah Activity
    */
    String KEY_NAME = "NAME";
    String nama;
    String KEY_GOL = "GOLDAR";
    String goldar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extra = getIntent().getExtras();
        nama = extra.getString(KEY_NAME);
        goldar = extra.getString(KEY_GOL);
        setContentView(R.layout.activity_almost__there);
    }

    public void verify(View v){
        Intent verify = new Intent(Almost_There.this, Verify.class);
        verify.putExtra(KEY_NAME, nama);
        verify.putExtra(KEY_GOL, goldar);
        startActivity(verify);
    }
}
