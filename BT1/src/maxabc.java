
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
 * @author macbookpro
 */
public class maxabc implements ActionListener{
     JLabel lb_hoten, lbnhapa, lbnhapb, lbketqua, lbnhapc;
    JTextField tf_nhapa, tf_nhapb, tf_nhapc, tf_ketqua;
    JButton btn_kiemtra;
    public void GUI(){
    JFrame frame = new JFrame ();
         frame.setSize(500,500);
         frame.setLayout(null);
         
         lb_hoten = new JLabel(" Nguyen Quoc Trieu ");
         lb_hoten.setBounds(320, 10, 150, 30);
         frame.add(lb_hoten);
         
         
         lbnhapa = new JLabel("nhap a :");
         lbnhapa.setBounds(10,50,150,30);
         tf_nhapa = new JTextField();
         tf_nhapa.setBounds(160,50,150,30);
         frame.add(lbnhapa);
         frame.add(tf_nhapa);
         
         
         lbnhapb = new JLabel("nhap b :");
         lbnhapb.setBounds(10,90,150,30);
         tf_nhapb = new JTextField();
         tf_nhapb.setBounds(160,90,150,30);
         frame.add(lbnhapb);
         frame.add(tf_nhapb);
         
         
         lbnhapc = new JLabel("nhap c :");
         lbnhapc.setBounds(10,130,150,30);
         tf_nhapc = new JTextField();
         tf_nhapc.setBounds(160,130,150,30);
         frame.add(lbnhapc);
         frame.add(tf_nhapc);
         
         
         lbketqua = new JLabel("ket qua :");
         lbketqua.setBounds(10,170,150,30);
         tf_ketqua = new JTextField ();
         tf_ketqua.setBounds(160,170,150,30);
         frame.add(lbketqua);
         frame.add(tf_ketqua);
         
         
         btn_kiemtra = new JButton ("kiem tra");
         btn_kiemtra.setBounds(160,210,150,30);
         btn_kiemtra.addActionListener((ActionListener)this);
         frame.add(btn_kiemtra);
         frame.setVisible(true);
         
         
         
         
    
}
    public static void main(String[] args) {
        maxabc kt = new maxabc();
        kt.GUI();
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(tf_nhapa.getText());
        int b = Integer.parseInt(tf_nhapb.getText());
        int c = Integer.parseInt(tf_nhapc.getText());
        int max = a;
        if (b>max) {
            max = b;
            
        }
        if (c>max) {
            max = c;
            
        }
        tf_ketqua.setText(""+max);
        
        
        
        
        
        
        
        
            
            
        }
                
        
    }
    

