package com.f19.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeSource(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.icon01_02);
//        imageView.animate().alpha(0.5f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
