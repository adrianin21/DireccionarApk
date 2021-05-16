package com.example.direccionarapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton facebook, instagram, youtube, buscador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        youtube = findViewById(R.id.youtube);
        buscador = findViewById(R.id.buscador);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instagram = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(instagram);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);

            }
        });
        buscador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);

            }
        });
    }
}