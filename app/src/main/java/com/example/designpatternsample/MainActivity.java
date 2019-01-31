package com.example.designpatternsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatternsample.abstract_factory.ComputerAbstractFactory;
import com.example.designpatternsample.abstract_factory.ComputerFactory_FactoryOfFactories;
import com.example.designpatternsample.abstract_factory.PcFactory;
import com.example.designpatternsample.abstract_factory.ServerFactory;
import com.example.designpatternsample.factory.Computer;
import com.example.designpatternsample.factory.ComputerFactory;
import com.example.designpatternsample.factory.ComputerType;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "______";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Factory
        Computer pc = ComputerFactory.createCoumputer(ComputerType.PC, "120GB", "30.00Ghz", "100TB");
        Computer server = ComputerFactory.createCoumputer(ComputerType.PC, "1260GB", "210.00Ghz", "500TB");
        Log.e(TAG, "pc: "+pc.toString() );
        Log.e(TAG, "server: " + server.toString());
        //endregion

        //region Abstract Factory
        Computer pc1 = ComputerFactory_FactoryOfFactories.getComputer(new PcFactory("12Gb ", "8Ghz ", "1000GB"));
        Computer Server1 = ComputerFactory_FactoryOfFactories.getComputer(new ServerFactory("11Gb", "81Ghz", "5000GB"));
        Log.e(TAG, "AbsFactory_pc: "+pc1.toString() );
        Log.e(TAG, "AbsFactory_server: "+Server1.toString() );
        //endregion

    }
}
