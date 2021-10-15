package Hamsa;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_String {
    //(ArrayList) Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ahmed");
        names.add("Brad");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Robert");
        names.add("Ahmed");
        names.add("Hamsa");
        names.add("Ahmed");
        System.out.println("Array List Before removing Values : " + names);
        ArrayList<String> newList = new ArrayList<>();
        for (String name : names) {
            if (!(name.equalsIgnoreCase("Ahmed"))) {
                newList.add(name);
            }
        }
        System.out.println("Array List after removing Values : " + newList);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        names.addAll(Arrays.asList("Ahmed","Brad","Eric","Ahmed","Robert","Ahmed","Hamsa","Ahmed"));
        System.out.println(names);
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);
    }
}

