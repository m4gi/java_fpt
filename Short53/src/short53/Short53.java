/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short53;

public class Short53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Array a = new Array();
        while (true) {
            switch (a.menu()) {
                case 1:
                    a.Input();
                    break;
                case 2:
                    a.bubbleSort();
                    a.DisplayAccess();
                    break;
                case 3:
                    a.bubbleSort();
                    a.DisplayDeaccess();
                    break;
                case 4:
                    System.out.println("Exit Successful!!");
                    return;
            }
        }

    }

}
