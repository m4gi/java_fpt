/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short51;



public class Main {

    public static void main(String[] args) {
        while (true) {
            int choice = Process.Menu();
            switch (choice) {
                case 1:
                    Process.NormalCal();
                    break;
                case 2:
                    Process.BMICal();
                    break;
                case 3:
                    return;
            }
        }
    }

}
