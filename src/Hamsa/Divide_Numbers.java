package Hamsa;

public class Divide_Numbers {
    //    (Numbers) Divide without / operator
//    Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {

        int counter = 0;
        int number1 = 595;
        int number2 = 50;
        int number = number1;
        while (!(number1 <= 0)) {
            number1 = number1 - number2;
            counter++;
            if (number1<number2){break;}

        }

        System.out.println(number+" / "+number2+" = " + counter);
    }
}