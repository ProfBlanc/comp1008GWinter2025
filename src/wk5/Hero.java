package wk5;

public class Hero extends Person{

    private String superPower = "Flying";
    private String uniform = "Cap";

    public Hero(){}

    public Hero(String name, int age, double height, double weight, String superPower, String uniform) {

        super(name, age, height, weight);

        //ctr+?
//        setName(name);
//        setAge(age);
//        setHeight(height);
//        setWeight(weight);

        this.superPower = superPower;
        this.uniform = uniform;
    }

    @Override
    public int getAge(){
        return super.getAge() / 2 ;
    }
}
