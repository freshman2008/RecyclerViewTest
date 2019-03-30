package com.example.edward.recyclerviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter<T> extends CommonRVAdapter<T> {

    public MyAdapter(Context mContext, int layoutId, List<T> mDatas) {
        super(mContext, layoutId, mDatas);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        super.onBindViewHolder(viewHolder, position);

        ViewHolder holder = (ViewHolder)viewHolder;
        TextView tv = holder.getView(R.id.text_test);
        tv.setText((String)getDatas().get(position));
    }
}
