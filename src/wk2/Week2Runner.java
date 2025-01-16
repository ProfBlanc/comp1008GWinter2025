package wk2;

public class Week2Runner {

    public static void main(String[] args) {

        SeatingArrangement sa = new SeatingArrangement(2, 6);//instantiating object
        //System.out.println(sa);
        sa.setNames("Paul", "John", "Glen", "Mary", "Joey", "Bobby","Jill", "Bill","Jane", "Ottis", "Tammy", "Sally");

        String[] names = {"Paul", "John", "Glen", "Mary", "Joey", "Bobby","Jill", "Bill","Jane",
                "Otis", "Tammy", "Sally"};
            sa.setNames(names);
        System.out.println(sa.displaySeatingArrangement());

    }
}
