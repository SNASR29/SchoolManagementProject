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

        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));
        s1.addTeacher("Yi", "Wang", new Department("Math"));

        s1.printTeachers();

        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));
        s1.addStudent("Sergio", "Nasr", new Department("Math"));

        s1.printStudents();
    }
}
