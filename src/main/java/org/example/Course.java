package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Course {
    private String id;
    private String name;
    private List<Teacher> teachers = new ArrayList<>();

    private List <Student> students = new ArrayList<>();

}
