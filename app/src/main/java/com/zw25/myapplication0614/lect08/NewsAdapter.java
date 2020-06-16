package com.zw25.myapplication0614.lect08;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zw25.myapplication0614.R;

import java.util.List;

public class NewsAdapter extends BaseAdapter {
    private String TAG =NewsAdapter.class.getSimpleName();
    private Context mContext;
    private List<News> mDataList;


    public NewsAdapter(Context context,List<News> dataList){
        mContext =context;
        mDataList = dataList;
    }

    @Override
    public int getCount() {
        int count=(null == mDataList ? 0 : mDataList.size());
        Log.i(TAG,"-----getCount()" +count);
        return count;
    }

    @Override
    public News getItem(int position) {
        Log.i(TAG,"-----getItem()" +position);
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        Log.i(TAG,"-----getItemID()" +position);
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i(TAG,"-----getView()" +position+"convertView:"+convertView);
        LayoutInflater inflater =LayoutInflater.from(mContext);
        convertView = inflater.inflate(R.layout.activity_news,null);
        ImageView  iconIV= convertView.findViewById(R.id.iv_icon);
        TextView titTV=convertView.findViewById(R.id.tv_title);

        News news= mDataList.get(position);
        iconIV.setImageResource(news.getPicId());
        titTV.setText(news.getTitle());

        return convertView;
    }
}
