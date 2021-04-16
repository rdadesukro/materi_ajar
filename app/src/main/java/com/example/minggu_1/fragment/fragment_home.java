package com.example.minggu_1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.minggu_1.R;
import com.example.minggu_1.menu.menu_materi_pertemuan;

import butterknife.ButterKnife;


public class fragment_home extends Fragment {


    private CardView cardPustaka;
    private CardView cardAbsen;
    private CardView cardTugas;
    private CardView cardMateri;

    public fragment_home() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_menu_home, container, false);
        ButterKnife.bind(this, view);
        initView(view);

        return view;


    }

    @Override
    public void onResume() {
        super.onResume();


    }


    @Override
    public void onStart() {
        super.onStart();

    }

    private void initView(View v) {
        cardPustaka =  v.findViewById(R.id.card_pustaka);
        cardAbsen =  v.findViewById(R.id.card_absen);
        cardTugas =  v.findViewById(R.id.card_tugas);
        cardMateri =  v.findViewById(R.id.card_materi);

        cardMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent materi = new Intent(getActivity(), menu_materi_pertemuan.class);
               startActivity(materi);
            }
        });
    }
}