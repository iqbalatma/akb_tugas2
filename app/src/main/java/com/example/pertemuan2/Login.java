package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

/*
    NIM     : 10117124
    Nama    : Iqbal Atma Muliawan
    Kelas   : IF4
    Matkul  : AKB
    Tugas   : Tugas 2

    Pengerjaan
    Tanggal 16 April Membuat Tampilan layout
    Tanggal 17 April Membuat logic perpindahan activity
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View v){
        Intent register = new Intent(Login.this, Register.class);
        startActivity(register);
    }
}
