/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short63;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class Main {

    Person p;

    public Main(Person p) {
        this.p = p;
    }

    public Main() {
    }

    public static void main(String[] args) {
        Validation obj = new Validation();
        ArrayList<Person> list = new ArrayList<>();
        System.out.println("=====Management Person programer=====");
        do {
            list.add(obj.inputPersonInfo());
        } while (Validation.doYouWantContinue());

        System.out.println("Information of Person you have entered:");
        list.forEach((person) -> {
            System.out.println(person);
        });
        Collections.sort(list, (Person c1, Person c2) -> Double.compare(c1.getSalary(), c2.getSalary()));
        System.out.println("Information of Person you have entered after sort:");
        list.forEach((person) -> {
            System.out.println(person);
        });
    }

}
