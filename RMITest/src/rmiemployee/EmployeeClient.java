package rmiemployee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.rmi.Naming;
import javax.swing.JOptionPane;
import Database.employee;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeClient extends javax.swing.JFrame {

    /**
     * Creates new form JBook
     */
    private String textSearch;
    String serviceName = "rmi://localhost:1098/MathServer";
    EmployeeRemote stub = null;

    Vector header = new Vector();
    Vector data = new Vector();

    public EmployeeClient() {

        initComponents();

        ///connect rmi
        try {
            stub = (EmployeeRemote) Naming.lookup(serviceName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        ///set header table

        header.add("Emp_ID");
        header.add("Last Name");
        header.add("Fist Name");
        header.add("Gender");
        header.add("Email");

        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        model.setDataVector(data, header);
        //fill table when khoi tao
        updataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        Jtable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFistName = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrinte = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cSearch = new javax.swing.JComboBox<>();
        inputSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lMassege = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
                }
        ));
        tbDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDisplay);

        Jtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("EmployeeID");

        jLabel3.setText("Last Name");

        jLabel4.setText("Fist Name");

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender");

        jLabel6.setText("Email");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JtableLayout = new javax.swing.GroupLayout(Jtable);
        Jtable.setLayout(JtableLayout);
        JtableLayout.setHorizontalGroup(
                JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JtableLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmpID)
                                        .addComponent(txtLastName)
                                        .addComponent(txtFistName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail)
                                        .addComponent(cbGender, 0, 200, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JtableLayout.setVerticalGroup(
                JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JtableLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setAlignmentX(5.0F);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnNew);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnPrinte.setText("Printe");
        btnPrinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrinteActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrinte);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setText("Search by:");

        cSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Employee ID"}));
        cSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSearchActionPerformed(evt);
            }
        });

        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnSearch)
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(Jtable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jtable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lMassege, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIDActionPerformed

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:       
        lMassege.setText("");
        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        String s = model.getValueAt(tbDisplay.getSelectedRow(), 0).toString();

        lMassege.setText("Sucessfully");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:      
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:     

    }//GEN-LAST:event_inputSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (stub != null) {
            lMassege.setText("");
            DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
            model.getDataVector().removeAllElements();
            if (cSearch.getSelectedItem().equals("Employee ID")) {
                textSearch = inputSearch.getText();
                // search ID
                try {
                    model.addRow(new Object[]{
                        stub.getID(textSearch).getEmp_ID(),
                        stub.getID(textSearch).getLast_Name() ,
                        stub.getID(textSearch).getFist_Name(),
                        stub.getID(textSearch).getFist_Name(),
                        stub.getID(textSearch).getEmail()
                    });
                } catch (RemoteException ex) {
                    Logger.getLogger(EmployeeClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void cSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if (stub != null) {
            // TODO add your handling code here:
            int countPrev = tbDisplay.getRowCount();
            lMassege.setText("");
            System.out.println(txtEmpID.getText()
                    + txtLastName.getText()
                    + txtFistName.getText()
                    + cbGender.getSelectedItem().toString()
                    + txtEmail.getText());

            try {
                stub.add(
                        txtEmpID.getText(),
                        txtLastName.getText(),
                        txtFistName.getText(),
                        cbGender.getSelectedItem().toString(),
                        txtEmail.getText()
                );
            } catch (RemoteException ex) {
                Logger.getLogger(EmployeeClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            updataTable();
            if (countPrev != tbDisplay.getRowCount()) {
                lMassege.setText("Sucessfully");
            } else {
                lMassege.setText("Something wrong");
            }
        }

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnPrinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrinteActionPerformed
        // TODO add your handling code here:
        updataTable();

    }//GEN-LAST:event_btnPrinteActionPerformed

    private void updataTable() {
        if (stub != null) {

            DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
            model.getDataVector().removeAllElements();
            Vector<employee> row = new Vector<>();
            try {
                row = stub.listEmployee();
                for (int i = 0; i < row.size(); i++) {
                    model.addRow(new Object[]{
                        row.get(i).getEmp_ID(),
                        row.get(i).getLast_Name(),
                        row.get(i).getFist_Name(),
                        row.get(i).getGender(),
                        row.get(i).getEmail()
                    });
                }
            } catch (RemoteException ex) {
                Logger.getLogger(EmployeeClient.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        lMassege.setText("");
        int countPrev = tbDisplay.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        String s = model.getValueAt(tbDisplay.getSelectedRow(), 0).toString();
        System.out.println(s);
//        BookDB.detele(s);
        updataTable();
        if (countPrev != tbDisplay.getRowCount()) {
            lMassege.setText("Sucessfully");
        } else {
            lMassege.setText("Something wrong");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDisplayMouseClicked
        // TODO add your handling code here:
        getTextItem();

    }//GEN-LAST:event_tbDisplayMouseClicked

    private void getTextItem() {
        DefaultTableModel model = (DefaultTableModel) tbDisplay.getModel();
        txtEmpID.setText(model.getValueAt(tbDisplay.getSelectedRow(), 0).toString());
        txtLastName.setText(model.getValueAt(tbDisplay.getSelectedRow(), 1).toString());
        txtFistName.setText(model.getValueAt(tbDisplay.getSelectedRow(), 2).toString());
        txtEmail.setText(model.getValueAt(tbDisplay.getSelectedRow(), 4).toString());
    }

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
            java.util.logging.Logger.getLogger(EmployeeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jtable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrinte;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cSearch;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMassege;
    private javax.swing.JTable tbDisplay;
    private javax.swing.JTextField txtFistName;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
