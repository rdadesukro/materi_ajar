package com.example.minggu_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.minggu_1.adapter.adapter;
import com.example.minggu_1.adapter.adapter_sqlite;
import com.example.minggu_1.db_kontak.Helper;
import com.example.minggu_1.model.Data;
import com.example.minggu_1.model.konta_new;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class crud extends AppCompatActivity implements adapter_sqlite.OnImageClickListener {



    private SqliteDatabase mDatabase;
    private RecyclerView rv;
    private ArrayList<konta_new> allContacts=new ArrayList<>();
    com.example.minggu_1.adapter.adapter_sqlite adapter;
   // Helper SQLite = new Helper(this);

    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_ADDRESS = "address";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);
      //  SQLite = new Helper(getApplicationContext());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
        mDatabase = new SqliteDatabase(this);
        allContacts = mDatabase.listContacts();
        if (allContacts.size() > 0) {
            adapter = new adapter_sqlite(crud.this, allContacts,this);
            rv.setAdapter(adapter);

        } else {

            Toast.makeText(this, "Data Tidak Ada", Toast.LENGTH_LONG).show();
        }
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                addTaskDialog();
            }
        });

    }
    private void addTaskDialog(){
        LayoutInflater inflater = LayoutInflater.from(this);
        View subView = inflater.inflate(R.layout.add_contact_layout, null);

        final EditText nameField = (EditText)subView.findViewById(R.id.enter_name);
        final EditText noField = (EditText)subView.findViewById(R.id.enter_phno);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add new CONTACT");
        builder.setView(subView);
        builder.create();

        builder.setPositiveButton("ADD CONTACT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final String name = nameField.getText().toString();
                final String ph_no = noField.getText().toString();

                if(TextUtils.isEmpty(name)){
                    Toast.makeText(crud.this, "Something went wrong. Check your input values", Toast.LENGTH_LONG).show();
                }
                else{
                    konta_new newContact = new konta_new(name, ph_no);
                    mDatabase.addContacts(newContact);

                    finish();
                    startActivity(getIntent());
                }
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(crud.this, "Task cancelled", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    private void editTaskDialog(String nama,String phone,final konta_new contacts){
        LayoutInflater inflater = LayoutInflater.from(this);
        View subView = inflater.inflate(R.layout.add_contact_layout, null);

        final EditText nameField = (EditText)subView.findViewById(R.id.enter_name);
        final EditText contactField = (EditText)subView.findViewById(R.id.enter_phno);
        nameField.setText(nama);
        contactField.setText(phone);



        final String name = nameField.getText().toString();
        final String ph_no = contactField.getText().toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Edit contact");
        builder.setView(subView);
        builder.create();

        builder.setPositiveButton("EDIT CONTACT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final String name = nameField.getText().toString();
                final String ph_no = contactField.getText().toString();

                if(TextUtils.isEmpty(name)){
                    Toast.makeText(crud.this, "Data Tidak Ada", Toast.LENGTH_LONG).show();
                }
                else{

                    mDatabase.updateContacts(new konta_new(contacts.getId(), name, ph_no));
                    finish();
                    startActivity(getIntent());

                }
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(crud.this, "Task cancelled", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }


    @Override
    public void edit(konta_new id, String nama, String no_hp) {
        editTaskDialog(nama,no_hp,id);
    }

    @Override
    public void hapus(String id) {
        mDatabase.deleteContact(Integer.parseInt(id));
        finish();
        startActivity(getIntent());

    }
}