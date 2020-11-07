
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
public class kiemtrachanle implements ActionListener {
     JButton btnKiemtra;
   JLabel lbnhapn, lbketqua, lbde, lbtenhs;
   JTextField tf_nhapn, tf_ketqua;
   
   public void GUI (){
       JFrame frame =new JFrame();
       frame.setSize(500,500);
       frame.setLayout(null);
       
        lbnhapn = new JLabel ();
       lbnhapn.setBounds(10,50,150,30); 
       lbnhapn.setText("Nhâp n");
       tf_nhapn =new JTextField ();
       tf_nhapn.setBounds(160,50,150,30);
       frame.add(lbnhapn);
       frame.add(tf_nhapn);
       
       lbketqua = new JLabel();
       lbketqua.setBounds(10,90,150,30);
       lbketqua.setText("Kết quả");
       tf_ketqua = new JTextField();
       tf_ketqua.setBounds(160, 90, 150, 30);
       frame.add(lbketqua);
       frame.add(tf_ketqua);
       
           
       lbde = new JLabel (" Kiểm tra số chẵn lẻ");
       lbde.setBounds(10,10,150,30);
       frame.add(lbde);
       
       lbtenhs = new JLabel (" Triệu ");
       lbtenhs.setBounds(160,10,150,30);
       frame.add(lbtenhs);
       
         btnKiemtra = new JButton("Tính");
       btnKiemtra.setBounds(160, 130, 150, 30);
       btnKiemtra.addActionListener((ActionListener) this);
       frame.add(btnKiemtra);
       
        frame.setVisible(true);
   }
    public static void main(String[] args) {
       kiemtrachanle hcn = new kiemtrachanle();
       hcn.GUI();
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
     int n = Integer.parseInt(tf_nhapn.getText());
        if (n%2==0) {
          tf_ketqua.setText("số chẵn");
        }
        if (n%2!=0) {
          tf_ketqua.setText("số lẻ");
          
        }
    }
    
}