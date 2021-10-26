package Hamsa;

public class assignment15 {
    public static void main(String[] args) {
        System.out.println("We sleep in if it is not a weekday and not a vacation ? "+sleepIn(false,false));
        System.out.println("We sleep in if it is a weekday and not a vacation ? "+sleepIn(true,false));
        System.out.println("We sleep in if it is not a weekday but a vacation ? "+sleepIn(false,true));
        System.out.println("We sleep in if it is a weekday and a vacation ? "+sleepIn(true,true));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("We are in trouble with monkey: " + monkeyTrouble(true, true));
        System.out.println("We are in trouble with monkey: " + monkeyTrouble(false, false));
        System.out.println("We are in trouble with monkey: " + monkeyTrouble(true, false));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("sum of both values is :" + sumDouble(1, 2));
        System.out.println("sum of both values is :" + sumDouble(3, 2));
        System.out.println("sum of both values is :" + sumDouble(2, 2));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("the absolute difference between the given number and 21 " + diff21(19));
        System.out.println("the absolute difference between the given number and 21 " + diff21(10));
        System.out.println("the absolute difference between the given number and 21 " + diff21(21));
        System.out.println("the absolute difference between the given number and 21 " + diff21(24));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("we in trouble " + parrotTrouble(true, 6));
        System.out.println("we in trouble " + parrotTrouble(true, 7));
        System.out.println("we in trouble " + parrotTrouble(false, 6));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("either one of the numbers is 10 or total is 10 " + makes10(9, 10));
        System.out.println("either one of the numbers is 10 or total is 10 " + makes10(9, 9));
        System.out.println("either one of the numbers is 10 or total is 10 " + makes10(9, 1));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("new string is : \""+notString("candy")+"\"");
        System.out.println("new string is : \""+notString("X")+"\"");
        System.out.println("new string is : \""+notString("not bad")+"\"");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("\"code\" became :\""+frontBack("code")+"\"");
        System.out.println("\"a\" became :\""+frontBack("a")+"\"");
        System.out.println("\"ab\" became :\""+frontBack("ab")+"\"");
        System.out.println("\"hamsaelyas\" became :\""+frontBack("hamsaelyas")+"\"");


    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation) {
            return true;
        }
        else if (weekday && !vacation) {
            return false;
        }
        else return true;
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else return false;
    }

    public static int sumDouble(int value1, int value2) {
        int sum = 0;
        sum = value1 + value2;
        if (value1 == value2) {
            sum = sum * 2;
        }
        return sum;
    }

    public static int diff21(int n) {
        int result = 0;
        if (n <= 21) {
            result = 21 - n;
        } else result = (21 - n) * (-1) * 2;
        return result;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour > 0 && hour < 7) || (hour > 20 && hour < 23)) {
            return true;
        } else return false;
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        } else
            return false;
    }
    public static String notString(String original) {
        if (original.length() >= 3) {
            String not = "" + original.charAt(0) + original.charAt(1) + original.charAt(2);
            if (not.equalsIgnoreCase("not")) {
                return original;
            }
            else original = "not".concat(" " + original);
            return original;
        }
        else original = "not".concat(" " + original);
        return original;
    }   /*if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        return str;
        }
        return "not " + str;*/
    public static String frontBack(String firstLas){
        int length=firstLas.length();
        if(length<2){
            return firstLas;
        }
        else
            firstLas =firstLas.charAt(length-1)+firstLas.substring(1,length-1)+firstLas.charAt(0);
        return firstLas;
    }
}


//        task1: The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
//
//        task2 : We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//        We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//        monkeyTrouble(true, true) → true
//        monkeyTrouble(false, false) → true
//        monkeyTrouble(true, false) → false
//
//        task3 :Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
//
//        task4 : Given an int n, return the absolute difference between n and 21,
//        except return double the absolute difference if n is over 21.
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0
//        diff21(24) ->6
//
//        task5
//        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
//        We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//        parrotTrouble(true, 6) → true
//        parrotTrouble(true, 7) → false
//        parrotTrouble(false, 6) → false

//        task6 : Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
//        makes10(9, 10) → true
//        makes10(9, 9) → false
//        makes10(1, 9) → true

//        task7 : Given a string, return a new string where "not " has been added to the front.
//        However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
//        notString("candy") → "not candy"
//        notString("x") → "not x"
//        notString("not bad") → "not bad"

//        task8 : Given a string, return a new string where the first and last chars have been exchanged.
//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"
//                */
