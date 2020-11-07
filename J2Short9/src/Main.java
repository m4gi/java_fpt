import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

/**
 * @author ADMIN
 *
 * 
 */

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenu mnEdit;
    private JMenu mnHelp;
    private JMenuItem mntmCopy;
    private JMenuItem mntmCut;
    private JMenuItem mntmPaste;
    private JMenuItem mntmDelete;
    private JMenuItem mntmSelect_1;
    private JSeparator separator;
    private JMenuItem mntmSave;
    private JMenuItem mntmExit;
    private JMenuItem mntmAbout;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private String bufferString = null;

    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		try {
		    Main frame = new Main();
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
    public Main() {
	initComponents();
    }

    private void initComponents() {
	setTitle("DoanDucTin_SE1401");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1013, 603);
	setJMenuBar(getMenuBar_1());
	this.contentPane = new JPanel();
	this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	this.contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(this.contentPane);
	this.contentPane.add(getScrollPane(), BorderLayout.CENTER);
    }

    public JMenuBar getMenuBar_1() {
	if (menuBar == null) {
	    menuBar = new JMenuBar();
	    menuBar.add(getMnFile());
	    menuBar.add(getMnEdit());
	    menuBar.add(getMnHelp());
	}
	return menuBar;
    }

    public JMenu getMnFile() {
	if (mnFile == null) {
	    mnFile = new JMenu("File");
	    mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	    mnFile.add(getMntmSave());
	    mnFile.add(getMntmExit());
	}
	return mnFile;
    }

    public JMenu getMnEdit() {
	if (mnEdit == null) {
	    mnEdit = new JMenu("Edit");
	    mnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	    mnEdit.add(getMntmCopy());
	    mnEdit.add(getMntmCut());
	    mnEdit.add(getMntmPaste());
	    mnEdit.add(getSeparator());
	    mnEdit.add(getMntmDelete());
	    mnEdit.add(getMntmSelect_1());
	}
	return mnEdit;
    }

    public JMenu getMnHelp() {
	if (mnHelp == null) {
	    mnHelp = new JMenu("Help");
	    mnHelp.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	    mnHelp.add(getMntmAbout());
	}
	return mnHelp;
    }

    @SuppressWarnings("deprecation")
    public JMenuItem getMntmCopy() {
	if (mntmCopy == null) {
	    mntmCopy = new JMenuItem("Copy");
	    mntmCopy.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmCopyActionPerformed(e);
		}
	    });
	    mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
	    mntmCopy.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmCopy;
    }

    @SuppressWarnings("deprecation")
    public JMenuItem getMntmCut() {
	if (mntmCut == null) {
	    mntmCut = new JMenuItem("Cut");
	    mntmCut.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmCutActionPerformed(e);
		}
	    });
	    mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
	    mntmCut.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmCut;
    }

    @SuppressWarnings("deprecation")
    public JMenuItem getMntmPaste() {
	if (mntmPaste == null) {
	    mntmPaste = new JMenuItem("Paste");
	    mntmPaste.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmPasteActionPerformed(e);
		}
	    });
	    mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
	    mntmPaste.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmPaste;
    }

    public JMenuItem getMntmDelete() {
	if (mntmDelete == null) {
	    mntmDelete = new JMenuItem("Delete");
	    mntmDelete.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmDeleteActionPerformed(e);
		}
	    });
	    mntmDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
	    mntmDelete.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmDelete;
    }

    @SuppressWarnings("deprecation")
    public JMenuItem getMntmSelect_1() {
	if (mntmSelect_1 == null) {
	    mntmSelect_1 = new JMenuItem("Select All");
	    mntmSelect_1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmSelect_1ActionPerformed(e);
		}
	    });
	    mntmSelect_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
	    mntmSelect_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmSelect_1;
    }

    public JSeparator getSeparator() {
	if (separator == null) {
	    separator = new JSeparator();
	}
	return separator;
    }

    @SuppressWarnings("deprecation")
    public JMenuItem getMntmSave() {
	if (mntmSave == null) {
	    mntmSave = new JMenuItem("Save");
	    mntmSave.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmSaveActionPerformed(e);
		}
	    });
	    mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
	    mntmSave.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmSave;
    }

    public JMenuItem getMntmExit() {
	if (mntmExit == null) {
	    mntmExit = new JMenuItem("Exit");
	    mntmExit.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmExitActionPerformed(e);
		}
	    });
	    mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_END, 0));
	    mntmExit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmExit;
    }

    public JMenuItem getMntmAbout() {
	if (mntmAbout == null) {
	    mntmAbout = new JMenuItem("About");
	    mntmAbout.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    mntmAboutActionPerformed(e);
		}
	    });
	    mntmAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_HELP, 0));
	    mntmAbout.setFont(new Font("Segoe UI", Font.PLAIN, 15));
	}
	return mntmAbout;
    }

    public JScrollPane getScrollPane() {
	if (scrollPane == null) {
	    scrollPane = new JScrollPane();
	    scrollPane.setViewportView(getTextArea());
	}
	return scrollPane;
    }

    public JTextArea getTextArea() {
	if (textArea == null) {
	    textArea = new JTextArea();
	    textArea.setFont(new Font("Monospaced", Font.PLAIN, 22));
	}
	return textArea;
    }

    protected void mntmAboutActionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(contentPane, "Program Description: Notepad\nAuthor: Doan Duc Tin", "About",
	                JOptionPane.INFORMATION_MESSAGE);
    }

    protected void mntmCopyActionPerformed(ActionEvent e) {
	bufferString = textArea.getSelectedText();
    }

    protected void mntmCutActionPerformed(ActionEvent e) {
	String mess = textArea.getText();
	bufferString = textArea.getSelectedText();
	mess = mess.replace(bufferString, "");
	textArea.setText(mess);
    }

    protected void mntmPasteActionPerformed(ActionEvent e) {
	String mess = textArea.getText();
	int pos1 = textArea.getSelectionStart();
	int pos2 = textArea.getSelectionEnd();
	mess = mess.substring(0, pos1) + bufferString + mess.substring(pos2, mess.length());
	textArea.setText(mess);
    }

    protected void mntmDeleteActionPerformed(ActionEvent e) {
	String mess = textArea.getText();
	String deleteString = textArea.getSelectedText();
	mess = mess.replace(deleteString, "");
    }

    protected void mntmSelect_1ActionPerformed(ActionEvent e) {
	bufferString = textArea.getText();
	textArea.selectAll();
    }

    protected void mntmSaveActionPerformed(ActionEvent e) {
	try {
	    if (textArea.getText().isEmpty()) { throw new Exception("Nothing to save!"); }
	    MessageFormat header = new MessageFormat("Notepad");
	    MessageFormat footer = new MessageFormat("Author: DoanDucTin_SE1401");
	    textArea.print(header, footer);
	    JOptionPane.showMessageDialog(contentPane, "File save!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception ex) {
	    JOptionPane.showMessageDialog(contentPane, ex, "Error while save", JOptionPane.ERROR_MESSAGE);
	}
    }

    protected void mntmExitActionPerformed(ActionEvent e) {
	System.exit(0);
    }
}
