package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button menu=(Button) findViewById(R.id.btnMenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent m = new Intent(getApplicationContext(), Login.class);
                startActivity(m);
            }
        });
    }

}