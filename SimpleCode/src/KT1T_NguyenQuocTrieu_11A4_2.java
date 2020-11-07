
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
public class KT1T_NguyenQuocTrieu_11A4_2 {
    JLabel lb_nhapu, lb_nhapr, lb_cs, lb_ten, lb_debai;
    JTextField tf_nhapu, tf_nhapr, tf_cs;
    JButton btntinh;
    
    public void GUI (){
     JFrame frame = new JFrame ();
          frame.setSize(500,500);
          frame.setLayout(null);
          
          lb_ten = new JLabel("HS: Nguyễn Quốc Triệu  Lớpp: 11A4");
     lb_ten.setBounds(50, 5, 400, 30);
     frame.add(lb_ten);
     lb_debai = new JLabel("Tinh cong suat toa nhiet");
     lb_debai.setBounds(280, 5, 400, 30);
     frame.add(lb_debai);
     
     lb_nhapu = new JLabel("nhap U:");
          lb_nhapu.setBounds(10, 30, 200, 30);
          tf_nhapu = new JTextField();
         tf_nhapu.setBounds(160, 30, 150, 30);
          frame.add(lb_nhapu);
          frame.add(tf_nhapu);
          
          lb_nhapr = new JLabel("Nhap R(Dien tro) :");
         lb_nhapr.setBounds(10, 70, 150, 30);
         tf_nhapr = new JTextField();
          tf_nhapr.setBounds(160, 70, 150, 30);
          frame.add(tf_nhapr);
          frame.add(lb_nhapr);
          
         lb_cs = new JLabel("Cong suat toa nhiet (J) :");
          lb_cs.setBounds(10, 110, 150, 30);
          tf_cs = new JTextField();
         tf_cs.setBounds(160, 110, 150, 30);
          frame.add(tf_cs);
          frame.add(lb_cs);
          
          btntinh = new JButton("tinh");
       btntinh.setBounds(120, 170, 150, 30);
       btntinh.addActionListener((ActionListener) this);
       frame.add(btntinh);
       frame.setVisible(true);
    }
       public static void main(String[] args) {
       KT1T_NguyenQuocTrieu_11A4 hcn = new KT1T_NguyenQuocTrieu_11A4();
       hcn.GUI();
   }
    public void actionPerformed(ActionEvent ae) {
       int I = Integer.parseInt(tf_nhapu.getText());
       int R = Integer.parseInt(tf_nhapr.getText());
       int congsuat = I * I * R;
       tf_cs.setText(congsuat + "");
    }
}

