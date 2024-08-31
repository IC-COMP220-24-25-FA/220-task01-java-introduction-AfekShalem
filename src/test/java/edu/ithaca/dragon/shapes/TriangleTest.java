package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(2,2);
        assertEquals(2, myTriangle.calcArea(), 0.0001);
        
        myTriangle = new Triangle(2,1);
        assertEquals(1, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(1,1);
        assertEquals(0.5, myTriangle.calcArea(), 0.0001);
    }
    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(2,2);
        assertEquals(2, myTriangle.longestLineWithin(), 0.0001);

        myTriangle = new Triangle(2,1);
        assertEquals(2, myTriangle.longestLineWithin(), 0.0001);
        
        myTriangle = new Triangle(2,0);
        assertEquals(2, myTriangle.longestLineWithin(), 0.0001);
    }
}
