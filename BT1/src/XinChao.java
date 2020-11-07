
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
public class XinChao {
    JButton btn_XinChao;
    
    JLabel lbName;
    JTextField tf_name;
    public void  GUI (){
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLayout(null);
        btn_XinChao = new JButton ("Xin Chào");
        btn_XinChao.addActionListener((ActionListener) this);
        btn_XinChao.setBounds(150, 175, 100, 30);
        
        lbName =  new JLabel (" My Name: ");
        lbName.setBounds(100, 10, 100, 30);
        tf_name =  new JTextField();
        tf_name.setBounds(175, 10, 100, 30);
        
        frame.add(lbName);
        frame.add(tf_name);
        frame.add(btn_XinChao);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        XinChao xc = new XinChao();
        xc.GUI();
    }

    }
    

