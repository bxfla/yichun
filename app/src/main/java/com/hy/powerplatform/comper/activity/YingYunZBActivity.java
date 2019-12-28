package com.hy.powerplatform.comper.activity;

import android.os.Bundle;

import com.hy.powerplatform.R;
import com.hy.powerplatform.http.base.BaseActivity;

import butterknife.ButterKnife;

public class YingYunZBActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_ying_yun_zb;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }
}
