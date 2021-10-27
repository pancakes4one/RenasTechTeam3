package Jessicca.presentations;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;

public class wrapperAndTypeCastingPresentation {
    public static void main(String[] args) {


        // int x = 25;
        Integer x = new Integer(25);

//      ArrayList <int> arrList1= new ArrayList<>();  // will not work because this is trying to use a primitive
        ArrayList<Integer> arrList2 = new ArrayList<>();

//Primitive Data Types
        //byte
        //short
        //int
        //long
        //float
        //double
        //boolean
        //char

        ///non primitives object and objets are getting created by classes

        //Data Structure:
        //	1. Array
        //	2. Collection ==> only accepts objects
        //	3. Map ==>  only accepts objects
        //
        //	primitives: byte, short, int, long, float, double, char, boolean
        //
        //  wrapper classes:
        //		Byte, Short, Integer, Long, Float, Double, Character, Boolean

        //Java Wrapper Classes
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        //
        //The table below shows the primitive type and the equivalent wrapper class:
        //
        //Primitive Data Type	Wrapper Class
        //byte	                Byte
        //short	                Short
        //int	                Integer
        //long	                Long
        //float	                Float
        //double	            Double
        //boolean	            Boolean
        //char	                Character
        //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
        // where primitive types cannot be used (the list can only store objects):

        //Example
        //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        //ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

        // -----------------------------------------------------------------

        // why we need wrapper classes:
        // primitive data types are not objects, they don't belong to any class
        // primitive types are used when you need efficiency
        // they are slower to access and would use more processing power
        // if you need to use collections you will need wrapper class
        // collection framework only works with objects (like ArrayList)
        // Generics in Java only accept objects
        //what they do:
        // each primitive data type has a corresponding wrapper class (8 total)
        // Strings are not included.  They are already reference data type
        // they are used to convert the primitive data type to a wrapper class object
        //boxing or autoboxing int to Integer
        // the reverse of autoboxing,

        //Primitive Data Type	Wrapper Class
        //byte	                Byte
        //short	                Short
        //int	                Integer
        //long	                Long
        //float	                Float
        //double	            Double
        //boolean	            Boolean
        //char	                Character

        // Ex:

        // Reference data type variables
        Boolean a = true;
        Character b = '#';
        Integer c = 77;
        Double d = 545.45;
        String e = "kitten";

        // you can still treat them as if they are primitive
        // it is a reference data type but it will still be treated as if primitive because of this automatic
        // unboxing feature

        //each wrapper class contains useful methods like String toCharArray
        //we've been working with reference data types already with String
        // ex of each by typing a..b...c....d...e

        //benefits
        // provides a way to use primitive data types as a object or reference data type
        //they contain useful methods.
        //disadvantages
        // slower to access, takes more steps.  If you're using millions of numbers
        // it's going to take longer to access.

        // sometimes is done automatically
        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        if (a == true) {
            System.out.println("This is true");
        }

        // Typecasting allows us to

        int y = (int) 0.5;  // defaults to rounding down

        byte l;
        short m;
        char n;
        int o;
        long p;
        float q;
        double r;

        // automatically casts up (implicit), will not automatically cast down

        System.out.println();


// Primitives
        // variable contains the value
        //distinct variables that contain unique values


// Reference type
        // the variable references the value
        // different but reference the same value





// Type Casting
        // converting a data type to another data type
        // Two types : Widening and Narrowing
        // or Implicit and Explicit


        // Implicit or Widening Casting - happens automatically when converting a narrower ranged
        // data type to a wider range data type
        // ex: an int to a double/float/long
        // float to a double

        double d1 = 5; // java will try to convert this from an int --> double automatically (implicit)
        double d2 = 5.5f; // float --> double
        long l1 = 500; // int --> long

        // happens because the double wider than int
        // double wider than float
        // long wider than a long

        // -----------------------

        // Explicit or Narrow Casting - doesn't happen automatically.  Should be done by the programmer
        // because this way will be losing data
        // converting a double/float/long to an int -- some data might be lost
        // java will not do it automatically

//        int i1 = 6.7; // error -- range of an int is narrower than a double
//        int i2 = 6L; // error -- int is narrower than a long
//        float f1 = 6.5; // error -- float is narrower than a double

        // so would need to use explicit casting here
        // programmer would need to tell java

        // (new data type) expression
        // to do this, they should match
        // java will try to convert form R to L if they do not match
        // if L is wider than R = auto by java
        // if L narrower, then the programmer should use explict by putting the type on the inside

        int i3 = (int) 6.7;
        int i2 = (int) 6L;
        float f1 = (float) 6.5;

        //example explicit again
        // int int1 = 4.5;  // we're trying to store a double inside of a variable int / double is wider
        int int1 = (int) 4.5;

        //example implicit again
        // arithemtic operators will be applied to the same type

        double dub1 = 10.6 + 4;  // java automatically casts 3 --> 3.0
        System.out.println(dub1);

        //example of casting w/o variable changing

        double dub2 = 5.5;
        int i = (int) dub2;  // we're storing it inside i, but the variable being casted doesn't change
        System.out.println("i = " + i);
        System.out.println("dub2 = " + dub2);
        // i = 4, d = 5.5


        // ------------------------------------

        //Type Casting
        //    int --> Integer
        //1.Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
        // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
        //Passed as a parameter to a method that expects an object of the corresponding wrapper class.
        //Assigned to a variable of the corresponding wrapper class.

        //    Character --> char
        //2.Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
        // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
        //Passed as a parameter to a method that expects a value of the corresponding primitive type.
        //Assigned to a variable of the corresponding primitive type.
        //The following table lists the primitive types and their corresponding wrapper classes,
        // which are used by the Java compiler for autoboxing and unboxing:
        //Primitive Data Type	Wrapper Class
        //byte	                Byte
        //short	                Short
        //int	                Integer
        //long	                Long
        //float	                Float
        //double	            Double
        //boolean	            Boolean
        //char	                Character


            //create an Integer object
            Integer myInt1 = new Integer(10);

            int i1=myInt1; //unboxing
            //converting an object of wrapper Integer to it's corresponding value int

            Character myCh='w';//autoboxing
            //we take char 'w' and assigned to wrapper classes
            //Converting a primitive value into an object of the corresponding wrapper class is

            char ch2=myCh; //unboxing

            System.out.println("myCh = " + myCh);
            System.out.println("ch2 = " + ch2);

            int number= 100; //primitive

            Integer myInt=number;//autoboxing

            Byte myByte=25;
            byte b1=myByte; //unboxing

            //Integer myInt2=b1; error


    }
}
