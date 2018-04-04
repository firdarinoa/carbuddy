package com.example.firdasahidi.carbuddy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.firdasahidi.carbuddy.R;
import com.example.firdasahidi.carbuddy.model.ScanHistoryModel;
import com.example.firdasahidi.carbuddy.model.ScanResultsModel;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * Created by FirdaRinoa on 11/6/17.
 */

public class ScanResultsAdapter extends RecyclerView.Adapter<ScanResultsAdapter.MyViewHolder> {

    private List<ScanResultsModel> problemList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,desc;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
        }

    }

    public ScanResultsAdapter(List<ScanResultsModel> problemList){
        this.problemList = problemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.results_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ScanResultsModel date = problemList.get(position);
        holder.title.setText(date.getTitle());
        holder.desc.setText(date.getDesc());
    }

    @Override
    public int getItemCount() {
        return problemList.size();
    }
}
