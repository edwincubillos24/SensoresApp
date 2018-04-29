package com.edwinacubillos.sensoresapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;


public class sensores extends AppCompatActivity {

    private TextView listSensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensores);

        listSensores = findViewById(R.id.listSensores);


    }


}
