package wk2;

import java.io.Console;

public class Week2Runner {

    public static void main(String[] args) {

        runSeatingArrangement();
    }
    static void runSeatingArrangement(){

        //introduce the program
        System.out.println("Welcome to our Seating Arrangement Program");
        //ask user how many students they have in class
        System.out.println("How many students do you have your class? ");
        Console console = System.console();

        int numStudents = Integer.parseInt(console.readLine());

        // ask user to enter how many rows and columns they want to use in SA
        System.out.println("How many rows and columns do you want to use. Enter rows, followed by a space, then columns");
        String[] data = console.readLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int columns = Integer.parseInt(data[1]);
        // determine if rows and columns will fit the SA of classroom
        if(!SeatingArrangement.isValidData(numStudents, rows, columns)){
            System.err.println("Invalid data. Rows x Columns is not greater or equal to number of students");
        }
        else{
            SeatingArrangement sa = new SeatingArrangement(rows, columns);
            System.out.println("Would you like to enter the names of all " + numStudents + " students? Y/N");
            char answer = console.readLine().trim().toUpperCase().charAt(0);

            if(answer == 'Y'){
                String[] names = new String[numStudents];
                for(int i = 0; i < numStudents; i++){
                    System.out.printf("Enter name for student %d of %d\n", i + 1, numStudents);
                    names[i] = console.readLine();
                }
                sa.setNames(names);
            }

            System.out.println("Seating Arrangement has been completed");

            String response = "";
            do{
                System.out.println("What would you like to do next? \n1)Modify Student Name\n2)Enter Floor Value" +
                        "\n3)Display Seating Arrangement\n4)Quit Program");
                response = console.readLine();
                switch (response){
                    case "1":
                        // call on a Week2Runner method to ask user what student (index) they want to modify.
                        // ask user for new name
                        // YOUR choice: 1) add a new method in Seating Arrangement
                        // or
                        // 2) use the names[] array and override the student at the specified index
                        break;
                    case "2":
                        //enter floor value
                        break;
                    case "3":
                        System.out.println(sa.displaySeatingArrangement());
                        break;
                    default: break;
                }
            }
            while(response.trim().length() > 0 || response.trim().toUpperCase().charAt(0) == '4');

        }
        // ask user if they would like to enter all names of students OR have default names
        // display messaging stating that SA has been completed
        //give options to modify student name, floor value or display seating arrangement




    }
        static void example3(){
        SeatingArrangement sa = SeatingArrangement.LargeClass();
        System.out.println(sa);
        System.out.println(sa.displaySeatingArrangement());

    }
    static void example2(){
        SeatingArrangement sa = new SeatingArrangement(2, 2);//instantiating object

        System.out.println(sa.displaySeatingArrangement());
        sa.floor = SeatingArrangement.Floor.BASEMENT;
        System.out.println(sa.displaySeatingArrangement());

    }
    static void example1(){
        SeatingArrangement sa = new SeatingArrangement(2, 6);//instantiating object
        //System.out.println(sa);
        sa.setNames("Paul", "John", "Glen", "Mary", "Joey", "Bobby","Jill", "Bill","Jane", "Ottis", "Tammy", "Sally");

        String[] names = {"Paul", "John", "Glen", "Mary", "Joey", "Bobby","Jill", "Bill","Jane",
                "Otis", "Tammy", "Sally"};
        sa.setNames(names);
        System.out.println(sa.displaySeatingArrangement());

    }
}
