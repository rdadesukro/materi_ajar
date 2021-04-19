package com.example.minggu_1.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu_1.R;
import com.example.minggu_1.crud;
import com.example.minggu_1.materi.minggu_ke_1;
import com.example.minggu_1.materi.minggu_ke_2;
import com.example.minggu_1.materi.minggu_ke_3;
import com.example.minggu_1.model.kontak;
import com.example.minggu_1.model.materi;

import java.util.List;

public class adapter_rv extends RecyclerView.Adapter<adapter_rv.ViewHolder> {

    private List<materi> mList ;
    private Context ctx;
    private kontak[] listdata;
    // RecyclerView recyclerView;
    public adapter_rv(Context ctx, kontak[] listdata) {
        this.listdata = listdata;
        this.ctx = ctx;
    }
    @NonNull
    @Override
    public adapter_rv.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.model_kontak, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_rv.ViewHolder holder, int position) {

        final kontak myListData = listdata[position];
        holder.tgl.setText(listdata[position].getTgl());
        holder.minggu.setText(listdata[position].getMinggu());
        holder.judul.setText(listdata[position].getJudul());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0){
                    Intent intent = new Intent(ctx, minggu_ke_1.class);
                    ctx.startActivity(intent);
                }else if (position==1){
                    Intent intent = new Intent(ctx, minggu_ke_2.class);
                    ctx.startActivity(intent);
                }else if (position==2){
                    Intent intent = new Intent(ctx, minggu_ke_3.class);
                    ctx.startActivity(intent);
                }else{
                    Intent intent = new Intent(ctx, crud.class);
                    ctx.startActivity(intent);
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
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.minggu = (TextView) itemView.findViewById(R.id.txt_minggu);
            this.judul = (TextView) itemView.findViewById(R.id.txt_judul);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView4);
            this.tgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            this.cardView = (CardView) itemView.findViewById(R.id.card);
        }
    }
}
