package ws8;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;

public class WriteAndReadObject  {

    public static void main(String[] args) {
        WriteAndReadObject w = new WriteAndReadObject();
        ListStudent ls = new ListStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Add Student");
        System.out.println("2. Loading list Student");
        System.out.println("3 .Exit");
        System.out.println("Enter your choice: ");
        int m = sc.nextInt();
        switch (m) {
            case 1:

                System.out.println("Enter name Sudent :");
                String name = sc.next();
                ls.setName(name);
                System.out.println("Enter age Sudent :");
                int age = sc.nextInt();
                ls.setAge(age);
                System.out.println("Enter mark Sudent :");
                float mark = sc.nextFloat();
                ls.setMark(mark);
                w.inputStudent(ls);

                break;
            case 2:
                System.out.println("List student: ");
                System.out.println("------------------");
                Object o = w.outputStudent();
                System.out.println(o.toString());
                break;
            case 3:
                break;
        }

    }

    public void inputStudent(ListStudent ls) {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("ObjectVer2");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.flush();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public Object outputStudent() {
        ObjectInputStream ois = null;
        Object oR = null;
        try {
            FileInputStream fis = new FileInputStream("ObjectVer2");
            ois = new ObjectInputStream(fis);
            oR = ois.readObject();
            ois.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
        return oR;
    }

}
