package com.example.designpatternsample.Builder;


public class Computerr {
    //required Parameters
    private String HDD;
    private String RAM;

    //Optional Parameters
    private boolean SSD_HDD;
    private boolean HaveCdDriver;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isSSD_HDD() {
        return SSD_HDD;
    }

    public boolean isHaveCdDriver() {
        return HaveCdDriver;
    }

    public Computerr(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.SSD_HDD=builder.SSD_HDD;
        this.HaveCdDriver=builder.HaveCdDriver;

    }

    public static class ComputerBuilder {
        //required Parameters
        private String HDD;
        private String RAM;

        //Optional Parameters
        private boolean SSD_HDD;
        private boolean HaveCdDriver;


       public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setSSD_HDD(boolean SSD_HDD) {
            this.SSD_HDD = SSD_HDD;
            return this;
        }

        public ComputerBuilder setHaveCdDriver(boolean haveCdDriver) {
            HaveCdDriver = haveCdDriver;
            return this;
        }

        public Computerr build(){
            return new Computerr(this);
        }
    }

}

