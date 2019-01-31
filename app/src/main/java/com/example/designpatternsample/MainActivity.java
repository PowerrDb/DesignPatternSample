package com.example.designpatternsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatternsample.factory.Computer;
import com.example.designpatternsample.factory.ComputerFactory;
import com.example.designpatternsample.factory.ComputerType;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "______";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Computer pc = ComputerFactory.createCoumputer(ComputerType.PC, "120GB", "30.00Ghz", "100TB");
        Computer server = ComputerFactory.createCoumputer(ComputerType.PC, "1260GB", "210.00Ghz", "500TB");
        Log.e(TAG, "pc: "+pc.toString() );
        Log.e(TAG, "server: "+server.toString() );
    }
}
