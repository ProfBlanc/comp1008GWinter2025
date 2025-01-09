package wk1;

import java.util.Scanner;

public class MathOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter operator");
        String operator = sc.next();//next, nextLine()
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        if(operator.equals("-"))
            result = num1 - num2;
        else if(operator.equals("*") || operator.equalsIgnoreCase("x"))
             result = num1 * num2;
        else if(operator.equals("/")){
            if(num2 == 0)
                num2 = 1;
            result = num1 / num2;
        }

        System.out.printf("%d %s %d = %d",
                num1, operator, num2, result
                );

    }
}
