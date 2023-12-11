package Sergio.example.dto;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Arrays;

@ToString
@Getter
@AllArgsConstructor
@Setter
@EqualsAndHashCode

//the fields of this class
public class Student {
    public static int nextId = 1;
    public static final int MAX_COURSE_NUMBER = 5;

    private String firstName;
    private int courseNum;
    private String lastName;
    private String studentId;
    private Department department;
    private Course[] courses;
    private String name;

    //the method that receives the requested info
    public Student( String firstName, String lastname, Department department) {
        this.studentId = String.format("S%03d", nextId++);
        this.courseNum = 0;
        this.firstName = firstName;
        this.lastName = lastname;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUMBER];
    }

    //Method that registers a student to a course( support method)
    public void registerForCourse(Course course) {
        if (courseNum < MAX_COURSE_NUMBER) {
            courses[courseNum] = course;
            courseNum++;
            System.out.println("Student " + firstName + " " + lastName +
                    " registered for course " + course.getCourseName());
        } else {
            System.out.println("Cannot register for more courses. Maximum number of courses reached for student " + firstName + " " + lastName);
        }
    }

    //toString method that adjusts the format of the string
    @Override
    public String toString() {
        String coursesString = "[";

        for (int i = 0; i < courseNum; i++) {
            coursesString += courses[i].getCourseName();
            if (i < courseNum - 1) {
                coursesString += ", ";
            }
        }

        coursesString += "]";

        return "Student{ First name = " + firstName + ", last name = " + lastName +
                ", course number = " + courseNum + ", department = " + department +
                ", courses = " + coursesString + ", student ID = " + studentId + "}";
    }
}
