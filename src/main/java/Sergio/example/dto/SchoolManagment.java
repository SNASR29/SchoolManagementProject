package Sergio.example.dto;

/**
 * SchoolManagement class that completes all requested tasks such as finding the student or course
 *
 * @author Sergio Nasr(ID:2376102)
 */

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

public class SchoolManagementSystem {
    public static final byte MAX_DEPARTMENT_NUMBER = 5;
    public static final int MAX_STUDENT_NUMBER = 200;
    public static final int MAX_TEACHER_NUMBER = 20;
    public static final int MAX_COURSE_NUMBER = 30;

    private Department[] departments = new Department[MAX_DEPARTMENT_NUMBER];
    private Student[] students = new Student[MAX_STUDENT_NUMBER];
    private Teacher[] teachers = new Teacher[MAX_TEACHER_NUMBER];
    private Course[] courses = new Course[MAX_COURSE_NUMBER];

    private int departmentCount = 0;
    private int studentCount = 0;
    private int courseCount = 0;
    private int teacherCount = 0;

    public SchoolManagementSystem(){}


    /**
     * Method that finds the requested department
     * @param departmentId
     * @return info about the desired department according to the department class format
     */
    public Department findDepartment(String departmentId) {
        if (departmentCount < MAX_DEPARTMENT_NUMBER) {
            Department newDepartment = new Department(departmentId);
            departments[departmentCount] = newDepartment;
            departmentCount++;
            System.out.println("Department added:" + newDepartment);
        }
        return null;
    }

    /**
     * Method that prints the names of the teachers
     */
    public void printTeachers() {
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i]);
        }
    }

    /**
     * Method that changes the teacher for the according course using the id of the teacher and the course
     * @param teacherId
     * @param courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {


    }

    /**
     * This method adds a department to the school
     * @param departmentName
     */
    public void addDepartment (String departmentName) {
        if (departmentCount < MAX_DEPARTMENT_NUMBER) {
            Department newDepartment = new Department(departmentName);
            departments[departmentCount] = newDepartment;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments. Maximum number of departments reached");
        }
    }


    /**
     * This method prints out the info of all the students according to the format of the Student class
     */
    public void printStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(courses[i]);
        }
    }

    /**
     * This method finds the requested student and gives that student's info
     * @param studentId
     * @return the info of the student according to the Student class
     */
    public Student findStudent (String studentId) {


        return null;
    }


    /**
     * This method ads a new course to the shcool
     * @param courseName
     * @param credit
     * @param courseID
     */
    public void addCourse (String courseName, double credit, String courseID) {
        if (courseCount < MAX_COURSE_NUMBER) {;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Maximum number of courses reached");
        }

    }


    /**
     * This method registers students to a certain course
     * @param courseName
     * @param courseId
     */
    public void registerCourse (String courseName, String courseId) {
    }

    /**
     * This method ads a new teacher to the school
     * @param teacherFirstName
     * @param teacherLastName
     * @param department
     */
    public void addTeacher (String teacherFirstName, String teacherLastName, Department department) {
        if (teacherCount < MAX_TEACHER_NUMBER) {
            Teacher newTeacher = new Teacher(teacherFirstName, teacherLastName, department);
            teachers[teacherCount] = newTeacher;
            teacherCount++;
        } else {
            System.out.println("Cannot add more teachers. Maximum number of teachers reached");
        }
    }

    /**
     * This method finds the info about a course according to the Course class by receiving the name of the course
     * @param courseName
     * @return the info about the course according to the Course class
     */
    public Course findCourse(String courseName) {

        return null;
    }

    /**
     * This method prints out all the departments
     */
    public void printDepartment() {
        for (int i = 0; i < departmentCount; i++) {
            System.out.println(departments[i]);
        }
    }

    /**
     * this method adds a new student to the school
     * @param studentFirstName
     * @param studentLastName
     * @param department
     */
    public void addStudent(String studentFirstName, String studentLastName, Department department) {
        if (studentCount < MAX_STUDENT_NUMBER) {
            Student newStudent = new Student(studentFirstName, studentLastName, department);
            students[studentCount] = newStudent;
            studentCount++;
        } else {
            System.out.println("Cannot add more teachers. Maximum number of teachers reached");
        }

    }

    /**
     * this method finds a teacher in the school by using their Id
     * @param teacherId
     * @return the info of the teacher according to the Teacher class
     */
    public Teacher findTeacher(String teacherId) {

        return null;
    }
}
