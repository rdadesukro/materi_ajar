package com.example.minggu_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kalkulator extends AppCompatActivity {

    private Button btnKurang;
    private Button btnTambah;
    private Button btnKali;
    private EditText editDua;
    private Button btnBagi;
    private EditText editSatu;
    private TextView txtHaslil;

    float a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
        initView();
    }

    private void initView() {
        btnKurang = findViewById(R.id.btn_kurang);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKali = findViewById(R.id.btn_kali);
        editDua = findViewById(R.id.edit_dua);
        btnBagi = findViewById(R.id.btn_bagi);
        editSatu = findViewById(R.id.edit_satu);
        txtHaslil = findViewById(R.id.txt_haslil);




//        btnTambah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                a = Float.parseFloat(editSatu.getText() + "");
//                b = Float.parseFloat(editDua.getText() + "");
//                txtHaslil.setText(a+b+"");
//
//
//            }
//        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(editSatu.getText() + "");
                b = Float.parseFloat(editDua.getText() + "");
                txtHaslil.setText(a/b+"");
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(editSatu.getText() + "");
                b = Float.parseFloat(editDua.getText() + "");
                txtHaslil.setText(a*b+"");
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(editSatu.getText() + "");
                b = Float.parseFloat(editDua.getText() + "");
                txtHaslil.setText(a-b+"");
            }
        });
    }
    public void btn_tambah (View v){
        Toast.makeText(this, "tamabah", Toast.LENGTH_SHORT).show();
    }
}