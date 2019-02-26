package com.nishan.imageloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView=findViewById(R.id.imageView);
        Glide.with(MainActivity.this)
                .load("https://resize.indiatvnews.com/en/centered/newbucket/715_431/2018/04/hair-1523074498.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.not_found)
                .into(imgView);
    }
}
