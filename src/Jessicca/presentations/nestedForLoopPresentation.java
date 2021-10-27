package Jessicca.presentations;

import sharedUtilFolder.util;

public class nestedForLoopPresentation {
    // for loop:
    // 1. repeat code like a string
    // 2. repeat code using a special variable "i"
    // 3. using i to access element from an array or ArrayList

    // ex 1
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) // 3x3=9
                System.out.println("today is a good day");
        }

        util.brkLn();

        // ex 2
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 3; j++) { // 3x3=9
                // System.out.println("i: " + i + ", j:" +j);
                System.out.println("  j:" + j);
            }
        }


        //ex 3
        util.brkLn();
        String[][] colors = {{"red", "blue", "green"},
                //     [0][0]    0,1    0,2
                {"purple", "pink", "orange"}};

        for (int row = 0; row < colors.length; row++){
            for (int colums =0; colums < 3; colums++){
                System.out.println(colors[row][colums]+ ", ");
            }

        }

        util.brkLn();
 /*
            want to make this pattern

            *
            * *
            * * *
            * * * *
            * * *
            * *
            *

             */

//        System.out.println("How many stars do you want for the widest part of the triangle?");
//        Scanner s = new Scanner(System.in);
//        int numStars = s.nextInt();

        for (int i=1; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i=4; i>0; i--){
            for (int j=0; j<i; j++){
                //i=4 ; j=0,1,2,3
                //i=3 ; j=0,1,2
                //i=2 ; j=0,1
                //i=1 ; j=0
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Example 6:   (String) Remove Duplicates

//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

        util.brkLn();


        char [] removeDup ="AAABBBCC".toCharArray();

        for (int i=0; i<removeDup.length; i++){
            int j;
            for(j=0; j<1; j++){  // or for(j=0; j<removeDup.length; j++){


                // i=0  //0 AA YES
                // i=1  //0 1  AA AA
                // i=2  //0 1 2


                if (removeDup[i]==removeDup[j]){
                    break;
                }
            }
            if (i==j){
                System.out.println(removeDup[i]+" ");
            }
        }
    }
}
