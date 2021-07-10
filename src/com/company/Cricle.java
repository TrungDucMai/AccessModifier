package com.company;

public class Cricle {
    private double radius = 1.0;
    private  String color = "Red";
    public final double Pi = 3.14;

    public Cricle(){
    }
    public Cricle(double radius){
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea(){
        return this.radius* this.radius*Pi;
    }

}
