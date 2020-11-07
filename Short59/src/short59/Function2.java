/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short59;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Function2 {

    public static String ReadUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        String result;
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String line;
            result = "";
            System.out.println("Reader text file using FileReader");
            while ((line = br.readLine()) != null) {
                result = Analyze(line, result);
            }
        }
        return result;
    }

    private static String Analyze(String line, String result) {
        StringTokenizer st;
        String temp;
        st = new StringTokenizer(line, " ");
        while (st.hasMoreTokens()) {
            // System.out.println(st.nextToken());
            temp = st.nextToken();
            int index = result.indexOf(temp);
            if (index == -1) {
                result = result.concat(temp + " ");
            }

        }
        return result;
    }

    public static void WriteUsingFileWriter(String destinationpath, String data) throws IOException {
        File file = new File(destinationpath);
        try (FileWriter fr = new FileWriter(file)) {
            fr.write(data);
        } catch (IOException e) {
        }
    }

}
