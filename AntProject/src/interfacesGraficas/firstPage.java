package interfacesGraficas;
import EDD.Grafo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Zambrano
 */
public class firstPage extends javax.swing.JFrame {

    ImageIcon imageAnt = new ImageIcon("antwithgreenleaf.png");
    public static Grafo mainGrafo;
    
    
    /**
     * Creates new form firstPage
     */
    public firstPage() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        antPic.setIcon(imageAnt);
        antPic.setText("");
    }

    public Grafo getMainGrafo() {
        return mainGrafo;
    }

    public void setMainGrafo(Grafo mainGrafo) {
        this.mainGrafo = mainGrafo;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        greenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        creditosButton = new javax.swing.JButton();
        exitButtonInicio = new javax.swing.JButton();
        uploadAnthillButton = new javax.swing.JButton();
        instructionButton = new javax.swing.JButton();
        antPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basePanel.setMinimumSize(new java.awt.Dimension(996, 617));
        basePanel.setName(""); // NOI18N
        basePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greenPanel.setBackground(new java.awt.Color(49, 114, 24));
        greenPanel.setMinimumSize(new java.awt.Dimension(610, 550));
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

        jLabel6.setBackground(new java.awt.Color(238, 237, 236));
        jLabel6.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 237, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Bienvenido al Mejor Simulador de ");
        greenPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 570, 50));

        jLabel3.setBackground(new java.awt.Color(238, 237, 236));
        jLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 237, 236));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Metropolitana");
        greenPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, 50));

        jLabel7.setBackground(new java.awt.Color(238, 237, 236));
        jLabel7.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 237, 236));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Hormigas de la Universidad");
        greenPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 50));

        creditosButton.setBackground(new java.awt.Color(221, 228, 195));
        creditosButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        creditosButton.setForeground(new java.awt.Color(51, 46, 45));
        creditosButton.setText("Créditos");
        creditosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosButtonActionPerformed(evt);
            }
        });
        greenPanel.add(creditosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 190, 50));

        exitButtonInicio.setBackground(new java.awt.Color(221, 228, 195));
        exitButtonInicio.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        exitButtonInicio.setForeground(new java.awt.Color(51, 46, 45));
        exitButtonInicio.setText("Salir");
        exitButtonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonInicioMouseClicked(evt);
            }
        });
        exitButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonInicioActionPerformed(evt);
            }
        });
        greenPanel.add(exitButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 190, 50));

        uploadAnthillButton.setBackground(new java.awt.Color(221, 228, 195));
        uploadAnthillButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        uploadAnthillButton.setForeground(new java.awt.Color(51, 46, 45));
        uploadAnthillButton.setText("Cargar Hormiguero");
        uploadAnthillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadAnthillButtonMouseClicked(evt);
            }
        });
        uploadAnthillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadAnthillButtonActionPerformed(evt);
            }
        });
        greenPanel.add(uploadAnthillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 50));

        instructionButton.setBackground(new java.awt.Color(221, 228, 195));
        instructionButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        instructionButton.setForeground(new java.awt.Color(51, 46, 45));
        instructionButton.setText("Introducción");
        instructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButtonActionPerformed(evt);
            }
        });
        greenPanel.add(instructionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 190, 50));

        basePanel.add(greenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 620));

        antPic.setText("ant");
        basePanel.add(antPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 570, 620));

        getContentPane().add(basePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosButtonActionPerformed
        creditos Creditos = new  creditos();
        Creditos.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_creditosButtonActionPerformed

    private void exitButtonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonInicioMouseClicked

    }//GEN-LAST:event_exitButtonInicioMouseClicked

    private void exitButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonInicioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonInicioActionPerformed

    private void uploadAnthillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadAnthillButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadAnthillButtonMouseClicked

    private void uploadAnthillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadAnthillButtonActionPerformed
        uploadData uPage = new  uploadData();
        uPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_uploadAnthillButtonActionPerformed

    private void instructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionButtonActionPerformed
        instructions instruction = new  instructions();
        instruction.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_instructionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antPic;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton creditosButton;
    private javax.swing.JButton exitButtonInicio;
    private javax.swing.JPanel greenPanel;
    private javax.swing.JButton instructionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton uploadAnthillButton;
    // End of variables declaration//GEN-END:variables

    
    
}
