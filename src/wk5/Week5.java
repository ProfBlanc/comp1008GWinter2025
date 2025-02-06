package wk5;

public class Week5 {

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.clothing);
        p1.clothing = "jogging suit";
        System.out.println(p1.clothing);
        System.out.println(p1.isSmiling);

        Hero hero = new Hero();
        System.out.println(hero.clothing);

        hero.setAge(100);
        System.out.println(hero.getAge());

        p1.setAge(100);
        System.out.println(p1.getAge());

        Person p2 = new Hero();
        p2.setAge(100);
        System.out.println(p2.getAge());

        Person[] people = {new Person(), new Hero(), new Villain()};
        Object[] obs = {new Person(), new Hero(), new Villain()};

        System.out.println(hero instanceof Person);

        //Shape s = new Shape();
        Rectangle r = new Rectangle("Rectangle", 2, 3);
        Shape s = new Rectangle("Shape", 4,5);
        System.out.println(s.area()); //

    }

}
