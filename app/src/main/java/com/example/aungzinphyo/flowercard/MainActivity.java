package com.example.aungzinphyo.flowercard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<FlowerData> mFlowerList;
    FlowerData mFlowerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mToolbar = findViewById(R.id.toolbar);
//        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
////        mRecyclerView.setLayoutManager(gridLayoutManager);

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(lm);

        mFlowerList = new ArrayList<>();
        mFlowerData = new FlowerData("Rose", getString(R.string.description_flower_rose),R.drawable.rose);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Carnation", getString(R.string.descripion_flower_carnation),R.drawable.carnation);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Tulip", getString(R.string.description_flower_tulip),R.drawable.tulip);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Daisy", getString(R.string.description_flower_daisy),R.drawable.daisy);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Sunflower", getString(R.string.descripion_flower_sunflower),R.drawable.sunflower);
        mFlowerList.add(mFlowerData);
        mFlowerData = new FlowerData("Daffodil", getString(R.string.description_flower_daffodil),R.drawable.daffodil);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_send_money_);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_cash_refill);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_deposit);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_m_pitesan_logo);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_money_service);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_receive_money_);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_subscription_logo);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_top_up);
        mFlowerList.add(mFlowerData);

        mFlowerData = new FlowerData("Send Money", getString(R.string.send_money),R.drawable.ic_withdraw);
        mFlowerList.add(mFlowerData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mFlowerList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
