package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);

            ArrayList<Rectangle> rectangles = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                double length = 1 + random.nextDouble() * 9;
                double width = 1 + random.nextDouble() * 9;
                rectangles.add(new Rectangle(length, width));
            }
            for (int i = 0; i < rectangles.size(); i++) {
                Rectangle rect = rectangles.get(i);
                System.out.println("Rectangle " + (i+1) + ":");
                System.out.println("  Area: " + rect.calcArea());
                System.out.println("  Longest line within: " + rect.longestLineWithin());
            }
            System.out.print("Choose a rectangle to double its size (1-5): ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5) {
                rectangles.get(choice - 1).doubleSize();
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("After doubling:");
            for (int i = 0; i < rectangles.size(); i++) {
                Rectangle rect = rectangles.get(i);
                System.out.println("Rectangle " + (i+1) + ":");
                System.out.println("  Area: " + rect.calcArea());
                System.out.println("  Longest line within: " + rect.longestLineWithin());
            }

            System.out.println();
        }

        scanner.close();
    }
}
