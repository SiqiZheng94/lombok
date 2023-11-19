package org.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {
    public double averageGradeOfACourse(Course course){


        List<Student> students = course.getStudents();

        double sum = students.stream()
                .mapToInt(student->student.getGrade())
                .reduce(Integer::sum)
                .orElse(0);
        return sum/ students.size();
    }

    public double averageGradeOfUniversity(University university){
        List<Student> allStudent = university.courseList().stream()
                .flatMap(course -> course.getStudents().stream())
                .collect(Collectors.toList());
        int sum = allStudent.stream()
                        .mapToInt(Student::getGrade)
                        .reduce(Integer::sum)
                        .orElse(0);
        return (double) sum/ allStudent.size();
    }
    public List<Student> goodStudents(University university) {
        List<Student> allStudent = university.courseList().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= 2)
                .collect(Collectors.toList());
        return allStudent;
    }
}
