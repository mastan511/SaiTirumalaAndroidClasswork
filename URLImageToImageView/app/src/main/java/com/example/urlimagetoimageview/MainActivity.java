package com.example.urlimagetoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.urlimage);
        String url = "data:image/jpeg;base64,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";
        //Glide or Picaso
        Glide.with(this).load(url).into(iv);

    }
}
