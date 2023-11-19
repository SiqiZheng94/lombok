package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@With
@Value
public class Course {
    private String id;
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    //private List<Teacher> teachers = new ArrayList<>();

    //private List <Student> students = new ArrayList<>();

/*
    public Course(String id, String name, List<Teacher> teachers, List<Student> students) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

 */
}
