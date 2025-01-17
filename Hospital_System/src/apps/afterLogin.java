/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apps;

/**
 *
 * @author Mohammed Hussain
 */
public class afterLogin extends javax.swing.JFrame {

    /**
     * Creates new form afterLogin
     */
    public afterLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Doctor = new javax.swing.JButton();
        lapel = new javax.swing.JLabel();
        btn_Nurse = new javax.swing.JButton();
        lapel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lapel2 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngtree-vector-doctor-icon-png-image_515568-removebg-preview.png"))); // NOI18N
        btn_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 115, 125));

        lapel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lapel.setText("Doctor");
        jPanel1.add(lapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 115, 33));

        btn_Nurse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images__1_-removebg-preview.png"))); // NOI18N
        btn_Nurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NurseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Nurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 115, 125));

        lapel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lapel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lapel1.setText("Nurse");
        jPanel1.add(lapel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 115, 33));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthcare-_-medical-_-hospital-logo-design-template-f9bcb68f480fabac31102ca9eb971193_screen.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 6, 100, -1));

        lapel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lapel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lapel2.setText("Search");
        jPanel1.add(lapel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 115, 33));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-admin-18-removebg-preview.png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 115, 125));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpapersy.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoctorActionPerformed
        // TODO add your handling code here:
        DoctorForm doc = new DoctorForm();
        doc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DoctorActionPerformed

    private void btn_NurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NurseActionPerformed
        // TODO add your handling code here:
        NurseForm nu = new NurseForm();
        nu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_NurseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Adminlogin ad = new Adminlogin();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        choosesearch ch = new choosesearch();
        ch.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(afterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(afterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(afterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(afterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new afterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Doctor;
    private javax.swing.JButton btn_Nurse;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lapel;
    private javax.swing.JLabel lapel1;
    private javax.swing.JLabel lapel2;
    // End of variables declaration//GEN-END:variables
}
