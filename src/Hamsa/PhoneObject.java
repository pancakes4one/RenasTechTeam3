package Hamsa;

public abstract class PhoneObject {
    public static String brand;
    public String model;
    public double price;
    public double size;

    abstract void calling();
    abstract void texting();

    @Override
    public String toString() {
        return "{"+
                "model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}







    // 1. create an abstract class called Phone
//    attributes: brand, model, price, size
//    abstract methods: calling(), texting()
//    instance method: toString()
//
//    create sub classes called iphone and samsung
//--create a static block to assign brand at begining for iphone and samsung
//--create a constructor to assign model , price and size for iphone and samsung
//--override abstract methods from parent Phone class
//
//    create a phoneobject class
//    to create 5 iphone object and 5 samsung object
//    use all the methods for all objects

//    plus you can create extra special methods for iphone and samsung classes

