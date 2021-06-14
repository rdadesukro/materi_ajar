package com.example.minggu_1.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.minggu_1.R;
import com.example.minggu_1.adapter.adapter_materi;
import com.example.minggu_1.adapter.adapter_tugas;
import com.example.minggu_1.model.materi;

public class menu_tugas extends AppCompatActivity {
    private RecyclerView rv;
    materi[] myListData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_tugas);
        initView();

        materi[] myListData = new materi[]{
                new materi("TUGAS KE-1","","19-April-2021","INTENT"),
                new materi("TUGAS KE-2","","19-April-2021","LOGIKA IF"),
                new materi("TUGAS KE-3","","19-April-2021","INTENT DAN FUNGSI IF"),
                new materi("UTS","","14-juni-2021","UTS"),

        };
        adapter_tugas adapter = new adapter_tugas(this,myListData);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
    private void initView() {
        rv = findViewById(R.id.rv);
    }
}