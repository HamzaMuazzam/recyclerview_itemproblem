package com.example.new_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class My_viewholder extends RecyclerView.ViewHolder {
    TextView name, age;


    public My_viewholder(@NonNull final View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tv_name_itemlist);
        age = itemView.findViewById(R.id.tv_age_itemlist);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age.setVisibility(View.VISIBLE);
                name.setVisibility(View.GONE);


            }
        });

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
                name.setVisibility(View.VISIBLE);
                age.setVisibility(View.GONE);


            }
        });

    }
}
