package com.example.designpatternsample.factory;

import androidx.annotation.NonNull;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getCpu();
    public abstract String getHdd();

    @NonNull
    @Override
    public String toString() {
        return "Ram : " + getRam() + "Cpu : " + getCpu() + "Hdd : " + getHdd();

    }
}
