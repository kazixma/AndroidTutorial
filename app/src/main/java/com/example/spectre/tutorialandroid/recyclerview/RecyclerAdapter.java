package com.example.spectre.tutorialandroid.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Spectre on 7/2/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    public RecyclerAdapter() {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class HeaderViewHolder extends RecyclerView.ViewHolder {


        public HeaderViewHolder(View itemView) {
            super(itemView);
        }
    }


    public static class CardViewHolder extends RecyclerView.ViewHolder {


        public CardViewHolder(View itemView) {
            super(itemView);
        }
    }


}
