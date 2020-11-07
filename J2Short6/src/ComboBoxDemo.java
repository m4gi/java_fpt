import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author ADMIN
 *
 * 
 */

public class ComboBoxDemo extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JComboBox<?> comboBox;
    private JPanel panel;
    private JLabel lblNew;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		try {
		    ComboBoxDemo frame = new ComboBoxDemo();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public ComboBoxDemo() {
	initComponents();
    }

    private void initComponents() {
	setTitle("Short6");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 631, 369);
	this.contentPane = new JPanel();
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(this.contentPane);
	this.contentPane.setLayout(new BorderLayout(0, 0));
	this.contentPane.add(getComboBox(), BorderLayout.NORTH);
	this.contentPane.add(getPanel(), BorderLayout.CENTER);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public JComboBox getComboBox() {
	if (comboBox == null) {
	    comboBox = new JComboBox();
	    comboBox.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    comboBoxActionPerformed(e);
		}
	    });
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bird", "Rabbit", "Star"}));
	}
	return comboBox;
    }

    protected ImageIcon resizeIcon(ImageIcon imageIcon) {
	// Transform it
	Image image = imageIcon.getImage();
	Image newimg = image.getScaledInstance(lblNew.getWidth(), lblNew.getHeight(), java.awt.Image.SCALE_SMOOTH);
	// Transform it back
	imageIcon = new ImageIcon(newimg);
	return imageIcon;
    }

    protected void comboBoxActionPerformed(ActionEvent e) {
	int index = comboBox.getSelectedIndex();
	switch (index) {
	case 0:
	    lblNew.setIcon(resizeIcon(new ImageIcon(ListDemo.class.getResource("/Resource/bird.jpg"))));
	    break;
	case 1:
	    lblNew.setIcon(resizeIcon(new ImageIcon(ListDemo.class.getResource("/Resource/rabbit.jpg"))));
	    break;
	case 2:
	    lblNew.setIcon(resizeIcon(new ImageIcon(ListDemo.class.getResource("/Resource/star.jpg"))));
	    break;
	}
    }

    public JPanel getPanel() {
	if (panel == null) {
	    panel = new JPanel();
	    panel.setLayout(new BorderLayout(0, 0));
	    panel.add(getLblNew(), BorderLayout.CENTER);
	}
	return panel;
    }

    public JLabel getLblNew() {
	if (lblNew == null) {
	    lblNew = new JLabel("");
	}
	return lblNew;
    }
}
