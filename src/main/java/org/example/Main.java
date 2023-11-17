package org.example;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //traditional-student
        Student student1 = new Student("000","Example","Lee","Hamburg",13);
        System.out.println(student1);
        //Lombok-student
        Student student2 = Student.builder()
                .id("111111")
                .grade(1)
                .Adress("Berlin")
                .firstName("Muster")
                .build();
        System.out.println(student2);
        //Lombok-teacher-record
        Teacher teacher1 = Teacher.builder()
                .id("xxxx")
                .name("Mr. Lee")
                .subject(Subject.MATH)
                .build();
        Teacher teacher2 = Teacher.builder()
                .id("yyyy")
                .name("Mr. Right")
                .subject(Subject.ENGLISH)
                .build();
        System.out.println(teacher1);
        //Lombok
        Course course1 = Course.builder()
                .id("Nr.1")
                .name("FirstClass")
                .teachers(List.of(teacher1,teacher2))
                .students(List.of(student1,student2))
                .build();
        System.out.println(course1);

        course1.setId("Nr. 2");
        System.out.println("course1: "+course1);

        //@With build another course
        Course course2 = course1.withId("Nr. 999999");
        System.out.println("course2: "+course2);
    }
}