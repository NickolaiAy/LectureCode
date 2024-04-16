package org.example.Week7_OOP;

public class ITECCourseManager {
    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse();
        maintenanceCourse.name = "Microcomputer Systems Maintenance";
        maintenanceCourse.code = 1310;
        maintenanceCourse.maxStudents = 20;
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.writeCourseInfo();
        ITECCourse datacomCourse = new ITECCourse();
        datacomCourse.name = "Data Communications";
        datacomCourse.code = 1425;
        datacomCourse.maxStudents = 30;
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();
    }
}
