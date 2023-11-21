package oop.workintech.models;

public class Wardrobe {
    private int width;
    private int height;
    private PaintColor color;

    public Wardrobe(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
