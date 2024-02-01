/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.layerd.assignment.view;

/**
 *
 * @author Harsha
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
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

        jLabel3 = new javax.swing.JLabel();
        manageItemButton = new javax.swing.JButton();
        manageCustomerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageOrderButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(932, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/layerd/assignment/view/icons8-supermarket-64.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 80));

        manageItemButton.setBackground(new java.awt.Color(255, 255, 51));
        manageItemButton.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        manageItemButton.setForeground(new java.awt.Color(0, 0, 204));
        manageItemButton.setText("Manage Item");
        manageItemButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(manageItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 60));

        manageCustomerButton.setBackground(new java.awt.Color(255, 255, 51));
        manageCustomerButton.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        manageCustomerButton.setForeground(new java.awt.Color(0, 0, 204));
        manageCustomerButton.setText("Manage Customer");
        manageCustomerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(manageCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 60));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Family Super");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 80));

        manageOrderButton.setBackground(new java.awt.Color(255, 255, 51));
        manageOrderButton.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        manageOrderButton.setForeground(new java.awt.Color(0, 0, 204));
        manageOrderButton.setText("Manage Order");
        manageOrderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(manageOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 160, 60));

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 0, 750, 540));

        jLabel2.setBackground(new java.awt.Color(20, 123, 245));
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/layerd/assignment/view/etttt.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 190, 560));

        setSize(new java.awt.Dimension(948, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
        loadCustomerPanel();
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

    private void manageItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemButtonActionPerformed
        loadItemPanel();
    }//GEN-LAST:event_manageItemButtonActionPerformed

    private void manageOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderButtonActionPerformed
        loadOrderPanel();
    }//GEN-LAST:event_manageOrderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton manageItemButton;
    private javax.swing.JButton manageOrderButton;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodyPanel.removeAll();
        CustomerPanel customerPanel = new CustomerPanel();
        customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadItemPanel() {
        bodyPanel.removeAll();
        ItemPanel itemPanel = new ItemPanel();
        itemPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(itemPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadOrderPanel() {
        bodyPanel.removeAll();
        OrderPanel orderPanel = new OrderPanel();
        orderPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(orderPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }
}
