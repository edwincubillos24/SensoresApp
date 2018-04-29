package com.edwinacubillos.sensoresapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class orientation extends AppCompatActivity implements SensorEventListener {

    private TextView tInfo, tSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        tInfo = findViewById(R.id.info);
        tSalida = findViewById(R.id.salida);

        
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this){
            
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
