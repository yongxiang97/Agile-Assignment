/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.CustomOrder;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.DisplayMode;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class CustomizeOrderPayment extends javax.swing.JFrame {

    public static ArrayList<CustomOrder> OrderList = AddCustomizeOrder.CustomOrder;
    /**
     * Creates new form CustomizeOrderPayment
     */
    public CustomizeOrderPayment() {
        initComponents();
        jlLabelTotalAmount.setText(String.format("RM %.2f", OrderList.get(0).getTotalAmount()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPaymentType = new javax.swing.ButtonGroup();
        jPanelDetailView = new javax.swing.JPanel();
        jlLabelTotalAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonCard = new javax.swing.JRadioButton();
        jRadioButtonBanking = new javax.swing.JRadioButton();
        jPanelHeader = new javax.swing.JPanel();
        jlMenuName1 = new javax.swing.JLabel();
        jlLoginName1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelPaymentType = new javax.swing.JPanel();
        jPanelPayByCreditCard = new View.JPanelPayByCreditCard();
        jPanelPayByBank = new View.JPanelPayByBank();
        jPanelBottom = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jlLabelTotalAmount.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLabelTotalAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Total Bill Amount ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Select Payment Type");

        buttonGroupPaymentType.add(jRadioButtonCard);
        jRadioButtonCard.setSelected(true);
        jRadioButtonCard.setText("Master Card");
        jRadioButtonCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCardActionPerformed(evt);
            }
        });

        buttonGroupPaymentType.add(jRadioButtonBanking);
        jRadioButtonBanking.setText("Internet Banking");
        jRadioButtonBanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBankingActionPerformed(evt);
            }
        });

        jlMenuName1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlMenuName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenuName1.setText("CUSTOM SCHEDULED ORDER");
        jlMenuName1.setMaximumSize(new java.awt.Dimension(231, 29));
        jlMenuName1.setMinimumSize(new java.awt.Dimension(231, 29));
        jlMenuName1.setPreferredSize(new java.awt.Dimension(231, 29));

        jlLoginName1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLoginName1.setText("Soraka");

        jLabelLogo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setText("LOGO");
        jLabelLogo.setMaximumSize(new java.awt.Dimension(100, 51));
        jLabelLogo.setMinimumSize(new java.awt.Dimension(100, 51));
        jLabelLogo.setPreferredSize(new java.awt.Dimension(100, 51));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jlMenuName1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jlLoginName1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginName1)
                    .addComponent(jlMenuName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanelPaymentType.setMaximumSize(new java.awt.Dimension(760, 254));
        jPanelPaymentType.setMinimumSize(new java.awt.Dimension(760, 254));
        jPanelPaymentType.setPreferredSize(new java.awt.Dimension(760, 254));
        jPanelPaymentType.setLayout(new java.awt.CardLayout());
        jPanelPaymentType.add(jPanelPayByCreditCard, "card5");
        jPanelPayByCreditCard.getAccessibleContext().setAccessibleName("");

        jPanelPaymentType.add(jPanelPayByBank, "card4");

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton4.setText("Proceed");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDetailViewLayout = new javax.swing.GroupLayout(jPanelDetailView);
        jPanelDetailView.setLayout(jPanelDetailViewLayout);
        jPanelDetailViewLayout.setHorizontalGroup(
            jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPaymentType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlLabelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonCard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonBanking)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))))
                .addContainerGap())
        );
        jPanelDetailViewLayout.setVerticalGroup(
            jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailViewLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLabelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonCard)
                    .addComponent(jRadioButtonBanking))
                .addGap(18, 18, 18)
                .addComponent(jPanelPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDetailViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))))
        );

        getContentPane().add(jPanelDetailView, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JPanel card = null;
        jPanelPayByBank.setName("Bank");
        jPanelPayByCreditCard.setName("Card");
        for (Component comp : jPanelPaymentType.getComponents()) {
            if (comp.isVisible() == true) {
                card = (JPanel) comp;
            }
        }
        String DisplayMessage;
        String paymentBy = "";
        String bankName = "";
        String cardno = "XXXX XXXX XXXX ";
        if (card.getName().equals("Bank")) {
            String[] compValue = jPanelPayByBank.getValueToString().split("[|]");
            paymentBy = compValue[1];
            bankName = compValue[0];
            DisplayMessage = String.format("Issued Bank: %s\n"
                    + "Bank Account ID: %s\n"
                    + "Total Bill Amount: %s\n",
                    bankName, paymentBy, String.format("RM %.2f", OrderList.get(0).getTotalAmount()));

        } else {
            String[] compValue = jPanelPayByCreditCard.getValueToString().split("[|]");
            paymentBy = compValue[1];
            bankName = compValue[0];
            cardno += compValue[2].substring(12, 16);

             DisplayMessage = String.format("Issued Bank: %s\n"
                    + "Cardholder Name: %s\n"
                    + "Card No.: %s\n"
                    + "Total Bill Amount: %s\n",
                    bankName, paymentBy, cardno, String.format("RM %.2f",OrderList.get(0).getTotalAmount()));
        }

        int option = JOptionPane.showConfirmDialog(null, DisplayMessage,"Confirm Order" , JOptionPane.YES_NO_OPTION);
        if(option == 0 ){
            OrderList.get(0).setPayStatus("Paid");
            JOptionPane.showMessageDialog(null,"Payment completed! You can view your scheduled order in 'View Scheduled Order","Payment Complete", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new CustomizeOrderMainMenu().setVisible(true); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButtonBankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBankingActionPerformed
        // TODO add your handling code here:
        jPanelPaymentType.removeAll();
        jPanelPaymentType.add(jPanelPayByBank);
        jPanelPaymentType.repaint();
        jPanelPaymentType.revalidate();
    }//GEN-LAST:event_jRadioButtonBankingActionPerformed

    private void jRadioButtonCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCardActionPerformed
        jPanelPaymentType.removeAll();
        jPanelPaymentType.add(jPanelPayByCreditCard);
        jPanelPaymentType.repaint();
        jPanelPaymentType.revalidate();
    }//GEN-LAST:event_jRadioButtonCardActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddCustomizeOrder().setVisible(true); 
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomizeOrderPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomizeOrderPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomizeOrderPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomizeOrderPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomizeOrderPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPaymentType;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelDetailView;
    private javax.swing.JPanel jPanelHeader;
    private View.JPanelPayByBank jPanelPayByBank;
    private View.JPanelPayByCreditCard jPanelPayByCreditCard;
    private javax.swing.JPanel jPanelPaymentType;
    private javax.swing.JRadioButton jRadioButtonBanking;
    private javax.swing.JRadioButton jRadioButtonCard;
    private javax.swing.JLabel jlLabelTotalAmount;
    private javax.swing.JLabel jlLoginName1;
    private javax.swing.JLabel jlMenuName1;
    // End of variables declaration//GEN-END:variables
}
