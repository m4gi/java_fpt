/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BoatList extends Boat {

    Validation va = new Validation();
    FileBoat ft = new FileBoat();

    public BoatList() {
        super();
    }

    private static BufferedReader openFile(String nameFile) throws IOException {
        try {
            return new BufferedReader(new FileReader(nameFile));
        } catch (FileNotFoundException e) {
            throw new IOException("File [" + nameFile + "] not found.", e);
        }
    }

    private static String readFile(BufferedReader reader) throws IOException {
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    private static void readObjects(String fileContents, BSTBoat bstb) {

        String[] parts = fileContents.split("\\|");
        for (int i = 0, length = parts.length; i < length; i += 6) {

            String tc = parts[i];
            String tn = ((i + 1) < length ? parts[i + 1] : "");
            int s = ((i + 2) < length ? Integer.parseInt(parts[i + 2]) : -1);
            int b = ((i + 3) < length ? Integer.parseInt(parts[i + 3]) : -1);
            String dt = ((i + 4) < length ? (parts[i + 4]) : "");
            double at = ((i + 5) < length ? Double.parseDouble(parts[i + 5]) : -1);
            bstb.add(new Boat(tc, tn, s, b, dt, at));
        }
    }

    void BoatOP1(BSTBoat bstb) throws FileNotFoundException {
        System.out.println("---- Load data from file ----");
        while (true) {
            System.out.print("Enter the file name to load data : ");
            Scanner sc = new Scanner(System.in);
            String nameFile = sc.nextLine();

            BufferedReader reader;
            try {
                reader = openFile(nameFile);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return;
            }

            String fileContents;
            try {
                fileContents = readFile(reader);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
            readObjects(fileContents, bstb);
            break;
        }
        System.err.println("Data input completed!");
    }

    void BoatOP2(BSTBoat bstb) {

        System.out.println("----Input & Add to the head ----");
        System.out.print("Enter boat code: ");
        bcode = Validation.checkInputID();
        System.out.print("Enter boat name: ");
        boatName = Validation.checkInputString();
        System.out.print("Enter seat: ");
        seat = Validation.checkInputSeat();
        do {
            System.out.print("Enter booked: ");
            booked = Validation.checkInputBooked();
        } while (booked >= seat);
        System.out.print("Enter depart place: ");
        departPlace = Validation.checkInputString();

        bstb.add(new Boat(bcode, boatName, seat, booked, departPlace, rate));
//        System.out.println("----Input & Add to the head ----");
//        System.out.print("Enter boat code: ");
//        bcode = Validation.checkInputID();
//        System.out.print("Enter boat name: ");
//        boatName = Validation.checkInputString();
//        System.out.print("Enter seat: ");
//        seat = Validation.checkInputSeat();
//        System.out.print("Enter booked seat: ");
//        booked = Validation.checkInputBooked();
//        System.out.print("Enter depart place: ");
//        departPlace = Validation.checkInputString();
//        System.out.print("Enter depart rate: ");
//        rate = Validation.checkInputDouble();
//        bstb.add(bcode, boatName, seat, booked, rate, departPlace);
    }

    void BoatOP3(BSTBoat bstb) throws IOException {

        System.out.println("---- In-order traverse ----");
        System.out.println("bcode |Boat Name     |  Seat |  booked |  depart_time |  arrival_time | travel_time       ");
        System.out.println("------------------------------------------------------------------------------------------");
        bstb.printInOrder();

    }

    void BoatOP4(BSTBoat bstb) throws IOException {
        System.out.println("---- Breadth-first traverse ----");
        System.out.println("bcode |Boat Name     |  Seat |  booked |  depart_time |  arrival_time | travel_time       ");
        System.out.println("------------------------------------------------------------------------------------------");
        bstb.printBreathFirst();
    }

    void BoatOP5(File f, BSTBoat bstb) throws IOException {
        String c;
        System.out.println("---- In-order traverse to file ----");
        FileBoat.saveDataToFile(bstb);

    }

    @SuppressWarnings("null")
    void BoatOP6(BSTBoat bstb) {

        System.out.println("---- Search By Bcode ----");
        System.out.println("Enter bcode: ");
        String x = Validation.checkInputID();
        boolean check = bstb.search(x);
        if (!check) {
            System.err.println("Value not found!");
        }
    }

    void BoatOP7(BSTBoat bstb) {
        System.out.println("---- Delete By Bcode ----");
        System.out.println("Enter bcode: ");
        String x = Validation.checkInputID();
        boolean check = bstb.deleteNode(x);
        if (check) {
            System.err.println("Found and removed!");
        } else {
            System.err.println("Value not found!");
        }

    }

    void BoatOP8(BSTBoat bstb) {
        bstb.getBalance(bstb.root);
        System.err.println("<Simply balancing successful>");
    }

    void BoatOP9(BSTBoat bstb) {
        System.out.println("---- Count Number Of Boat ----");
        System.out.println(" Number of Boat: " + bstb.count(bstb.root));

    }
//    void addtest(BSTBoat bstb) {
//        bstb.add( "B03", "Sug", 12, 3, 11, "PA");
//        bstb.add(bstb, "B01", "Mil", 10, 5, 5.7, "PC");
//        bstb.add(bstb, "B02", "App", 5, 2, 4, "PB");
//        bstb.add(bstb, "B05", "Roo", 7, 6, 15, "PE");
//        bstb.add(bstb, "B07", "Bee", 11, 3, 12, "PF");
//        bstb.add(bstb, "B04", "Boo", 9, 5, 5, "PD");
//    }
}
