package com.example.spectre.tutorialandroid.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.spectre.tutorialandroid.BaseActivity;
import com.example.spectre.tutorialandroid.R;

/**
 * Created by Spectre on 7/2/2017.
 */

public class RecyclerViewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView rcv = (RecyclerView) findViewById(R.id.rcv);
        RecyclerAdapter adapter = new RecyclerAdapter();
        rcv.setAdapter(adapter);
    }


}
