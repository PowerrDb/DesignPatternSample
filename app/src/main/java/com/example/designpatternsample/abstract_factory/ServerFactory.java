package com.example.designpatternsample.abstract_factory;


import com.example.designpatternsample.factory.Computer;
import com.example.designpatternsample.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;
    private String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, cpu, hdd);
    }
}
