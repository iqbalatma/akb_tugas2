package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class User_Home extends AppCompatActivity {
    /*
            NIM     : 10117124
            Nama    : Iqbal Atma Muliawan
            Kelas   : IF4
            Matkul  : AKB
            Tugas   : Tugas 2

            Pengerjaan
            Tanggal 17 April Membuat tampilan layout user home, logic pindah activity

        */
    String KEY_NAME = "NAME";
    TextView namaView;
    TextView gol;
    String KEY_GOL = "GOLDAR";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__home);

        Bundle extra = getIntent().getExtras();
        String nama = extra.getString(KEY_NAME);
        String goldar = extra.getString(KEY_GOL);
        gol = findViewById(R.id.textView12);
        namaView = findViewById(R.id.textView10);
        namaView.setText(nama);
        gol.setText(goldar);
    }
}
