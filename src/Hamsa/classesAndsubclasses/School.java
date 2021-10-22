package Hamsa.classesAndsubclasses;


import java.util.ArrayList;

public class School {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Cast",35,'F',"Art");

        Student student1= new Student("Hamsa Elyas",18,'F',123456);
        Student student2= new Student("Saman Zangana",16,'M',566377);
        Student student3= new Student("Tara Zangana",17,'F',333323);

        ArrayList<Student> students= new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student st:students){
            System.out.println(st.name+"\t ID# "+st.studentID);
        }


    }
}





//    create a class called school:
//        create 3 objects of student and set their info
//        create a an ArrayList of students to store all student objects
//        use for each loop to print out each students' name and studentID