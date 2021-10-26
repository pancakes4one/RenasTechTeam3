package Hamsa;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class assignment18 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//create 3 different arraylist : Double , Integer , String .
//use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))
//use remove method to remove 2 of them (use index number to remove or object name to remove)
//print size of list
// use indexOf method to print last index of arraylists
//use contains method to check if your arraylist are contain the data that you passed
// use Collections.sort method to sort your array list and use get method to print them
//use clear method to clear all your list
//check if they are empty by isEmpty method
// use bulk operations to add multiple data(10) to your arraylist
//use containsAll method to check if they are contain those data that you passe
//use retainAll to retain ony 5 data in your lists
//use removeall method to remove 3 data in your list
// while you working on this make sure to use print line each time so you can see what differences has been made to your lists
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//2. Write a Java program to iterate through all elements in a array list.
//3. Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update specific array element by given element.
//6. Write a Java program to remove the third element from a array list.
//7. Write a Java program to search an element in a array list.
//8. Write a Java program to sort a given array list.
//9. Write a Java program to copy one array list into another.
//10. Write a Java program to shuffle elements in a array list.  hint :  Collections.shuffle(list_Strings);
//11. Write a Java program to reverse elements in a array list.
//13. Write a Java program to compare two array lists.
//14. Write a Java program of swap two elements in an array list.
//15. Write a Java program to join two array lists.
//17. Write a Java program to empty an array list.
//18. Write a Java program to test an array list is empty or not.
//21. Write a Java program to replace the second element of a ArrayList with the specified element.
//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.


        ArrayList<Integer> numbersInt = new ArrayList<>();
        ArrayList<Double> numbersDou = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        addValues1(numbersInt);
        Collections.sort(numbersInt);
        System.out.print("Array after sorting\t"+numbersInt);
        numbersInt.remove(2);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        addValues2(numbersDou);
        Collections.sort(numbersDou);
        System.out.print("Array after sorting\t"+numbersDou);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        addValues3(names);
        System.out.println("---------------------------------------------------------------");
        names.remove(names.size()/2);
        System.out.println("Array after removing middle value has "+names.size()+" values "+names);
        System.out.println("---------------------------------------------------------------");
        names.remove("hamsa");
        System.out.println("Array after removing \"Hamsa\" has "+names.size()+" values "+names);
        System.out.println("---------------------------------------------------------------");
        System.out.println("the index for the last value in the array is :"+ names.indexOf(names.get((names.size())-1)));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Array contains \"Hamsa\" : "+names.contains("hamsa"));
        System.out.println("---------------------------------------------------------------");
        System.out.print("Array after sorting\t");
        Collections.sort(names);
        System.out.println();
        System.out.println(names);
        for (int i =0 ; i < names.size() ; i++){
            System.out.println("name("+(i+1)+") = " + names.get(i));
        }
        System.out.println("---------------------------------------------------------------");
        numbersDou.clear();
        System.out.println("Array before empty \t"+numbersDou);
        System.out.println("numbersDou.isEmpty() = " + numbersDou.isEmpty());
        System.out.println("Array after empty \t"+numbersDou);
        System.out.println("---------------------------------------------------------------");
        numbersDou.addAll(Arrays.asList(8.5,1.0,1.0,2.5,3.5,3.0,3.0,3.0,3.6,3.0,3.0,10.3));
        System.out.print("numbersDou after adding \t"+numbersDou);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Array contains the added list \t"+numbersDou.containsAll(Arrays.asList(8.5,1.0,1.0,2.5,3.5,3.0,3.0,3.0,3.6,3.0,3.0,10.3)));
        System.out.println("---------------------------------------------------------------");
        numbersDou.retainAll(Arrays.asList(3.5,3.0));
        System.out.println(" the modified array\t"+numbersDou);
        System.out.println("---------------------------------------------------------------");
        for (int i=0;i<3;i++) {
            numbersDou.remove(i);
        }
        System.out.println("after removing 3 values \t"+numbersDou);
        System.out.println("---------------------------------------------------------------");
        numbersDou.add(0,349.50);
        System.out.println(numbersDou);
        System.out.println("the value in 0 index : "+numbersDou.get(0));
        System.out.println("---------------------------------------------------------------");
        System.out.println("before shuffle\t"+numbersDou);
        Collections.shuffle(numbersDou);
        System.out.println("After shuffle\t"+numbersDou);
        System.out.println("---------------------------------------------------------------");
        int i=1;
        System.out.println("Array before switch\t"+numbersInt);
        int temp=numbersInt.get(i);
        numbersInt.set(i,numbersInt.get(i+1));
        numbersInt.set((i+1),temp);
        System.out.println("Array after switch\t"+numbersInt);
    }
    public static void addValues1(ArrayList<Integer> numbers){
        System.out.print("Enter 5 Integer numbers for your array");
        for (int i=0; i<5 ; i++){
            numbers.add(input.nextInt());
        }
        System.out.println(numbers);
    }
    public static void addValues2(ArrayList<Double> numbers1){
        System.out.println("Enter 5 Double numbers for your array");
        for (int i=0; i<5 ; i++){
            numbers1.add(input.nextDouble());
        }
        System.out.println(numbers1);
    }
    public static void addValues3(ArrayList<String> names){
        System.out.println("Enter 5 names for your array");
        for (int i=0; i<5 ; i++){
            names.add(i,(input.next()));
        }
        System.out.println(names);
    }

}
