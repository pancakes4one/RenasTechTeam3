package Hamsa.classesAndsubclasses;


public class Phone extends Device {

    public void call(){
        System.out.println("use "+brand+" model -- "+model+"to call from long distance");
    }

    public void text(){
        System.out.println(brand+"--"+model+" is really good for texting and its around $"+price);
    }

}


//    create ba class called phone:
//        attributes: brand, model, price,  type = "Phone"
//        methods: call, text,  toString