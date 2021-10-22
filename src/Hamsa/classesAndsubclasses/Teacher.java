package Hamsa.classesAndsubclasses;



public class Teacher extends Person {

    public String teacherType;

    public void startClass() {
        System.out.println(name + " the " + teacherType + " teacher will start the class");
    }

    public Teacher(String name, int age, char gender, String teacherType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherType = teacherType;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", teacherType='" + teacherType + '\'' +
                '}';
    }
}




//    create a class called Teacher
//        attributes: name, age, gender, teacherType
//        methods: startClass, setTeacherInfo, toString
