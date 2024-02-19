package interfacesGraficas;

import javax.swing.ImageIcon;

/**
 *
 * @author Daniela Zambrano
 */
public class menu extends javax.swing.JFrame {
    
    ImageIcon imageAnt = new ImageIcon("antwithgreenleaf.png");
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        antPic.setIcon(imageAnt);
        antPic.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basicPanel = new javax.swing.JPanel();
        antPic = new javax.swing.JLabel();
        greenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        createGrafo = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        exitButtonInicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basicPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        antPic.setText("ant");
        basicPanel.add(antPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 570, 620));

        greenPanel.setBackground(new java.awt.Color(49, 114, 24));
        greenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 237, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIDANTS");
        greenPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 80));

        jLabel5.setBackground(new java.awt.Color(238, 237, 236));
        jLabel5.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 237, 236));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("-Ant Simulator");
        greenPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 300, 50));

        startButton.setBackground(new java.awt.Color(221, 228, 195));
        startButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(51, 46, 45));
        startButton.setText("Comenzar Simulación");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        greenPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 50));

        createGrafo.setBackground(new java.awt.Color(221, 228, 195));
        createGrafo.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        createGrafo.setForeground(new java.awt.Color(51, 46, 45));
        createGrafo.setText("Crear Hormiguero");
        createGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGrafoActionPerformed(evt);
            }
        });
        greenPanel.add(createGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 50));

        atrasButton.setBackground(new java.awt.Color(221, 228, 195));
        atrasButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        atrasButton.setForeground(new java.awt.Color(51, 46, 45));
        atrasButton.setText("Atrás");
        atrasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasButtonMouseClicked(evt);
            }
        });
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });
        greenPanel.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 190, 50));

        exitButtonInicio1.setBackground(new java.awt.Color(221, 228, 195));
        exitButtonInicio1.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        exitButtonInicio1.setForeground(new java.awt.Color(51, 46, 45));
        exitButtonInicio1.setText("Cargar Hormiguero");
        exitButtonInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonInicio1MouseClicked(evt);
            }
        });
        exitButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonInicio1ActionPerformed(evt);
            }
        });
        greenPanel.add(exitButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 190, 50));

        basicPanel.add(greenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 620));

        getContentPane().add(basicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        valoresIniciales valorI = new  valoresIniciales();
        valorI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void createGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGrafoActionPerformed
        newGrafo newGrafoPage = new newGrafo();
        newGrafoPage.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_createGrafoActionPerformed

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked

    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        firstPage fPage = new  firstPage();
        fPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void exitButtonInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonInicio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonInicio1MouseClicked

    private void exitButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonInicio1ActionPerformed
        uploadData uPage = new  uploadData();
        uPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antPic;
    private javax.swing.JButton atrasButton;
    private javax.swing.JPanel basicPanel;
    private javax.swing.JButton createGrafo;
    private javax.swing.JButton exitButtonInicio1;
    private javax.swing.JPanel greenPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
