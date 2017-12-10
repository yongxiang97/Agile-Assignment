package fooddeliverysystem;

import javax.swing.JOptionPane;
//import adt.*;
import domain.domainMenu;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Menu extends javax.swing.JFrame {

    // public static ListInterface<domainMenu> MaintainMenu = new List<>();
    private String FoodName = "Cheese Burger|Cheese Pizza|Chicken burger";
    private String FoodPrice = "5.00|9.00|7.00";
    private String[] FoodNameArr = FoodName.split("[|]");
    private String[] FoodPriceArr = FoodPrice.split("[|]");
    private DefaultListModel dlmMenu=new DefaultListModel<>();

    public Menu() {
        initComponents();
        initValue();
    }

    private void initValue() {
        dlmMenu = (DefaultListModel) JListFoodMenu.getModel();
        for (int i = 0; i < FoodNameArr.length; i++) {
            dlmMenu.addElement(FoodNameArr[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jadd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfFoodName = new javax.swing.JTextField();
        jtfFoodPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListFoodMenu = new javax.swing.JList<>();
        JTFPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JUpdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(350, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Menu");

        Jadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jadd.setText("Add");
        Jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Food Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Food Price  : ");

        JListFoodMenu.setModel(dlmMenu);
        JListFoodMenu.setMaximumSize(new java.awt.Dimension(350, 400));
        JListFoodMenu.setMinimumSize(new java.awt.Dimension(300, 400));
        JListFoodMenu.setPreferredSize(new java.awt.Dimension(350, 400));
        JListFoodMenu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListFoodMenuValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JListFoodMenu);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Price(RM):");

        JUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JUpdate.setText("Update");
        JUpdate.setMaximumSize(new java.awt.Dimension(67, 31));
        JUpdate.setMinimumSize(new java.awt.Dimension(67, 31));
        JUpdate.setPreferredSize(new java.awt.Dimension(67, 31));
        JUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUpdateActionPerformed(evt);
            }
        });

        Bdelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bdelete.setText("Delete");
        Bdelete.setPreferredSize(new java.awt.Dimension(67, 31));
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addComponent(jtfFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(230, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddActionPerformed
        try {
            String jtffoodName = jtfFoodName.getText();
            double fdPrice = Double.parseDouble(jtfFoodPrice.getText());

            if (jtfFoodName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter new food name");
            } else {
                FoodName = FoodName.concat("|" + jtffoodName);
                FoodNameArr = FoodName.split("[|]");
                FoodPrice = FoodPrice.concat(String.format("|%.2f", fdPrice));
                FoodPriceArr = FoodPrice.split("[|]");
                //refresh the list
                JListFoodMenu.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = FoodName.split("[|]");

                    public int getSize() {
                        return strings.length;
                    }

                    public String getElementAt(int i) {
                        return strings[i];
                    }
                });
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JaddActionPerformed

    private void JListFoodMenuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListFoodMenuValueChanged
        // TODO add your handling code here:
        String food = JListFoodMenu.getSelectedValue();
        for (int i = 0; i < FoodNameArr.length; i++) {
            if (FoodNameArr[i].equalsIgnoreCase(food)) {
                JTFPrice.setText(FoodPriceArr[i]);
            }
        }
        //JTFPrice.setText(JListFoodMenu.getSelectedValue());
    }//GEN-LAST:event_JListFoodMenuValueChanged

    private void JUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUpdateActionPerformed
        // TODO add your handling code here:
        //domainMenu dm=new domainMenu(jtfFoodName.getText(),Double.parseDouble(jtfFoodPrice.getText()));
        //MaintainMenu.replace(JListFoodMenu.getSelectedIndex(),dm);
        String food = JListFoodMenu.getSelectedValue();
        boolean found = false;
        try {
            double newPrice = Double.parseDouble(JTFPrice.getText());
            for (int i = 0; i < FoodNameArr.length && !found; i++) {
                if (FoodNameArr[i].equalsIgnoreCase(food)) {
                    FoodPriceArr[i] = String.format("%.2f", newPrice);
                    FoodPrice = "";
                    found = true;
                }
            }
            for (int i = 0; i < FoodPriceArr.length; i++) {
                FoodPrice = FoodPrice.concat("|" + FoodPriceArr[i]);
            }
            FoodPrice = FoodPrice.substring(1);
            JOptionPane.showMessageDialog(null, "Update successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JUpdateActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // TODO add your handling code here:
        
        int food = JListFoodMenu.getSelectedIndex();
        dlmMenu.removeElement(food);
        JListFoodMenu.setModel(dlmMenu);

        JOptionPane.showMessageDialog(null, "Delete successful", "Success", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_BdeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JList<String> JListFoodMenu;
    private javax.swing.JTextField JTFPrice;
    private javax.swing.JButton JUpdate;
    private javax.swing.JButton Jadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfFoodName;
    private javax.swing.JTextField jtfFoodPrice;
    // End of variables declaration//GEN-END:variables
}
