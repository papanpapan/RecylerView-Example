package com.example.samim.json_glyed_volly_recylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.samim.json_glyed_volly_recylerview.Adapter.ProgramingAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView programingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        programingList=(RecyclerView)findViewById(R.id.programingList);
        programingList.setLayoutManager(new LinearLayoutManager(this));
        String[]name={"samim","papan","amit","babul","tuhin","rubel","princess","Asha","bapul","suporma","Somenath","samim","papan","amit","babul","tuhin","rubel","princess","Asha","bapul","suporma","Somenath"};
        programingList.setAdapter(new ProgramingAdapter(name));
    }
}
