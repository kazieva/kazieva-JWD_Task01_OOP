package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {
    private int batteryCampacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCampacity;
    private String color;

    public TabletPC() {
        this.batteryCampacity = 0;
        this.displayInches = 0;
        this.memoryROM = 0;
        this.flashMemoryCampacity = 0;
        this.color = "";
    }

    public TabletPC(int batteryCampacity, int displayInches, int memoryROM, int flashMemoryCampacity, String color) {
        this.batteryCampacity = batteryCampacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCampacity = flashMemoryCampacity;
        this.color = color;
    }

    public int getBatteryCampacity() {
        return batteryCampacity;
    }

    public void setBatteryCampacity(int batteryCampacity) {
        this.batteryCampacity = batteryCampacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryRom) {
        this.memoryROM = memoryRom;
    }

    public int getFlashMemoryCampacity() {
        return flashMemoryCampacity;
    }

    public void setFlashMemoryCampacity(int flashMemoryCampacity) {
        this.flashMemoryCampacity = flashMemoryCampacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCampacity != tabletPC.batteryCampacity) return false;
        if (displayInches != tabletPC.displayInches) return false;
        if (memoryROM != tabletPC.memoryROM) return false;
        if (flashMemoryCampacity != tabletPC.flashMemoryCampacity) return false;
        return color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result = batteryCampacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryROM;
        result = 31 * result + flashMemoryCampacity;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC {" +
                "batteryCampacity=" + batteryCampacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCampacity=" + flashMemoryCampacity +
                ", color='" + color + '\'' +
                '}';
    }
}
