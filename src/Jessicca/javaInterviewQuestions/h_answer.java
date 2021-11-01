//package Jessicca.interviewQs;
//
//import java.util.Scanner;
//
//public class hamsa {
//    public static void main(String[] args) {
//
//
//        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.):");
//        Scanner input = new Scanner(System.in);
//        String password = input.nextLine();
//        passwordChecking(password);
//    }
//
//        public static void passwordChecking(String pass) {
//            int countNumber = 0;
//            int countLetters=0;
//            if (pass.length() < 10) {
//                System.out.println("invalid password : " + pass);
//            }
//            else {
//                for (int i=0; i<pass.length() ;i++) {
//                    char letter = pass.charAt(i);
//                    if (checkIfNumber(letter)) {
//                        countNumber++;
//                    }
//                    else if (checkIfLetter(letter)){
//                        countLetters++;
//                    }
//                    else
//                        System.out.println("invalid password");
//                    break;
//                }
//                if (countNumber>=2 && countLetters>=2) {
//                    System.out.println("valid");
//                }
//                else System.out.println("invalid");
//            }
//        }
//
//        public static boolean checkIfLetter ( char ch){
//            int ascii = ch;
//            if ((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 90)) {
//                return true;
//            } else return false;
//        }
//        public static boolean checkIfNumber( char ch){
//            int ascii = ch;
//            if (ascii >= 48 && ascii <= 57) {
//                return true;
//            } else return false;
//        }
//
//
//
//        if (is_Valid_Password(s)) {
//            System.out.println("Password is valid: " + s);
//        } else {
//            System.out.println("Not a valid password: " + s);
//        }
//
//    }
//
//    public static boolean is_Valid_Password(String password) {
//
//        if (password.length() < PASSWORD_LENGTH) return false;
//
//        int charCount = 0;
//        int numCount = 0;
//        for (int i = 0; i < password.length(); i++) {
//
//            char ch = password.charAt(i);
//
//            if (is_Numeric(ch)) numCount++;
//            else if (is_Letter(ch)) charCount++;
//            else return false;
//        }
//
//
//        return (charCount >= 2 && numCount >= 2);
//    }
//
//    public static boolean is_Letter(char ch) {
//        ch = Character.toUpperCase(ch);
//        return (ch >= 'A' && ch <= 'Z');
//    }
//
//
//    public static boolean is_Numeric(char ch) {
//
//        return (ch >= '0' && ch <= '9');
//    }
//
//}
//    }
//}
