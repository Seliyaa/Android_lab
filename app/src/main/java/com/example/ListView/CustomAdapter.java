package com.example.ListView;// CustomAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linearlayout.R;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private String[] animals;
    private int[] images;

    public CustomAdapter(Context context, String[] animals, int[] images) {
        this.context = context;
        this.animals = animals;
        this.images = images;
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return animals[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.text_view);

        imageView.setImageResource(images[position]);
        textView.setText(animals[position]);

        return convertView;
    }
}
