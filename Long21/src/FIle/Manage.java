/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIle;

import java.util.ArrayList;

/**
 *
 * @author Le Tuan
 */
public class Manage extends Student {

    ArrayList<Student> Data = new ArrayList();

    void InputData() {
        System.out.print("Enter Student ID : ");
        ID = Validation.checkInputString();
        System.out.print("Enter Student Name: ");
        Name = Validation.checkInputString();
        System.out.print("Enter Student Semester: ");
        Semester = Validation.checkInputString();
        System.out.print("Enter Student Course: ");
        Course = Validation.checkInputString();
        Data.add(new Student(Name, ID, Semester, Course));
    }

    void Report() {

        Data.forEach((student) -> {
            System.out.println(student);
        });
    }
}
