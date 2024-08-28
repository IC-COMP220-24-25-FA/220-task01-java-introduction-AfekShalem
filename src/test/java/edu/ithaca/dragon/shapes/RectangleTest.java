package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(2,2);
        assertEquals(4, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(2,1);
        assertEquals(2, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(2,0);
        assertEquals(0, myRectangle.calcArea(), 0.0001);
    }
}
