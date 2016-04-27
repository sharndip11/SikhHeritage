package com.example.sharndip.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by sosa on 26/04/16.
 */
public class CustomAdapterHist extends BaseAdapter implements ListAdapter {
    int [] result;
    int [] imageId;
    int _index;
    View rowView;

    private static LayoutInflater inflater=null;

    public CustomAdapterHist(Context context, int[] prgmNameList, int[] prgmImages, int index) {
        result=prgmNameList;
        imageId=prgmImages;
        _index = index;
        this.rowView = new View(context);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView tv, tv2;
        ImageView img, img2;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        if (_index == 0) {
            this.rowView = inflater.inflate(R.layout.fragment_histoire_itit, null);
            holder.tv=(TextView) rowView.findViewById(R.id.textView1);
            holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
            holder.tv2=(TextView) rowView.findViewById(R.id.textView2);
            holder.img2=(ImageView) rowView.findViewById(R.id.imageView2);
            holder.tv.setText(result[position]);
            holder.img.setImageResource(imageId[position]);
            position++;
            holder.tv2.setText(result[position]);
            holder.img2.setImageResource(imageId[position]);
        } else if (_index == 1) {
            this.rowView = inflater.inflate(R.layout.fragment_histoire_it, null);
            holder.tv=(TextView) rowView.findViewById(R.id.textView1);
            holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
            holder.tv.setText(result[position]);
            holder.img.setImageResource(imageId[position]);
        } else if (_index == 2) {
            this.rowView = inflater.inflate(R.layout.fragment_histoire_t, null);
            holder.tv=(TextView) rowView.findViewById(R.id.textView1);
            holder.tv.setText(result[position]);
        }
        return this.rowView;
    }
}
