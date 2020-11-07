
import java.util.Stack;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
//        Stack<String> st = new Stack<>();
//        st.push("Tran");
//        st.push("Hoang");
//        st.push("Nam");
//        st.push("Minh");

//        System.out.println("Display stack");
//
//        System.out.println("===========");
//
//        System.out.println("" + st.pop());// Lay phan ut dau tien trong stack
//        System.out.println("" + st.pop());
//        System.out.println("" + st.pop());
//        System.out.println("" + st.pop());
        MyStack st = new MyStack(5);
        st.converBinary(15);
        st.travesal();
        System.out.println("");

    }
}
