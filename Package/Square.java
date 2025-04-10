
package graphics;

public class Square implements Figures {
    private double side;

    
    public Square(double side) {
        this.side = side;
    }

   
    public double getArea() {
        return side * side;
    }
}

