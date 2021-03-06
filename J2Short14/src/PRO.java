
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Magi
 */
public class PRO extends javax.swing.JFrame {

    private String bufferString = null;
    private String filePath;
    private String textoriginal;
    private boolean isNewFile;

    /**
     * Creates new form PRO
     */
    public PRO() {
        initComponents();
        isNewFile = true;
        filePath = "";
        textoriginal = "";
        this.setSize(1000,800);
    }

    private boolean Verify_Save() {
        if (!textoriginal.equals(txtArea.getText())) {
            int result;
            Object[] options = {"Save", "Don't save", "Cancel"};
            if (!isNewFile) {
                result = JOptionPane.showOptionDialog(this,
                        "Do you want to save change to"
                        + filePath, "Notepad",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            } else {
                String file = this.getTitle().replaceAll("- Notepad", "");
                result = JOptionPane.showOptionDialog(this,
                        "Do you want to save change to"
                        + file, "Notepad",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
            if (result == JOptionPane.YES_OPTION) {
                if (!isNewFile) {
                    try {
                        WriteFile wf = new WriteFile(filePath, txtArea.getText());
                        wf.Write();
                    } catch (Exception e) {

                    }
                } else {
                    JFileChooser save = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt", "text");
                    save.setFileFilter(filter);
                    int option = save.showSaveDialog(this);
                    if (option == JFileChooser.APPROVE_OPTION) {

                        try {
                            BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath() + ".txt"));
                            out.write(this.txtArea.getText());
                            out.close();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            } else if (result == JOptionPane.CANCEL_OPTION) {
                return false;

            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniLoad = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniPrint = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mniCopy = new javax.swing.JMenuItem();
        mniCut = new javax.swing.JMenuItem();
        mniPaste = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDelete = new javax.swing.JMenuItem();
        mniSelect = new javax.swing.JMenuItem();
        mnAblout = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(120, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(120, 21));

        mnFile.setText("File");
        mnFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniNew.setText("New");
        mniNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        mnFile.add(mniNew);

        mniLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniLoad.setText("Load");
        mniLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoadActionPerformed(evt);
            }
        });
        mnFile.add(mniLoad);

        mniSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnFile.add(mniSave);
        mnFile.add(jSeparator1);

        mniPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mniPrint.setText("Print");
        mniPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPrintActionPerformed(evt);
            }
        });
        mnFile.add(mniPrint);
        mnFile.add(jSeparator2);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnFile.add(mniExit);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");
        mnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mniCopy.setText("Copy");
        mniCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCopyActionPerformed(evt);
            }
        });
        mnEdit.add(mniCopy);

        mniCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mniCut.setText("Cut");
        mniCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCutActionPerformed(evt);
            }
        });
        mnEdit.add(mniCut);

        mniPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mniPaste.setText("Paste");
        mniPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPasteActionPerformed(evt);
            }
        });
        mnEdit.add(mniPaste);
        mnEdit.add(jSeparator3);

        mniDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        mniDelete.setText("Delete");
        mniDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDeleteActionPerformed(evt);
            }
        });
        mnEdit.add(mniDelete);

        mniSelect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mniSelect.setText("Select All");
        mniSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSelectActionPerformed(evt);
            }
        });
        mnEdit.add(mniSelect);

        jMenuBar1.add(mnEdit);

        mnAblout.setText("About");
        mnAblout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HELP, 0));
        mniAbout.setText("About");
        mniAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutActionPerformed(evt);
            }
        });
        mnAblout.add(mniAbout);

        jMenuBar1.add(mnAblout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoadActionPerformed
        JFileChooser open = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt", "text");
        open.setFileFilter(filter);
        int option = open.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            this.txtArea.setText("");
            try {
                Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                while (scan.hasNext()) {
                    this.txtArea.append(scan.nextLine() + "\n");
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Can't open file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_mniLoadActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        if (!Verify_Save()) {
            return;
        }
        isNewFile = true;
        txtArea.setText("");
    }//GEN-LAST:event_mniNewActionPerformed

    private void mniPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPrintActionPerformed
        try {
            if (txtArea.getText().isEmpty()) {
                throw new Exception("Nothing to save!");
            }
            MessageFormat header = new MessageFormat("Notepad");
            MessageFormat footer = new MessageFormat("Author: Le Anh Tuan - SE1404");
            if (txtArea.print(header, footer)) {
                JOptionPane.showMessageDialog(contentPane, "File save!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(contentPane, ex, "Error while print file", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mniPrintActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        JFileChooser save = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt", "text");
        save.setFileFilter(filter);
        int option = save.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {

            try {
                textoriginal = txtArea.getText();
                filePath = save.getSelectedFile().getPath() + ".txt";
                WriteFile wf = new WriteFile(filePath, textoriginal);
                wf.Write();
                isNewFile = false;
                setTitle(save.getSelectedFile().getName());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCopyActionPerformed
        txtArea.copy();
    }//GEN-LAST:event_mniCopyActionPerformed

    private void mniCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCutActionPerformed
        txtArea.cut();
    }//GEN-LAST:event_mniCutActionPerformed

    private void mniPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPasteActionPerformed
        txtArea.paste();
    }//GEN-LAST:event_mniPasteActionPerformed

    private void mniDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDeleteActionPerformed
        txtArea.replaceSelection("");
    }//GEN-LAST:event_mniDeleteActionPerformed

    private void mniSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSelectActionPerformed
        txtArea.selectAll();
    }//GEN-LAST:event_mniSelectActionPerformed

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        JOptionPane.showMessageDialog(contentPane, "Program Description: Notepad\nAuthor: Le Anh Tuan", "About",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mniAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PRO().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnAblout;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniCopy;
    private javax.swing.JMenuItem mniCut;
    private javax.swing.JMenuItem mniDelete;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniLoad;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniPaste;
    private javax.swing.JMenuItem mniPrint;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenuItem mniSelect;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}

class WriteFile {

    private String path;
    private String content;

    public WriteFile() {
    }

    public WriteFile(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public void Write() {
        try {
//            StringTokenizer st = new StringTokenizer(content, "\n");
            try (PrintWriter fw = new PrintWriter(new FileOutputStream(path), true)) {
                //            StringTokenizer st = new StringTokenizer(content, "\n");
                String s[] = content.split("\n");
                for (String string : s) {
                    fw.print(string + "\r\n");
                }
            }
        } catch (FileNotFoundException ex) {
        }
    }
}
