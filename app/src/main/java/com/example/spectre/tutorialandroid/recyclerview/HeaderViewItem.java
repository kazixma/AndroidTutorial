package com.example.spectre.tutorialandroid.recyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.spectre.tutorialandroid.R;

/**
 * Created by Spectre on 7/2/2017.
 */

public class HeaderViewItem extends LinearLayout {
    private Context context;

    public HeaderViewItem(Context context) {
        super(context);
        this.context = context;
    }

    public HeaderViewItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public HeaderViewItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_header, this, true);


    }
}
