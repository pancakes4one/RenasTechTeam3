package Hamsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class assignment17 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(reverseList(numbers));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("= "+ sumOfIntegers("hello 5world a1b2c3"));
        System.out.println("= "+ sumOfIntegers2("hello 5world a1b2c3"));

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer> doublicated = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6));
        unique(doublicated);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        combine(arr1,arr2);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer> mixedList = new ArrayList<>(Arrays.asList(70,-98,71,22,58,190,0,-18));
        System.out.println(mixedList);
        System.out.println("Maximum number is : "+maxNumber(mixedList));
        System.out.println("Minimum number is : "+minNumber(mixedList));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        colorsList();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        iteration(mixedList);
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> numbers) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverse.add(numbers.get(i));
        }
        return reverse;
    }
    public static int sumOfIntegers(String sentence) {
        System.out.println(sentence);
        int sum = 0;
        String temp = "";
        char[] charSentence = sentence.toCharArray();
        //       System.out.println(Arrays.toString(charSentence));
        for (int i = 0; i < charSentence.length; i++) {
            int ascii = charSentence[i];
            if (ascii >= 48 && ascii <= 57) {
                System.out.print(charSentence[i]+" + ");
                temp=""+charSentence[i];
                sum = sum +Integer.parseInt(temp);
            }
        }
        return sum;
    }
    public static int sumOfIntegers2(String sentence) {//another way
        int sum2 = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i)) >= 48 && (sentence.charAt(i)) <= 57) {
                sum2 = sum2 + Integer.parseInt("" + sentence.charAt(i));
            }
        }
        return sum2;
    }
    public static void unique(ArrayList<Integer> list) {
        ArrayList<Integer> uniquelist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(list.get(i));
                uniquelist.add(list.get(i));
            }
        }
        System.out.println(uniquelist);
    }
    public static void combine(String[] arr1,String[] arr2){
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i< arr1.length;i++){
            list.add(arr1[i]);
        }
        for (int i=0;i< arr2.length;i++){
            list.add(arr2[i]);
        }
        System.out.println(list);
    }
    public static Integer maxNumber(ArrayList<Integer>mixedList){
        int maxNum= mixedList.get(0);
        for (int i=0;i<mixedList.size();i++){
            if (maxNum<mixedList.get(i)){
                maxNum=mixedList.get(i);
            }
        }
        return maxNum;
    }
    public static Integer minNumber(ArrayList<Integer>mixedList){
        int minNum= mixedList.get(0);
        for (int i=0;i<mixedList.size();i++){
            if (minNum>mixedList.get(i)){
                minNum=mixedList.get(i);
            }
        }
        return minNum;
    }
    public static void colorsList(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        for (int i=0; i< 6;i++){
            System.out.print("Enter "+(i+1)+" color :");
            String color= input.nextLine();
            colors.add(color);
        }
        System.out.println("My color collection is : "+colors);
        System.out.print("Enter a number 1-6 to find the color for it : ");
        int colorNum=+input.nextInt();
        System.out.println("The color is : "+colors.get(colorNum-1));
    }
    public static void iteration(ArrayList<Integer> arr){
        for (int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

//  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */
 /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
 /*
  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

    ex: list==> {1,1,2,3,3,4,5,6}
    uniques ==> {2,4,5,6}

    */
/*
     write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
//write a return method that will print max number from arraylist
//write a retunr method that will print min number from arraylist

//        1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//        2. Write a Java program to iterate through all elements in an array list.
//        4. Write a Java program to retrieve an element (at a specified index) from a given array list



}
