package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        module = new ArrayList<Module>();

        if(year.equalsIgnoreCase("Year 1")){
            module.add(new Module("B208",true));
            module.add(new Module("C234",false));
            module.add(new Module("B267",true));
        } else if (year.equalsIgnoreCase("year 2")){
            module.add(new Module("C208",true));
            module.add(new Module("C200",false));
            module.add(new Module("C346",true));
        } else {
            module.add(new Module("C349",true));
            module.add(new Module("C105",true));
            module.add(new Module("C347",true));
        }

        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);




    }



}
