package com.example.minggu_1.materi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minggu_1.R;

public class minggu_ke_3_2 extends AppCompatActivity {

    private TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minggu_ke_3_2);
        initView();
        Intent intent = getIntent();

        String user_name = intent.getStringExtra("USER_NAME");
        txtNama.setText("Selama Datang "+user_name+" Di Kampus Universitas Adiwangsa Kota Jambi");

    }

    private void initView() {
        txtNama = findViewById(R.id.txt_nama);
    }
}