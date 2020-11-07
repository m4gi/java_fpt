/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short65;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Magi
 */
public class Main {

    private static final Scanner in = new Scanner(System.in);
    static HashMap<String, Double> getPercentTypeStudent = new HashMap<>();
    static Set<Map.Entry<String, Double>> set = getPercentTypeStudent.entrySet();

    private static String checkInputString() {
        //loop until user input true value
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    private static int checkInputMark(String nameSubject) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < 0) {
                    System.err.println(nameSubject + " is greater than equal zero");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                if (result > 10) {
                    System.err.println(nameSubject + " is less than equal ten");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println(nameSubject + " is digit");
                System.out.print(nameSubject + ":");
            }
        }
    }

    static boolean doYouWantContinue() {
        return doYouWantContinue("Do you want to continue(Y/N): ", "Y", "N");
    }

    static boolean doYouWantContinue(String text, String var1, String var2) {
        System.out.print(text);
        while (true) {
            String rs = checkInputString();
            if (rs.equalsIgnoreCase(var1)) {
                return true;
            } else if (rs.equalsIgnoreCase(var2)) {
                return false;
            } else {
                System.out.printf("Please type %s/%s: ", var1, var2);
            }
        }
    }

    static void createStudent(List<Student> ls) {
        while (true) {
            System.out.print("Name: ");
            String name = checkInputString();
            System.out.print("Classes: ");
            String className = checkInputString();
            System.out.print("Maths: ");
            double math = checkInputMark("Maths");
            System.out.print("Chemistry: ");
            double chemistry = checkInputMark("Chemistry");
            System.out.print("Physics: ");
            double physics = checkInputMark("Physics");
            double average = (math + chemistry + physics) / 3;
            char type;
            if (average > 7.5) {
                type = 'A';
            } else if (average >= 6 && average <= 7.5) {
                type = 'B';
            } else if (average >= 4 && average < 6) {
                type = 'C';
            } else {
                type = 'D';
            }
            ls.add(new Student(name, className, math, physics, chemistry, average, type));
            if (!doYouWantContinue()) {
                return;
            }
        }
    }

    static HashMap<String, Double> getPercentTypeStudent(List<Student> students) {
        int totalStudent = students.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        for (int i = 0; i < totalStudent; i++) {
            if (students.get(i).getType() == 'A') {
                typeA++;
            }
            if (students.get(i).getType() == 'B') {
                typeB++;
            }
            if (students.get(i).getType() == 'C') {
                typeC++;
            }
            if (students.get(i).getType() == 'D') {
                typeD++;
            }
        }
        getPercentTypeStudent.put("A", typeA / totalStudent * 100);
        getPercentTypeStudent.put("B", typeB / totalStudent * 100);
        getPercentTypeStudent.put("C", typeC / totalStudent * 100);
        getPercentTypeStudent.put("D", typeD / totalStudent * 100);
        return getPercentTypeStudent;
    }

    private static void display() {
        List<Student> ls = new ArrayList<>();
        createStudent(ls);
        displayInformationStudent(ls);
        HashMap<String, Double> getPercentTypeStudent = getPercentTypeStudent(ls);
        System.out.println("--------Classification Info -----");
        getPercentTypeStudent.entrySet().forEach((student) -> {
            System.out.println(student.getKey() + " :" + student.getValue() + "%");
        });
    }

    private static void displayInformationStudent(List<Student> ls) {
        int i = 0;
        for (Student mem : ls) {
            System.out.println("-----------Student " + (++i) + " info-----------");
            System.out.println("Name: " + mem.getSName());
            System.out.println("Classes: " + mem.getSClasses());
            System.out.println("AVG: " + mem.getAverage());
            System.out.println("Type: " + mem.getType());
            
        }
    }

    public static void main(String[] args) {
        display();
    }
}
