package com.yalantis.desser.ce_1257218;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    ArrayList<String> imageURLList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        imageURLList.add("http://d1udmfvw0p7cd2.cloudfront.net/wp-content/uploads/2016/03/n-manhole-z-20160302-870x653.jpg");
        imageURLList.add("https://upload.wikimedia.org/wikipedia/commons/8/81/Bell_Systems_manhole_hayward.jpg");
        imageURLList.add("http://untappedcities.wpengine.netdna-cdn.com/wp-content/uploads/2014/11/Manhattan-Born-Manhole-Cover-Central-Park.jpg");
        imageURLList.add("http://www.japanvisitor.com/images/content_images/kyoto-manhole.jpg");
        imageURLList.add("http://torontoist.com/wp-content/uploads/2013/02/manhole-cover-art-ena-city.jpg");

        ImageSliderAdapter imageSliderAdapter = new ImageSliderAdapter(imageURLList, this);
        RecyclerView slider = (RecyclerView) findViewById(R.id.recycler_image_view);
        //LinearLayoutManager lm = new LinearLayoutManager(this);
        LinearLayoutManager lm
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        slider.setLayoutManager(lm);
        slider.setAdapter(imageSliderAdapter);

    }

    @Override
    //exit on arrow click
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View v) {

        String show_id = v.getResources().getResourceName(v.getId());
        TextView currentView = (TextView) v;
        String text = (String) currentView.getText();
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

       }
    }
