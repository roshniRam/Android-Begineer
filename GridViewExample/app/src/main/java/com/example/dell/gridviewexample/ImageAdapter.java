package com.example.dell.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Dell on 20/12/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 600));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.aurangabad, R.drawable.jaiselmer,
            R.drawable.paro, R.drawable.trivandrum,
            R.drawable.jaiselmer, R.drawable.aurangabad,
            R.drawable.ic_launcher_background, R.drawable.trivandrum,
            R.drawable.aurangabad, R.drawable.paro,
            R.drawable.trivandrum, R.drawable.jaiselmer,
            R.drawable.paro, R.drawable.ic_launcher_background,
            R.drawable.aurangabad, R.drawable.trivandrum,
            R.drawable.ic_launcher_background, R.drawable.paro,
            R.drawable.jaiselmer, R.drawable.trivandrum,
            R.drawable.paro, R.drawable.aurangabad
    };
}
