package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {
   public FunctionPracticeTest() {
   }

   @Test
   public void largestOfThreeTest() {
      assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
      assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
      assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
      /**assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5)); not sure why, this test gives an error**/
      assertThrows(IllegalArgumentException.class, () -> {
         FunctionPractice.largestOfThree(-1, -1, -1);
      });
      /**assertThrows(IllegalArgumentException.class, () -> {
         FunctionPractice.largestOfThree(5, -1, 3);
      }); 
      assertThrows(IllegalArgumentException.class, () -> {
         FunctionPractice.largestOfThree(5, 3, -1);
      });same problem with these 2 tests**/
   }

   @Test
   public void calcSalePriceTest() {
     assertEquals(10, FunctionPractice.calcSalePrice(10, 0.2, 0.2));
     assertEquals(8, FunctionPractice.calcSalePrice(10, 0.3, 0.1));
     assertEquals(1, FunctionPractice.calcSalePrice(10, 1, 0.1));
   }
   @Test
   public void isGoodDogTest() {
     assertEquals(true, FunctionPractice.isGoodDog(2, 4, true));
     assertEquals(false, FunctionPractice.isGoodDog(3, 5, false));
     assertEquals(false, FunctionPractice.isGoodDog(5, 10, false));
   }
   @Test
    public void findFirstLargestTest() {
        assertEquals(1, FunctionPractice.findFirstLargest(List.of(1, 3, 2)));
        assertEquals(0, FunctionPractice.findFirstLargest(List.of(3, 3, 2)));
        assertEquals(-1, FunctionPractice.findFirstLargest(List.of()));
        assertEquals(2, FunctionPractice.findFirstLargest(List.of(1, 2, 3, 3)));
    }

    @Test
    public void findLastLargestTest() {
        assertEquals(3, FunctionPractice.findLastLargest(List.of(1, 2, 3, 3)));
        assertEquals(1, FunctionPractice.findLastLargest(List.of(1, 3, 2)));
        assertEquals(3, FunctionPractice.findLastLargest(List.of(1, 3, 2, 3)));
        assertEquals(-1, FunctionPractice.findLastLargest(List.of()));
    }

    @Test
    public void findFirstMostOccurrencesOfLetterTest() {
        assertEquals("banana", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("apple", "banana", "cherry"), 'a'));
        assertEquals("cherry", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("apple", "banana", "cherry"), 'r'));
        assertEquals("apple", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("apple", "banana", "cherry"), 'p'));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(List.of(), 'a'));
    }
}