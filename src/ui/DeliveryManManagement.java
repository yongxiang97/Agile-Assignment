package ui;

import domain.DeliveryManDomain;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author annoy
 */
class JTextFieldLimit extends PlainDocument {

    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    JTextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}

public class DeliveryManManagement extends javax.swing.JFrame {

    public void clearText() {
        jtfAddress.setText("");
        jtfName.setText("");
        jtfIC.setText("");
        jtfPhone.setText("");
        jtfEmail.setText("");
        jtfAccPw.setText("");
        jtfSearch.setText("");
        jtfSearch.requestFocusInWindow();
    }

    public static ListInterface<DeliveryManDomain> DmanList = new DeliveryManList<>();

    public DeliveryManManagement() {

        DeliveryManDomain test1 = new DeliveryManDomain("S001", "hamato", "970713-11-1414", "Male", "016-4531458", "asd@asd.com", "12312", "6-1-1 PV 12 Condominium", "W", "Delivering", "A001");
        DmanList.add(test1);
        DeliveryManDomain test2 = new DeliveryManDomain("S002", "Lily", "970713-11-6111", "Female", "016-4222235", "lily@gmail.com", "zzxczxczxc", "4-5-A pv 15 Condominium", "F", "Delivering", "A001");
        DmanList.add(test2);

        initComponents();
        setTitle("Delivery Man Management");
        jtfName.setDocument(new JTextFieldLimit(30));
        jtfIC.setDocument(new JTextFieldLimit(14));
        jtfPhone.setDocument(new JTextFieldLimit(11));
        jtfEmail.setDocument(new JTextFieldLimit(30));
        jtfAccPw.setDocument(new JTextFieldLimit(29));
        jtfAddress.setDocument(new JTextFieldLimit(50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAge = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfIC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfAccPw = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        BtnUpdate = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        BtnDelete = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Delivery Man Management");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, null, null));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 40, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("IC:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 40, 18, 17);
        jPanel2.add(jtfIC);
        jtfIC.setBounds(120, 40, 220, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 70, 49, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Phone:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 100, 44, 17);
        jPanel2.add(jtfPhone);
        jtfPhone.setBounds(120, 100, 220, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Email:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 130, 36, 17);
        jPanel2.add(jtfAccPw);
        jtfAccPw.setBounds(120, 160, 220, 25);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setAutoscrolls(true);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(30, 250, 80, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Acc Password:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 160, 100, 20);
        jPanel2.add(jtfEmail);
        jtfEmail.setBounds(120, 130, 220, 25);

        jtfName.setMaximumSize(new java.awt.Dimension(6, 18));
        jtfName.setMinimumSize(new java.awt.Dimension(6, 18));
        jtfName.setName(""); // NOI18N
        jtfName.setPreferredSize(new java.awt.Dimension(6, 18));
        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });
        jPanel2.add(jtfName);
        jtfName.setBounds(120, 10, 220, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 90, 20);
        jPanel2.add(jtfAddress);
        jtfAddress.setBounds(120, 190, 220, 25);

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(BtnUpdate);
        BtnUpdate.setBounds(150, 250, 80, 20);

        buttonGroupAge.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(120, 70, 70, 23);

        buttonGroupAge.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(230, 70, 70, 23);

        BtnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(BtnDelete);
        BtnDelete.setBounds(270, 250, 80, 20);

        jLabel11.setText("Enter Staff ID to search");

