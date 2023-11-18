package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartGame extends AppCompatActivity {

    private Button btnStartGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        btnStartGame = findViewById(R.id.btn_start_game);
        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartGame.this, PuzzleGame.class));
            }
        });
    }
}