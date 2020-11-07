/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author TuanThaiHo
 */
public class Inracacmua implements ActionListener {
    JButton btnKetqua;
   JLabel lbketqua, lbnhapso, lbtieude, lbhocsinh, lblop;
   JTextField tf_nhapso, tf_ketqua;
   public void GUI (){
       JFrame frame =new JFrame();
       frame.setSize(500,500);
       frame.setLayout(null);
       
       lbtieude = new JLabel (" Nhập các số từ 1 đến 4 ");
       lbtieude.setBounds(160,50,150,30); 
       frame.add(lbtieude);
       
       lbnhapso = new JLabel(" Nhập số :");
       lbnhapso.setBounds(10,90,150,30);
       tf_nhapso = new JTextField();
       tf_nhapso.setBounds(160, 90, 150, 30);
       frame.add(lbnhapso);
       frame.add(tf_nhapso);
      
       lbketqua= new JLabel(" Kết quả :");
       lbketqua.setBounds(10,130,150,30);
       tf_ketqua = new JTextField();
       tf_ketqua.setBounds(160, 130, 150, 30);
       frame.add(lbketqua);
       frame.add(tf_ketqua);
       
       lbhocsinh = new JLabel ("Quốc Triệu");
       lbhocsinh.setBounds(30,10,150,30);
       frame.add(lbhocsinh);
       
       lblop = new JLabel (" 11A4 ");
       lblop.setBounds(160,10,150,30);
       frame.add(lblop);
       
       btnKetqua = new JButton("Kiểm Tra");
       btnKetqua.setBounds(160, 210, 150, 30);
       btnKetqua.addActionListener(this);
       frame.add(btnKetqua);
       
       frame.setVisible(true);
   }
   public static void main(String[] args) {
       Inracacmua kt  = new Inracacmua();
       kt.GUI();
}

    @Override
    public void actionPerformed(ActionEvent ae) {
      int chon = Integer.parseInt(tf_nhapso.getText());
      switch (chon) {
          case 1:
              tf_ketqua.setText("Mùa Xuân");
              break;
          case 2:
              tf_ketqua.setText("Mùa Hạ");
              break;
          case 3:
              tf_ketqua.setText("Mùa Thu");
              break;
          case 4:
              tf_ketqua.setText("Mùa Đông");
              break;
          default:
              tf_ketqua.setText("Chỉ được nhập các số từ 1 - 4 ");
      }
    }
}