package com.example.callisto.testmaterial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        List<BranchAdapter.BranchItems> items=new ArrayList<BranchAdapter.BranchItems>();
        items.add( new BranchAdapter.BranchItems("Branch1","File List"));
        items.add( new BranchAdapter.BranchItems("Branch2","Create File"));
        items.add( new BranchAdapter.BranchItems("Branch3","Utilities"));
        items.add( new BranchAdapter.BranchItems("Branch4","Center Creation"));
        items.add( new BranchAdapter.BranchItems("Branch5","Group Formation"));
        items.add( new BranchAdapter.BranchItems("Branch6","20-02-2010"));
        items.add( new BranchAdapter.BranchItems("Branch7","12-02-2010"));
        items.add( new BranchAdapter.BranchItems("Branch8","11-02-2010"));
        items.add( new BranchAdapter.BranchItems("Branch9","13-02-2019"));



        recyclerView.setAdapter(new BranchAdapter(this,items,recyclerView));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
