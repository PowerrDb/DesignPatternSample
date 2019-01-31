package com.example.designpatternsample.abstract_factory;

import com.example.designpatternsample.factory.Computer;
import com.example.designpatternsample.factory.Pc;

public class PcFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;
    private String hdd;


    public PcFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram, cpu, hdd);
    }

}
