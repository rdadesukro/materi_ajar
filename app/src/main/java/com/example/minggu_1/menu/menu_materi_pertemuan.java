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

        materi[] myListData = new materi[]{
                new materi("Minggu Ke-1","","19-April-2021","Layout"),
                new materi("Minggu Ke-2","","19-April-2021","Button,Toast,EditText"),
                new materi("Minggu Ke-3","","19-April-2021","Intent put extra"),
                new materi("Minggu Ke-4","","19-April-2021","Listview dan RecyclerView"),
                new materi("Minggu Ke-5","","19-April-2021","Listview dan RecyclerView"),
                new materi("Minggu Ke-6","","19-April-2021","Sqlite Database"),
                new materi("Minggu Ke-7","","19-April-2021","Sqlite Database"),
                new materi("Minggu Ke-8","","19-April-2021","Sqlite Database"),
                new materi("Minggu Ke-9","","19-April-2021","Sqlite Database"),

        };
        adapter_materi adapter = new adapter_materi(this,myListData);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }
    private List<materi> generateSimpleList() {
        List<materi> simpleViewModelList = new ArrayList<>();

        for (int i = 1; i <=9; i++) {
//            simpleViewModelList.add(new materi("Minggu Ke- "+i,""+i,""+i));
        }

        return simpleViewModelList;
    }

    private void initView() {
        rv = findViewById(R.id.rv);
    }
}