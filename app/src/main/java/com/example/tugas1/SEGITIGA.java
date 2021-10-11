package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SEGITIGA extends AppCompatActivity {

    EditText alas, tinggi,hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        EditText alas =
                (EditText)findViewById(R.id.input_alas);
        EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        EditText hasil =
                (EditText)findViewById(R.id.output_hasil);

        final Button hitung =
                (Button)findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String A = alas.getText().toString();
                String T = tinggi.getText().toString();
                double alas = Double.parseDouble(A);
                double tinggi = Double.parseDouble(T);
                double Hasil = LuasSegitiga(alas, tinggi);
                String output = String.valueOf(Hasil);
                hasil.setText(output.toString());
            }
        });
    }
    public double LuasSegitiga(double alas, double tinggi) {
        return alas*tinggi/2;
    }
}