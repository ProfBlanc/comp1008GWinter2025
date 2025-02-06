package wk5;

public class Person implements Arm {

    private String name;
    private int age;
    private double height, weight;

    public boolean isSmiling;
    protected String clothing = "Suit and Tie";


    public Person(){}

    public Person( String name, int age, double height, double weight ){

        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
