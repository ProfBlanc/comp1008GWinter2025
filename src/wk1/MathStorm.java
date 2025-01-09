package wk1;

import java.util.Random;
import java.util.Scanner;

public class MathStorm {
    static void example1(){
        Random rand = new Random();
        int n = rand.nextInt(1, 21) ;

        char[] ops = {'+', '-'}; //char is primitive ops[0] == '+'

        char selectOp = ops[rand.nextInt(ops.length)];

        //https://github.com/ProfBlanc/comp1008GWinter2025

    }
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("You must answer Math questions until you incorrectly answer a question");

        int MIN_NUM = 1;
        int MAX_NUM = 20;

        char[] ops = {'+', '-', '*', '%'};

        int correctAnswer = 0;
        int userAnswer = 0;
        int numberOfQuestionsSolved = 0;

        do{
            int n1 = rand.nextInt(MIN_NUM, MAX_NUM);
            int n2 = rand.nextInt(MIN_NUM, MAX_NUM);
            char selectedOperator = ops[rand.nextInt(ops.length)];

            correctAnswer = n1 + n2;
            if(selectedOperator == '-')
                correctAnswer = n1 - n2;
            else if(selectedOperator == '*')
                correctAnswer = n1 * n2;
            else if(selectedOperator == '%')
                correctAnswer = n1 % n2;

            System.out.printf("%d %s %d = ? ", n1, selectedOperator, n2 );
            userAnswer = sc.nextInt();

            System.out.println(correctAnswer == userAnswer ? "Correct" : "Incorrect. The actual answer is " + correctAnswer); ;

            numberOfQuestionsSolved = correctAnswer == userAnswer ? numberOfQuestionsSolved + 1 : numberOfQuestionsSolved;


        }
        while(correctAnswer == userAnswer);

        System.out.printf("You answers %d out of %d questions.",
                                numberOfQuestionsSolved, numberOfQuestionsSolved + 1
                );


    }
}
