package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SosialMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosial_media);

        ImageButton btnfb = (android.widget.ImageButton)findViewById(R.id.imageBtnFB);
        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri fb = Uri.parse("https://www.facebook.com/uciha.iii.5");
                Intent i =new Intent(Intent.ACTION_VIEW, fb);
                startActivity(i);
            }
        });
    ImageButton btnig = (android.widget.ImageButton)findViewById(R.id.imageBtnIG);
    btnig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Uri ig = Uri.parse("https://www.instagram.com/yudi.menggala/");
            Intent i = new Intent(Intent.ACTION_VIEW,ig);
            startActivity(i);
        }
    });
    ImageButton btnlin = (android.widget.ImageButton)findViewById(R.id.imageBtnLinked);
    btnlin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Uri in = Uri.parse("https://www.linkedin.com/in/yudi-asmara-086bb8279/");
            Intent i = new Intent(Intent.ACTION_VIEW, in);
            startActivity(i);
        }
    });
    }
}