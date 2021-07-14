package com.example.minggu_1.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class contoh  extends RecyclerView.Adapter<contoh.ViewHolder> {
    @NonNull
    @NotNull
    @Override
    public contoh.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull contoh.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
