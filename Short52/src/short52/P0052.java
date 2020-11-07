/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short52;

import short52.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;

class listCountry {

    public static ArrayList<EastAsiaCountries> ls = new ArrayList<EastAsiaCountries>();

    public void Input() {
        String Code, Name, Terian;
        float Area;
        for (int i = 0; i < 11; i++) {
            System.out.println("The " + (i + 1) + " Country:");
            System.out.println("Enter Country Code: ");
            Code = Validation.checkString();
            System.out.println("Enter Country name: ");
            Name = Validation.checkString();
            System.out.println("Enter Country Area: ");
            Area = Validation.checkInputFloat();
            System.out.println("Enter Country Terrian: ");
            Terian = Validation.checkString();
            ls.add(new EastAsiaCountries(Terian, Code, Name, Area));
            System.out.println("*********************************");
        }
    }

    public void Display() {
        if (ls != null) {
            Collections.sort(ls);
            for (int i = 0; i < ls.size(); i++) {
                System.out.println(ls.get(i));
            }
        } else {
            System.out.println("list is null");
        }
    }

    public void Search(String name) {
        if (ls != null) {
            Collections.sort(ls);
            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i).getCountryName().compareToIgnoreCase(name) == 0) {
                    System.out.println(ls.get(i));
                }
            }
        } else {
            System.out.println("list is null");
        }
    }

}

public class P0052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listCountry ls = new listCountry();
        int choice;
        do {
            choice = Menu.menu();
            switch (choice) {
                case 1:
                    ls.Input();
                    break;
                case 2:
                    ls.Display();
                    break;
                case 3:
                    System.out.println("Enter Name of Country");
                    String name = Validation.checkString();
                    ls.Search(name);
                    break;
            }

        } while (choice != 4);
    }
}
