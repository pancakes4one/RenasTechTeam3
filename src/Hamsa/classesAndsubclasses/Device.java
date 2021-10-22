package Hamsa.classesAndsubclasses;


public class Device {
    public String brand;
    public int model;
    public Double price;
    public String type;

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}


/*
task3
 creata a class called device:
                attributes: brand, model, price,  type
                methods: toString

create a class called TV:
                attributes: brand, model, price,Type
                methods: watch, toString
 create ba class called phone:
                attributes: brand, model, price,  type = "Phone"
                methods: call, text,  toString
 */