package com.demobench.model;

public class Specifications {
    private String processor; // For laptop
    private String ram; // For laptop
    private String storage; // For laptop
    private String type; // For mouse
    private String batteryLife; // For mouse
    private String screenSize; // For laptop


    public Specifications() {
    }

    public Specifications(String processor, String ram, String storage, String type, String batteryLife, String screenSize) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.type = type;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;

    }

    // Getters and Setters
    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }

    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getBatteryLife() { return batteryLife; }
    public void setBatteryLife(String batteryLife) { this.batteryLife = batteryLife; }

    public String getScreenSize() { return screenSize; }
    public void setScreenSize(String screenSize) { this.screenSize = screenSize; }


    @Override
    public String toString() {
        return "Specifications{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", type='" + type + '\'' +
                ", batteryLife='" + batteryLife + '\'' +
                '}';
    }
}
