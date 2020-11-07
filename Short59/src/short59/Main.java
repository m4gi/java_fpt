/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short59;

import java.io.IOException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int choice;
        do {
            choice = Manager.menu();
            switch (choice) {
                case 1:
                    System.out.println("--------- Person info ---------");
                    System.out.println("Enter full path of file:");
                    String fullpath = Validation.checkString();
                    System.out.println("Enter salary :");
                    double salary = Validation.checkInputDouble();
                    listPerson lp = new listPerson();
                    lp.FindPersonInfo(fullpath, salary);

                    break;
                case 2:
                    System.out.println("------------- Copy text --------------");
                    System.out.println("Enter full path of file:");
                    String sourcepath = Validation.checkString();
                    String data = null;
                    data = Function2.ReadUsingFileReader(sourcepath);
                    //System.out.println(data);
                    System.out.println("Enter full path of file:");
                    String destinationpath = Validation.checkString();
                    Function2.WriteUsingFileWriter(destinationpath, data);
                    System.out.println("Write Success !!");
                    break;
                case 3:
                    return;
            }
        } while (choice != 3);
    }
}
