package com.example.sairam.mivi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    TextView welcomeTextView;
    Animation animation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        welcomeTextView = (TextView) findViewById(R.id.welcome_text);

        Animation an2 = AnimationUtils.loadAnimation(this, R.anim.bounce);
        welcomeTextView.startAnimation(an2);

        //animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        //welcomeTextView.startAnimation(animation);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }


}
