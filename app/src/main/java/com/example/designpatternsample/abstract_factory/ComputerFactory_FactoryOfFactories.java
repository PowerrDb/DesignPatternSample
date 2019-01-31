package com.example.designpatternsample.abstract_factory;

import com.example.designpatternsample.factory.Computer;

public class ComputerFactory_FactoryOfFactories {
    public static Computer getComputer(ComputerAbstractFactory computer) {
        return computer.createComputer();
    }
}
