package Hamsa.classesAndsubclasses;


public class Person {

    public String name;
    public int age;
    public char gender;

    public void eat() {
        System.out.println(name + " has to eat 3 meals a day");
    }

    public void walk() {
        System.out.println(gender + " walk at least 30 minutes a day");
    }

    public void sleep() {
        if (age >= 1 && age <= 18) {
            System.out.println("the average sleeping hours 10-12 hrs.");
        } else if (age >= 18) {
            System.out.println("the average sleeping hours 7-9 hrs.");
        }
    }

        public void Person(String name,int age, char gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }





/*
task2
create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo




 */
