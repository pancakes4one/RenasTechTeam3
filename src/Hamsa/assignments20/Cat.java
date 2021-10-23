package Hamsa.assignments20;

public class Cat {
    String name;
    String color;
    int age;

    public void sleep() {
        System.out.println("the "+name+" went to sleep");
    }
    public void eat() {
        System.out.println("my "+name+" likes to eat cookies");
    }
    public void age() {
        System.out.println("the "+name+" age is around "+age);
    }
    public void move(String str) {
        System.out.println("my "+name+" is "+str+" active");
    }
    public void catInfo(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
        System.out.println("____________________________________________________________");
    }
}
/*
cat class:
      data/attributes:  instance variables
        name, color, age

      actions: instance methods
        sleep(), eat(), drink() , move()
 */