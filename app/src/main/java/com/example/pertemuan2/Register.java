package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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


////    Button btnRegister = findViewById(R.id.button5);
    EditText inputNama;

    Spinner inputGoldar;
    String KEY_NAME = "NAME";
    String nama;
    String KEY_GOL = "GOLDAR";
    String goldar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        inputNama = findViewById(R.id.editText5);
        inputGoldar = findViewById(R.id.spinner3);
    }





    public void almost(View v){
//        Toast.makeText(this, "Selected "+ inputGoldar.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        goldar = inputGoldar.getSelectedItem().toString();
        nama = inputNama.getText().toString();
        Intent almost = new Intent(Register.this, Almost_There.class);
        almost.putExtra(KEY_NAME, nama);
        almost.putExtra(KEY_GOL, goldar);
        startActivity(almost);
    }

    public void login(View v){
        Intent login = new Intent(Register.this, Login.class);
        startActivity(login);
    }
}
