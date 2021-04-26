package com.example.minggu_1.materi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.minggu_1.R;

import androidx.appcompat.app.AppCompatActivity;

public class tugas_ke_2 extends AppCompatActivity {

    private Button btnKurang;
    private Button btnTambah;
    private Button btnKali;
    private EditText editDua;
    private Button btnBagi;
    private EditText editSatu;
    private TextView txtHaslil;

    float a,b,c;
    boolean isEmptyFields;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
        initView();
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka_satu =editSatu.getText().toString().trim();
                String angka_dua = editDua.getText().toString().trim();
                if (angka_satu.equals("")){
                    isEmptyFields = true;
                    editSatu.setError("Field ini tidak boleh kosong");
                    Toast.makeText(tugas_ke_2.this, "Kosong", Toast.LENGTH_SHORT).show();
                }else if (angka_dua.equals("")){
                    isEmptyFields = true;
                    editDua.setError("Field ini tidak boleh kosong");
                     Toast.makeText(tugas_ke_2.this, "Kosong", Toast.LENGTH_SHORT).show();
                }else {
                    a = Float.parseFloat(editSatu.getText() + "");
                    b = Float.parseFloat(editDua.getText() + "");
                    txtHaslil.setText(a+b+"");
                }



            }
        });
    }

    private void initView() {
        btnKurang = findViewById(R.id.btn_kurang);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKali = findViewById(R.id.btn_kali);
        editDua = findViewById(R.id.edit_dua);
        btnBagi = findViewById(R.id.btn_bagi);
        editSatu = findViewById(R.id.edit_satu);
        txtHaslil = findViewById(R.id.txt_haslil);


        isEmptyFields=false;






//
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
//    public void btn_tambah (View v){
//
//    }
}