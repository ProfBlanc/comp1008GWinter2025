package wk1;

import java.util.Scanner;

public class Greetings {
    //psvm+tab => automatically generates main method signature

    public static void main(String[] args) {
        //sout+tab => auto generates System.out.println()
        System.out.println("Hello, how are you doing?");
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        //Console.WriteLine($"You are {age} years old");
        //souf+tab => String formatting
        //d=digit (whole), s=string, f=float/double
        System.out.printf("You are %d years old", age);
        System.out.printf("In %d years from now, you will be %f years old",
                5, age + ((float)5 + 1)
                );
    }

}
