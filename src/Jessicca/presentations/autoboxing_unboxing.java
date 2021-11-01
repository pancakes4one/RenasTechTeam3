package Jessicca.presentations;

public class autoboxing_unboxing {

    public static void main(String[] args) {

        autoboxing_unboxing wc = new autoboxing_unboxing();

        Integer a = new Integer (2);
        Integer b = new Integer (3);

        int c = 4;
        int d = 5;


        System.out.println("Add Primitives = " + wc.addPrimitives(a,b)); // we add Integer instead of int //Autoboxing


        System.out.println("Add Objects = " + wc.addObjects(c,d)); // we add int instead of Integer //Unboxing

        //still works
    }

    public int addPrimitives (int i, int j){
        return i + j;  // asking for primitive in and return
    }

    public Integer addObjects (Integer i, Integer j){
        return 5 + 6;  // asking for object in and return // can also put variable instead of i, j
    }

}
