package com.example.minggu_1.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.minggu_1.R;

public class minggu_ke_2 extends AppCompatActivity {


    Button btn_jawab;
    EditText edit_jaawab;

    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minggu_ke_2);

        btn_jawab = findViewById(R.id.bt);
        edit_jaawab =findViewById(R.id.edit_nama);

        btn_jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edit_jaawab.getText().toString().trim();
                if (nama.equals("jokowi")){


                    Toast.makeText(minggu_ke_2.this, "Jawaban anda Benar", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(minggu_ke_2.this, "Jawaban anda Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}