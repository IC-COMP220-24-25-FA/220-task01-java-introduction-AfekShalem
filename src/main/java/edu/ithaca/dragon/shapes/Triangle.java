package edu.ithaca.dragon.shapes;

public class Triangle implements TriangleInterface{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

        public String toString(){
        return "This is a Triangle, the base is " + this.base + "long and the height is " + this.height + "long.";
        }

    public double calcArea(){
        return (this.height*this.base)/2;
    }

    public void doubleSize(){
        this.base *= 2;
        this.height *=2;
    }

    public double longestLineWithin(){
        if(this.height>this.base){
            return this.height;
        }
        else{
            return this.base;
        }
    }
}