package Hamsa;

import java.util.ArrayList;

public class Remove_SomeValues {
    //(ArrayList) Remove Some Values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        ArrayList<Integer> values= new ArrayList<Integer>();
        values.add(400);
        values.add(22);
        values.add(130);
        values.add(13);
        values.add(90);
        values.add(100);
        values.add(101);
        values.add(45);
        System.out.println("Array List Before removing Values : "+values);
        ArrayList<Integer> newList=new ArrayList<>();
        for(Integer number:values){
            if(number<=100){
                newList.add(number);
            }
        }
        System.out.println("Array List after removing Values : "+newList);
    }
}
