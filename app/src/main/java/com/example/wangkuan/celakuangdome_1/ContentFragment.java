package com.example.wangkuan.celakuangdome_1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1：左右
 * 2：名字
 * 3：日期
 */
public class ContentFragment extends Fragment {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }


}
