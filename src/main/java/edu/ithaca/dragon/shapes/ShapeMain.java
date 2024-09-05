package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);
            if (shapeType == 0) {
                double radius = random.nextDouble(10);
                shapes.add(new Circle(radius));
            } else if (shapeType == 1) {
                double length = random.nextDouble(10);
                double width = random.nextDouble(10);
                shapes.add(new Rectangle(length, width));
            } else if (shapeType == 2) {
                double base = random.nextDouble(10);
                double height = random.nextDouble(10);
                shapes.add(new Triangle(base, height));
            }
        }
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes.get(i).toString());
        }
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);

            ArrayList<Rectangle> rectangles = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                double length = random.nextDouble(10);
                double width = random.nextDouble(10);
                rectangles.add(new Rectangle(length, width));
            }
            for (int i = 0; i < rectangles.size(); i++) {
                Rectangle rect = rectangles.get(i);
                System.out.println("Rectangle " + (i + 1) + ":");
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
                System.out.println("Rectangle " + (i + 1) + ":");
                System.out.println("  Area: " + rect.calcArea());
                System.out.println("  Longest line within: " + rect.longestLineWithin());
            }

            System.out.println();
        }

        scanner.close();
    }
}
