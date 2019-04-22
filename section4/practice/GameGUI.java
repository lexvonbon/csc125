/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.awt.EventQueue;
/**
 *
 * @author lexvonbon
 */
public class GameGUI extends JFrame {

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        prevQuestionButton = new javax.swing.JButton();
        nextQuestionButton = new javax.swing.JButton();
        pagePane = new javax.swing.JLayeredPane();
        pageNumberField = new javax.swing.JTextField();
        pageTotalLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quizzer");

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setForeground(new java.awt.Color(21, 21, 21));
        jPanel1.setToolTipText("");
        jPanel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jPanel1AncestorResized(evt);
            }
        });

        prevQuestionButton.setText("Previous");
        prevQuestionButton.setMaximumSize(new java.awt.Dimension(128, 48));
        prevQuestionButton.setMinimumSize(new java.awt.Dimension(128, 48));
        prevQuestionButton.setPreferredSize(new java.awt.Dimension(128, 48));

        nextQuestionButton.setText("Next");
        nextQuestionButton.setAlignmentY(0.0F);
        nextQuestionButton.setMaximumSize(new java.awt.Dimension(128, 48));
        nextQuestionButton.setMinimumSize(new java.awt.Dimension(128, 48));
        nextQuestionButton.setPreferredSize(new java.awt.Dimension(128, 48));
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        pagePane.setMaximumSize(new java.awt.Dimension(128, 48));
        pagePane.setMinimumSize(new java.awt.Dimension(128, 48));

        pageNumberField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pageNumberField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pageNumberField.setText("1");
        pageNumberField.setToolTipText("");
        pageNumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pageNumberField.setMaximumSize(new java.awt.Dimension(15, 24));
        pageNumberField.setMinimumSize(new java.awt.Dimension(15, 24));
        pageNumberField.setName("pageNumberField"); // NOI18N
        pageNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageNumberFieldActionPerformed(evt);
            }
        });

        pageTotalLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pageTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pageTotalLabel.setText("/ 164");

        pagePane.setLayer(pageNumberField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pagePane.setLayer(pageTotalLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pagePaneLayout = new javax.swing.GroupLayout(pagePane);
        pagePane.setLayout(pagePaneLayout);
        pagePaneLayout.setHorizontalGroup(
            pagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pageNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pageTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pagePaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pageNumberField, pageTotalLabel});

        pagePaneLayout.setVerticalGroup(
            pagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePaneLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pageTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(prevQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pagePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(nextQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        navPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nextQuestionButton, pagePane, prevQuestionButton});

        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prevQuestionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextQuestionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        navPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nextQuestionButton, prevQuestionButton});

        nextQuestionButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void pageNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageNumberFieldActionPerformed

    private void jPanel1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1AncestorResized
        // TODO add your handling code here:
        jPanel1.setSize(this.getSize());
    }//GEN-LAST:event_jPanel1AncestorResized

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JTextField pageNumberField;
    private javax.swing.JLayeredPane pagePane;
    private javax.swing.JLabel pageTotalLabel;
    private javax.swing.JButton prevQuestionButton;
    // End of variables declaration//GEN-END:variables
}