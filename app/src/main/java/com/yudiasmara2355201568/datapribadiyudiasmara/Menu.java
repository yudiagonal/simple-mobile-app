package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button datadiri=(Button)findViewById(R.id.btnDataDiri);
        datadiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Profil.class);
                startActivity(i);
            }
        });

        Button webview=(Button) findViewById(R.id.btnWeb);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), WebViews.class);
                startActivity(i);
            }
        });
        Button btnkonten =(Button) findViewById(R.id.btnKonten);
        btnkonten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent k = new Intent(getApplicationContext(), KontenScrolling.class);
                startActivity(k);
            }
        });
       Button btnkalkulator = (Button) findViewById(R.id.btnKalkulator);
       btnkalkulator.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View arg0) {
               Intent i = new Intent(getApplicationContext(), KalkulatorIcikiwir.class);
               startActivity(i);

           }
       });
        Button btnsosmed = (Button)findViewById(R.id.btnSosialMedia);
        btnsosmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SosialMedia.class);
                startActivity(i);
            }
        });
    }
}