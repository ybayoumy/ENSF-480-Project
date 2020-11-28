/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 15877
 */
public class RegisterView extends javax.swing.JPanel {

    /**
     * Creates new form RegisterView
     */
    public RegisterView() {
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

        Title = new javax.swing.JLabel();
        emailTitle = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordTitle = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 204));
        setBorder(new javax.swing.border.MatteBorder(null));

        Title.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Title.setText("Become a Registered User!");

        emailTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        emailTitle.setText("Email Address:");

        emailField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        emailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passwordTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passwordTitle.setText("Password:");

        passwordField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passwordField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));

        registerButton.setBackground(new java.awt.Color(255, 204, 204));
        registerButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.setToolTipText("Register!");
        registerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CancelButton.setBackground(new java.awt.Color(255, 204, 204));
        CancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.setToolTipText("Go back to main screen");
        CancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup().addContainerGap(308, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 232,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 308, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(emailTitle).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(passwordTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(79, Short.MAX_VALUE)));
    }// </editor-fold>

    public void addCancelListener(java.awt.event.ActionListener listener) {
        CancelButton.addActionListener(listener);
    }

    public void addRegisterListener(java.awt.event.ActionListener listener) {
        registerButton.addActionListener(listener);
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getPass() {
        return new String(passwordField.getPassword());
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailTitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JButton registerButton;
    // End of variables declaration
}