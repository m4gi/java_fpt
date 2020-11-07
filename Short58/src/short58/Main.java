/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short58;

/**
 *
 * @author Magi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dictionary obj = new Dictionary();
        while (true) {
            switch (Manager.menu()) {
                case 1:
                    obj.addNewWord();
                    break;
                case 2:
                    obj.deleteWord();
                    break;
                case 3:
                    obj.translate();
                    break;
                case 4:
                    return;
            }
        }
    }
}
