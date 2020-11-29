/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import model.Seat;

/**
 *
 * @author 15877
 */
public class PurchaseTicketView extends javax.swing.JPanel {

    private Seat theSeat;
    private boolean isRegistered;

    /**
     * Creates new form PurchaseTicketView
     */
    public PurchaseTicketView(Seat s, boolean isRegistered) {
        theSeat = s;
        this.isRegistered = isRegistered;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tilte = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberField = new javax.swing.JTextField();
        expirationLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cvvLabel = new javax.swing.JLabel();
        cvvField = new javax.swing.JTextField();
        couponLabel = new javax.swing.JLabel();
        couponField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 204));

        tilte.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        tilte.setText("Complete Your Purchase Below");

        informationLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        informationLabel.setText("<html>\ntest<br />\ntest test\n\n\n</html>");
        informationLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cardNumberLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cardNumberLabel.setText("Card Number");

        cardNumberField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        expirationLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        expirationLabel.setText("Expiration Date");

        monthComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthComboBox.setPreferredSize(new java.awt.Dimension(51, 30));

        yearComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nameLabel.setText("Cardholder Name");

        nameField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        cvvLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cvvLabel.setText("CVV");

        cvvField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        couponLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        couponLabel.setText("Redeem Coupon (optional)");

        couponField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        emailField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        purchaseButton.setBackground(new java.awt.Color(255, 204, 204));
        purchaseButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        purchaseButton.setText("Confirm Purchase");
        purchaseButton.setToolTipText("Finish Transaction");
        purchaseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        purchaseButton.setSelected(true);

        cancelButton.setBackground(new java.awt.Color(255, 204, 204));
        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel Order and go back");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelButton.setSelected(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(informationLabel)
                            .addComponent(tilte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cvvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cvvField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(136, 136, 136))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardNumberLabel)
                                    .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expirationLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(128, 128, 128)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(couponField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couponLabel)
                            .addComponent(emailLabel)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tilte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardNumberLabel)
                            .addComponent(expirationLabel)
                            .addComponent(couponLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox)
                            .addComponent(couponField)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(cvvLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField couponField;
    private javax.swing.JLabel couponLabel;
    private javax.swing.JTextField cvvField;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel expirationLabel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel tilte;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration                   
    
    public void addCancelButtonListener(ActionListener e){
        cancelButton.addActionListener(e);
    }
    
    public void addPurchaseButtonListener(ActionListener e){
        purchaseButton.addActionListener(e);
    }
    
    public String getCardNumber(){
        return cardNumberField.getText();
    }
    
    public String getCvvNumber(){
        return cvvField.getText();
    }    
    
    public String getEmail(){
        return emailField.getText();
    }
    
    public String getName(){
        return nameField.getText();
    }
    
    public String getCoupon(){
        return couponField.getText();
    }
    
    public String getYear(){
        return yearComboBox.getSelectedItem().toString();
    }
    
    public String getMonth(){
        return monthComboBox.getSelectedItem().toString();
    }

}
