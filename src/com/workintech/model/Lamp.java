package com.workintech.model;

import com.workintech.enums.LampType;

public class Lamp {
    private boolean battery;
    private int globRating;
    private LampType style;

    public Lamp(boolean battery, int globRating, LampType style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public LampType getStyle(){
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
}
