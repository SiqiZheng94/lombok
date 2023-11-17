package org.example;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@With
public class Student {
    private String id;
    private String firstName;
    private String familyName;
    private String Adress;
    private int grade;

}

