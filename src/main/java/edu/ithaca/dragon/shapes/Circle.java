package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "this is a circle, the radius is " + this.radius + "long.";
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI*Math.pow(radius,2);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = this.radius*2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius*2;
    }
}
