package Hamsa;

import java.util.Arrays;

public class same_letters {

    //    Write a return method that check if a string is build out of the same letters as another string.
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false:

    public static void main(String[] args) {

        String first="abc";
        String second="cab";

        char[] firstarr=first.toCharArray();
        char[] secondarr=second.toCharArray();

        Arrays.sort(firstarr);
        System.out.println(Arrays.toString(firstarr));
        Arrays.sort(secondarr);
        System.out.println(Arrays.toString(secondarr));

        boolean compare= Arrays.equals(firstarr,secondarr);
        System.out.println("compare = " + compare);
    }

}

