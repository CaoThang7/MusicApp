package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.adapterHoadonchitiet;
import com.example.myapplication.dao.Hoadonchitietdao;
import com.example.myapplication.model.Hoadonchitiet;

import java.util.ArrayList;

public class hoadonchitiet_rcv2 extends AppCompatActivity {
    RecyclerView rcvhdct;
    adapterHoadonchitiet adapter;
    ArrayList<Hoadonchitiet> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoadonchutiet_rcv2);
        rcvhdct=findViewById(R.id.rcv_hdct2);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(hoadonchitiet_rcv2.this);
        rcvhdct.setLayoutManager(layoutManager);
        list=new ArrayList<>();
        final String mahoadon1=getIntent().getExtras().getString("mahoadon2");
        list= Hoadonchitietdao.reaAll(hoadonchitiet_rcv2.this,mahoadon1);
        adapter=new adapterHoadonchitiet(hoadonchitiet_rcv2.this,list);
        rcvhdct.setAdapter(adapter);
        Log.e("loi", "onCreate: "+mahoadon1);
    }
}
