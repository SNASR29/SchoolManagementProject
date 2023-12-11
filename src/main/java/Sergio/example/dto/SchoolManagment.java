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
import java.util.ArrayList;
import java.util.List;

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

    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;
    private int departmentCount;
    private int courseCount;
    private int studentCount;
    private int teacherCount;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUMBER];
        this.courses = new Course[MAX_COURSE_NUMBER];
        this.students = new Student[MAX_STUDENT_NUMBER];
        this.teachers = new Teacher[MAX_TEACHER_NUMBER];
        this.departmentCount = 0;
        this.courseCount = 0;
        this.teacherCount = 0;
        this.studentCount = 0;
    }

    /**
     * Search a department in the departments based on a departmentId. If the departmentId
     * does not match with anything in the departments, return null.
     * @param departmentId
     * @return department
     */
    public Department findDepartment(String departmentId) {
        for (int i = 0; i < departmentCount; i++) {
            Department department = departments[i];
            if (department != null && department.getDepartmentId().equals(departmentId)) {
                System.out.println(departments[i]);
                return department;
            }
        }
        return null;
    }

    /**
     * Display all teachers in a school, only display the teacher that is not null. And only display
     * the names of course and department if there is any.
     * Method that prints the names of the teachers
     */
    public void printTeachers() {
        System.out.println("List of Teachers with Courses:");
        for (int i = 0; i < teacherCount; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null) {
                System.out.println(teacher.toString());

                Department teacherDepartment = teacher.getDepartment();
                if (teacherDepartment != null) {
                    System.out.println("Department: " + teacherDepartment.getName());
                }

                Course[] teacherCourses = teacher.getCourses();
                for (Course course : teacherCourses) {
                    if (course != null) {
                        System.out.println("Course: " + course.getCourseName());
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * Display all courses in a school, only display the course that is not null. And only display
     * the names of teacher, students, and department if there is any.
     */
    public void printCourses() {
        System.out.println("List of Courses with Details:");
        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            if (course != null) {
                System.out.println(course.toString());

                Department courseDepartment = course.getDepartment();
                if (courseDepartment != null) {
                    System.out.println("Department: " + courseDepartment.getName());
                }

                Teacher courseTeacher = course.getTeacher();
                if (courseTeacher != null) {
                    System.out.println("Teacher: " + courseTeacher.getFirstName() + " " + courseTeacher.getLastName());
                }

                Student[] courseStudents = course.getStudents();
                for (Student student : courseStudents) {
                    if (student != null) {
                        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     *Assign a teacher to a specific course, based on teacherId and courseId, if no teacher or
     * course can be found with those ids, print a message
     * @param teacherId
     * @param courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);

        if (teacher != null && course != null) {
            course.setTeacher(teacher);
            System.out.println("Teacher " + teacher.getFirstName() + " " + teacher.getLastName() +
                    " assigned to course " + course.getCourseName());
        } else {
            System.out.println("Teacher or course not found with the specified IDs.");
        }
    }

    /**
     *Add a new department
     * @param departmentName
     */
    public void addDepartment(String departmentName) {
        if (departmentCount < MAX_DEPARTMENT_NUMBER) {
            Department newDepartment = new Department(departmentName);
            departments[departmentCount] = newDepartment;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments. Maximum number of departments reached.");
        }
    }

    /**
     * Display all students in a school, only display the student that is not null. And only display
     * the names of courses and department if there is any.
     */
    public void printStudents() {
        System.out.println("List of Students with Courses:");
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            if (student != null) {
                System.out.println(student.toString());

                Department studentDepartment = student.getDepartment();
                if (studentDepartment != null) {
                    System.out.println("Department: " + studentDepartment.getName());
                }

                Course[] studentCourses = student.getCourses();
                for (Course course : studentCourses) {
                    if (course != null) {
                        System.out.println("Course: " + course.getCourseName());
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * Search a student in the students based on a studentId. If the studentId does not match
     * with anything in the students, return null.
     * @param studentId
     * @return student
     */
    public Student findStudent(String studentId) {
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            if (student != null && student.getStudentId().equals(studentId)) {
                System.out.println(students[i]);
                return student;
            }
        }
        return null;
    }

    /**
     * Add a new course
     * @param courseName
     * @param credit
     * @param department
     */
    public void addCourse(String courseName, double credit, Department department) {
        if (courseCount < MAX_COURSE_NUMBER) {
            Course newCourse = new Course(courseName, department, credit);
            courses[courseCount] = newCourse;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Maximum number of courses reached");
        }

    }

    /**
     *Register a course for a student, based on studentId and courseId, which will check
     * i. If the studentId or courseId does not match with anything, print a message.
     * ii. If the student has register max amount courses (5), print a message.
     * iii. If the course has be registered by the max number of students (5), print a
     * message.
     * @param courseId
     * @param studentId
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student != null && course != null) {
            boolean isAlreadyRegistered = false;

            for (int i = 0; i < student.getCourseNum(); i++) {
                if (student.getCourses()[i].getCourseId().equals(courseId)) {
                    isAlreadyRegistered = true;
                    break;
                }
            }

            if (isAlreadyRegistered) {
                System.out.println("Student " + student.getFirstName() + " " + student.getLastName() +
                        " is already registered for course " + course.getCourseName());
                return;
            }

            if (course.getStudentNum() < Course.MAX_STUDENT_NUMBER) {
                if (student.getCourseNum() < Student.MAX_COURSE_NUMBER) {
                    student.registerForCourse(course);
                    course.registerStudent(student);

                    System.out.println("Student " + student.getFirstName() + " " + student.getLastName() +
                            " registered for course " + course.getCourseName());
                } else {
                    System.out.println("Cannot register for more courses. Maximum number of courses reached for student " + student.getFirstName() + " " + student.getLastName());
                }
            } else {
                System.out.println("Cannot register more students. Maximum number of students reached for course " + course.getCourseName());
            }
        } else {
            System.out.println("Student or course not found with the specified IDs.");
        }
    }

    /**
     * This method adds a new teacher to the school
     * @param teacherFirstName
     * @param teacherLastName
     * @param department
     */
    public void addTeacher(String teacherFirstName, String teacherLastName, Department department) {
        if (teacherCount < MAX_TEACHER_NUMBER) {
            Teacher newTeacher = new Teacher(teacherFirstName, teacherLastName, department);
            teachers[teacherCount] = newTeacher;
            teacherCount++;
        } else {
            System.out.println("Cannot add more teachers. Maximum number of teachers reached");
        }
    }

    /**
     * Search a course in the courses based on a courseId. If the courseId does not match with
     * anything in the courses, return null.
     * @param courseId
     * @return course
     */
    public Course findCourse(String courseId) {
        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            if (course != null && course.getCourseId().equals(courseId)) {
                System.out.println(courses[i]);
                return course;
            }
        }
        return null;
    }

    /**
     * Display all departments in a school, only display the department that is not null
     */
    public void printDepartment() {
        System.out.println("List of departments:");
        for (int i = 0; i < MAX_DEPARTMENT_NUMBER; i++) {
            if (departments[i] != null) {
                System.out.println(departments[i]);
            }
        }
    }

    /**
     * Add a new Stundent
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
     *Search a teacher in the teachers based on a teacherId. If the teacherId does not match
     * with anything in the teachers, return null.
     * @param teacherId
     * @return teacher
     */
    public Teacher findTeacher(String teacherId) {
        for (int i = 0; i < teacherCount; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                System.out.println(teachers[i]);
                return teacher;
            }
        }
        return null;
    }
}
