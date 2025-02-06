package wk5;

public class SUV extends Vehicle implements Windshield {

    private boolean cracked = false;
    private double weight;
    @Override
    public boolean isInGoodDrivingCondition(int age, double kilometers) {
        return age < 15 || kilometers < 200000;
    }

    @Override
    public boolean isCracked() {
        return cracked;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
