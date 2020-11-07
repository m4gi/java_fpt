/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalexam;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Practicalexam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Start func = new Start();
        func.setOrigin();
        int choice;
        do {
            System.out.println("Choice list: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    func.addPatient();
                    break;
                case 2:
                    func.getAverageInPatient();
                    break;
                case 3:
                    func.listOutPatient();
                    break;
                case 4:
                    func.searchPatient();
                    break;
                case 5:
                    func.minimumFee();
                    break;
                case 6:
                    func.removeInPatient();
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Wrong value");
                    break;
            }
        } while (choice != 0);
    }
}
