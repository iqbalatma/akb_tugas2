package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {
    /*
        NIM     : 10117124
        Nama    : Iqbal Atma Muliawan
        Kelas   : IF4
        Matkul  : AKB
        Tugas   : Tugas 2

        Pengerjaan
        Tanggal 17 April Membuat Tampilan layout, logic pindah activity
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void almost(View v){
        Intent almost = new Intent(Register.this, Almost_There.class);
        startActivity(almost);
    }

    public void login(View v){
        Intent login = new Intent(Register.this, Login.class);
        startActivity(login);
    }
}
