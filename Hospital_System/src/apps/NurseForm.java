/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apps;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohammed Hussain
 */
public class NurseForm extends javax.swing.JFrame {

    Connection con;

    /**
     * Creates new form NurseForm
     */
    public NurseForm() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(NurseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_city = new javax.swing.JTextField();
        btn_join = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_leave = new javax.swing.JComboBox<>();
        btn_male = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn_female = new javax.swing.JRadioButton();
        btn_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_name2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_name3 = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_add = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        YearcomboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nurse Form");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(btn_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 240, 36));

        btn_join.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM ", "9 PM", "10 PM", "11 PM" }));
        jPanel1.add(btn_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 214, 34));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 50, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Leaving");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 360, 70, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 84, 35));

        btn_leave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM ", "9 PM", "10 PM", "11 PM" }));
        jPanel1.add(btn_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 214, 34));

        buttonGroup1.add(btn_male);
        btn_male.setText("male");
        btn_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 98, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("First name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 130, 27));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 80, -1));

        buttonGroup1.add(btn_female);
        btn_female.setText("female");
        jPanel1.add(btn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 98, -1));
        jPanel1.add(btn_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 274, 27));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Middle name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 27));
        jPanel1.add(btn_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 274, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Last name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 27));
        jPanel1.add(btn_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 274, 27));

        btn_save.setText("Save ");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phone Num");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 41));
        jPanel1.add(btn_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 280, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 73, 38));
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 240, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("City");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 57, 36));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Age:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 79, 37));

        YearcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jPanel1.add(YearcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Joing");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 69, 34));

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 80, -1));

        btn_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_idMouseReleased(evt);
            }
        });
        btn_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_idKeyReleased(evt);
            }
        });
        jPanel1.add(btn_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpapersy.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        afterLogin another = new afterLogin();
        another.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:

        if (!btn_name.getText().isEmpty() && !btn_name2.getText().isEmpty() && !btn_name3.getText().isEmpty()) {
            try {
                String firstname = btn_name.getText();
                String middlename = btn_name2.getText();
                String lastname = btn_name3.getText();
                String id = btn_id.getText();
                int year = Integer.parseInt((String) YearcomboBox.getSelectedItem());

                String gender;
                if (btn_male.isSelected()) {
                    gender = "male";
                } else {
                    gender = "female";
                }
                int ph = Integer.parseInt(btn_phone.getText());
                String cit = btn_city.getText();
                String add = btn_add.getText();
                String going = btn_join.getSelectedItem().toString();
                String leave = btn_leave.getSelectedItem().toString();
                PreparedStatement stmt = con.prepareStatement("insert into nurse (n_f_name,n_m_name,n_l_name,n_age,n_phoneNum,n_address,n_city,n_gender,n_join,n_leave) values (?,?,?,?,?,?,?,?,?,?)");

                stmt.setString(1, firstname);
                stmt.setString(2, middlename);
                stmt.setString(3, lastname);
                stmt.setInt(4, year);
                stmt.setInt(5, ph);
                stmt.setString(6, add);
                stmt.setString(7, cit);
                stmt.setString(8, gender);
                stmt.setString(9, going);
                stmt.setString(10, leave);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "save data success");
                btn_add.setText(" ");
                btn_name.setText("");
                btn_name2.setText("");
                btn_name3.setText("");
                btn_city.setText("");
                btn_phone.setText("");
                btn_id.setText("");
                YearcomboBox.setSelectedIndex(0);
                btn_join.setSelectedIndex(0);
                btn_leave.setSelectedIndex(0);
                buttonGroup1.clearSelection();
            } catch (SQLException ex) {
                Logger.getLogger(NurseForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {
            String firstname = btn_name.getText();
            String middlename = btn_name2.getText();
            String lastname = btn_name3.getText();
            int id = Integer.parseInt(btn_id.getText());
            int year = Integer.parseInt((String) YearcomboBox.getSelectedItem());

            String gender;
            if (btn_male.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            int ph = Integer.parseInt(btn_phone.getText());
            String cit = btn_city.getText();
            String add = btn_add.getText();
            String going = btn_join.getSelectedItem().toString();
            String leave = btn_leave.getSelectedItem().toString();
            PreparedStatement stmt = con.prepareStatement("update nurse set n_f_name=?,n_m_name=?,n_l_name=?,n_age=?,n_phoneNum=?,n_address=?,n_city=?,n_gender=?,n_join=?,n_leave=? where nurse_id=?");

            stmt.setString(1, firstname);
            stmt.setString(2, middlename);
            stmt.setString(3, lastname);
            stmt.setInt(4, year);
            stmt.setInt(5, ph);
            stmt.setString(6, add);
            stmt.setString(7, cit);
            stmt.setString(8, gender);
            stmt.setString(9, going);
            stmt.setString(10, leave);
            stmt.setInt(11, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "save data success");
            btn_add.setText(" ");
            btn_name.setText("");
            btn_name2.setText("");
            btn_name3.setText("");
            btn_city.setText("");
            btn_phone.setText("");
            btn_id.setText("");
            YearcomboBox.setSelectedIndex(0);
            btn_join.setSelectedIndex(0);
            btn_leave.setSelectedIndex(0);
            buttonGroup1.clearSelection();
        } catch (SQLException ex) {
            Logger.getLogger(NurseForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_idKeyReleased
        String id = btn_id.getText();
        String gender;
        if (btn_male.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        try {
            PreparedStatement stmt = con.prepareStatement("select * from nurse where nurse_id=?");
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                if (id.equals(rs.getString("nurse_id"))) {
                    btn_add.setText(rs.getString("n_address"));
                    btn_city.setText(rs.getString("n_city"));
                    btn_name.setText(rs.getString("n_f_name"));
                    btn_name2.setText(rs.getString("n_m_name"));
                    btn_name3.setText(rs.getString("n_l_name"));
                    btn_phone.setText(rs.getString("n_phoneNum"));
                    String st = rs.getString("n_gender");
                    if (st.equals("male")) {
                        btn_male.setSelected(true);
                    } else {
                        btn_female.setSelected(true);
                    }
                    YearcomboBox.setSelectedItem(rs.getString("n_age"));
                    btn_join.setSelectedItem(rs.getString("n_join"));
                    btn_leave.setSelectedItem(rs.getString("n_leave"));

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(NurseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_idKeyReleased

    private void btn_idMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_idMouseReleased

    }//GEN-LAST:event_btn_idMouseReleased

    private void btn_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_maleActionPerformed

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
            java.util.logging.Logger.getLogger(NurseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> YearcomboBox;
    private javax.swing.JTextField btn_add;
    private javax.swing.JTextField btn_city;
    private javax.swing.JRadioButton btn_female;
    private javax.swing.JTextField btn_id;
    private javax.swing.JComboBox<String> btn_join;
    private javax.swing.JComboBox<String> btn_leave;
    private javax.swing.JRadioButton btn_male;
    private javax.swing.JTextField btn_name;
    private javax.swing.JTextField btn_name2;
    private javax.swing.JTextField btn_name3;
    private javax.swing.JTextField btn_phone;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
