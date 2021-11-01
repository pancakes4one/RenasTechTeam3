package Jessicca.javaInterviewQuestions;

public class swap_numbers {

//(Numbers) Swap Numbers
//Swap two variable' values without using a third variable

    public static void main(String[] args){


            int a = 5;
            int b = 10;

            a = (a + b); // 15
            System.out.println(a);
            b = (a - b);  // 5
            System.out.println(b);
            a = a - b; // 10
            System.out.println(a);
        }
}
