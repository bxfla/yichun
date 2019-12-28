package com.hy.powerplatform.oaflow.activity.oa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hy.powerplatform.R;
import com.hy.powerplatform.http.base.AlertDialogUtil;
import com.hy.powerplatform.http.base.BaseActivity;
import com.hy.powerplatform.http.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.http.utils.BaseViewHolder;
import com.hy.powerplatform.http.views.Header;
import com.hy.powerplatform.login.bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OAListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    Intent intent;
    BaseRecyclerAdapter mAdapter;
    AlertDialogUtil alertDialogUtil;
    List<ItemBean> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        //添加模块
        addItem();
        setItemAdapter();
        alertDialogUtil = new AlertDialogUtil(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_oalist;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    private void addItem() {
        ItemBean bean1 = new ItemBean();
        int drawableId1 = getResources().getIdentifier("oaflow_oa_rb1", "drawable", this.getPackageName());
        bean1.setAddress(drawableId1);
        bean1.setName(getResources().getString(R.string.oaflow_oa_rb1));
        itemList.add(bean1);

        ItemBean bean2 = new ItemBean();
        int drawableId2 = getResources().getIdentifier("oaflow_oa_rb2", "drawable", this.getPackageName());
        bean2.setAddress(drawableId2);
        bean2.setName(getResources().getString(R.string.oaflow_oa_rb2));
        itemList.add(bean2);

        ItemBean bean3 = new ItemBean();
        int drawableId3 = getResources().getIdentifier("oaflow_oa_rb3", "drawable", this.getPackageName());
        bean3.setAddress(drawableId3);
        bean3.setName(getResources().getString(R.string.oaflow_oa_rb3));
        itemList.add(bean3);

        ItemBean bean4 = new ItemBean();
        int drawableId4 = getResources().getIdentifier("oaflow_oa_rb4", "drawable", this.getPackageName());
        bean4.setAddress(drawableId4);
        bean4.setName(getResources().getString(R.string.oaflow_oa_rb4));
        itemList.add(bean4);

        ItemBean bean5 = new ItemBean();
        int drawableId5 = getResources().getIdentifier("oaflow_oa_rb5", "drawable", this.getPackageName());
        bean5.setAddress(drawableId5);
        bean5.setName(getResources().getString(R.string.oaflow_oa_rb5));
        itemList.add(bean5);

        ItemBean bean6 = new ItemBean();
        int drawableId6 = getResources().getIdentifier("oaflow_oa_rb6", "drawable", this.getPackageName());
        bean6.setAddress(drawableId6);
        bean6.setName(getResources().getString(R.string.oaflow_oa_rb6));
        itemList.add(bean6);
    }

    private void setItemAdapter() {
        GridLayoutManager manager = new GridLayoutManager (this,4);
        recyclerView.setLayoutManager(manager);
        mAdapter = new BaseRecyclerAdapter<ItemBean>(this, R.layout.adapter_itembean, itemList) {
            @Override
            public void convert(BaseViewHolder holder, final ItemBean itemBean,int position) {
                holder.setText(R.id.textView, itemBean.getName());
                holder.setImageResource(R.id.imageView, itemBean.getAddress());
                holder.setOnClickListener(R.id.linearLayout, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb1))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb2))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb3))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb4))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb5))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_oa_rb6))){
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_open));
                        }
                    }
                });
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
