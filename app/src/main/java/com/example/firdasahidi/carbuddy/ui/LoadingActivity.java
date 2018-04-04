package com.example.firdasahidi.carbuddy.ui;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.firdasahidi.carbuddy.R;
import com.github.lzyzsd.circleprogress.ArcProgress;
import com.github.lzyzsd.circleprogress.DonutProgress;
import java.util.Timer;
import java.util.TimerTask;
import android.view.animation.DecelerateInterpolator;
public class LoadingActivity extends AppCompatActivity {

    private DonutProgress donutProgress;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        donutProgress = (DonutProgress) findViewById(R.id.donut_progress);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean a = false;
                if (a) {
                    ObjectAnimator anim = ObjectAnimator.ofInt(donutProgress, "progress", 0, 10);
                    anim.setInterpolator(new DecelerateInterpolator());
                    anim.setDuration(500);
                    anim.start();
                } else {
                    AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(LoadingActivity.this, R.animator.progress_anim);
                    set.setInterpolator(new DecelerateInterpolator());
                    set.setTarget(donutProgress);
                    set.start();
                }
            }
        }, 0, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

}
