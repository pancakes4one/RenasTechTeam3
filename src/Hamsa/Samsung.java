package Hamsa;




public class Samsung extends PhoneObject {

    static String brand;

    static {
        brand="samsung";
    }

    Samsung(String model, double price, double size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    void calling() {
        System.out.println(brand +" model "+model+" has a good camera ");
    }

    @Override
    void texting() {
        System.out.println(brand+"--"+model+" size "+size+" texting is autocorrected");
    }

    public void camera(){
        System.out.println(brand+"--"+model+" high resolution camera");
    }
}