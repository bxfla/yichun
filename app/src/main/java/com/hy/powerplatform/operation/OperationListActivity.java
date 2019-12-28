package com.hy.powerplatform.operation;

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

public class OperationListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    AlertDialogUtil alertDialogUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_operation_list;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    @OnClick({R.id.rb1, R.id.rb2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                break;
            case R.id.rb2:
                alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                break;
        }
    }
}
