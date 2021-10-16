package Hamsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_AscendingAndDescending {
        //(ArrayList) sorting in ascending
        //Write a method that can sort the ArrayList in Ascending order without using the sort method
        // (ArrayList) sorting in descending order
        //Write a method that can sort the ArrayList in descending order without using the sort method

        public static void main(String[] args) {

            ArrayList<Integer> ascending = new ArrayList<>();
            ascending.addAll(Arrays.asList(9, 6, 4, 1, 3));
            System.out.println("array before sorting : "+ascending);
            Collections.sort(ascending);
            System.out.println("array sorted ascending : "+ascending);

            ArrayList<Integer> descending = new ArrayList<>();
            for(int i=0; i< ascending.size();i++) {
                descending.add(ascending.get(ascending.size() - i-1));
            }
            System.out.println("array sorted descending : "+descending);
            System.out.println("************** Different Method **************");
            for (int i=0;i<ascending.size();i++){
                for(int j=i+1;j<ascending.size();j++){
                    if(ascending.get(i)>ascending.get(j)){
                        Collections.swap(ascending,i,j);
                    }
                }
            }
            System.out.println("array sorted descending : "+ascending);
            for (int i=0;i<ascending.size();i++){
                for(int j=i+1;j<ascending.size();j++){
                    if(ascending.get(i)<ascending.get(j)){
                        Collections.swap(ascending,i,j);
                    }
                }
            }
            System.out.println("array sorted ascending : "+descending);
        }


    }
