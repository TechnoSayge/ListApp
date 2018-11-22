package com.android.sayge.listapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvmy_dynamic;
    String[] items;
    String[] prices;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        lvmy_dynamic = (ListView) findViewById(R.id.lvmy_dynamic);
        items = res.getStringArray(R.array.items);
        prices  = res.getStringArray(R.array.prices);
        descriptions = res.getStringArray(R.array.descriptions);

        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        lvmy_dynamic.setAdapter(itemAdapter);
/*
        // lvmy_dynamic.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));
*/
    }
}
