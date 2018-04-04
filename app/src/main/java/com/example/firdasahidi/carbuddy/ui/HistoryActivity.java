package com.example.firdasahidi.carbuddy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.firdasahidi.carbuddy.R;
import com.example.firdasahidi.carbuddy.adapter.ScanHistoryAdapter;
import com.example.firdasahidi.carbuddy.model.ScanHistoryModel;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private List<ScanHistoryModel> dateList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ScanHistoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new ScanHistoryAdapter(dateList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        dateData();

    }

    private  void dateData(){
        ScanHistoryModel date = new ScanHistoryModel("7 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);
        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);
        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);
        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 August 2017");
        dateList.add(date);

        date = new ScanHistoryModel("27 September 2017");
        dateList.add(date);
        mAdapter.notifyDataSetChanged();
    }
}
