package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(2,2);
        assertEquals(4, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(2,1);
        assertEquals(2, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(2,0);
        assertEquals(0, myRectangle.calcArea(), 0.0001);
    }
    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(2,2);
        assertEquals(2, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(2,1);
        assertEquals(2, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(2,0);
        assertEquals(2, myRectangle.calcArea(), 0.0001);
    }
}
