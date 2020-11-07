/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Magi
 */
public class DrawWithMouse extends javax.swing.JFrame {

    Graphics g = null;
    Point p1 = null, p2 = null;
    Color color = Color.RED;

    /**
     * Creates new form DrawWithMouse
     */
    public DrawWithMouse() {
        initComponents();
        g = this.pLines.getGraphics();
        this.rdFill.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pChooser = new javax.swing.JPanel();
        btnColor = new javax.swing.JButton();
        rdDraw = new javax.swing.JRadioButton();
        rdFill = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pLines = new javax.swing.JPanel();
        pEllipses = new javax.swing.JPanel();
        pRectangle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnColor.setText("Select Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        pChooser.add(btnColor);

        rdDraw.setText("Draw only");
        pChooser.add(rdDraw);

        rdFill.setText("Draw and Fill");
        pChooser.add(rdFill);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        pLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pLinesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pLinesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pLinesLayout = new javax.swing.GroupLayout(pLines);
        pLines.setLayout(pLinesLayout);
        pLinesLayout.setHorizontalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pLinesLayout.setVerticalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lines", pLines);

        pEllipses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pEllipsesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pEllipsesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pEllipsesLayout = new javax.swing.GroupLayout(pEllipses);
        pEllipses.setLayout(pEllipsesLayout);
        pEllipsesLayout.setHorizontalGroup(
            pEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pEllipsesLayout.setVerticalGroup(
            pEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ellipses", pEllipses);

        pRectangle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pRectangleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pRectangleMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pRectangleLayout = new javax.swing.GroupLayout(pRectangle);
        pRectangle.setLayout(pRectangleLayout);
        pRectangleLayout.setHorizontalGroup(
            pRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        pRectangleLayout.setVerticalGroup(
            pRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reactangles", pRectangle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
        g.setColor(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        int index = this.jTabbedPane1.getSelectedIndex();
        switch (index) {
            case 0:
                g = pLines.getGraphics();
                this.rdDraw.setSelected(true);
                this.rdFill.setEnabled(false);
                break;
            case 1:
                g = pEllipses.getGraphics();
                this.rdDraw.setEnabled(true);
                break;
            case 2:
                g = pRectangle.getGraphics();
                this.rdFill.setEnabled(true);
                break;
        }
        g.setColor(color);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void pLinesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_pLinesMousePressed

    private void pLinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMouseReleased
        p2 = evt.getPoint();
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        p1 = p2 = null;
    }//GEN-LAST:event_pLinesMouseReleased

    private void pEllipsesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEllipsesMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_pEllipsesMousePressed

    private void pEllipsesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEllipsesMouseReleased
        p2 = evt.getPoint();
        int left = p1.x < p2.x ? p1.x : p2.x;
        int top = p1.y < p2.y ? p1.y : p2.y;
        int width = Math.abs(p1.x - p2.x);
        int height = Math.abs(p1.y - p2.y);
        if (rdDraw.isSelected()) {
            g.drawOval(left, top, width, height);
        } else {
            g.fillOval(left, top, width, height);
        }
        p1 = p2 = null;
    }//GEN-LAST:event_pEllipsesMouseReleased

    private void pRectangleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectangleMousePressed
        p1 = evt.getPoint();
    }//GEN-LAST:event_pRectangleMousePressed

    private void pRectangleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectangleMouseReleased
        p2 = evt.getPoint();
        int left = p1.x < p2.x ? p1.x : p2.x;
        int top = p1.y < p2.y ? p1.y : p2.y;
        int width = Math.abs(p1.x - p2.x);
        int height = Math.abs(p1.y - p2.y);
        if (rdDraw.isSelected()) {
            g.drawRect(left, top, width, height);
        } else {
            g.fillRect(left, top, width, height);
        }
        p1 = p2 = null;
    }//GEN-LAST:event_pRectangleMouseReleased

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
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawWithMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pChooser;
    private javax.swing.JPanel pEllipses;
    private javax.swing.JPanel pLines;
    private javax.swing.JPanel pRectangle;
    private javax.swing.JRadioButton rdDraw;
    private javax.swing.JRadioButton rdFill;
    // End of variables declaration//GEN-END:variables
}
