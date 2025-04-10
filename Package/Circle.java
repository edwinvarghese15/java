
package graphics;

public class Circle implements Figures {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

 
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

