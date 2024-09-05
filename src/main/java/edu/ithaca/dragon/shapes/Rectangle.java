package edu.ithaca.dragon.shapes;

public class Rectangle implements RectangleInterface{
    

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public String toString(){
        return "this is a Rectangle, the length is " + this.length + "long and the width is " + this.width + "long.";
    }

    public double calcArea(){
       return this.length * this.width;
    }

    public void doubleSize(){
        this.length = this.length*2;
        this.width = this.width*2;
    }

    public double longestLineWithin(){
        if (this.length > this.width){
            return this.length;
        }
        else {
            return this.width;
        }
    }
    
}
