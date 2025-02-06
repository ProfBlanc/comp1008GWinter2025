package wk5;

public class Rectangle extends Shape{

    double length, width;

    @Override
    public double area(){
        return length * width;
    }
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }
}
