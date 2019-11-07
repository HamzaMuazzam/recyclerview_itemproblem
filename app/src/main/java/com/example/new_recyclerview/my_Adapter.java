package com.example.new_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class my_Adapter extends RecyclerView.Adapter<My_viewholder> {
    private ArrayList<My_modelclass> list;
    private Context context;
    private My_viewholder viewholder;
    private static int global_position;


    public my_Adapter(ArrayList<My_modelclass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public My_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_layout, parent, false);
        return new My_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final My_viewholder holder, final int position) {
//       holder.setIsRecyclable(false);

        holder.name.setText(list.get(position).getName());
        holder.age.setText(list.get(position).getAge());


        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global_position=holder.getAdapterPosition();
                Toast.makeText(context, "Local Postion:"+position+"\n Global position:" +global_position
                        , Toast.LENGTH_SHORT).show();

                if (global_position == position) {
                    holder.name.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {

        return list.size();

    }


}
