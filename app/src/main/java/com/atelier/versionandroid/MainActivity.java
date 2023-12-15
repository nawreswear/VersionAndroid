package com.atelier.versionandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView Re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  init();
        Re=findViewById(R.id.re);
        remplir();
    }

    private void remplir() {
        List<Item>items=new ArrayList<Item>();
        items.add(new Item("Cupcake","1.5",R.drawable.cupcake));
        items.add(new Item("Donut","1.5",R.drawable.donut));
        items.add(new Item("eclair","1.5",R.drawable.eclair));
        items.add(new Item("froyo","1.5",R.drawable.froyo));
        items.add(new Item("gingerbread","1.5",R.drawable.gingerbread));
        items.add(new Item("honeycomb","1.5",R.drawable.honeycomb));
        items.add(new Item("icecreamsandwitch","1.5",R.drawable.icecreamsandwitch));
        items.add(new Item("jellybean","1.5",R.drawable.jellybean));
        items.add(new Item("kitkat","1.5",R.drawable.kitkat));
        items.add(new Item("lollipop","1.5",R.drawable.lollipop));
        items.add(new Item("marshmallow","1.5",R.drawable.marshmallow));
        items.add(new Item("nouga","1.5",R.drawable.nouga));
        items.add(new Item("oreo","1.5",R.drawable.oreo));
        items.add(new Item("pie","1.5",R.drawable.pie));
        Re.setLayoutManager(new LinearLayoutManager(this));
        Re.setAdapter(new MyAdpter(getApplicationContext(),items));
    }
}