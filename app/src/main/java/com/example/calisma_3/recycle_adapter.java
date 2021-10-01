package com.example.calisma_3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycle_adapter extends  RecyclerView.Adapter<recycle_adapter.ItemViewHolder>{
    ArrayList<String> itemName;
    ArrayList<Integer> itemPrice;
    ArrayList<Integer> itemImage;
    Button buy;
    Context context;

    public recycle_adapter(ArrayList<String> itemName, ArrayList<Integer> itemPrice, ArrayList<Integer> itemImage, Button buy, Context context) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
        this.buy = buy;
        this.context = context;
    }

    @NonNull
    
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_example,parent,false);
        
        return new ItemViewHolder(view);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull  recycle_adapter.ItemViewHolder holder, int position) {
        holder.textViewItem.setText(itemName.get(position));
        holder.textViewPrice.setText(itemPrice.get(position));
        holder.imageView.setImageResource(itemImage.get(position));

        holder.buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "added to cart", Toast.LENGTH_SHORT).show();
            }
        });





    }

    @Override
    public int getItemCount() {
        return itemName.size();
    }



    public  class  ItemViewHolder extends RecyclerView.ViewHolder {
        private  TextView textViewItem;
        private TextView textViewPrice;
        private  ImageView imageView;
        private  Button buy;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewItem= itemView.findViewById(R.id.textViewItem);
            textViewPrice=itemView.findViewById(R.id.textViewPrice);
            imageView=itemView.findViewById(R.id.profile_image);
            buy=itemView.findViewById(R.id.buttonBuy);
        }
    }
}
