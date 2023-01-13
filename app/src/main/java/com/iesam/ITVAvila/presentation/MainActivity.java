package com.iesam.ITVAvila.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itvprueba.R;
import com.iesam.ITVAvila.data.Coche1;
import com.iesam.ITVAvila.data.DataStore;
import com.iesam.ITVAvila.domain.models.Coche;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainNota mainNota = new MainNota();
        mainNota.main();
    }

    private void example(){
        Coche1 coche1 = new Coche1();
        Coche1.size=3;
        System.out.println(coche1.getSize());

        Coche1 coche2 = new Coche1();
        Coche1.size=1;
        System.out.println(coche1.getSize());
    }}

