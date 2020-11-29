/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author 15877
 */
public class MainAppView extends javax.swing.JPanel {

    /**
     * Creates new form ViewController
     */
    public MainAppView() {
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
        moviesButton = new javax.swing.JButton();
        cancelTicketButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 204));
        setBorder(new javax.swing.border.MatteBorder(null));
        setToolTipText("Welcome!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        setName("Movie Booking App"); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 480));

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Movie Ticket Purchasing App");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        moviesButton.setBackground(new java.awt.Color(255, 204, 204));
        moviesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        moviesButton.setText("Browse Movies");
        moviesButton.setToolTipText("Browse the Movie Catalogue");
        moviesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moviesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moviesButton.setSelected(true);

        cancelTicketButton.setBackground(new java.awt.Color(255, 204, 204));
        cancelTicketButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cancelTicketButton.setText("Cancel Ticket");
        cancelTicketButton.setToolTipText("Cancel a Ticket you purchased");
        cancelTicketButton
                .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exitButton.setBackground(new java.awt.Color(255, 204, 204));
        exitButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addGap(209, 209, 209)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 360,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cancelTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(moviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(moviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(cancelTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)));

        cancelTicketButton.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public void addCancelTicketListener(java.awt.event.ActionListener listener) {
        cancelTicketButton.addActionListener(listener);
    }

    public void addMoviesListener(java.awt.event.ActionListener listener) {
        moviesButton.addActionListener(listener);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelTicketButton;
    private javax.swing.JLabel Title;
    private javax.swing.JButton moviesButton;
    private javax.swing.JButton exitButton;
    // End of variables declaration

}