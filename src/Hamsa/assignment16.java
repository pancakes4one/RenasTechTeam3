package Hamsa;

import java.time.LocalDate;

public class assignment16 {
    public static void main(String[] args) {
        // 1. create an array of string, store five of your friends names in it
        //    2. create Array of localdates and store their birthdays in the same order
        //    3. use for loop to print out your friends' names and their birthdays
        String[] freinds = {"Tara", "Yara", "Lara", "May", "Angela"};
        LocalDate tarabir = LocalDate.of(1990, 01, 24);
        LocalDate yarabir = LocalDate.of(1991, 06, 06);
        LocalDate larabir = LocalDate.of(1987, 04, 29);
        LocalDate maybir = LocalDate.of(1988, 8, 15);
        LocalDate angelabir = LocalDate.of(1981, 9, 18);
        String TaraBirthday = tarabir.toString();
        String YaraBirthday = yarabir.toString();
        String LaraBirthday = larabir.toString();
        String MayBirthday = maybir.toString();
        String AngelaBirthday = angelabir.toString();
        String[] birthdays = {TaraBirthday, YaraBirthday, LaraBirthday, MayBirthday, AngelaBirthday};
        for (int i = 0; i < 5; i++) {
            System.out.println("My freind " + freinds[i] + " her birthday is on\t" + birthdays[i]);
        }
    }
}