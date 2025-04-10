package mca;
import graphics.*;
import java.util.*;

public class MainPack {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Rectangle: ");
        System.out.print("Enter the length of the rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectWidth = scanner.nextDouble();
        Rectangle rect = new Rectangle(rectLength, rectWidth);
        
        System.out.println(" Square: ");
        System.out.print("Enter the side length of the square: ");
        double sqSide = scanner.nextDouble();
        Square sq = new Square(sqSide);
        
        System.out.println(" Triangle: ");
        System.out.print("Enter the base of the triangle: ");
        double triBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triHeight = scanner.nextDouble();
        Triangle tri = new Triangle(triBase, triHeight);
        
        System.out.println(" Circle: ");
        System.out.print("Enter the radius of the circle: ");
        double circRadius = scanner.nextDouble();
        Circle circ = new Circle(circRadius);
        
        System.out.println(" ---- Areas of Figures ----- ");
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Square Area: " + sq.getArea());
        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Circle Area: " + circ.getArea());
        scanner.close();
    }
}

