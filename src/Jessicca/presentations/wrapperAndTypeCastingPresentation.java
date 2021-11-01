package Jessicca.presentations;

import sharedUtilFolder.util;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;

public class wrapperAndTypeCastingPresentation {
    public static void main(String[] args) {


        // Type Casting
        // Converting a data type to another data type
        // Two types :      Widening and Narrowing
        //                  Implicit and Explicit

//        Data Type        Size           Description
//        byte             1 byte         Stores whole numbers from -128 to 127
//        short            2 bytes        Stores whole numbers from -32,768 to 32,767
//        int              4 bytes        Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long             8 bytes        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

//        float            4 bytes         Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double           8 bytes         Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean          1 bit           Stores true or false values
//        char             2 bytes         Stores a single character/letter or ASCII values   'a'

        // Implicit or Widening Casting - happens automatically when converting a narrower ranged
        //      data type to a wider range data type
        //
        //      Ex: an int to a double/float/long
        //      float to a double

        double d1 = 5; // java convert auto (implicitly)  int--->double
        double d2 = 5.5f; //double wider  float --->  double
        long l1 = 500; // int ----> long

        // Explicit or Narrow Casting - doesn't happen automatically.  Should be done by the programmer
        //      because this way will be losing data
        //
        //      Ex: converting a double/float/long to an int -- some data might be lost
        //
        //      java will not do it automatically

        int i1 = (int) 6.7; // error  -- range of int narrower than double
        System.out.println(i1);
        // int i2 = 6L; // int is narrower than long -- error
        float f1 = (float) 6.5;
        System.out.println(f1);

        //do by (new data type) expression

        int i2 = (int) 6.7;
        float f2 = (float) 6.5;

        //arithmetic
        double d5 =10.6 + 4; // 4.0
        System.out.println(d5);

        double dub2 = 5.5;
        int i = (int) dub2;  // we're storing it inside i, but the variable being casted doesn't change
        System.out.println("i = " + i);
        System.out.println("dub2 = " + dub2);
        // i = 4, d = 5.5

        //                      **************************************************

        //                              Wrapper Objects -

        // object representation of primitive data types
        // immutable - cannot be changed

        // Primitive vs. Reference Data Types (String)

        //Primitive Data Types
        //byte
        //short
        //int
        //long
        //float
        //double
        //boolean
        //char

        // PRIMITIVE                                    REFERENCE
        // 8 types                                      unlimited (user defined)
        // store data/contains the value                stores the address/references the value
        // can only hold 1 value                        could hold more than one value
        // less memory                                  more memory
        // faster                                       slower

        // not String - String is uppercase like the other reference types and is a class (Array, Interface, Class...
        //      a couple more we haven't talked about --Annotations and Enumeration)

        // String is a reference data type NOT a primitive.  Doesn't have corresponding wrapper class.
        // Can already be used with ArrayList -- which we've already been doing

        // Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        // They are the

        // Data Structure:
        //	1. Array
        //	2. Collection ==> only accepts objects
        //          Collection Interfaces
        //                  a. List (includes ArrayList)
        //                  b. Queue
        //                  c. Set
        //	3. Map ==>  only accepts objects

        // ArrayList<int> numbers = new ArrayList<int>() //not going to work
        ArrayList<Integer> numbers= new ArrayList<>();

        //Primitive Data Type	Wrapper Class

        //byte	                Byte
        //short	                Short
        //int	                Integer
        //long	                Long
        //float	                Float
        //double	            Double
        //boolean	            Boolean
        //char	                Character

        String String1 = new String("fall time");
        //String1.
        util.stars();
        int x = 10;
        Integer X = x;

        double a = 100.25;
        Double I = new Double (a);
        double b = I.doubleValue();

        System.out.println(I.intValue());

        // (sometimes done automatically)
        //      autoboxing = Java compiler automatic conversion primitive types to their corresponding
        //                      object wrapper classes
        //      unboxing = Automatic conversion of wrapper class to primitive data type when compiling

        // Benefits of Wrapper Classes
        //      - Provide a way to use primitive data types as an object or reference data type (functionality)
        //      - They contain useful methods that primitives don't
        //      - Still gets treated as a primitive (Java unboxing feature)
        // Disadvantages
        //      - Slower to access, takes more steps
        //      - If you're using millions of numbers it's going to take longer to access

    }
}
