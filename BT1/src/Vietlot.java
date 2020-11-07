/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TuanThaiHo
 */
public class Vietlot implements ActionListener {
    JButton btnTinh;
   JLabel lbchonso, lbchuongtrinh, lbhocsinh, lblop;
   JTextField tf_chonso;
   public void GUI (){
       JFrame frame =new JFrame();
       frame.setSize(500,500);
       frame.setLayout(null);
       
       lbchuongtrinh = new JLabel ("Chương trình xổ số Vietlot");
       lbchuongtrinh.setBounds(100,50,250,30); 
       frame.add(lbchuongtrinh);
       
       
       lbchonso = new JLabel(" Chọn số :");
       lbchonso.setBounds(10,90,150,30);
       tf_chonso = new JTextField();
       tf_chonso.setBounds(160, 90, 150, 30);
       frame.add(lbchonso);
       frame.add(tf_chonso);
       
      
       lbhocsinh = new JLabel ("Quốc Triệu");
       lbhocsinh.setBounds(30,10,150,30);
       frame.add(lbhocsinh);
       
       lblop = new JLabel ("11A4");
       lblop.setBounds(160,10,150,30);
       frame.add(lblop);
       
       btnTinh = new JButton("Xổ số");
       btnTinh.setBounds(160, 210, 150, 30);
       btnTinh.addActionListener(this);
       frame.add(btnTinh);
       
       frame.setVisible(true);
   }
   public static void main(String[] args) {
       Vietlot kt  = new Vietlot();
       kt.GUI();
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Random ran = new Random();
        int soTrung = ran.nextInt(10);
        JOptionPane.showMessageDialog(null,"số trúng thưởng là " + soTrung);
        int soChon = Integer.parseInt(tf_chonso.getText());
        if (soChon==soTrung){
            JOptionPane.showConfirmDialog(null,"You WON 1 Billion Dollar");
        } else {
            JOptionPane.showConfirmDialog(null,"Chúc bạn may mắn lần sau");
        }
    }
    
}