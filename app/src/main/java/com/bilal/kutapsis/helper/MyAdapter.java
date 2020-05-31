package com.bilal.kutapsis.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bilal.kutapsis.R;
import com.bilal.kutapsis.model.Hayvan;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    ArrayList<Hayvan> arrayList;
    public MyAdapter(Context applicationContext, ArrayList<Hayvan> itemList){
        this.context=applicationContext;
        this.arrayList=itemList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_item_hayvan_listesi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Hayvan list=arrayList.get(position);
        holder.txtHayvanFiyat.setText(list.getHayvanFiyat());
        holder.txtHayvanIsmi.setText(list.getHayvanIsmi());
        holder.txtCounter.setText(position+"");

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtHayvanIsmi, txtHayvanFiyat, txtCounter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHayvanIsmi = itemView.findViewById(R.id.txtHayvanIsmi);
            txtHayvanFiyat = itemView.findViewById(R.id.txtHayvanFiyat);
            txtCounter = itemView.findViewById(R.id.txtCounter);

        }
    }
}
