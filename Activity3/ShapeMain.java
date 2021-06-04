import java.util.*;
abstract class Shape
{
    int value;
    public void setvalue(int value)
    {
        this.value = value;
    }
    public int getvalue()
    {
        return this.value;
    }
    abstract public void calculateArea(int value);
}
class Circle extends Shape
{
    public void calculateArea(int value)
    {
        System.out.println("Area of Circle is: " + (double)(Math.PI)*(value*value));
    }
}
class Square extends Shape
{
    public void calculateArea(int value)
    {
        System.out.println("Area of Square is: " + (value*value));
    }
}
public class ShapeMain 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Type Circle to calculate area of circle");
        System.out.println("Type Square to calculate area of square");
        System.out.println("Enter your choice");
        String choice = sc.next();
        if(choice.equals("Circle"))
        {
            Circle object = new Circle();
            System.out.println("Enter value");
            int value = sc.nextInt();
            object.calculateArea(value);
        }
        else
        {
            Square object = new Square();
            System.out.println("Enter value");
            int value = sc.nextInt();
            object.calculateArea(value);
        }
        sc.close();
    }
}
