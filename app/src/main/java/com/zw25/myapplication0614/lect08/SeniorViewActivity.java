package com.zw25.myapplication0614.lect08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.zw25.myapplication0614.R;

import java.util.ArrayList;
import java.util.List;

public class SeniorViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_view);
        ListView listView = findViewById(R.id.lv);
        List<News> dataList = new ArrayList<>();
        for (int i= 0;i<10;i++){
            News item = new News();
            item.setPicId(R.mipmap.timg);
            item.setTitle(i+"1同学在课堂上...");

            dataList.add(item);
        }
        NewsAdapter adapter = new NewsAdapter(SeniorViewActivity.this,dataList);
        listView.setAdapter(adapter);
    }
}