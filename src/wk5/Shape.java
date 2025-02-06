package wk5;

public abstract class Shape {

    public String name;
    int edges;

    public Shape(String name){
        this.name = name;
    }
    public abstract double area(); //
    public abstract double perimeter();

    public boolean isCircle(){
        return edges == 0;
    }

}
