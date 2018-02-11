package com.example.samim.json_glyed_volly_recylerview.Adapter;

import android.os.StrictMode;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samim.json_glyed_volly_recylerview.R;

/**
 * Created by SAMIM on 2/9/2018.
 */

public class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.ProgramingViewHolder> {
    private String[] data;
    public ProgramingAdapter(String[] data){

        this.data=data;
    }
    @Override
    public ProgramingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgramingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgramingViewHolder holder, int position) {
      String title =data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;

        public ProgramingViewHolder(View itemView) {
            super(itemView);
            imgIcon=itemView.findViewById(R.id.imgItem);
            txtTitle=itemView.findViewById(R.id.textTitle);
        }
    }
}
