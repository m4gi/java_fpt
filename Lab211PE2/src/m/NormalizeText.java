/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tranp
 */
public class NormalizeText {

    private String line;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public NormalizeText() {
    }

    public NormalizeText(String line) {
        this.line = line;
    }
    int countQuetes = 0;

    public String formatOneSpaceSpecial(String character) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = line.split("\\s*\\" + character + "\\s*");

        for (String oneWord : strings) {
            stringBuffer.append(oneWord + " " + character);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString().trim().substring(0, stringBuffer.length() - 3);
    }

    public String formatOneSpace() {
        line = line.toLowerCase();
        line = line.replaceAll("\\s+", " ");
        line = formatOneSpaceSpecial(".");
        line = formatOneSpaceSpecial(",");
        line = formatOneSpaceSpecial(":");
        line = formatOneSpaceSpecial("\"");
        return line.trim();
    }

    public String formatSpecialCharacters() {
        StringBuffer stringBuffer = new StringBuffer(line);
        //check from first to last before .,:; then delete
        for (int i = 0; i < stringBuffer.length() - 1; i++) {
            if (stringBuffer.charAt(i) == ' '
                    && stringBuffer.charAt(i + 1) == '.'
                    || stringBuffer.charAt(i + 1) == ','
                    || stringBuffer.charAt(i + 1) == ':') {
                stringBuffer.deleteCharAt(i);
            }
        }
        return stringBuffer.toString().trim();
    }

    public String afterDotUpperCase() {
        StringBuffer stringBuffer = new StringBuffer(line);
        int lengthLine = stringBuffer.length();
        //check from first to last after . then UpperCase
        for (int i = 0; i < lengthLine - 2; i++) {
            if (stringBuffer.charAt(i) == '.') {
                char afterDot = stringBuffer.charAt(i + 2);
                stringBuffer.setCharAt(i + 2, Character.toUpperCase(afterDot));
            }
        }
        return stringBuffer.toString().trim();
    }

    public String noSpaceQuotes() {
        StringBuffer stringBuffer = new StringBuffer(line);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == '"' && countQuetes % 2 == 0) {
                stringBuffer.deleteCharAt(i + 1);
                countQuetes++;
            } else if (stringBuffer.charAt(i) == '"' && countQuetes % 2 == 1
                    && i != 0) {
                stringBuffer.deleteCharAt(i - 1);
                countQuetes++;
            }
        }
        return stringBuffer.toString().trim();
    }

    public String firstUpercase() {
        line = line.substring(3);
        StringBuffer stringBuffer = new StringBuffer(line);
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                stringBuffer.setCharAt(i, Character.toUpperCase(line.charAt(i)));
                break;
            }
        }
        return stringBuffer.toString().trim();
    }

    public String lastAddDot() {
        if (line.endsWith(".")) {
            return line;
        } else {
            return line + ".";
        }
    }

    public boolean isLineEmpty() {
        if (line.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int countLine(String uFile) {
        int countLine = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(uFile)));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(uFile, true)));
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (isLineEmpty()) {
                    continue;
                }
                countLine++;
            }
            br.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.err.println("Can't found.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return countLine;
    }
}
