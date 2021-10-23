package Hamsa.assignments20;

    public class Birds {
        String name;
        String color;
        int age;
        public void sleep(){
            System.out.println("my "+name+" never sleep");
        }
        public void eat(String food){
            System.out.println("my "+name+" likes to eat "+food);
        }
        public void drink(){
            System.out.println("my "+name+" likes to drink juice");
        }
        public void fly(String action){
            System.out.println("my "+name+" fly "+action);
        }
        public void setBirdInfo(String name,String color,int age){
            this.name=name;
            this.color=color;
            this.age=age;
            System.out.println("____________________________________________________________");
        }
}
// bird class
//
//data/attributes:  instance variables
//        name, color, age
//
//        actions: instance methods
//        sleep(), eat(), drink() ,fly()