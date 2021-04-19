package com.example.minggu_1.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu_1.MainActivity;
import com.example.minggu_1.R;
import com.example.minggu_1.crud;
import com.example.minggu_1.kalkulator;
import com.example.minggu_1.model.materi;

import java.util.List;

public class adapter_materi  extends RecyclerView.Adapter<adapter_materi.ViewHolder> {

    private List<materi> mList ;
    private Context ctx;
    private materi[] listdata;
    // RecyclerView recyclerView;
    public adapter_materi(Context ctx, materi[] listdata) {
        this.listdata = listdata;
        this.ctx = ctx;
    }
    @NonNull
    @Override
    public adapter_materi.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.model_materi, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_materi.ViewHolder holder, int position) {

        final materi myListData = listdata[position];
        holder.tgl.setText(listdata[position].getTgl());
        holder.minggu.setText(listdata[position].getMinggu());
        holder.judul.setText(listdata[position].getJudul());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0){
                    Intent intent = new Intent(ctx, MainActivity.class);
                    ctx.startActivity(intent);
                }else if (position==1){
                    Intent intent = new Intent(ctx, kalkulator.class);
                    ctx.startActivity(intent);
                }else if (position==2){

                }else if (position==3){
                    Intent intent = new Intent(ctx, crud.class);
                    ctx.startActivity(intent);
                }else if (position==4){

                }else if (position==5){

                }else if (position==6){

                }else if (position==7){

                }else {

                }

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return listdata.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView minggu,tgl,judul;
        public CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.minggu = (TextView) itemView.findViewById(R.id.txt_minggu);
            this.judul = (TextView) itemView.findViewById(R.id.txt_judul);
            this.tgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            this.cardView = (CardView) itemView.findViewById(R.id.card);
        }
    }
}
