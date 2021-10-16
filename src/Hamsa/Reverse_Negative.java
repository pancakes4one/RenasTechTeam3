package Hamsa;

import java.util.Scanner;
import java.util.Scanner;

    public class Reverse_Negative {
        //(Number) Reverse Negative Number
        //Write a return method that can reverse negative number and return it as int
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter a number :");
            int num=input.nextInt();
            int newnum=reverseNegative(num);
            System.out.println(newnum);

        }

        private static int reverseNegative(int num) {
            if(num<0) {
                num = num * (-1);
            }
            return num;
        }
    }

