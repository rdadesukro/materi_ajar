package com.example.minggu_1.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu_1.R;
import com.example.minggu_1.SqliteDatabase;
import com.example.minggu_1.model.konta_new;

import java.util.ArrayList;

public class adapter_sqlite extends RecyclerView.Adapter<adapter_sqlite.ViewHolder> {


    private Context ctx;


    private SqliteDatabase mDatabase;
    private OnImageClickListener onImageClickListener;
    private ArrayList<konta_new> mList ;


    public adapter_sqlite(Context ctx, ArrayList<konta_new> listContacts ,OnImageClickListener onImageClickListener) {
        this.mList = listContacts;
        this.ctx = ctx;
        this.onImageClickListener = onImageClickListener;
        mDatabase = new SqliteDatabase(ctx);


    }
    public interface OnImageClickListener {
        void edit(konta_new id,String nama,String no_hp);
        void  hapus(String id);
    }

    @NonNull
    @Override
    public adapter_sqlite.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.model_data, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_sqlite.ViewHolder holder, int position) {
        konta_new data = mList.get(position);
        holder.nama.setText(data.getName());
        holder.adres.setText(data.getPhno());

        holder.konta_new = data;
    }

    @Override
    public int getItemCount()
    {

        return mList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nama,adres;
        public ImageView edit,hapus;

        konta_new konta_new;
        public ViewHolder(View itemView) {
            super(itemView);
            this.nama = (TextView) itemView.findViewById(R.id.name);
            this.hapus = (ImageView) itemView.findViewById(R.id.btn_hapus);
            this.edit = (ImageView) itemView.findViewById(R.id.btn_edit);
            this.nama = (TextView) itemView.findViewById(R.id.name);
            this.adres = (TextView) itemView.findViewById(R.id.address);



            hapus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    onImageClickListener.hapus(String.valueOf(konta_new.getId()));
//
                }
            });

            edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onImageClickListener.edit(konta_new,"","");
                    onImageClickListener.edit(konta_new,konta_new.getName(),konta_new.getPhno());
//
                }
            });
        }
    }
}
