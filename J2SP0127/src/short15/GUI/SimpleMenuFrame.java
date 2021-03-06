/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short15.GUI;

/**
 *
 * @author lab026
 */
public class SimpleMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form SimpleMenuFrame
     */
    public SimpleMenuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jMenuSimple = new javax.swing.JMenu();
        jMenuItemTextOnly = new javax.swing.JMenuItem();
        jMenuItemTextIcon = new javax.swing.JMenuItem();
        jMenuItemIcon = new javax.swing.JMenuItem();
        jSeparatorTextIcon = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jSeparatorRadio = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparatorCheckBox = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuOther = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenuSimple.setMnemonic('a');
        jMenuSimple.setText("A Menu");

        jMenuItemTextOnly.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTextOnly.setMnemonic('t');
        jMenuItemTextOnly.setText("A text-only menu item");
        jMenuSimple.add(jMenuItemTextOnly);

        jMenuItemTextIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/short15/Images/icon.jpg"))); // NOI18N
        jMenuItemTextIcon.setMnemonic('b');
        jMenuItemTextIcon.setText("Both text and icon");
        jMenuSimple.add(jMenuItemTextIcon);

        jMenuItemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/short15/Images/icon.jpg"))); // NOI18N
        jMenuSimple.add(jMenuItemIcon);
        jMenuSimple.add(jSeparatorTextIcon);

        jRadioButtonMenuItem1.setMnemonic('r');
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("A radio button menu item");
        jMenuSimple.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setMnemonic('o');
        jRadioButtonMenuItem2.setText("Another one");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSimple.add(jRadioButtonMenuItem2);
        jMenuSimple.add(jSeparatorRadio);

        jCheckBoxMenuItem1.setMnemonic('c');
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("A check box menu item ");
        jMenuSimple.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setMnemonic('h');
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Another one");
        jMenuSimple.add(jCheckBoxMenuItem2);
        jMenuSimple.add(jSeparatorCheckBox);

        jMenu1.setMnemonic('s');
        jMenu1.setText("A submenu");

        jMenuItem4.setText("Menu item ");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Another menu item");
        jMenu1.add(jMenuItem5);

        jMenuSimple.add(jMenu1);

        jMenuBar.add(jMenuSimple);

        jMenuOther.setMnemonic('n');
        jMenuOther.setText("Another Menu");
        jMenuBar.add(jMenuOther);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(SimpleMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemIcon;
    private javax.swing.JMenuItem jMenuItemTextIcon;
    private javax.swing.JMenuItem jMenuItemTextOnly;
    private javax.swing.JMenu jMenuOther;
    private javax.swing.JMenu jMenuSimple;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparatorCheckBox;
    private javax.swing.JPopupMenu.Separator jSeparatorRadio;
    private javax.swing.JPopupMenu.Separator jSeparatorTextIcon;
    // End of variables declaration//GEN-END:variables
}
