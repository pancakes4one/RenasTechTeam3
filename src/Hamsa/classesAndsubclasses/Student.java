package Hamsa.classesAndsubclasses;



public class Student extends Person {
    public long studentID;

    public void attendClass(String str){
        System.out.println(name+" attend class "+str);
    }
    public Student(String name,int age,char gender,long studentID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID=studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentID=" + studentID +
                '}';
    }
}




//    create a class called Student
//        attributes: name, age, gender, studentID
//        methods: attendClass, code, setStudentInfo, toString