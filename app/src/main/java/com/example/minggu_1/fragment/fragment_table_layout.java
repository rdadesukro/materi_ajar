package com.example.minggu_1.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.minggu_1.R;

import butterknife.ButterKnife;

;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_table_layout extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

    }

    public fragment_table_layout() {

    }

    public static fragment_table_layout newInstance(int sectionNumber) {
        fragment_table_layout fragment = new fragment_table_layout();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        Log.i("isi", "newInstance: " + fragment);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_data, container, false);
        View view = inflater.inflate(R.layout.table_layout, container, false);
        setHasOptionsMenu(true);
        ButterKnife.bind(this, view);




        return view;


    }




    @Override
    public void onResume() {
        super.onResume();

    }




}
