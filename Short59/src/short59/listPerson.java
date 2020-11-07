/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short59;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class listPerson {

    private ArrayList<Person> lp = new ArrayList<>();

    public listPerson() {
    }

    public ArrayList<Person> getLp() {
        return lp;
    }

    //allow user find person info
    public void FindPersonInfo(String fullpath, double salary) {
        GetData(fullpath);
        Display(salary);
        Collections.sort(lp);
        System.out.println("Max: " + lp.get(0).getName());
        System.out.println("Min: " + lp.get(lp.size() - 1).getName());

    }

    private void GetData(String fullpath) {
        File file = new File(fullpath);
        //check file exist or not and path must be file
        if (!file.exists() || !file.isFile()) {
            System.err.println("Path doesn't exist");
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] infoPerson = line.split(";");
                lp.add(new Person(infoPerson[0], infoPerson[1],
                        Validation.getSalary(infoPerson[2])));
            }
        } catch (IOException e) {
            System.err.println("Can't read file.");
        }
    }

    private void Display(double money) {
        System.out.println("------------- Result ----------");
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Address", "Salary");
        for (Person person : lp) {
            if (person.getSalary() >= money) {
                System.out.printf("%-20s%-20s%-20.1f\n", person.getName(),
                        person.getAddress(), person.getSalary());
            }
        }
    }

}
