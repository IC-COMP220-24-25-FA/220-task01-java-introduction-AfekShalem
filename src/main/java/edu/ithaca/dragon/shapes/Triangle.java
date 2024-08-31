package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
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