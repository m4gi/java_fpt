/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CustomerList{
    
    Scanner sc = new Scanner(System.in);
    
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
    
    private static void readObjects(String fileContents, LinkedList2 l ) {
        
        String[] parts = fileContents.split("\\|");
        for(int i = 0, length = parts.length;i<length; i+=3){               
            String cc = parts[i];
            String cn = ((i+1) < length ? parts[i+1] : "");
            String p = ((i+2) < length ? parts[i+2] : "");
            
            l.addToTail(cc,cn,p);
        }
    }

    void CusListOP1(LinkedList2 list){
        System.out.println("---- Load data form file ----");
        while(true){
            System.out.print("Enter the file name to load data : ");
            String nameFile = sc.nextLine().trim();

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
                readObjects(fileContents,list);
                break;
        }
        System.err.println("Data input completed!");
        
    }
    
    void CusListOP2(LinkedList2 list){
        System.out.println("---- Input & add to the end ----");
        System.out.print("Enter customer code: ");
        String ccode = Validation.checkInputID();
        System.out.print("Enter customer name: ");
        String cusName = Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Validation.checkInputString();
        
        list.addToTail(ccode, cusName, phone);
        System.err.println("Add completed!");
    }
    
    void CusListOP3(LinkedList2 list){
        System.out.println("---- Display Data ----");
        list.printList(list);
    }
    
    void CusListOP4(LinkedList2 list) throws IOException{
        System.out.println("---- Save customer list to file ----");
        FileCustomer.saveDataToFile(list);
    }
    
    void CusListOP5(LinkedList2 list){
        String c;
        System.out.println("---- Search by ccode ----");
        System.out.println("Enter the ccode you want to search: ");
        c = sc.next();
        list.NodeSearch(c, list);
        if(list.search()) System.err.println("Found!");
        else System.err.println("Data not found!");
    }
    
    void CusListOP6(LinkedList2 list){
        NodeCustomer curr = list.head;
        NodeCustomer prev = null;
        
        System.out.println("---- Delete by ccode ----");
        String c = sc.next();
        
        if(curr!= null && (curr.ccode == null ? c == null : curr.ccode.equals(c))){
            list.head = curr.next;
            System.err.println("Found and Deleted!!");
        }
        else{
            
            while(curr!=null && (curr.ccode == null ? c == null : !curr.ccode.equals(c))){
                    prev = curr;
                    curr = curr.next;
                }

            if(curr!=null){
                prev.next = curr.next;
                System.err.println("Found and Deleted!!");
            }

            if(curr == null){
                System.err.println("bcode not found!!");
            }
        }
    }
}
