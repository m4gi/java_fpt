/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab;

/**
 *
 * @author Le Tuan
 */
public class StackLab {

    public static void main(String[] args) {
        stack st = new stack();
        st.push(5);
        st.push(10);
        st.push(3);
        st.push(8);
        st.push(1);
        for (int i = 0; i < 5; i++) {
            System.out.print(st.pop() + " ");

        }
    }

}
