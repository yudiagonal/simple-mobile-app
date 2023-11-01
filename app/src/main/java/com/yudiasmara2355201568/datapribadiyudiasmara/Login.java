package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.btnLogin);
        ed1 = (EditText) findViewById(R.id.txtUsername);
        ed2 = (EditText) findViewById(R.id.txtPassword);
        tx1 = (TextView) findViewById(R.id.textView23);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin")) {

                        Toast.makeText(getApplicationContext(), "Login Berhasi...", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Login Gagal!", Toast.LENGTH_SHORT).show();
                        tx1.setVisibility(View.VISIBLE);
                        tx1.setBackgroundColor(Color.RED);
                        counter--;
                        tx1.setText(Integer.toString(counter));

                        if (counter == 0) {
                            b1.setEnabled(false);
                        }
                    }
                }
            }
        });
        Button btnlogin = (Button) findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);

            }
        });

    }
}