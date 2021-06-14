package com.example.minggu_1.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.minggu_1.R;

public class tugas_ke_3 extends AppCompatActivity {

  private   EditText nama,nilai;
    TextView grade;
    Button cek;

    int tampung_nilai;
    String tampung_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugas_ke_3);

        nama   = findViewById(R.id.edit_nama);
        nilai = findViewById(R.id.edit_nilai);
        cek = findViewById(R.id.btn_cek);
        grade    = findViewById(R.id.txt_grade);

//        cek.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//
//
//
//            }
//        });

    }

    public void btn_simpan(View view) {

        try {

        }catch (Exception e){

        }
        if (nama.getText().toString().trim().equals("")){
            Toast.makeText(this, "nama", Toast.LENGTH_SHORT).show();
        }
        if (nilai.getText().toString().trim().equals("")){
            Toast.makeText(this, "niali", Toast.LENGTH_SHORT).show();
        }else {
            tampung_nilai = Integer.parseInt(nilai.getText().toString());
            tampung_nama = nama.getText().toString().trim();
            if (tampung_nilai>=80 && tampung_nilai<=100){
                grade.setText("Selamat "+tampung_nama+" Nilai anda sangat memuaskan dengan grade A");
            }else if (tampung_nilai>=70&&tampung_nilai<=79){
                grade.setText("Selamat "+tampung_nama+" Nilai anda  memuaskan dengan grade B+");
            }else if (tampung_nilai>=60&&tampung_nilai<=69){
                grade.setText("Selamat "+tampung_nama+" Nilai anda Cukup memuaskan dengan grade B");
            }else if (tampung_nilai>=50&&tampung_nilai<=59){
                grade.setText("Selamat "+tampung_nama+" Nilai anda Cukup memuaskan dengan grade C+");
            }else if (tampung_nilai>=40&&tampung_nilai<=49){
                grade.setText("Selamat "+tampung_nama+" Nilai anda Cukup memuaskan dengan grade C");
            }else {
                grade.setText("Selamat "+tampung_nama+" Nilai anda Cukup memuaskan dengan grade E");
            }
        }
    }
}