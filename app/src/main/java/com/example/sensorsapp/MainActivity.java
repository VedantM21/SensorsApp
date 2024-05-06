package com.example.sensorsapp;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declare a Sensor Manager object here :




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1st step to do ; Create a Button and TextView
        Button myBtn = findViewById(R.id.myBtn);
        TextView tv = findViewById(R.id.tv) ;

        // Declare a List to store sensors

        List<Sensor> list ;

        // 2 : Add a button click listener

        // 3 Declare a Sensor Manager
        SensorManager sm;

        //4 Give value to Sensor Manager

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);

        list = sm.getSensorList(Sensor.TYPE_ALL);

        if(list.size() == 0){
            // There are no sensors/ No sensor found
        }else{

        }

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,list.toString(),Toast.LENGTH_SHORT).show();

                Log.d("Data is : ",list.toString());
                for(int i=0;i < list.size();i++ ){
                    Sensor currentSensor = list.get(i);
                    tv.append(currentSensor.getName() + " " + currentSensor.getVendor() + " " + currentSensor.getVersion() );
                    tv.append("\n");
                }

//




            }
        });


    }
}

