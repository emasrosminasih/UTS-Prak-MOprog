package com.example.er.restoranemas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class FragmentAbout extends AppCompatActivity {

    TextView nama, nim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);

        nama = (TextView) findViewById(R.id.txtNama);
        nim = (TextView) findViewById(R.id.txtNim);

    }
}