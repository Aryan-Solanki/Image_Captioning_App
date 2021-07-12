package com.example.image_captioning;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final ImageView zoom = (ImageView) findViewById(R.id.logo);
        final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        zoom.startAnimation(zoomAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent registerIntent = new Intent(SplashScreen.this, MainActivity.class);
                registerIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                SplashScreen.this.startActivity(registerIntent);
            }
        }, SPLASH_TIME_OUT);


    }
}