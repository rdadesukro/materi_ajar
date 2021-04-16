package com.example.minggu_1.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu_1.R;
import com.example.minggu_1.adapter.adapter_materi;
import com.example.minggu_1.model.materi;

import java.util.ArrayList;
import java.util.List;


public class menu_materi_pertemuan extends AppCompatActivity {

    private RecyclerView rv;
    materi[] myListData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_materi_pertemuan);
        initView();
        for (int i = 0; i < 9; i++) {
             myListData = new materi[]{
                    new materi("Minggu Ke-"+i, ""+i,""),
            };

        }
        adapter_materi adapter = new adapter_materi(this,generateSimpleList());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }
    private List<materi> generateSimpleList() {
        List<materi> simpleViewModelList = new ArrayList<>();

        for (int i = 1; i <=9; i++) {
            simpleViewModelList.add(new materi("Minggu Ke- "+i,""+i,""+i));
        }

        return simpleViewModelList;
    }

    private void initView() {
        rv = findViewById(R.id.rv);
    }
}