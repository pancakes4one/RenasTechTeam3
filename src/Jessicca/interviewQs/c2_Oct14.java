package Jessicca.interviewQs;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class c2_Oct14 {
    //(String) Frequency of Characters
//String -- Frequency of Characters
//Write a return method that can find the frequency of characters

    public static void main(String[] args) {
//        String x = "TYUIOJUUUWJEHRYHFNG";
//        char [] freq = x.toCharArray();
//        System.out.println(freq);
//
//       int i,j;
//        for (i = 0; i <freq.length; i++) {
//            freq [i] = 1;
//            for (j = i + 1; j<freq.length; j++){
//                if (freq[i]==freq[j]){
//                    freq[i]++;
//
//                }
//            }
//
//        }

//
//        System.out.println("(String) Frequency of Characters");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an string");
////        String sentence1 = input.nextLine();
//String sentence1 = "TYUIOJUUUWJEHRYHFNG";
//
//        int[] freq = new int[sentence1.length()];
//        System.out.println(sentence1);
//        int i, j;
//
//        char[] senChar = sentence1.toCharArray();
//
//        for (i = 0; i < sentence1.length(); i++) {
//            freq[i] = 1;
//            for (j = i + 1; j < sentence1.length(); j++) {
//                if (senChar[i] == senChar[j]) {
//                    freq[i]++;
//                    senChar[j] = '0';
//                }
//            }
//        }
//
//        for (i = 0; i < freq.length; i++) {
//            if (senChar[i] != '0' && senChar[i] != ' ') {
//                System.out.println(senChar[i] + " - " + freq[i]);
//            }
//        }



//(String) Sum of Digits in a string
//Write a method that can return the sum of the digits in a string

        String digits = "1234567654321";



//(String) Sort Letters and Numbers from alphanumeric String
//Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
//sort the individual string and append them back together
//Ex:
//Input:  "DC501GCCCA098911"
//OutPut: "CD015ACCCG011899"


//(String) Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false

//        Scanner s = new Scanner (System.in);
//        String password = s.nextLine();

        int asciiLocaton = 'a';
        System.out.println(asciiLocaton);
        char char1 = 'a';
//        char [] charArray = new char['a''b''c']
        System.out.println(char1);
        System.out.println();

        int ascII;
        char[] characters={'a','&','*','$'};
        for(int i=0;i< characters.length;i++){
            System.out.println("character["+i+"]"+(ascII=characters[i]));
        }


//        if (password.length()>=6 && !(password.contains(" ")){
//
//        }else if{
//            System.out.println("Password must be at least 6 characters");
//        }if (password)


//(Array) Move Zeros to the End
//Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//Ex:
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]

//(Numbers) Factorial Number
//Write a return method that returns the factorial number of any given number
//Ex:
//Input: 5
//outPut: 120

//(Numbers) Fibonacci numbers
//Write a return method that returns the  Fibonacci of any given number

    }


}