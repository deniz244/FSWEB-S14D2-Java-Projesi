package com.workintech.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling,
                   Lamp lamp, String name, Bed bed, Wardrobe wardrobe, Carpet carpet) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp); //üst sınıf constructor call
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void createBedroom(){
        super.getWall1().create();
        super.getWall2().create();
        super.getWall3().create();
        super.getWall4().create();
        super.getCeiling().create();

        bed.make();
        getCarpet().lying();
        wardrobe.add();
        super.getLamp().turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
