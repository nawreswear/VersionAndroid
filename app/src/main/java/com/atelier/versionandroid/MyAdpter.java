package com.atelier.versionandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdpter extends RecyclerView.Adapter<MyViewHolder> {
    static List<Item> items;
     Context context;

    public MyAdpter(Context context, List<Item> items) {
        this.context=context;
        this.items=items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    final Item item=items.get(position);
        holder.name.setText(item.getNom());
        holder.version.setText(item.getVersion());
        holder.image.setImageResource(item.getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }



}
