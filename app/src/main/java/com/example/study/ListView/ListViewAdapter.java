package com.example.study.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.study.R;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    ListViewAdapter(Context context){
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static  class ViewHolder{
        public ImageView imageView;
        public TextView tl1;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tl1 = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        //给控件赋值
        holder.tl1.setText("这是标题");
        Glide.with(context).load("https://images.pexels.com/photos/2115562/pexels-photo-2115562.jpeg?cs=srgb&dl=analog-photography-art-beautiful-2115562.jpg&fm=jpg").into(holder.imageView);
        return convertView;
    }
}
