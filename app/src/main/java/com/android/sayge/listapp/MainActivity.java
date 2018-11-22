package com.android.sayge.listapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvmy_dynamic;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        lvmy_dynamic = (ListView) findViewById(R.id.lvmy_dynamic);
        items = res.getStringArray(R.array.items);

        lvmy_dynamic.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));

    }
}