        BtnSearch.setText("Search");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel11))
                        .addGap(212, 212, 212))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearch)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String chkIC = jtfIC.getText();
        String chkphn = jtfPhone.getText();

        //generate new ID
        int newid = Integer.parseInt(DmanList.getAddEntry(DmanList.getNumberOfEntries()).getDMid().substring(1)) + 1;
        String GenID = String.format("S%03d", newid);

        String Gender;
        if (jRadioButton1.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }

        if (chkIC.charAt(6) == '-' && chkIC.charAt(9) == '-') {

            if (chkphn.substring(0, 2).equals("01")) {
                if (chkphn.indexOf('-') == 3) {

                    DeliveryManDomain newMan = new DeliveryManDomain(GenID, jtfName.getText(), jtfIC.getText(), Gender, jtfPhone.getText(), jtfEmail.getText(), jtfAccPw.getText(), jtfAddress.getText(), "W", "Delivering", "A001");
                    DmanList.add(newMan);
                    JOptionPane.showMessageDialog(null, "New Staff added, your staff id is " + GenID);

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong phone number format, please make sure it is 01X-xxxxxxxx", "FORMAT ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong phone number format, please make sure it is 01X-xxxxxxxx", "FORMAT ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Wrong IC format, please make sure the format is XXXXXX-XX-XXXX", "FORMAT ERROR", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        boolean found = false;
        DeliveryManDomain foundDM = null;
        String id = jtfSearch.getText();
        String name = jtfName.getText();
        String ic = jtfIC.getText();
        String phone = jtfPhone.getText();
        String email = jtfEmail.getText();
        String accpass = jtfAccPw.getText();
        String address = jtfAddress.getText();
        String status = "W";
        String delivering = "delivering";
        String orderID = "A001";
        String gender;
        if (jRadioButton1.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        foundDM = new DeliveryManDomain(id, name, ic, gender, phone, email, accpass, address, status, delivering, orderID);
        for (int i = 0; i < DmanList.getNumberOfEntries() && !found; i++) {
            if (jtfSearch.getText().equals(DmanList.getEntry(i).getDMid())) {
                found = true;
                DmanList.replace(i, foundDM);
                JOptionPane.showMessageDialog(null, "updated.");
            }
        }

    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed

        //search id
        boolean found = false;
        DeliveryManDomain foundDM = null;
        for (int i = 0; i < DmanList.getNumberOfEntries() && !found; i++) {
            if (jtfSearch.getText().equals(DmanList.getEntry(i).getDMid())) {
                found = true;
                foundDM = DmanList.getEntry(i);

                if (found = false) {
                    JOptionPane.showMessageDialog(null, "Staff " + foundDM.getDMid() + " doesn't exist", "error", JOptionPane.ERROR_MESSAGE);
                }

                if (foundDM.getDMStatus() == "W") {
                    jtfIC.setText(foundDM.getDMic());
                    jtfName.setText(foundDM.getDMname());
                    jtfPhone.setText(foundDM.getDMphone());
                    jtfEmail.setText(foundDM.getDMemail());
                    jtfAccPw.setText(foundDM.getDMaccpass());
                    jtfAddress.setText(foundDM.getDMAddress());
                    System.out.println(foundDM.getDMdelivery());
                    jtfSearch.setEditable(false);

                    if (foundDM.getDMgender().equals("Male")) {
                        jRadioButton1.setSelected(true);
                    } else {
                        jRadioButton2.setSelected(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Staff " + foundDM.getDMid() + " deleted and no longer in the company", "error", JOptionPane.ERROR_MESSAGE);
                    int response = JOptionPane.showConfirmDialog(null, "Do you want to display " + foundDM.getDMid() + " info ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        jtfIC.setText(foundDM.getDMic());
                        jtfName.setText(foundDM.getDMname());
                        jtfPhone.setText(foundDM.getDMphone());
                        jtfEmail.setText(foundDM.getDMemail());
                        jtfAccPw.setText(foundDM.getDMaccpass());
                        jtfAddress.setText(foundDM.getDMAddress());
                        jtfSearch.setEditable(false);

                        if (foundDM.getDMgender().equals("Male")) {
                            jRadioButton1.setSelected(true);
                        } else {
                            jRadioButton2.setSelected(true);
                        }
                    }
                }
            }
        }

        //end search
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clearText();
        jtfSearch.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        boolean found = false;
        DeliveryManDomain foundDM = null;
        String id = jtfSearch.getText();
        String name = jtfName.getText();
        String ic = jtfIC.getText();
        String phone = jtfPhone.getText();
        String email = jtfEmail.getText();
        String accpass = jtfAccPw.getText();
        String address = jtfAddress.getText();
        String status = "F";
        String delivering = "delivering";
        String gender;
        String orderID = "A001";
        if (jRadioButton1.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete? " + jtfSearch.getText() + " info ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            foundDM = new DeliveryManDomain(id, name, ic, gender, phone, email, accpass, address, status, delivering, orderID);
            for (int i = 0; i < DmanList.getNumberOfEntries() && !found; i++) {
                if (jtfSearch.getText().equals(DmanList.getEntry(i).getDMid())) {
                    found = true;
                    DmanList.replace(i, foundDM);
                    JOptionPane.showMessageDialog(null, "Deleted Successfully.");
                }
            }
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DeliveryManManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryManManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryManManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryManManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryManManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroupAge;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jtfAccPw;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIC;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}