/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        FileBoat ft = new FileBoat();
        CheckInput ci = new CheckInput();
        LinkedList list = new LinkedList();
        LinkedList2 list2 = new LinkedList2();
        LinkedList3 list3 = new LinkedList3();
        BoatList tr = new BoatList();
        CustomerList cs = new CustomerList();
        BookingList bl = new BookingList();
        File f = new File("BoatList.txt");
        Scanner sc = new Scanner(System.in);
        tr.addtest(list);
        cs.addtest(list2);
        bl.addtest(list, list2, list3);
        int n = 0;
        
        do {
            System.out.println("-----Boat Booking Menu-----");
            System.out.println("1. Boat List");
            System.out.println("2. Customer List");
            System.out.println("3. Booking List");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            n = ci.CheckInput1(n);
            
            switch (n) {
                
                case 1: {
                    
                    System.out.println("----Boat List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Boat List Data");
                    System.out.println("5. Search By Tcode");
                    System.out.println("6. Delete By Tcode");
                    System.out.println("7. Sort By Tcode");
                    System.out.println("8. Add After Position x");
                    System.out.println("9. Delete The Node Before The Node Having Tcode = Xcode");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch (n) {
                        
                        case 1: {
                            tr.Boat1(list);
                            break;
                        }
                        
                        case 2: {
                            tr.Boat2(list);
                            break;
                        }
                        
                        case 3: {
                            
                            tr.Boat3(list);
                            break;
                        }
                        
                        case 4: {
                            tr.Boat4(f, list);
                            break;
                        }
                        
                        case 5: {
                            tr.Boat5(list);
                            break;
                        }
                        
                        case 6: {
                            tr.Boat6(list);
                            break;
                        }
                        
                        case 7: {
                            tr.Boat7(list);
                            break;
                        }
                        
                        case 8: {
                            tr.Boat8(list);
                            break;
                        }
                        case 9: {
                            tr.Boat9(list);
                            break;
                        }
                    }
                    break;
                    
                }
                
                case 2: {
                    System.out.println("----Customer List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Customer List Data");
                    System.out.println("5. Search By Ccode");
                    System.out.println("6. Delete By Ccode");
                    System.out.print("Your option: ");
                    n = ci.CheckInput1(n);
                    
                    switch (n) {
                        case 1: {
                            cs.CL1(list2);
                            break;
                        }
                        case 2: {
                            cs.CL2(list2);
                            break;
                        }
                        
                        case 3: {
                            cs.CL3(list2);
                            break;
                        }
                        
                        case 4: {
                            cs.CL4(list2);
                            break;
                        }
                        
                        case 5: {
                            cs.CL5(list2);
                            break;
                        }
                        
                        case 6: {
                            cs.CL6(list2);
                            break;
                        }
                    }
                    break;
                }
                
                case 3: {
                    System.out.println("----Booking List----");
                    System.out.println("1. Input Data");
                    System.out.println("2. Display Data Width Available Seat");
                    System.out.println("3. Sort By Tcode & Ccode");
                    n = ci.CheckInput1(n);
                    
                    switch (n) {
                        case 1: {
                            bl.BL1(list, list2, list3);
                            break;
                        }
                        case 2: {
                            bl.BL2(list3);
                            break;
                        }
                        
                        case 3: {
                            try {
                                bl.BL3(list3);
                            } catch (Exception e) {
                                System.out.println("If this line appears, maybe there are some mistakes in my algorithm!?");
                            }
                            break;
                        }
                    }
                }
                
            }
        } while (n != 0);
    }
    
}
