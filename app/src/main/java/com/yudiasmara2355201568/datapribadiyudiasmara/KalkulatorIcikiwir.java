package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KalkulatorIcikiwir extends AppCompatActivity {
    EditText angkaSatu, angkaDua;
    Button tambah,kurang,bagi,kali,bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_icikiwir);

        angkaSatu = (EditText) findViewById(R.id.TextAngka1);
        angkaDua = (EditText) findViewById(R.id.TextAngka2);
        tambah  = (Button) findViewById(R.id.btnTambah);
        kurang  = (Button) findViewById(R.id.btnKurang);
        kali  = (Button) findViewById(R.id.btnKali);
        bagi  = (Button) findViewById(R.id.btnBagi);
        hasil =(TextView) findViewById(R.id.TextHasil);
        bersihkan = (Button)findViewById(R.id.btnBersih);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaSatu.length()==0 && angkaDua.length()==0){
                    Toast.makeText(getApplication(),"Angka tidak boleh kosong cuy", Toast.LENGTH_SHORT).show();
                } else if (angkaSatu.length() == 0) {
                    Toast.makeText(getApplication(), "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (angkaDua.length()==0) {
                    Toast.makeText(getApplication(), "Angka 2 tidak boleh kosong",Toast.LENGTH_SHORT).show();
                } else {
                    String isiAngka1 = angkaSatu.getText().toString();
                    String isiAngka2 = angkaDua.getText().toString();

                    //parsing isi jado double
                    double A1 = Double.parseDouble(isiAngka1);
                    double A2 =Double.parseDouble(isiAngka2);

                    //panggil method jumlah
                    double tambah = hitungJumlah(A1,A2);

                    //parsing to string tambah
                    String tambahOutput = String.valueOf(tambah);
                    hasil.setText(tambahOutput.toString());

                }
            }
          });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaSatu.length()==0 && angkaDua.length()==0){
                    Toast.makeText(getApplication(),"Angka tidak boleh kosong cuy", Toast.LENGTH_SHORT).show();
                } else if (angkaSatu.length() == 0) {
                    Toast.makeText(getApplication(), "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (angkaDua.length()==0) {
                    Toast.makeText(getApplication(), "Angka 2 tidak boleh kosong",Toast.LENGTH_SHORT).show();
                } else {
                    String isiAngka1 = angkaSatu.getText().toString();
                    String isiAngka2 = angkaDua.getText().toString();

                    //parsing isi jado double
                    double A1 = Double.parseDouble(isiAngka1);
                    double A2 =Double.parseDouble(isiAngka2);

                    //panggil method jumlah
                    double kurang = hitungKurang(A1,A2);

                    //parsing to string tambah
                    String kurangOutput = String.valueOf(kurang);
                    hasil.setText(kurangOutput.toString());

                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaSatu.length()==0 && angkaDua.length()==0){
                    Toast.makeText(getApplication(),"Angka tidak boleh kosong cuy", Toast.LENGTH_SHORT).show();
                } else if (angkaSatu.length() == 0) {
                    Toast.makeText(getApplication(), "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (angkaDua.length()==0) {
                    Toast.makeText(getApplication(), "Angka 2 tidak boleh kosong",Toast.LENGTH_SHORT).show();
                } else {
                    String isiAngka1 = angkaSatu.getText().toString();
                    String isiAngka2 = angkaDua.getText().toString();

                    //parsing isi jado double
                    double A1 = Double.parseDouble(isiAngka1);
                    double A2 =Double.parseDouble(isiAngka2);

                    //panggil method jumlah
                    double bagi = hitungBagi(A1,A2);

                    //parsing to string tambah
                    String bagiOutput = String.valueOf(bagi);
                    hasil.setText(bagiOutput.toString());

                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (angkaSatu.length()==0 && angkaDua.length()==0){
                    Toast.makeText(getApplication(),"Angka tidak boleh kosong cuy", Toast.LENGTH_SHORT).show();
                } else if (angkaSatu.length() == 0) {
                    Toast.makeText(getApplication(), "Angka 1 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (angkaDua.length()==0) {
                    Toast.makeText(getApplication(), "Angka 2 tidak boleh kosong",Toast.LENGTH_SHORT).show();
                } else {
                    String isiAngka1 = angkaSatu.getText().toString();
                    String isiAngka2 = angkaDua.getText().toString();

                    //parsing isi jado double
                    double A1 = Double.parseDouble(isiAngka1);
                    double A2 =Double.parseDouble(isiAngka2);

                    //panggil method jumlah
                    double kali = hitungKali(A1,A2);

                    //parsing to string tambah
                    String kaliOutput = String.valueOf(kali);
                    hasil.setText(kaliOutput.toString());

                }
            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaSatu.setText("");
                angkaDua.setText("");
                hasil.setText("");
                angkaSatu.requestFocus();
            }
        });
    }
    public double hitungJumlah(double a1, double a2) {
        return a1 + a2;
    }
    public double hitungKurang(double a1, double a2) {
       return a1 - a2;
    }
    public double hitungBagi(double a1, double a2) {
        return a1 / a2;
    }
    public double hitungKali(double a1, double a2) {return a1 * a2;}
}