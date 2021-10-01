package com.example.calisma_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    recycle_adapter adapter;

    ArrayList<String> itemName=new ArrayList<>();
    ArrayList<Integer> itemPrice=new ArrayList<>();
    ArrayList<Integer> itemImage=new ArrayList<>();
    Button buy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buy=findViewById(R.id.buttonBuy);

        recyclerView=findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        itemName.add("armut");
        itemName.add("elma");
        itemName.add("erik");
        itemName.add("portakal");


        itemPrice.add(1);
        itemPrice.add(2);
        itemPrice.add(3);
        itemPrice.add(4);


        itemImage.add(R.drawable.armut);
        itemImage.add(R.drawable.elma);
        itemImage.add(R.drawable.erik);
        itemImage.add(R.drawable.portakal);





        adapter=new recycle_adapter(itemName,itemPrice,itemImage,buy,MainActivity.this);
        recyclerView.setAdapter(adapter);


    }
}