package Sergio.example.dto;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@ToString
@Getter
@AllArgsConstructor
@Setter
@EqualsAndHashCode

//the fields of this class
public class Student {
    public static int nextId = 1;
    private static final int MAX_COURSE_NUMBER = 5;

    private String firstName;
    private int courseNum;
    private String lastName;
    private String studentId;
    private Department department;
    private Course[] courses;
    private String name;

    //the method that receives the requested info
    public Student(String studentId, String firstName, String lastname, Department department) {
        this.studentId = String.format("S%03d", nextId++);

        this.courseNum = 0;
        this.firstName = firstName;
        this.lastName = lastname;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUMBER];
    }

    //toString method that adjusts the format of the string
    @Override
    public String toString() {
        return "Student{ First name = " + firstName + ", last name = " + lastName + ", course number = " + courseNum + ", department = " + department + ", courses = " + courses + ", stundent ID = " + studentId + "}";
    }
}
