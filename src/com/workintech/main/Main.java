package com.workintech.main;

import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(true,100, LampType.WHITE);
        lamp.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Wall northWall = new Wall("north");
        Wall eastWall = new Wall("east");
        Wall westWall = new Wall("west");
        Wall southWall = new Wall("south");

        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,southWall,ceiling,
                new Lamp(true,100,LampType.YELLOW),"Bedroom",
                new Bed(2,2,2,2,"DOUBLE"),
                new Wardrobe(2,2,20.1),
                new Carpet(2,2,PaintColor.BLUE)
        );

        System.out.println(bedroom);



    }
}