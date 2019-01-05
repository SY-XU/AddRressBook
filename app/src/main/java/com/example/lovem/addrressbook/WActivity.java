package com.example.lovem.addrressbook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class WActivity extends AppCompatActivity {
    ImageView iv_main_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        setContentView(R.layout.activity_w);
        iv_main_welcome=(ImageView)findViewById(R.id.iv_main_welcome);
        Animation anim=AnimationUtils.loadAnimation(this,R.anim.set);
        iv_main_welcome.startAnimation(anim);

        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                Intent intent1=new Intent(WActivity.this,MainActivity.class);
                startActivity(intent1);
                WActivity.this.finish();
            }
        };
        timer.schedule(timerTask,5000);
    }
}
