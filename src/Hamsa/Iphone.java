package Hamsa;



public class Iphone extends PhoneObject {

    static String brand;

    static {
    brand="iphone";
    }

    public Iphone(String model, double price, double size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    void calling() {
        System.out.println(brand+" model "+model+" has auto calling function");
    }

    @Override
    void texting() {
        System.out.println(brand+"--"+model+" size "+size+" is good for texting");
    }

    public void apps(){
        System.out.println(brand+" all the apps are easy to use");
    }


}
