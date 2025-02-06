package wk5;

public class Robot extends Rectangle implements Button, Arm {

    public Robot(String name, double length, double width){
        super(name, length, width);
    }
    @Override
    public double swing() {
        return 0;
    }

    @Override
    public boolean isBent() {
        return false;
    }

    @Override
    public void lightUp(String key, double duration) {

    }

    @Override
    public void click(String key) {

    }

    @Override
    public boolean isInFist() {
        return false;
    }

    @Override
    public void wave() {

    }

    @Override
    public double punch(String objectOrPerson) {
        return 0;
    }
}
