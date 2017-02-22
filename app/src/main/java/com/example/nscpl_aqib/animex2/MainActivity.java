package com.example.nscpl_aqib.animex2;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView= (ImageView) findViewById(R.id.image11);
        imageView.setBackgroundResource(R.drawable.frame_animation_list);
        AnimationDrawable animationDrawable= (AnimationDrawable) imageView.getBackground();
    animationDrawable.start();
    }
}
