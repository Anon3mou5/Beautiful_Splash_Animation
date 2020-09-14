package com.example.gitesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler2 = new Handler();
        final ConstraintLayout green1 = findViewById(R.id.green1);
        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout2);
        final ConstraintLayout green2 = findViewById(R.id.green2);
        final ConstraintLayout darkgreencircle = findViewById(R.id.darkcirclegreen);
        TextView welcomeback = findViewById(R.id.welcomeback);
        TextView login = findViewById(R.id.login);
        final ImageView q = findViewById(R.id.q);
        ImageView q2 = findViewById(R.id.q2);

        ///////start animation

        green1.animate().translationY(1000).setDuration(400).setStartDelay(200);
        green2.animate().translationY(-1000).setDuration(400).setStartDelay(200);
        darkgreencircle.animate().scaleX(4).scaleY(4).alpha(1).setDuration(300).setStartDelay(800);
        q.animate().scaleY((float)0.6).scaleX((float)0.6).alpha(1).setStartDelay(800).rotationBy(-180).setDuration(600);

        ////////close fadeout

        constraintLayout.animate().alpha(1).setDuration(200).setStartDelay(1800);
        q2.animate().setDuration(600).setStartDelay(2200).scaleY((float)0.6).scaleX((float)0.6).translationY(-700).translationX(-400);
        welcomeback.animate().translationY(80).alpha(1).setDuration(800).setStartDelay(2600);
        login.animate().translationY(80).alpha(1).setDuration(800).setStartDelay(2600);


//
        handler2.postDelayed(new Runnable() {
            public void run() {
                green1.setVisibility(View.GONE);
                green2.setVisibility(View.GONE);
            }
        },1600);
//

        handler2.postDelayed(new Runnable() {
            public void run() {
                darkgreencircle.animate().alpha(0).setDuration(200);
                q.animate().alpha(0).setDuration(200);
//                darkgreencircle.setVisibility(View.GONE);
//                q.setVisibility(View.GONE);
            }
        },1600);


    }

}