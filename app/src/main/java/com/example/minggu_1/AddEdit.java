package com.example.minggu_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.minggu_1.db_kontak.Helper;
import com.example.minggu_1.model.konta_new;

public class AddEdit extends AppCompatActivity {
    EditText txt_id, txt_name, txt_address;
    Button btn_submit, btn_cancel;
    Helper SQLite = new Helper(this);
    String id, name, address;
    private SqliteDatabase mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit);
        txt_id = (EditText) findViewById(R.id.txt_id);
        txt_name = (EditText) findViewById(R.id.txt_name);
        txt_address = (EditText) findViewById(R.id.txt_address);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);

        id = getIntent().getStringExtra(crud.TAG_ID);
        name = getIntent().getStringExtra(crud.TAG_NAME);
        address = getIntent().getStringExtra(crud.TAG_ADDRESS);

        if (id == null || id == "") {
            setTitle("Add Data");
        } else {
            setTitle("Edit Data");
            txt_id.setText(id);
            txt_name.setText(name);
            txt_address.setText(address);
        }

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final String name = txt_name.getText().toString();
                    final String ph_no = txt_address.getText().toString();

                    if(TextUtils.isEmpty(name)){
                        Toast.makeText(AddEdit.this, "Something went wrong. Check your input values", Toast.LENGTH_LONG).show();
                    }
                    else{
                        konta_new newContact = new konta_new(name, ph_no);
                        mDatabase.addContacts(newContact);

                        finish();
                        startActivity(getIntent());
                    }
                }catch (Exception e){
                    Log.i("cek_pross_tmabah", "onClick: "+e);
                }

            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blank();
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }



    // Make blank all Edit Text
    private void blank() {
        txt_name.requestFocus();
        txt_id.setText(null);
        txt_name.setText(null);
        txt_address.setText(null);
    }

    // Save data to SQLite database
//    private void save() {
//        if (String.valueOf(txt_name.getText()).equals(null) || String.valueOf(txt_name.getText()).equals("") ||
//                String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals("")) {
//            Toast.makeText(getApplicationContext(),
//                    "Please input name or address ...", Toast.LENGTH_SHORT).show();
//        } else {
//            SQLite.insert(txt_name.getText().toString().trim(), txt_address.getText().toString().trim());
//            blank();
//            finish();
//        }
//    }
//
//    // Update data in SQLite database
//    private void edit() {
//        if (String.valueOf(txt_name.getText()).equals(null) || String.valueOf(txt_name.getText()).equals("") ||
//                String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals("")) {
//            Toast.makeText(getApplicationContext(),
//                    "Please input name or address ...", Toast.LENGTH_SHORT).show();
//        } else {
//            SQLite.update(Integer.parseInt(txt_id.getText().toString().trim()), txt_name.getText().toString().trim(),
//                    txt_address.getText().toString().trim());
//            blank();
//            finish();
//        }
//    }
}