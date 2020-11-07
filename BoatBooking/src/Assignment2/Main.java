/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;



import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        boolean check;
        FileBoat fb = new FileBoat();
        Validation va = new Validation();
        BSTBoat bstb = new BSTBoat();
        LinkedList2 list2 = new LinkedList2();
        LinkedList3 list3 = new LinkedList3();
        BoatList bu = new BoatList();
        CustomerList cs = new CustomerList();
        BookingList bl = new BookingList();
        File f = new File("Boat.txt");
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do{    
            System.out.println("\n-----Boat Booking Menu-----");
            System.out.println("1. Boat List");
            System.out.println("2. Customer List");
            System.out.println("3. Booking List");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            n = va.checkIntLimit(0,3);

            switch(n){
               
                case 1:{
                    
                    System.out.println("----Boat List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Insert Data");
                    System.out.println("3. In-order traverse");
                    System.out.println("4. Breadth-first traverse");
                    System.out.println("5. In-order traverse to file");
                    System.out.println("6. Search By Bcode");
                    System.out.println("7. Delete By Bcode");
                    System.out.println("8. Symply Balancing");
                    System.out.println("9. Count Number Of Boates");
                    System.out.print("Your option: ");
                    n = va.checkIntLimit(1,9);
                    
                    switch(n){
                        
                        case 1:{
                            bu.BoatOP1(bstb);
                            break;
                        }
                        
                        case 2:{
                            bu.BoatOP2(bstb);
                            break;
                        }
                        
                        case 3:{
                            
                            bu.BoatOP3(bstb);
                            break;
                        }
                        
                        case 4:{
                            bu.BoatOP4(bstb);
                            break;
                        }
                        
                        case 5:{
                            bu.BoatOP5(f,bstb);
                            break;
                        }
                        
                        case 6:{
                            bu.BoatOP6(bstb);
                            break;
                        }
                        
                        case 7:{
                            bu.BoatOP7(bstb);
                            break;
                        }
                        
                        case 8:{
                            bu.BoatOP8(bstb);
                            break;
                        }
                        case 9:{
                            bu.BoatOP9(bstb);
                            break;
                        }
                    }
                    break;
                    
                } 
            
                case 2:{
                    System.out.println("----Customer List----");
                    System.out.println("1. Load Data From File");
                    System.out.println("2. Input & Add To The End");
                    System.out.println("3. Display Data");
                    System.out.println("4. Save Customer List To File");
                    System.out.println("5. Search By Ccode");
                    System.out.println("6. Delete By Ccode");
                    System.out.print("Your option: ");
                    n = va.checkIntLimit(1,6);
                    
                    switch(n){
                        case 1:{
                            cs.CusListOP1(list2);
                            break;
                        }
                        case 2:{
                            cs.CusListOP2(list2);
                            break;
                        }
                        
                        case 3:{
                            cs.CusListOP3(list2);
                            break;
                        }
                        
                        case 4:{
                            cs.CusListOP4(list2);
                            break;
                        }
                        
                        case 5:{
                            cs.CusListOP5(list2);
                            break;
                        }
                        
                        case 6:{
                            cs.CusListOP6(list2);
                            break;
                        }
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("----Booking List----");
                    System.out.println("1. Input Data");
                    System.out.println("2. Display Booking Data");
                    System.out.println("3. Sort By Bcode & Ccode");
                    n = va.checkIntLimit(1,3);
                    
                    switch(n){
                        case 1:{
                            bl.BL1(bstb, list2, list3);
                            break;
                        }
                        case 2:{
                            bl.BL2(list3);
                            break;
                        }
                        
                        case 3:{
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
        }
        while(n!=0);
    }    
    
}
