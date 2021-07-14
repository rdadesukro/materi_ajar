package com.example.minggu_1.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.minggu_1.R;
import com.example.minggu_1.adapter.adapter_materi;
import com.example.minggu_1.adapter.adapter_rv;
import com.example.minggu_1.model.kontak;
import com.example.minggu_1.model.materi;

public class minggu_ke_4 extends AppCompatActivity {
    private RecyclerView rv;
    kontak[] myListData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minggu_4);
        initView();

        kontak[] myListData = new kontak[]{
                new kontak("Ade Sukron","","Online","Jambi",android.R.drawable.ic_delete),
                new kontak("Budi Setawan","","Offlie","Jambi",android.R.drawable.ic_delete),
                new kontak("Adam Malik","","Online","Jambi",android.R.drawable.ic_delete),
                new kontak("Andi","","Offlie","Jambi",android.R.drawable.ic_delete),
                new kontak("Momon","","Offlie","Jambi",android.R.drawable.ic_delete),
                new kontak("Bujang","","Online","Jambi",android.R.drawable.ic_delete),
                new kontak("Gadis","","Offlie","Jambi",android.R.drawable.ic_delete),
                new kontak("Mapan","","Online","Jambi",android.R.drawable.ic_delete),
                new kontak("Hadir","","Offlie","Jambi",android.R.drawable.ic_delete),

        };


        adapter_rv adapter = new adapter_rv(this,myListData);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
    private void initView() {
        rv = findViewById(R.id.rv);
    }
}