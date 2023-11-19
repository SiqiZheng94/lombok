package org.example;


import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //traditional-student
        Student student1 = new Student("000","Example","Lee","Hamburg",13);
        System.out.println(student1);
        //Lombok-student-class
        Student student2 = Student.builder()
                .id("111111")
                .grade(1)
                .Address("Berlin")
                .firstName("Muster")
                .build();
        Student student3 = student2.withId("-----");
        System.out.println(student3);
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
        //Lombok-course-class
        Course course1 = Course.builder()
                .id("Nr.1")
                .name("FirstClass")
                .teachers(List.of(teacher1,teacher2))
                .students(List.of(student1,student2))
                .build();
        Course course2 = new Course("222","JAVA",List.of(teacher1, teacher2),List.of(student1,student2));
        System.out.println("course1 is : "+course1);
        System.out.println("course2 is : "+course2);
        //traditional Setter to change the ID of course1
        //course1.setId("Nr. 2");
        //System.out.println("course1: "+course1);

        //@With build another course(course2) with a different ID
        Course course3 = course1.withId("333").withName("WEB");
        System.out.println("course3 is : "+course3);
    }
}