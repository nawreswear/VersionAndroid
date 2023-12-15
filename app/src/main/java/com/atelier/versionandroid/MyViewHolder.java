package com.atelier.versionandroid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
     ImageView image;
     TextView name,version;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.imageView);
        name=itemView.findViewById(R.id.nom);
        version=itemView.findViewById(R.id.version);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item=MyAdpter.items.get(getAdapterPosition());
               Toast t= Toast.makeText(itemView.getContext(),item.getNom(),Toast.LENGTH_LONG);
                t.show();
            }
        });
    }

    public ImageView getImage() {
        return image;
    }

    public TextView getName() {
        return name;
    }

    public TextView getVersion() {
        return version;
    }
}
