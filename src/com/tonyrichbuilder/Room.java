package com.tonyrichbuilder;
/**
 * Created by localadmin on 7/27/16.
 */
public class Room implements Cost {

    private String name;
    private float height;
    private float length;
    private float width;
    private Floor floorType;
    private Paint paintType;

    public Room(String name, float height, float length, float width) {
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Paint getPaintType() {
        return paintType;
    }

    public void setPaintType(Paint paintType) {
        this.paintType = paintType;
    }

    public Floor getFloorType() {
        return floorType;
    }

    public void setFloorType(Floor floorType) {
        this.floorType = floorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getFloorCost() {
        return this.getLength() * this.getWidth() * this.floorType.getPrice();
    }

    @Override
    public float getPaintCost() {
        return this.getHeight() * (this.getWidth() + this.getLength()) * 2 * this.paintType.getPrice();
    }

    @Override
    public float getTotalCost() {
        return this.getFloorCost() + this.getPaintCost();
    }
}
