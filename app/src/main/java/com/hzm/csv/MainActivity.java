package com.hzm.csv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected SlideTable sdbar;
    List<IDataBean> textList = new ArrayList<IDataBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initData();
        initView();
        sdbar.setData(textList);
    }

    private void initData() {
        textList.add(new DataBean("tab1"));
        textList.add(new DataBean("tabhello2"));
        textList.add(new DataBean("tab3"));
        textList.add(new DataBean("tab4"));
    }

    private void initView() {
        sdbar = (SlideTable) findViewById(R.id.sdbar);
    }
}
