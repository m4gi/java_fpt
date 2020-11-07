package WS8;

import java.io.InputStream;
import java.io.FileInputStream;

public class ReplaceCharacter {

    public static void main(String[] args) {
        ReplaceCharacter rp = new ReplaceCharacter();
        rp.readData();

    }

    public void readData() {
        try {
            InputStream is = new FileInputStream("Out.txt");
            int c;
            while ((c = is.read()) != -1) {
                c += 3;
                System.out.print((char) c);

            }

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
