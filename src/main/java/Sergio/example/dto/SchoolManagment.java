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

public class SchoolManagment {

    /**
     * Method that finds the requested department
     * @param departmentId
     * @return info about the desired department according to the department class format
     */
    public Department finDepartment(String departmentId) {

        return null;
    }

    /**
     * Method that prints the names of the teachers
     */
    public void printTeachers() {


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
     * @param department
     */
    public void addDepartment (String department) {


    }

    /**
     * This method prints out the info of all the students according to the format of the Student class
     */
    public void printStudents() {


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
     * @param courseId
     */
    public void addCourse (String courseName, double credit, String courseId) {


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
     * @param teacherId
     */
    public void addTeacher (String teacherFirstName, String teacherLastName, String teacherId) {


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


    }

    /**
     * this method adds a new student to the school
     * @param studentFirstName
     * @param studentLastName
     * @param studentId
     */
    public void addStudent(String studentFirstName, String studentLastName, String studentId) {


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
