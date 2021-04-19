package com.example.minggu_1.materi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minggu_1.R;

public class minggu_ke_3 extends AppCompatActivity {

    private Button btnRegister;
    private EditText editUsername;
    private EditText editPassword;
    private EditText editKonfir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minggu_3);
        initView();



    }

    private void initView() {
        btnRegister = findViewById(R.id.btn_register);
        editUsername = findViewById(R.id.edit_username);
        editPassword = findViewById(R.id.edit_password);
        editKonfir = findViewById(R.id.edit_konfir);
    }
    public void btn_register(View v){

        if (editUsername.getText().toString().equals("")) {
            Toast.makeText(this, "Username Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();

        }else if (editPassword.getText().toString().equals("")){
            Toast.makeText(this, "Password Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else if (editKonfir.getText().toString().equals("")){
            Toast.makeText(this, "Konfirmasi Password Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        } else if (editPassword.getText().toString().trim().equals(editKonfir.getText().toString().trim())){
            Intent intent = new Intent(this, minggu_ke_3_2.class);
            String user_name = editUsername.getText().toString().trim();
            intent.putExtra("USER_NAME", user_name);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Password dan Konfirmasi Password Tidak Sama", Toast.LENGTH_SHORT).show();
        }

    }
}