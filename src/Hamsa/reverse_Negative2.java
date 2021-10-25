package Hamsa;

import java.util.Scanner;

public class reverse_Negative2 {

    public static void main(String[] args) {

        int num=-1356;
        System.out.println("the negative number = "+num);
        System.out.println("the reverse positive number = "+reverseNegative(num));

    }

    private static int reverseNegative(int neg) {
        int reverseNum=0;
        int reminder;
        neg = neg*(-1);
        while(neg >0){
            reminder=neg%10;
            reverseNum=(reverseNum*10)+reminder;
            neg=neg/10;
        }
        return reverseNum;
    }
}

