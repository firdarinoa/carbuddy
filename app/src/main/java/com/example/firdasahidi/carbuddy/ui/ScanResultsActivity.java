package com.example.firdasahidi.carbuddy.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.firdasahidi.carbuddy.R;
import com.example.firdasahidi.carbuddy.adapter.ScanHistoryAdapter;
import com.example.firdasahidi.carbuddy.adapter.ScanResultsAdapter;
import com.example.firdasahidi.carbuddy.model.ScanHistoryModel;
import com.example.firdasahidi.carbuddy.model.ScanResultsModel;

import java.util.ArrayList;
import java.util.List;

public class ScanResultsActivity extends AppCompatActivity {

    private List<ScanResultsModel> problemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ScanResultsAdapter dAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        dAdapter = new ScanResultsAdapter(problemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(dAdapter);

        problemData();
    }

    private void problemData(){
        ScanResultsModel problem = new ScanResultsModel("P0009", "The car engine is in trouble.");
        problemList.add(problem);

        problem = new ScanResultsModel("P0123", "The brake malfunction.");
        problemList.add(problem);

        problem = new ScanResultsModel("P0134", "O2 Sensor Circuit No Activity Detected Bank 1 Sensor 1 ");
        problemList.add(problem);

        problem = new ScanResultsModel("P0030", "The brake malfunction.");
        problemList.add(problem);

        problem = new ScanResultsModel("P0124", "HO2S Heater Control Circuit Bank 1 Sensor 1");
        problemList.add(problem);

        problem = new ScanResultsModel("P0132", "O2 Sensor Circuit High Voltage Bank 1 Sensor 1 ");
        problemList.add(problem);

        problem = new ScanResultsModel("P0117", "Engine Coolant Temperature Circuit Low Input ");
        problemList.add(problem);

        problem = new ScanResultsModel("P0119", "Engine Coolant Temperature Circuit Intermittent ");
        problemList.add(problem);
        dAdapter.notifyDataSetChanged();
    }
}
