
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
public class KT1T_NguyenQuocTrieu_11A4 implements ActionListener{
    JButton btnTinh;
   JLabel lbnhapI, lbnhapR, lbcongsuat, lbde, lbhslop;
   JTextField tf_nhapI, tf_nhapR, tf_congsuat;
   public void GUI (){
       JFrame frame =new JFrame();
       frame.setSize(500,500);
       frame.setLayout(null);
       
       lbnhapI = new JLabel ();
       lbnhapI.setBounds(10,50,150,30); 
       lbnhapI.setText("Nhập I / U");
       tf_nhapI =new JTextField ();
       tf_nhapI.setBounds(160,50,150,30);
       frame.add(lbnhapI);
       frame.add(tf_nhapI);
       
       lbnhapR = new JLabel();
       lbnhapR.setBounds(10,90,150,30);
       lbnhapR.setText("Nhập R (Điện trở)");
       tf_nhapR = new JTextField();
       tf_nhapR.setBounds(160, 90, 150, 30);
       frame.add(lbnhapR);
       frame.add(tf_nhapR);
       
       lbcongsuat= new JLabel();
       lbcongsuat.setBounds(10,130,150,30);
       lbcongsuat.setText("Công suất tỏa nhiệt");
       tf_congsuat = new JTextField();
       tf_congsuat.setBounds(160, 130, 150, 30);
       frame.add(lbcongsuat);
       frame.add(tf_congsuat);
       
         
       lbde = new JLabel (" Tính công suất tỏa nhiệt");
       lbde.setBounds(10,10,150,30);
       frame.add(lbde);
       
       lbhslop = new JLabel ("NguyenQuocTrieu - 11a4");
       lbhslop.setBounds(200,10,150,30);
       frame.add(lbhslop);
       
       btnTinh = new JButton("Tính");
       btnTinh.setBounds(160, 170, 150, 30);
       btnTinh.addActionListener(this);
       frame.add(btnTinh);
       
       frame.setVisible(true);
   }
   public static void main(String[] args) {
       KT1T_NguyenQuocTrieu_11A4 hcn = new KT1T_NguyenQuocTrieu_11A4();
       hcn.GUI();
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
       int I = Integer.parseInt(tf_nhapI.getText());
       int R = Integer.parseInt(tf_nhapR.getText());
       int congsuat = I * I * R;
       tf_congsuat.setText(congsuat + "");
    }

   
    
    
}
