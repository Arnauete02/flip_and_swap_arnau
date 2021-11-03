package com.example.flip_and_swap_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static String SITE_TITLE = "com.example.flip_and_swap_arnau.SITE_TITLE";
    public static String SITE_IMAGE = "com.example.flip_and_swap_arnau.SITE_IMAGE";

    private int image1_c = 0;
    private int image2_c = 0;
    private int image3_c = 0;
    private int image4_c = 0;
    private int image5_c = 0;

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;

    private RelativeLayout relative1;
    private RelativeLayout relative2;
    private RelativeLayout relative3;
    private RelativeLayout relative4;
    private RelativeLayout relative5;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);

        relative1 = findViewById(R.id.relative1);
        relative2 = findViewById(R.id.relative2);
        relative3 = findViewById(R.id.relative3);
        relative4 = findViewById(R.id.relative4);
        relative5 = findViewById(R.id.relative5);

        button1 = findViewById(R.id.button1);
        button1.setEnabled(false);
        button2 = findViewById(R.id.button2);
        button2.setEnabled(false);
        button3 = findViewById(R.id.button3);
        button3.setEnabled(false);
        button4 = findViewById(R.id.button4);
        button4.setEnabled(false);
        button5 = findViewById(R.id.button5);
        button5.setEnabled(false);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image1_c == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(image1, "RotationY", 0f, 360f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative1, "RotationY", 0f, 360f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative1, "alpha", 0, 1);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button1.setEnabled(true);
                    button1.setClickable(true);

                    image1_c++;
                } else {
                    objectAnimator1 = ObjectAnimator.ofFloat(image1, "RotationY", 360f, 0f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative1, "RotationY", 360f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative1, "alpha", 1, 0);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button1.setEnabled(false);
                    button1.setClickable(false);

                    image1_c = 0;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
                animatorSet.start();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image2_c == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(image2, "RotationY", 0f, 360f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative2, "RotationY", 0f, 360f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative2, "alpha", 0, 1);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button2.setEnabled(true);
                    button2.setClickable(true);

                    image2_c++;
                } else {
                    objectAnimator1 = ObjectAnimator.ofFloat(image2, "RotationY", 360f, 0f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative2, "RotationY", 360f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative2, "alpha", 1, 0);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button2.setEnabled(false);
                    button2.setClickable(false);

                    image2_c = 0;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
                animatorSet.start();
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image3_c == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(image3, "RotationY", 0f, 360f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative3, "RotationY", 0f, 360f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative3, "alpha", 0, 1);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button3.setEnabled(true);

                    image3_c++;
                } else {
                    objectAnimator1 = ObjectAnimator.ofFloat(image3, "RotationY", 360f, 0f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative3, "RotationY", 360f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative3, "alpha", 1, 0);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button3.setEnabled(false);

                    image3_c = 0;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
                animatorSet.start();
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image4_c == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(image4, "RotationY", 0f, 360f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative4, "RotationY", 0f, 360f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative4, "alpha", 0, 1);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button4.setEnabled(true);

                    image4_c++;
                } else {
                    objectAnimator1 = ObjectAnimator.ofFloat(image4, "RotationY", 360f, 0f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative4, "RotationY", 360f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative4, "alpha", 1, 0);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button4.setEnabled(false);

                    image4_c = 0;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
                animatorSet.start();
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image5_c == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(image5, "RotationY", 0f, 360f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative5, "RotationY", 0f, 360f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative5, "alpha", 0, 1);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button5.setEnabled(true);

                    image5_c++;
                } else {
                    objectAnimator1 = ObjectAnimator.ofFloat(image5, "RotationY", 360f, 0f);
                    objectAnimator1.setDuration(1000);

                    objectAnimator2 = ObjectAnimator.ofFloat(relative5, "RotationY", 360f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(relative5, "alpha", 1, 0);
                    objectAnimator3.setStartDelay(500);
                    objectAnimator3.setDuration(1);

                    button5.setEnabled(false);

                    image5_c = 0;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
                animatorSet.start();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.title_image1);
                int image = R.drawable.cosmo_caixa;

                Intent intent = new Intent(MainActivity.this, VisitarActivity.class);

                intent.putExtra(SITE_TITLE, title);
                intent.putExtra(SITE_IMAGE, image);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.title_image2);
                int image = R.drawable.jardi_botanic;

                Intent intent = new Intent(MainActivity.this, VisitarActivity.class);

                intent.putExtra(SITE_TITLE, title);
                intent.putExtra(SITE_IMAGE, image);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.title_image3);
                int image = R.drawable.teatre_grec;

                Intent intent = new Intent(MainActivity.this, VisitarActivity.class);

                intent.putExtra(SITE_TITLE, title);
                intent.putExtra(SITE_IMAGE, image);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.title_image4);
                int image = R.drawable.museu_picasso;

                Intent intent = new Intent(MainActivity.this, VisitarActivity.class);

                intent.putExtra(SITE_TITLE, title);
                intent.putExtra(SITE_IMAGE, image);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getString(R.string.title_image5);
                int image = R.drawable.museu_del_disseny;

                Intent intent = new Intent(MainActivity.this, VisitarActivity.class);

                intent.putExtra(SITE_TITLE, title);
                intent.putExtra(SITE_IMAGE, image);
                startActivity(intent);
            }
        });
    }
}