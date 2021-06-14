package com.example.minggu_1.materi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minggu_1.R;

public class menu_uts extends AppCompatActivity {


    private Button btnSimpan;
    private EditText editkonpw;
    private EditText editPassword;
    private EditText editNoHp;
    private EditText editPekerjaan;
    private EditText editAlaamat;
    private EditText editNama;

    String nama,pekerjaan,no_hp,alamat,pw,kon_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_uts);
        initView();



    }

    private void initView() {
        btnSimpan = findViewById(R.id.btn_simpan);
        editkonpw = findViewById(R.id.edit_konfirmasi_pw);
        editPassword = findViewById(R.id.edit_password);
        editNoHp = findViewById(R.id.edit_no_hp);
        editPekerjaan = findViewById(R.id.edit_pekerjaan);
        editAlaamat = findViewById(R.id.edit_alaamat);
        editNama = findViewById(R.id.edit_nama);
    }

    public void btn_simpan(View view) {
        nama = editNama.getText().toString().trim();
        kon_pw = editkonpw.getText().toString().trim();
        no_hp = editNoHp.getText().toString().trim();
        pekerjaan = editPekerjaan.getText().toString().trim();
        alamat = editAlaamat.getText().toString().trim();
        pw = editPassword.getText().toString().trim();

        if (nama.equals("")){
            Toast.makeText(this, "nama tidak boleh kosong", Toast.LENGTH_SHORT).show();

        }else if (alamat.equals("")){
            Toast.makeText(this, "alamat tidak boleh kosong", Toast.LENGTH_SHORT).show();

        }else if (pekerjaan.equals("")){
            Toast.makeText(this, "pekerjaan tidak boleh kosong", Toast.LENGTH_SHORT).show();


        }else if (no_hp.equals("")){
            Toast.makeText(this, "no hp tidak boleh kosong", Toast.LENGTH_SHORT).show();

        }else if (pw.equals("")){
            Toast.makeText(this, "password tidak boleh kosong", Toast.LENGTH_SHORT).show();

        }else if (kon_pw.equals("")){
            Toast.makeText(this, "konfirmasi password tidak boleh kosong", Toast.LENGTH_SHORT).show();

        }else if (!pw.equals(kon_pw)){
            Toast.makeText(this, "konfirmasi pasword tidak sama", Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this, "berhasil", Toast.LENGTH_SHORT).show();


        }



    }
}