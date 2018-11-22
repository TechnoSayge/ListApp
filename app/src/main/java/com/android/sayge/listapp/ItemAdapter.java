package com.android.sayge.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] descriptions;

    public void getCount(Context c, String[] i, String[] p, String [] d) {
        items = i;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    return;
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView tvname = (TextView) v.findViewById(R.id.tvname);
        TextView tvdescription = (TextView) v.findViewById(R.id.tvdescription);
        TextView tvprice = (TextView) v.findViewById(R.id.tvprice);

        String name = items[i];
        String desc = descriptions[i];
        String cost = prices[i];

        tvname.setText(name);
        tvdescription.setText(desc);
        tvprice.setText(cost);

        return v;
    }
}
