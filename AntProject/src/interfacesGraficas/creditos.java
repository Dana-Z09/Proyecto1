/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGraficas;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

/**
 *
 * @author Danna Star
 */
public class creditos extends javax.swing.JFrame {
    ImageIcon imageAnt = new ImageIcon("antwithgreenleaf.png");
    /**
     * Creates new form creditos
     */
    public creditos() {
        initComponents();
        antPic.setIcon(imageAnt);
        antPic.setText("");
        makeLabelStyle(mesi);
        this.setLocationRelativeTo(null);
    }

    
    public static JTextArea makeLabelStyle(JTextArea textArea) {
    if (textArea == null)
      return null;
    textArea.setEditable(false);
    textArea.setCursor(null);
    textArea.setOpaque(false);
    textArea.setFocusable(false);
    return textArea;
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
        greenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mesi = new javax.swing.JTextArea();
        antPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basicPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greenPanel.setBackground(new java.awt.Color(49, 114, 24));
        greenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 0, 37)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 228, 195));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creadores de DidAnts:");
        greenPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 450, 80));

        jLabel2.setFont(new java.awt.Font("Futura", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 23, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIDANTS");
        greenPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 80));

        jLabel5.setBackground(new java.awt.Color(238, 237, 236));
        jLabel5.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(65, 23, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("-Ant Simulator");
        greenPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 50));

        atrasButton.setBackground(new java.awt.Color(65, 23, 14));
        atrasButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        atrasButton.setForeground(new java.awt.Color(221, 228, 195));
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
        greenPanel.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 120, 50));

        mesi.setEditable(false);
        mesi.setBackground(new java.awt.Color(97, 143, 74));
        mesi.setColumns(20);
        mesi.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        mesi.setForeground(new java.awt.Color(221, 228, 195));
        mesi.setRows(5);
        mesi.setText("\n  \n\n\n  -Daniela Zambrano\n  C.I. 30956881 \n  d.zambrano@correo.unimet.edu.ve\n  \n  -Diego Méndez\n  C.I. 30830746 \n  d.mendez@correo.unimet.edu.ve\n  \n  -Alma Fuentes\n  C.I. \n  alma.fuenmayor@correo.unimet.edu.ve");
        mesi.setBorder(null);
        jScrollPane1.setViewportView(mesi);

        greenPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 500, 650));

        antPic.setText("ant");
        greenPanel.add(antPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 620));

        basicPanel.add(greenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        getContentPane().add(basicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        firstPage fPage = new  firstPage();
        fPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antPic;
    private javax.swing.JButton atrasButton;
    private javax.swing.JPanel basicPanel;
    private javax.swing.JPanel greenPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mesi;
    // End of variables declaration//GEN-END:variables
}
