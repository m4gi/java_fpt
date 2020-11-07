import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ListDemo extends JFrame {


    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<?> list;
    private JPanel panel;
    private JLabel lblNew;

    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		try {
		    ListDemo frame = new ListDemo();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }
    public ListDemo() {
	initComponents();
    }

    private void initComponents() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 710, 403);
	this.contentPane = new JPanel();
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(this.contentPane);
	this.contentPane.setLayout(new GridLayout(1, 0, 0, 0));
	this.contentPane.add(getList());
	this.contentPane.add(getPanel());
    }

    @SuppressWarnings({"unchecked", "rawtypes", "serial"})
    public JList<?> getList() {
	if (list == null) {
	    list = new JList<>();
	    list.addListSelectionListener(new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent e) {
		    listValueChanged(e);
		}
	    });
	    list.setBackground(Color.LIGHT_GRAY);
	    list.setFont(new Font("Arial", Font.BOLD, 20));
	    list.setModel(new AbstractListModel() {
		String[] values = new String[] {"Bird", "Rabbit", "Star"};

		@Override
		public int getSize() {
		    return values.length;
		}

		@Override
		public Object getElementAt(int index) {
		    return values[index];
		}
	    });
	}
	return list;
    }

    public JPanel getPanel() {
	if (panel == null) {
	    panel = new JPanel();
	    panel.setLayout(new BorderLayout(0, 0));
	    panel.add(getLabel_1(), BorderLayout.CENTER);
	}
	return panel;
    }

    public JLabel getLabel_1() {
	if (lblNew == null) {
	    lblNew = new JLabel("");
	}
	return lblNew;
    }

    protected ImageIcon resizeIcon(ImageIcon imageIcon) {
	// Transform it
	Image image = imageIcon.getImage();
	Image newimg = image.getScaledInstance(lblNew.getWidth(), lblNew.getHeight(), java.awt.Image.SCALE_SMOOTH);
	// Transform it back
	imageIcon = new ImageIcon(newimg);
	return imageIcon;
    }

    protected void listValueChanged(ListSelectionEvent e) {
	int index = list.getSelectedIndex();
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
}
