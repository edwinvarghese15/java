import java.util.*;
class shape{
    void area (int l, int b){
        int area=l*b;
        System.out.println("Area of rectangle:"+area);
    }
    void area(float r){
        System.out.println("Area of Circle:"+3.14*r*r);
    }
    void area(double side){
        System.out.println("Area of Square:"+side*side);
    }
}
class AreaShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shape obj=new shape();
        System.out.println("Enter the length of the rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b=sc.nextInt();
        obj.area(l,b);

        System.out.println("Enter the radius of Circle:");
        float r=sc.nextFloat();
        obj.area(r);

        System.out.println("Enter the side of square:");
        double side=sc.nextDouble();
        obj.area(side);
    }
    
}
