package org.example;

import java.math.BigDecimal;
import java.util.List;

public class UniversityService {
    public double averageGradeOfACourse(Course course){


        List<Student> students = course.getStudents();

        double sum = students.stream()
                .mapToInt(student->student.getGrade())
                .reduce((x,y)->{return x+y;})
                .orElse(0);
        return sum/ students.size();
    }


}
