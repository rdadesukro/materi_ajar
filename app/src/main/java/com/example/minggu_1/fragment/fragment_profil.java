package com.example.minggu_1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.minggu_1.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class fragment_profil extends Fragment  {

    int conunter = 10;
    @BindView(R.id.swifeRefresh)
    SwipeRefreshLayout swifeRefresh;
    @BindView(R.id.txt_tdk_ada)
    TextView txtTdkAda;
    @BindView(R.id.img_data2)
    ImageView imgData2;
    private RecyclerView.LayoutManager mManager, manager;
    int jumlah_notif = 0;
    String id_status_notif;
    Boolean cek;
//    private adapter_notif adapter_notif;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;


    String status_login, auth;


    @BindView(R.id.rv_aku)
    RecyclerView Recycler;
    int page_new;
//    notif countryPresenter;
    String id_user,jenis_login;

    public fragment_profil() {
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
        View view = inflater.inflate(R.layout.new_menu_notif, container, false);
        ButterKnife.bind(this, view);

//        status_login = Guru.getString("status_login", "false");
//        id_user = Guru.getString("id_user", "false");
//        jenis_login = Guru.getString("pilih_login", "false");
//        Log.i("id_user_notif", "id_user_notif: "+id_user);
//        countryPresenter = new notif(this, getActivity());
//        countryPresenter.get_notif();

        swifeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

//                countryPresenter.get_notif();
            }
        });

        return view;


    }

    @Override
    public void onResume() {
        super.onResume();
//        countryPresenter.get_notif();

    }



    @Override
    public void onStart() {
        super.onStart();
//        countryPresenter.get_notif();
    }

//    @Override
//    public void notif(List<IsiItem_notif> notif) {
//        Log.i("isi_event", "event: " + notif.size());
//        adapter_notif = new adapter_notif(getActivity(), notif, 1);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        Recycler.setLayoutManager(layoutManager);
//        Recycler.setAdapter(adapter_notif);
//        swifeRefresh.setRefreshing(false);
//        if (notif.size() == 0) {
//            txtTdkAda.setVisibility(View.VISIBLE);
//            imgData2.setVisibility(View.VISIBLE);
//            progressBar.setVisibility(View.GONE);
//        } else {
//            txtTdkAda.setVisibility(View.GONE);
//            imgData2.setVisibility(View.GONE);
//            progressBar.setVisibility(View.GONE);
//        }
//        jumlah_notif = 0;
//        for (int i = 0; i < notif.size(); i++) {
//            id_status_notif = notif.get(i).getUserStatusRead();
//            cek = id_status_notif.contains(id_user);
//            if (cek) {
//
//            } else {
//                jumlah_notif = jumlah_notif + 1;
//
//            }
//
//        }
//        Log.i("data_cek", "notif: "+cek);
//        if (jumlah_notif == 0) {
//
//            if (jenis_login.equals("warga")){
//                new_menu_utama.badge.setVisible(false);
//            }else {
//                new_menu_instansi.badge.setVisible(false);
//            }
//
//
//        } else {
//            if (jenis_login.equals("warga")){
//                new_menu_utama.badge.setVisible(true);
//                new_menu_utama.badge.setNumber(jumlah_notif);
//            }else {
//                new_menu_instansi.badge.setVisible(true);
//                new_menu_instansi.badge.setNumber(jumlah_notif);
//            }
//
//        }
//
//
//        Log.i("jumlah_notif_baru", "notif: " + jumlah_notif);
//    }
}