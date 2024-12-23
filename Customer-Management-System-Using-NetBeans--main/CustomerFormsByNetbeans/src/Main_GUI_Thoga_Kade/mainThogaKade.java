/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_GUI_Thoga_Kade;

import Customer.Customer;
import GUI.AddCustomerForm;
import Item.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import thogakadeController.thogakadeController;

/**
 *
 * @author hp
 */
public class mainThogaKade extends javax.swing.JFrame {

    /**
     * Creates new form mainThogaKade
     */
    public mainThogaKade() throws ClassNotFoundException, SQLException {
        initComponents();
        
        String todayDate=thogakadeController.showDate();
        dateTextField.setText(todayDate);
        dateTextField.setEditable(false);
        
        orderIdGenarated();
        itemIdBox();
        customerComboBox();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerComboBox = new javax.swing.JComboBox<>();
        addCustomerFormButton = new javax.swing.JButton();
        orderIdTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        itemComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        itemDescriptionTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        itemUnitPriceTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        qtyOnHandTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        qtyTextField = new javax.swing.JTextField();
        addOrderButton = new javax.swing.JButton();
        removeOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        totalTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Place Order Form");

        jLabel2.setText("Order ID : ");

        jLabel3.setText("Customer ID : ");

        customerComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customerComboBoxItemStateChanged(evt);
            }
        });

        addCustomerFormButton.setText("New");
        addCustomerFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerFormButtonActionPerformed(evt);
            }
        });

        orderIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Order Date :");

        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer Name :");

        customerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Code :");

        jLabel7.setText("Description :");

        jLabel8.setText("Unit Price");

        jLabel9.setText("Qty On Hand");

        jLabel10.setText("Qty");

        addOrderButton.setText("Add");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        removeOrderButton.setText("Remove");
        removeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrderButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Description", "Qty", "Unit Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setText("Total : ");

        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addCustomerFormButton))
                                    .addComponent(orderIdTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dateTextField)
                                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(336, 336, 336)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(itemDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(itemUnitPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(qtyOnHandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeOrderButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerFormButton)
                    .addComponent(jLabel5)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemUnitPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyOnHandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrderButton)
                    .addComponent(removeOrderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(placeOrderButton)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerFormButtonActionPerformed
               try {
        AddCustomerForm addCustomerForm = new AddCustomerForm();
        addCustomerForm.setVisible(true);
    } catch (SQLException | ClassNotFoundException ex) {
        
        System.out.println("Error opening Add Customer Form: " + ex.getMessage());
                   
    }
    }//GEN-LAST:event_addCustomerFormButtonActionPerformed

    private void orderIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextFieldActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void customerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTextFieldActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void removeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeOrderButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void customerComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerComboBoxItemStateChanged
        String selecCusId = customerComboBox.getSelectedItem().toString();
        try {
            String customerName = thogakadeController.getCustomerName(selecCusId);
            customerNameTextField.setText(customerName);

        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_customerComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerFormButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JComboBox<String> customerComboBox;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JComboBox<String> itemComboBox;
    private javax.swing.JTextField itemDescriptionTextField;
    private javax.swing.JTextField itemUnitPriceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField orderIdTextField;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField qtyOnHandTextField;
    private javax.swing.JTextField qtyTextField;
    private javax.swing.JButton removeOrderButton;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables

  private void orderIdGenarated() {
      orderIdTextField.setEditable(false);
    try {
        String generateOrderId = thogakadeController.orderIdGenerate();
        orderIdTextField.setText(generateOrderId);
    } catch (ClassNotFoundException ex) {
        System.out.println("Class Not Found Exception: " + ex.getMessage());
    } catch (SQLException ex) {
        System.out.println("SQL Exception: " + ex.getMessage());
    
    }
 }
  
   private void customerComboBox() {
       try {
            ArrayList<Customer> customerId = thogakadeController.getCustomerIds();
            for (Customer customer : customerId) {
                customerComboBox.addItem(customer.getId());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not FOunt Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    } 
   
   private void itemIdBox() {
    try {
        ArrayList<Item> itemCode = thogakadeController.getItemCode();
        if (itemCode != null && !itemCode.isEmpty()) {
            for (Item item : itemCode) {
                itemComboBox.addItem(item.getCode());
            }
        } else {
            System.out.println("No items found or itemCode is null.");
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("Class Not Found Exception: " + ex.getMessage());
    } catch (SQLException ex) {
        System.out.println("SQL Exception: " + ex.getMessage());
    }
   
}
}
