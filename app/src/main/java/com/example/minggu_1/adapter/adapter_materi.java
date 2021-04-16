package com.example.minggu_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu_1.R;
import com.example.minggu_1.model.materi;

import java.util.List;

public class adapter_materi  extends RecyclerView.Adapter<adapter_materi.ViewHolder> {

    private List<materi> mList ;
    private Context ctx;

    // RecyclerView recyclerView;
    public adapter_materi(Context ctx, List<materi> mList) {
        this.mList = mList;
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
        final materi myListData = mList.get(position);
        holder.tgl.setText(myListData.getTgl());
        holder.minggu.setText(myListData.getMinggu());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getId(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return mList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView minggu,tgl;
        public CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.minggu = (TextView) itemView.findViewById(R.id.txt_minggu);
            this.tgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            this.cardView = (CardView) itemView.findViewById(R.id.card);
        }
    }
}
