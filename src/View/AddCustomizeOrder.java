
package View;

import Model.CustomOrder;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddCustomizeOrder extends javax.swing.JFrame {
    private Double deliveryPrice =0.0;
    public static ArrayList<CustomOrder> CustomOrder  = new ArrayList<>();
    private final ArrayList<String> HotPotPrice = new ArrayList<>();
    private final ArrayList<String> HomeTownPrice = new ArrayList<>();
    private final ArrayList<String> DiYiTaiPrice = new ArrayList<>();
    private final DefaultComboBoxModel DefaultModel = new DefaultComboBoxModel(new String[]{"SELECT"});
    private final DefaultComboBoxModel HotPotModel = new DefaultComboBoxModel(new String[]{"SELECT","Extreme Spicy PanMee", "TomYam PanMee", "HakkaPanMee"});
    private final DefaultComboBoxModel HomeTownModel = new DefaultComboBoxModel(new String[]{"SELECT","Chicken Rice", "Chop Rice", "Rendang Chicken Rice"});
    private final DefaultComboBoxModel DiyiTaiModel = new DefaultComboBoxModel(new String[]{"SELECT","Pork Mince Rice", "Pork Braised Rice", "Chicken-pop Rice"});
    /**
     * Creates new form AddCustomizeOrder
     */
    public AddCustomizeOrder() {
        HotPotPrice.add("");
        HotPotPrice.add("Food Name : Extreme Spicy PanMee\nDescription : Extreme Spicy Pan Mee with half boiled egg and signature sauce.\nPrice : RM 8.00");
        HotPotPrice.add("Food Name : TomYam PanMee\nDescription : TomYam Soup Pan Mee with half boiled egg and signature sauce.\nPrice : RM 7.50");
        HotPotPrice.add("Food Name : Hakka PanMee\nDescription : Traditional Pan Mee in Hakka style with half boiled egg and signature sauce.\nPrice : RM 7.00");
        HomeTownPrice.add("");
        HomeTownPrice.add("Food Name : Chicken Rice\nDescription : Traditional  Chicken Rice with egg in Hainan style.\nPrice : RM 5.50");
        HomeTownPrice.add("Food Name : Chop Rice\nDescription : Chicken Chop Rice with special maked sauce in Hainan style.\nPrice : RM 6.00");
        HomeTownPrice.add("Food Name :Rendang Chicken Rice\nDescription : Malay Style Rendang Chicken Rice with egg and sambal. Hainan\nPrice : RM 6.00");
        DiYiTaiPrice.add("");
        DiYiTaiPrice.add("Food Name : Pork Mince Rice\nDescription : Taiwanese Pork Mince Rice with spiced corned egg.\nPrice : RM 8.90");
        DiYiTaiPrice.add("Food Name : Pork Braised Rice\nDescription : Taiwanese Pork Braised Rice with spiced corned egg.\nPrice : RM 8.90");
        DiYiTaiPrice.add("Food Name : Chicken-pop Rice\nDescription : Taiwanese Fried Chicken Pop Rice with spiced corned egg.\nPrice : RM 9.90");
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

        jPanel1 = new javax.swing.JPanel();
        jlMenuName = new javax.swing.JLabel();
        jlLoginName = new javax.swing.JLabel();
        jlSystemDateTime1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlLoginName1 = new javax.swing.JLabel();
        jlLoginName2 = new javax.swing.JLabel();
        jlLoginName3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jlLoginName4 = new javax.swing.JLabel();
        jtfDateFrom = new javax.swing.JTextField();
        jlLoginName6 = new javax.swing.JLabel();
        jlLoginName7 = new javax.swing.JLabel();
        jlLoginName8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlLoginName11 = new javax.swing.JLabel();
        jlLoginName12 = new javax.swing.JLabel();
        jtfDaysOrdered = new javax.swing.JTextField();
        jlLoginName13 = new javax.swing.JLabel();
        jtfTotalAmount = new javax.swing.JTextField();
        jlDeliveryFee = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jlMenuName.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlMenuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenuName.setText("CUSTOM SCHEDULED ORDER");
        jlMenuName.setMaximumSize(new java.awt.Dimension(231, 29));
        jlMenuName.setMinimumSize(new java.awt.Dimension(231, 29));
        jlMenuName.setPreferredSize(new java.awt.Dimension(231, 29));

        jlLoginName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLoginName.setText("Soraka");

        jlSystemDateTime1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlSystemDateTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSystemDateTime1.setText("LOGO");
        jlSystemDateTime1.setMaximumSize(new java.awt.Dimension(100, 51));
        jlSystemDateTime1.setMinimumSize(new java.awt.Dimension(100, 51));
        jlSystemDateTime1.setPreferredSize(new java.awt.Dimension(100, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlSystemDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jlMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jlLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginName)
                    .addComponent(jlMenuName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jlSystemDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jlLoginName1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName1.setText("Select restaurant");

        jlLoginName2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName2.setText("Choose your food set ");

        jlLoginName3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName3.setText("Select your schedule");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "HalloHotpot", "DiYiTai", "HomeTown", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jlLoginName4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlLoginName4.setText("Start :");

        jtfDateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDateFromActionPerformed(evt);
            }
        });

        jlLoginName6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlLoginName6.setForeground(new java.awt.Color(255, 51, 51));
        jlLoginName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLoginName6.setText("Note : Your schedule start date must be at least 3 days after today.");

        jlLoginName7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName7.setText("Total Amount of schduled order");

        jlLoginName8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName8.setText("Total days ordered");

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Complete Order ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("Direct to payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlLoginName11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLoginName11.setText("OR");

        jlLoginName12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlLoginName12.setForeground(new java.awt.Color(255, 51, 51));
        jlLoginName12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLoginName12.setText("Enter date format in dd/MM/yyyy format");

        jtfDaysOrdered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDaysOrderedActionPerformed(evt);
            }
        });

        jlLoginName13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlLoginName13.setText("Day(s)");

        jtfTotalAmount.setEditable(false);
        jtfTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTotalAmountActionPerformed(evt);
            }
        });

        jlDeliveryFee.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlDeliveryFee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlLoginName1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlLoginName2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlLoginName3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlLoginName7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jlLoginName4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jlLoginName6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfDaysOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlLoginName13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlLoginName12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlDeliveryFee, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlLoginName8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlLoginName11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlLoginName1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlLoginName2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jlLoginName3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jlLoginName8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLoginName4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jlLoginName12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jlLoginName6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDaysOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlLoginName13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDeliveryFee, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTotalAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlLoginName7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLoginName11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String SelectedRestarurant = jComboBox1.getSelectedItem().toString();
        String SelectedFood = jComboBox2.getSelectedItem().toString();
        switch(SelectedRestarurant){
        case("HalloHotpot") : {
            for(int i = 1 ; i < HotPotModel.getSize() ; i++){
                if(HotPotModel.getElementAt(i).toString().equals(SelectedFood)){
                   jTextArea1.setText(HotPotPrice.get(i));
                }
            }
            break;
        }
        case("HomeTown"):{
            for(int i = 1 ; i < HomeTownModel.getSize() ; i++){
                if(HomeTownModel.getElementAt(i).toString().equals(SelectedFood)){
                   jTextArea1.setText(HomeTownPrice.get(i)); 
                }
            }
        }case("DiYiTai"):{
            for(int i = 1 ; i < DiyiTaiModel.getSize() ; i++){
                if(DiyiTaiModel.getElementAt(i).toString().equals(SelectedFood)){
                   jTextArea1.setText(DiYiTaiPrice.get(i));
                }
            }
        }
    }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date systemDate = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String orderDate = format.format(systemDate);
       
        
        try{
             CustomOrder.add( new CustomOrder("CO0001",
                                          orderDate,
                                          jComboBox2.getSelectedItem().toString(),
                                          jtfDateFrom.getText(),
                                          Integer.parseInt(jtfDaysOrdered.getText()),
                                          Double.parseDouble(jtfTotalAmount.getText().substring(3)),
                                          "Unpaid"
                                          ));
             JOptionPane.showMessageDialog(null,"Order create successfully in "+systemDate+", you can view your scheduled order in 'View Scheduled Order'");
             jComboBox1.setSelectedIndex(0);
             jComboBox1.setSelectedIndex(0);
             jTextArea1.setText("");
             jtfDateFrom.setText("");
             jtfDaysOrdered.setText("");
             jtfTotalAmount.setText("");
             jlDeliveryFee.setText("");
        }catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "Please complete all the field to complete the order.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Date systemDate = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String orderDate = format.format(systemDate);
       
        
        try{
             CustomOrder.add( new CustomOrder("CO0001",
                                          orderDate,
                                          jComboBox2.getSelectedItem().toString(),
                                          jtfDateFrom.getText(),
                                          Integer.parseInt(jtfDaysOrdered.getText()),
                                          Double.parseDouble(jtfTotalAmount.getText().substring(3)),
                                          "Unpaid"
                                          ));
             jComboBox1.setSelectedIndex(0);
             jComboBox1.setSelectedIndex(0);
             jTextArea1.setText("");
             jtfDateFrom.setText("");
             jtfDaysOrdered.setText("");
             jtfTotalAmount.setText("");
             jlDeliveryFee.setText("");
             this.setVisible(false);
             new CustomizeOrderPayment().setVisible(true);
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(rootPane, "Please complete all the field to complete the order.", "Error", JOptionPane.ERROR_MESSAGE);
        }
                
                
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        switch (jComboBox1.getSelectedItem().toString()) {
            case "HalloHotpot":
                jComboBox2.setModel(HotPotModel);
                break;
            case "HomeTown":
                jComboBox2.setModel(HomeTownModel);
                break;
            case "DiYiTai":
                jComboBox2.setModel(DiyiTaiModel);
                break;   
            default:
                jComboBox2.setModel(DefaultModel);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtfDateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDateFromActionPerformed
        // TODO add your handling code here:
        
        String dateFrom = jtfDateFrom.getText();
        
    }//GEN-LAST:event_jtfDateFromActionPerformed

    private void jtfDaysOrderedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDaysOrderedActionPerformed
        // TODO add your handling code here:
        int totalDay = Integer.parseInt(jtfDaysOrdered.getText());
        String[] str1 = jTextArea1.getText().split("RM");
        double price = Double.parseDouble(str1[1]);
        double deliveryPriceRate;
        String Rate;
        if(totalDay >= 10){
            deliveryPriceRate = 0.1;
            Rate = "(10%)";
        }else{
            deliveryPriceRate = 0.2;
            Rate = "(20%)";
        }
        String totalPrice = String.format("RM  %.2f", price*totalDay*deliveryPriceRate + (price*totalDay));
        deliveryPrice = Double.parseDouble(String.format("%.2f", price*totalDay*deliveryPriceRate));
        jtfTotalAmount.setText(totalPrice);
        jlDeliveryFee.setText("Included delivery fee"+Rate+" in total of RM "+deliveryPrice);
    }//GEN-LAST:event_jtfDaysOrderedActionPerformed

    private void jtfTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTotalAmountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CustomizeOrderMainMenu().setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomizeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomizeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomizeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomizeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AddCustomizeOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlDeliveryFee;
    private javax.swing.JLabel jlLoginName;
    private javax.swing.JLabel jlLoginName1;
    private javax.swing.JLabel jlLoginName11;
    private javax.swing.JLabel jlLoginName12;
    private javax.swing.JLabel jlLoginName13;
    private javax.swing.JLabel jlLoginName2;
    private javax.swing.JLabel jlLoginName3;
    private javax.swing.JLabel jlLoginName4;
    private javax.swing.JLabel jlLoginName6;
    private javax.swing.JLabel jlLoginName7;
    private javax.swing.JLabel jlLoginName8;
    private javax.swing.JLabel jlMenuName;
    private javax.swing.JLabel jlSystemDateTime1;
    private javax.swing.JTextField jtfDateFrom;
    private javax.swing.JTextField jtfDaysOrdered;
    private javax.swing.JTextField jtfTotalAmount;
    // End of variables declaration//GEN-END:variables
}