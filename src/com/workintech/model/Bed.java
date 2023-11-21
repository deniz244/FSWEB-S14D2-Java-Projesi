package com.workintech.model;

public class Bed {
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    private String style;

    public Bed(int pillows, int height, int sheets, int quilt, String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }
    public int getPillows(){
        return pillows;
    }

    public int getHeight(){
        return height;
    }

    public int getSheets(){
        return sheets;
    }

    public int getQuilts(){
        return quilt;
    }

    public void make(){
        System.out.println("The bed is being made");
    }
    @Override
    public String toString() {
        return "Bed{" +
                "pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                ", style='" + style + '\'' +
                '}';
    }
}
