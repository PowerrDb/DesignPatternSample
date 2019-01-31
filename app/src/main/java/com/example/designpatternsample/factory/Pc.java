package com.example.designpatternsample.factory;

public class Pc extends Computer {
    private String ram;
    private String cpu;
    private String hdd;

    public Pc(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getHdd() {
        return hdd;
    }
}
