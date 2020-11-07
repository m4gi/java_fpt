/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Magi
 */
public class HashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> H = new HashMap<>();
        String s = "Hello My Name Is Tuan Is a My";
        String[] arr = s.split(" ");
        int n;
        for (String string : arr) {
            System.out.println("" + string);
            if (H.containsKey(string)) {
                n = H.get(string);
            } else {
                n = 0;
            }
            n++;
            H.put(string, n);
        }
        Set<Map.Entry<String, Integer>> set = H.entrySet();
        System.out.println("" + set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> en = (Map.Entry<String, Integer>) it.next();
            System.out.println("<" + en.getKey() + ", " + en.getValue() + " >");
        }
    }

}
