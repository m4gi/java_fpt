
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class GPTB1 implements ActionListener{
    JLabel lb_A, lb_B, lb_X;
    JTextField tf_A, tf_B, tf_X;
    JButton btn_Tinh;
    public void GUI (){
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        lb_A = new JLabel("A: ");
        lb_A.setBounds(10, 10, 150, 30);
        tf_A = new JTextField();
        tf_A.setBounds(160, 10, 150, 30);
        frame.add(lb_A);
        frame.add(tf_A);
        
        lb_B = new JLabel("B: ");
        lb_B.setBounds(10, 50, 150, 30);
        tf_B = new JTextField();
        tf_B.setBounds(160, 50, 150, 30);
        frame.add(lb_B);
        frame.add(tf_B);
        
       lb_X= new JLabel("X:");
       lb_X.setBounds(10,90,150,30);
       tf_X = new JTextField();
       tf_X.setBounds(160, 90, 150, 30);
       frame.add(lb_X);
       frame.add(tf_X);
       
       btn_Tinh = new JButton("Tinh");
       btn_Tinh.setBounds(160, 130, 150, 30);
       btn_Tinh.addActionListener(this);
       frame.add(btn_Tinh);
       
       frame.setVisible(true);
   }
   public static void main(String[] args) {
       GPTB1 pt = new GPTB1();
       pt.GUI();
   }  

    @Override
    public void actionPerformed(ActionEvent e) {
        double A = Double.parseDouble(tf_A.getText());
        double B = Double.parseDouble(tf_B.getText());
        double X = -B/A;
        tf_X.setText(""+X);
    }

}