package com.hy.powerplatform.statist.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hy.powerplatform.R;
import com.hy.powerplatform.http.base.BaseActivity;
import com.hy.powerplatform.http.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.http.utils.BaseViewHolder;
import com.hy.powerplatform.http.views.Header;
import com.hy.powerplatform.statist.bean.PersonTongJi;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PersonTongJiActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.spread_line_chart)
    LineChart spreadLineChart;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    BaseRecyclerAdapter mAdapter;
    public LineData lineData = null;
    public ArrayList<String> x = new ArrayList<String>();
    public ArrayList<Entry> y = new ArrayList<Entry>();
    public ArrayList<LineDataSet> lineDataSets = new ArrayList<LineDataSet>();
    List<PersonTongJi> beanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        for (int i = 0;i<12;i++){
            PersonTongJi personTongJi = new PersonTongJi();
            personTongJi.setMonth((i+1)+"月");
            personTongJi.setInner((i+1)*225+"");
            personTongJi.setOuter((i+1)*22.66+"");
            beanList.add(personTongJi);
        }

        mAdapter = new BaseRecyclerAdapter<PersonTongJi>(this, R.layout.adapter_loginperson, beanList) {
            @Override
            public void convert(BaseViewHolder holder, final PersonTongJi itemBean, int position) {
                holder.setText(R.id.tvNum, (position + 1) + "月");
                holder.setText(R.id.tvUserName, itemBean.getInner());
                holder.setText(R.id.tvLoginNum, itemBean.getOuter());
                if (position % 2 != 0) {
                    holder.setColor(R.id.ll);
                }
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        getLineData(12, 100);
        showChart();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_person_tong_ji;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    /**
     * 初始化数据
     * count 表示坐标点个数，range表示等下y值生成的范围
     */
    public LineData getLineData(int count, float range) {
        for (int i = 0; i < count; i++) {  //X轴显示的数据
            x.add((i+1) + "月");
        }
        for (int i = 0; i < count; i++) {//y轴的数据
            float result = Float.parseFloat(beanList.get(i).getInner());
            y.add(new Entry(result, i));
        }
        LineDataSet lineDataSet = new LineDataSet(y, "百公里营收");//y轴数据集合
        lineDataSet.setLineWidth(1f);//线宽
        lineDataSet.setCircleSize(Color.BLUE);//圆形颜色
        lineDataSet.setCircleSize(2f);//现实圆形大小
        lineDataSet.setColor(Color.RED);//现实颜色
        lineDataSet.setHighLightColor(Color.BLACK);//高度线的颜色
        lineDataSets.add(lineDataSet);
        lineData = new LineData(x,lineDataSet);
        return lineData;
    }

    /**
     * 设置样式
     */
    public void showChart() {
        spreadLineChart.setDrawBorders(false);//是否添加边框
        spreadLineChart.setDescription("随机生成的数据");//数据描述
        spreadLineChart.setNoDataTextDescription("我需要数据");//没数据显示
        spreadLineChart.setDrawGridBackground(true);//是否显示表格颜色
        spreadLineChart.setBackgroundColor(Color.GRAY);//背景颜色
        spreadLineChart.setData(lineData);//设置数据
        Legend legend = spreadLineChart.getLegend();//设置比例图片标示，就是那一组Y的value
        legend.setForm(Legend.LegendForm.SQUARE);//样式
        legend.setFormSize(10f);//字体
        legend.setTextColor(Color.BLUE);//设置颜色
        spreadLineChart.animateX(2000);//X轴的动画
    }
}
