package com.example.firdasahidi.carbuddy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.firdasahidi.carbuddy.R;
import com.example.firdasahidi.carbuddy.model.ScanHistoryModel;

import java.util.List;

/**
 * Created by FirdaRinoa on 11/1/17.
 */

public class ScanHistoryAdapter extends RecyclerView.Adapter<ScanHistoryAdapter.MyViewHolder> {

    private List<ScanHistoryModel> dateList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView date;

        public  MyViewHolder(View view){
            super(view);
            date = (TextView) view.findViewById(R.id.tv_date);
        }
    }

    public ScanHistoryAdapter(List<ScanHistoryModel> dateList){
        this.dateList = dateList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ScanHistoryModel date = dateList.get(position);
        holder.date.setText(date.getDate());
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }
}
