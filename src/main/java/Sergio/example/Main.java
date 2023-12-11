package Sergio.example;

import Sergio.example.dto.Department;
import Sergio.example.dto.SchoolManagementSystem;
import Sergio.example.dto.Student;
import Sergio.example.dto.Course;
import Sergio.example.dto.Teacher;

/**
 * main class that prints info and adds info
 *
 * @author Sergio Nasr(ID: 2376102)
 */
public class Main {
    public static void main(String[] args) {

        SchoolManagementSystem s1 = new SchoolManagementSystem();
        s1.addDepartment("Math");
        s1.addDepartment("Physics");
        s1.addDepartment("Biology");
        s1.addDepartment("Chemistry");
        s1.addDepartment("English");
        s1.addDepartment("French");
        s1.printDepartment();

        s1.addStudent("Sergio","Nasr", new Department("Math"));
        s1.addStudent("John","Doe", new Department("Math"));
        s1.addStudent("Eric","Snow", new Department("Math"));
        s1.addStudent("Kevin","Johnson", new Department("Math"));
        s1.addStudent("Steph","Kerr", new Department("Math"));
        s1.addStudent("William","Conan", new Department("Math"));
        s1.printStudents();

        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.printTeachers();

        s1.addCourse("Calculus", 20, new Department("Math"));
        s1.addCourse("Science", 20, new Department("Math"));
        s1.addCourse("Economics", 20, new Department("Math"));
        s1.addCourse("Mechanics", 20, new Department("Math"));
        s1.addCourse("French", 20, new Department("Math"));
        s1.addCourse("English", 20, new Department("Math"));
        s1.printCourses();

        s1.modifyCourseTeacher("T001", "C001");
        s1.modifyCourseTeacher("T001", "C007");
        s1.modifyCourseTeacher("T002", "C001");

        s1.registerCourse("S001", "C001");
        s1.registerCourse("S001", "C002");
        s1.registerCourse("S001", "C003");
        s1.registerCourse("S001", "C004");
        s1.registerCourse("S001", "C005");
        s1.registerCourse("S007", "C001");
        s1.registerCourse("S002", "C007");
        s1.registerCourse("S001", "C006");
        s1.registerCourse("S002", "C001");
        s1.registerCourse("S003", "C001");
        s1.registerCourse("S004", "C001");
        s1.registerCourse("S005", "C001");
        s1.registerCourse("S006", "C001");
    }
}
