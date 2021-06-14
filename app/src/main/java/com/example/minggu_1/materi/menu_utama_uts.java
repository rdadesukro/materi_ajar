package com.example.minggu_1.materi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minggu_1.R;

public class menu_utama_uts extends AppCompatActivity {


    private TextView txtAlamat;
    private TextView textView9;
    private TextView textView10;
    private TextView txtNama;
    private TextView textView12;
    private TextView textView15;
    private TextView txtPekerjaan;
    private TextView txtNoHp;
    private TextView textView17;

    String nama,pekerjaa,alamat,no_hp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama_uts);
        initView();

        Bundle b =getIntent().getExtras();
        nama = b.getString("nama");
        alamat = b.getString("alamat");
        no_hp = b.getString("no_hp");
        pekerjaa = b.getString("pekerjaan");

        txtNama.setText(nama);
        txtAlamat.setText(alamat);
        txtPekerjaan.setText(pekerjaa);
        txtNoHp.setText(no_hp);
    }

    private void initView() {
        txtAlamat = findViewById(R.id.txt_alamat);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        txtNama = findViewById(R.id.txt_nama);
        textView12 = findViewById(R.id.textView12);
        textView15 = findViewById(R.id.textView15);
        txtPekerjaan = findViewById(R.id.txt_pekerjaan);
        txtNoHp = findViewById(R.id.txt_no_hp);
        textView17 = findViewById(R.id.textView17);
    }
}