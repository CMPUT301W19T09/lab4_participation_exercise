package com.example.lslevins.lab4_exercise;

public abstract class Shape {
    private int x;
    private int y;
    private int z;
    private String colour;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String getColour(){
        return color;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
}
