package wk5;

public abstract class Vehicle {

    String name, color;
    int speed;

    public boolean isDriving(){
        return speed > 0;
    }
    abstract public boolean isInGoodDrivingCondition(int age, double kilometers);



}
