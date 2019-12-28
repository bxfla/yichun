package com.hy.powerplatform.human;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.hy.powerplatform.R;
import com.hy.powerplatform.http.base.AlertDialogUtil;
import com.hy.powerplatform.http.base.BaseActivity;
import com.hy.powerplatform.http.views.Header;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HuManListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    @BindView(R.id.rb3)
    RadioButton rb3;
    AlertDialogUtil alertDialogUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_hu_man_list;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    @OnClick({R.id.rb1, R.id.rb2, R.id.rb3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                break;
            case R.id.rb2:
                alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                break;
            case R.id.rb3:
                alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                break;
        }
    }
}
