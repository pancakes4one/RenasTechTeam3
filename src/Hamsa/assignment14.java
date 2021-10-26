package Hamsa;

import java.util.Arrays;

public class assignment14 {
    public static void main(String[] args) {
//(Array) Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:
//            int[] arr = {10, 9, 8, 7};
//             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

        int[] numbers = {5, 2, 1, 10, 9, 8, 7};
        sortAscending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("+++++++++++++++++++++++++++++++++");
        sortDescending(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("+++++++++++++++++++++++++++++++++");
        finer(30);
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Divisible By 3 :");
        divisibleBy3(100);
        System.out.println();
        System.out.print("Divisible By 5 :");
        divisibleBy5(100);
        System.out.println();
        System.out.print("Divisible By 15 :");
        divisibleBy15(100);
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++");
        evenOrOdd(8);
    }


    public static int[] sortAscending(int[] unsorted) {
        int minNumber = unsorted[0];
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[i]) {
                    minNumber = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = minNumber;
                }
            }
        }
        return unsorted;
    }

    public static int[] sortDescending(int[] unsorted) {
        int maxNumber = unsorted[0];
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] > unsorted[i]) {
                    maxNumber = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = maxNumber;
                }
            }
        }
        return unsorted;
    }

    public static void finer(int range) {
        for (int i = 0; i <= range; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("FIN " + i);
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("RA " + i);
            } else if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FINRA " + i);
        }
    }

    public static void divisibleBy3(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void divisibleBy5(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void divisibleBy15(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("number " + x + " is even");
        } else System.out.println("number " + x + " is odd");
    }
}
//(Array) Sort Descending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex:  int[] arr = {10,20,7, 8, 90};
//                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

//(Numbers) FINRA
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.

//(Numbers) Divisible by 3, 5, 15
//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//ex:
//OutPut:
//Divisible By 15 15 30 45 60 75 90
//Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

//(Numbers) Odd & Even numbers
//Write  a method which can identifies given number is even or odd




