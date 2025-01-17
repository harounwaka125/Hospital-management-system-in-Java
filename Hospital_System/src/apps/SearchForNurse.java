/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apps;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mohammed Hussain
 */
public class SearchForNurse extends javax.swing.JFrame {

    DefaultTableModel DTM;
    Connection con;

    /**
     * Creates new form SearchForNurse
     */
    public SearchForNurse() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(SearchForNurse.class.getName()).log(Level.SEVERE, null, ex);
        }
        ShowDataInTable();
    }

    public void ShowDataInTable() {
        try {
            PreparedStatement stmt = con.prepareStatement("select *from nurse");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("nurse_id");
                String firstname = rs.getString("n_f_name");
                String middlename = rs.getString("n_m_name");
                String lastname = rs.getString("n_l_name");
                int phone = rs.getInt("n_phoneNum");
                String address = rs.getString("n_address");
                String city = rs.getString("n_city");
                String gender = rs.getString("n_gender");
                int age = rs.getInt("n_age");
                String join = rs.getString("n_join");
                String leave = rs.getString("n_leave");
                Object[] obj = {id, firstname, middlename, lastname, age, phone, address, city, gender, join, leave};
                DTM = (DefaultTableModel) nurse_table.getModel();
                DTM.addRow(obj);

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchForDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void search(String str) {
        DTM = (DefaultTableModel) nurse_table.getModel();
        TableRowSorter<DefaultTableModel> def = new TableRowSorter<>(DTM);
        nurse_table.setRowSorter(def);
        def.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        search_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nurse_table = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search For Nurse");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_textKeyReleased(evt);
            }
        });
        jPanel2.add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 390, 65));

        nurse_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Middle Name", "Last Name", "Age", "Phone Number", "Address", "City", "Gender", "Join Time ", "Leave Time"
            }
        ));
        jScrollPane1.setViewportView(nurse_table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, 780, 376));

        btn_delete.setText("delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 110, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpapersy.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            PreparedStatement stmt = con.prepareStatement("delete from nurse where nurse_id=?");
            stmt.setInt(1, (int) nurse_table.getValueAt(nurse_table.getSelectedRow(), 0));
            JOptionPane.showMessageDialog(null, "success");
            DTM.removeRow(nurse_table.getSelectedRow());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "failed");

            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        choosesearch af = new choosesearch();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void search_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_textKeyReleased
        String searchfor = search_text.getText();
        search(searchfor);
    }//GEN-LAST:event_search_textKeyReleased

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
            java.util.logging.Logger.getLogger(SearchForNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForNurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nurse_table;
    private javax.swing.JTextField search_text;
    // End of variables declaration//GEN-END:variables
}
