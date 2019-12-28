package com.hy.powerplatform.login.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hy.powerplatform.R;

import butterknife.BindView;

/**
 * Created by Administrator on 2019/9/25.
 */

public class Fragment02 extends Fragment {
    View view;
    @BindView(R.id.tvmyName)
    TextView tvmyName;
    @BindView(R.id.myinform)
    LinearLayout myinform;
    @BindView(R.id.tvMyStatus)
    TextView tvMyStatus;
    @BindView(R.id.studyArchives)
    LinearLayout studyArchives;
    @BindView(R.id.tvVersion)
    TextView tvVersion;

    String versionName;
    int versionCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
