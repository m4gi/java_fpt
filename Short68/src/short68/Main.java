/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short68;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static void SortStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.err.println("The list is empty!");
            return;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("--------Student " + (i + 1) + "--------");
            System.out.println("Name: " + list.get(i).getName());
            System.out.println("Classes: " + list.get(i).getClasses());
            System.out.println("Mark: " + list.get(i).getMark());
        }

    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("====== Collection Sort Program ======");
        do {
            System.out.println("Please input student infomation");
            System.out.print("Name: ");
            String name = Validation.checkInputString();
            System.out.print("Classes: ");
            String classes = Validation.checkInputString();
            System.out.print("Mark: ");
            int mark = Validation.checkInputInt();
            list.add(new Student(name, mark, classes));
            System.out.print("Do you want to add more student ?(Y/N) :");
        } while (Validation.checkInputYN());
        SortStudent(list);
    }

}
