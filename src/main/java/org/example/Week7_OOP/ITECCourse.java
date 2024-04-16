package org.example.Week7_OOP;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
String name;
int code;
List<String> students;
int maxStudents;
void addStudent(String studentName) {
    if (students == null) {
        students = new ArrayList<>();
    }
    students.add(studentName);
}
void writeCourseInfo() {
    System.out.println("Course Name: " + name);
    System.out.println("Course Code: " + code);
    System.out.println("Students enrolled:");
    for (String student : students) {
        System.out.println(student);
    }
    System.out.println("There are " + getNumberOfStudents() + " students enrolled");
    System.out.println("The max number of students for this course is " + maxStudents);
}
int getNumberOfStudents() {
    return this.students.size();
}
}
