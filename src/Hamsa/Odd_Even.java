package Hamsa;

public class Odd_Even {
//    Write  a method which can identifies given number is even or odd
//    identify(5) ->  "Odd"
//    identify(6) ->  "Even"

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        oddEven(number1);
        oddEven(number2);
    }
        public static void oddEven(int num){
        if (num%2 == 0 ) {
            System.out.println(num + " Even");
        }
        else
            System.out.println(num + " Odd");
        }
    }

