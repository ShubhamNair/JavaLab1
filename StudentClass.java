package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class StudentClass{
    public static void main(String[] args) {
        JavaClass javaClass = new JavaClass();
        Student student1 = new Student(1, "John", "Doe");
        Student student2 = new Student(2, "Jane", "Doe");
        Student student3 = new Student(3, "Shubham", "Nair");

        javaClass.addStudent(student1);
        javaClass.addStudent(student2);
        javaClass.addStudent(student3);

        javaClass.displayStudents();

        javaClass.removeStudent(1);

        javaClass.displayStudents();
    }
}

class Student {
    int id;
    String firstName;
    String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class JavaClass {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.id == studentId) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " deleted.");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the class.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println("ID: " + student.id + ", Name: " + student.firstName + " " + student.lastName);
            }
        }
    }
}

