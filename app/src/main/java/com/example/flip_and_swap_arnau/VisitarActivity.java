package com.example.flip_and_swap_arnau;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VisitarActivity extends AppCompatActivity {

    private TextView title_visitar;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitar);

        title_visitar = findViewById(R.id.title_visitar);
        image = findViewById(R.id.image);

        Intent i = getIntent();

        String sTitle_visitar = i.getStringExtra(MainActivity.SITE_TITLE);
        int iImage = i.getIntExtra(MainActivity.SITE_IMAGE, 0);

        title_visitar.setText(sTitle_visitar);
        image.setImageResource(iImage);
    }
}
