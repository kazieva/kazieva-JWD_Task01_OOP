package by.tc.task01.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable{
    private int batteryCapacity;
    private String os;
    private int memoryPom;
    private int systemMemory;
    private double cpu;
    private int desplayInchs;

    public Laptop() {
        this.batteryCapacity = 0;
        this.os = "";
        this.memoryPom = 0;
        this.systemMemory = 0;
        this.cpu = 0;
        this.desplayInchs = 0;
    }
    public Laptop(int batteryCapacity, String os, int memoryPom, int systemMemory, float cpu, int desplayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryPom = memoryPom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.desplayInchs = desplayInchs;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryPom() {
        return memoryPom;
    }

    public void setMemoryPom(int memoryPom) {
        this.memoryPom = memoryPom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDesplayInchs() {
        return desplayInchs;
    }

    public void setDesplayInchs(int desplayInchs) {
        this.desplayInchs = desplayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (batteryCapacity != laptop.batteryCapacity) return false;
        if (memoryPom != laptop.memoryPom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (desplayInchs != laptop.desplayInchs) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = batteryCapacity;
        result = 31 * result + os.hashCode();
        result = 31 * result + memoryPom;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + desplayInchs;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryPom=" + memoryPom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", desplayInchs=" + desplayInchs +
                '}';
    }
}
