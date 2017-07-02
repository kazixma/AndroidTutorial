package com.example.spectre.tutorialandroid.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.spectre.tutorialandroid.R;

/**
 * Created by Spectre on 7/2/2017.
 */

public class SampleFragment extends Fragment {
    private TextView tvPage;

    public static SampleFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt("position", position);
        SampleFragment fragment = new SampleFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.fragment_sample, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        int position = bundle.getInt("position");
        tvPage = (TextView) view.findViewById(R.id.tv_page);
        tvPage.setText("Page " + position);

    }
}
