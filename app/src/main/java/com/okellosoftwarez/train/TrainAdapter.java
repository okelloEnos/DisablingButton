package com.okellosoftwarez.train;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrainAdapter extends RecyclerView.Adapter<TrainAdapter.ViewHolder> {

    private ArrayList<Train> trains;
    private Context mContext;

    public TrainAdapter(Context context, ArrayList<Train> list){
        trains = list;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder Vholder = new ViewHolder(view);
        return Vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {

        holder.tvName.setText(trains.get(position).getName());
        holder.tvPhone.setText(trains.get(position).getPhone());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(mContext, trains.get(position).getMail(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, DETAIL.class);
                intent.putExtra("name",trains.get(position).getName());
                intent.putExtra("phone", trains.get(position).getPhone());
                intent.putExtra("mail", trains.get(position).getMail());
                intent.putExtra("button", MainActivity.buttonString);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return trains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvName,tvPhone;
        LinearLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.textView);
            tvPhone = itemView.findViewById(R.id.textView2);
            layout = itemView.findViewById(R.id.layout);

        }
    }
}
