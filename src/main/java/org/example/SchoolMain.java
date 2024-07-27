package org.example;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melon = new Teacher(2, "Melon", 1000);
        Teacher bini = new Teacher(3, "Bini", 10000);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(lizzy);
        teacherList.add(melon);
        teacherList.add(bini);

        Student tamisha = new Student(5, "Tamisha", 4);
        Student sam = new Student(6, "Sam", 5);
        Student rabbi = new Student(7, "Rabbi", 9);
         List<Student> studentList = new ArrayList<>();

         studentList.add(tamisha);
         studentList.add(sam);
         studentList.add(rabbi);
         School ghs = new School(teacherList, studentList);

         System.out.println("GHS has earned $ "+ ghs.getTotalMoneyEarned());







    }
}
