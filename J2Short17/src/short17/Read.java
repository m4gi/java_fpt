/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Magi
 */
public class Read {

    public String read(String html) {
        String s, a = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(html));
            while ((s = br.readLine()) != null) {
                a += s;
                s = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return a;
    }
}
