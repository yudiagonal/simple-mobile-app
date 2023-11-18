package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        Button btnatbacttivity = (Button)findViewById(R.id.btntabs);
        btnatbacttivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TabsActivity.class);
                startActivity(i);
            }
        });
        Button btnalarm = (Button)findViewById(R.id.btnAlarm);
        btnalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AlarmApp.class);
                startActivity(i);
            }
        });

        Button btnkegame = (Button) findViewById(R.id.btnKeGame);
        btnkegame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), StartGame.class);
                startActivity(i);
            }
        });
    }
}