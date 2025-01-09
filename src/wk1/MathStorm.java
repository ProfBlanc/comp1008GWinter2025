package wk1;

import java.util.Random;

public class MathStorm {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(1, 21) ;

        char[] ops = {'+', '-'}; //char is primitive ops[0] == '+'

        char selectOp = ops[rand.nextInt(ops.length)];


    }
}
