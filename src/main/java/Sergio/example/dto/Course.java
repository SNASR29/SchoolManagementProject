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
public class Course {
    public static int nextId = 1;
    private static final int MAX_STUDENT_NUMBER = 5;


    private double credit;
    private int studentNum;
    private Student[] students;
    private Department department;
    private String courseId;
    private String courseName;
    private Teacher teacher;

    //the method that receives the requested info
    public Course(String courseId, String courseName, Department department, double credit) {
        this.courseId = String.format("C%03d", nextId++);

        this.credit = credit;
        this.courseName = courseName;
        this.teacher = getTeacher();
        this.students = new Student[MAX_STUDENT_NUMBER];
        this.department = department;
        this.studentNum = 0;
    }

    //toString method that adjust the string format
    @Override
    public String toString() {
        return "Course{ Teacher = " + teacher + ", course name = " + courseName + ", students = " + students + ", credit = " +
                 credit + ", student number = " + studentNum + ", department = " + department + ", course ID = " + courseId + " , max student num = " + MAX_STUDENT_NUMBER + "}";
    }
}
