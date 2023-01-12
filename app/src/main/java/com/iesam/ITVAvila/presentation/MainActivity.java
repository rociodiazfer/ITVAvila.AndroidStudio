package com.iesam.ITVAvila.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itvprueba.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainNota mainNota = new MainNota();
        mainNota.main();
    }

}
