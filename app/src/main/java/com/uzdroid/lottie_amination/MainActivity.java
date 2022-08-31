package com.uzdroid.lottie_amination;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottie;
    boolean onClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lottie = findViewById(R.id.lottie);


        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (onClick) {

                    lottie.setMinAndMaxProgress(0.5f, 1.0f);
                    // lottie.setSpeed(-1);
                    lottie.playAnimation();
                    onClick = false;


                } else {

                    lottie.setMinAndMaxProgress(0.0f, 0.5f);
                    // lottie.setSpeed(1);
                    lottie.playAnimation();
                    onClick = true;


                }


            }
        });


    }
}