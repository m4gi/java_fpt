/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Magi
 */
public class PhotoViewer extends javax.swing.JFrame {

    boolean autoSlide = false;
    int rate = 0;
    BufferedImage currentImage = null;
    JFileChooser fChooser = new JFileChooser();
    Vector<String> list = new Vector<String>();
    int x = 10, y = 20;
    int imgIndex = -1;
    Graphics g = null;
    TimeThread timeCounter;

    /**
     * Creates new form PhotoViewer
     */
    public PhotoViewer() {
        initComponents();
        this.setSize(1000, 600);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "GIF", "JPG", "PNG", "JPEG", "BMP");
        fChooser.setFileFilter(filter);
        fChooser.setMultiSelectionEnabled(true);
        g = this.pView.getGraphics();
        this.sldRate.setEnabled(false);
        this.sldRate.setValue(1);
    }

    private void loadImage() {
        String filename = list.elementAt(imgIndex);
        try {
            currentImage = ImageIO.read(new File(filename));
        } catch (Exception e) {
            currentImage = null;
            System.err.println(e);
        }
    }

    private void showImage() {
        if (currentImage != null) {
            g.clearRect(x, y, pView.getWidth() - x, pView.getHeight() - y);
            int imgWidth = currentImage.getWidth();
            int imgHeight = currentImage.getHeight();
            double ratio = 1.0 * imgWidth / imgHeight;
            int areaWidth = this.pView.getWidth() - 2 * x;
            int areaHeight = this.pView.getHeight() - 2 * y;
            if (imgWidth <= areaWidth && imgHeight <= areaHeight) {
                areaWidth = imgWidth;
                areaHeight = imgHeight;
            } else if (imgWidth > imgHeight) {
                if (imgWidth < areaWidth) {
                    areaWidth = imgWidth;
                }
                areaHeight = (int) (areaWidth / ratio);
            } else {
                if (imgHeight < areaHeight) {
                    areaHeight = imgHeight;
                }
                areaWidth = (int) (areaHeight * ratio);
            }
            g.drawImage(currentImage, x, y, areaWidth, areaHeight, this.pView);
        }
    }

    private void slidingImage() {
        timeCounter = new TimeThread();
        timeCounter.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pControl = new javax.swing.JPanel();
        btnAddFile = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFiles = new javax.swing.JList<>(list);
        btnRemove = new javax.swing.JToggleButton();
        btnClear = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chkOnOff = new javax.swing.JCheckBox();
        sldRate = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        pView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(250);

        pControl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 204))); // NOI18N
        pControl.setLayout(null);

        btnAddFile.setText("Add Image File ");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });
        pControl.add(btnAddFile);
        btnAddFile.setBounds(16, 41, 217, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Current File");
        pControl.add(jLabel1);
        jLabel1.setBounds(16, 82, 70, 15);

        lstFiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstFilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstFiles);

        pControl.add(jScrollPane1);
        jScrollPane1.setBounds(16, 115, 217, 301);

        btnRemove.setText("Remove");
        btnRemove.setPreferredSize(new java.awt.Dimension(105, 23));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        pControl.add(btnRemove);
        btnRemove.setBounds(16, 434, 105, 23);

        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(105, 23));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pControl.add(btnClear);
        btnClear.setBounds(128, 434, 105, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Auto Sliding", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("On/Off");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 27, 37, 14);

        chkOnOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkOnOffMouseClicked(evt);
            }
        });
        chkOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOnOffActionPerformed(evt);
            }
        });
        jPanel1.add(chkOnOff);
        chkOnOff.setBounds(73, 24, 21, 21);

        sldRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldRateMouseReleased(evt);
            }
        });
        jPanel1.add(sldRate);
        sldRate.setBounds(16, 63, 185, 26);

        jLabel3.setText("second/images");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(106, 46, 71, 14);

        pControl.add(jPanel1);
        jPanel1.setBounds(20, 460, 217, 107);

        jSplitPane1.setLeftComponent(pControl);

        pView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        pView.setPreferredSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout pViewLayout = new javax.swing.GroupLayout(pView);
        pView.setLayout(pViewLayout);
        pViewLayout.setHorizontalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        pViewLayout.setVerticalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(pView);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOnOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOnOffActionPerformed

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        int returnVal = fChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fChooser.getSelectedFiles();
            for (File file : files) {
                list.add(file.getAbsolutePath());
            }
            lstFiles.setSelectedIndex(0);
            this.lstFiles.updateUI();
        }
    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int[] indices = lstFiles.getSelectedIndices();
        for (int i = indices.length - 1; i >= 0; i--) {
            list.removeElementAt(i);
        }
        lstFiles.updateUI();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        list.removeAllElements();
        lstFiles.updateUI();
    }//GEN-LAST:event_btnClearActionPerformed

    private void lstFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFilesMouseClicked
        imgIndex = lstFiles.getSelectedIndex();
        this.loadImage();
        this.showImage();
    }//GEN-LAST:event_lstFilesMouseClicked

    private void chkOnOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkOnOffMouseClicked
        if (chkOnOff.isSelected() && lstFiles.getSelectedIndex() >= 0) {
            this.autoSlide = true;
            this.sldRate.setEnabled(true);
            this.rate = this.sldRate.getValue();
            slidingImage();
        } else {
            if (timeCounter != null) {
                timeCounter = null;
            }
            autoSlide = false;
            this.sldRate.setEnabled(false);
        }
    }//GEN-LAST:event_chkOnOffMouseClicked

    private void sldRateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldRateMouseReleased
        this.rate = sldRate.getValue();
    }//GEN-LAST:event_sldRateMouseReleased

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
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhotoViewer().setVisible(true);
            }
        });
    }

    class TimeThread extends Thread {

        @Override
        public void run() {
            imgIndex = lstFiles.getSelectedIndex();
            int n = lstFiles.getModel().getSize();
            if (n > 0 && autoSlide) {
                while (imgIndex < n) {
                    try {
                        loadImage();
                        showImage();
                        imgIndex++;
                        sleep(1000 * rate);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddFile;
    private javax.swing.JToggleButton btnClear;
    private javax.swing.JToggleButton btnRemove;
    private javax.swing.JCheckBox chkOnOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> lstFiles;
    private javax.swing.JPanel pControl;
    private javax.swing.JPanel pView;
    private javax.swing.JSlider sldRate;
    // End of variables declaration//GEN-END:variables
}
