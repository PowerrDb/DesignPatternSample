package com.example.designpatternsample.factory;


public class ComputerFactory {

    public static Computer createCoumputer(ComputerType computerType, String ram, String cpu, String hdd) {

        Computer computer;

        switch (computerType) {
            case PC:
                computer = new Pc(ram, cpu, hdd);
                break;
            case Server:
                computer = new com.example.designpatternsample.factory.Server(ram, cpu, hdd);
                break;
                default:
                    return null;
        }

        return computer;

    }


}
