package com.baway.a.tlm20190611;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;
import bean.Bean;

public class MainActivity extends AppCompatActivity {

    private PullToRefreshListView p_listview;
    private MyAdapter aa;
    private String url = "http://172.17.8.100/small/commodity/v1/commodityList";
    private List<Bean.Result.commodityList> lists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p_listview = findViewById(R.id.p_listview);

        lists = new ArrayList<>();

        p_listview.setMode(PullToRefreshBase.Mode.BOTH);
        aa = new MyAdapter(getApplicationContext(),lists);
        p_listview.setAdapter(aa);


    }
}
