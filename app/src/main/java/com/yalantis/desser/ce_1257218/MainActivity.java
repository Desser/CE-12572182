package com.yalantis.desser.ce_1257218;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        arrayList = new ArrayList();
        if (arrayList != null) {
            arrayList.add(getString(R.string.source_url_1));
            arrayList.add(getString(R.string.source_url_2));
            arrayList.add(getString(R.string.source_url_3));
            arrayList.add(getString(R.string.source_url_4));
            arrayList.add(getString(R.string.source_url_5));
        }
        ImageSliderAdapter imageSliderAdapter = new ImageSliderAdapter(arrayList, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_image_view);
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(lm);
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(imageSliderAdapter);
        }

    }

    @Override
    //exit on arrow click
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View v) {
        TextView currentView = (TextView) v;
        String text = (String) currentView.getText();
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

    }


}
