/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Movie;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author 15877
 */
public class MovieView extends JPanel {
    private ArrayList<Movie> movieList;
    private JLabel[] moviesDisplayed;
    private JLabel[] movieTitles;
    private JLabel backButton;
    private JScrollPane imageScroller;
    private JLabel title;
    private JPanel imageContainer;
    private int rows;
    private GroupLayout layout;

    public MovieView(ArrayList<Movie> movies) {
        movieList = movies;
        rows = movieList.size() / 3;
        if (movieList.size() % 3 == 1 || movieList.size() % 3 == 2)
            rows++;

        moviesDisplayed = new JLabel[movieList.size()];
        movieTitles = new JLabel[movieList.size()];

        initComponents();

        // for (int i = 0; i < movieList.size(); i++) {
        // image_scaller(movieList.get(i).getPoster(), moviesDisplayed[i], 200, 300);
        // }

    }

    // public void image_scaller(ImageIcon icon, JLabel to, int width, int height) {
    // // ImageIcon icon = new ImageIcon(imageLoc);
    // Image img = icon.getImage();
    // Image imgScalled = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    // icon = new ImageIcon(imgScalled);
    // to.setIcon(icon);
    // }

    private void initComponents() {
        // initialize components
        title = new JLabel();
        backButton = new JLabel();
        imageContainer = new JPanel();
        imageScroller = new JScrollPane();
        for (int i = 0; i < movieList.size(); i++) {
            moviesDisplayed[i] = new JLabel();
            movieTitles[i] = new JLabel();
        }

        // setup components
        // main JPanel
        setBackground(new java.awt.Color(255, 153, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 480));
        // backButton
        backButton.setToolTipText("Go back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setMaximumSize(new java.awt.Dimension(30, 30));
        backButton.setMinimumSize(new java.awt.Dimension(30, 30));
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));

        // scroll pane
        imageScroller.setBackground(new java.awt.Color(255, 153, 204));
        imageScroller.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imageScroller.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        imageScroller.getVerticalScrollBar().setUnitIncrement(16);

        // inner jpanel
        imageContainer.setBackground(new java.awt.Color(255, 153, 204));
        imageContainer.setPreferredSize(new java.awt.Dimension(790, 278 + (rows * 300)));

        // title
        title.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Pick the Movie You Want to View");

        for (int i = 0; i < movieList.size(); i++) {
            // movie images
            moviesDisplayed[i]
                    .setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            moviesDisplayed[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            moviesDisplayed[i].setPreferredSize(new java.awt.Dimension(200, 300));
            // moviesDisplayed[i].setIcon(movieList.get(i).getPoster());

            // movie names
            movieTitles[i].setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
            movieTitles[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            movieTitles[i].setPreferredSize(new Dimension(200, 18));
            movieTitles[i].setText(movieList.get(i).getTitle());
        }

        // imageContainer.add(moviesDisplayed[0]);
        // imageContainer.setAlignmentX(125);
        // moviesDisplayed[0].setLocation(30, 50);
        //
        // imageContainer.add(moviesDisplayed[1]);
        // moviesDisplayed[1].setLocation(100, 50);

        int i = 0;

        while (i < movieList.size()) {
            imageContainer.add(moviesDisplayed[i]);
            i++;

        }

        // add components to the main JPanel
        imageScroller.setViewportView(imageContainer);
        layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(imageScroller,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(title))
                        .addGap(18, 18, 18)
                        .addComponent(imageScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)));
        // image_scaller("C:\\Users\\15877\\Desktop\\ENSF
        // 480\\FinalProject\\finalproject\\src\\Images\\344330-200.png",
        // backButton,30,30);

    }

}
