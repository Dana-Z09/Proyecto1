
package interfacesGraficas;

import static Funciones.funcionesInterfaces.makeLabelStyle;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniela Zambrano
 */
public class instructions extends javax.swing.JFrame {
    ImageIcon imageAnt = new ImageIcon("antwithgreenleaf.png");
    boolean seve;
    
    /**
     * Creates new form creditos
     */
    public instructions() {
        this.seve = true;
        initComponents();
        antPic.setIcon(imageAnt);
        antPic.setText("");
        makeLabelStyle(nombres);
        this.setLocationRelativeTo(null);
        text2.setVisible(false);
        
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
        moveTextButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        antPic = new javax.swing.JLabel();
        text2 = new javax.swing.JScrollPane();
        nombres = new javax.swing.JTextArea();
        text1 = new javax.swing.JScrollPane();
        nombres1 = new javax.swing.JTextArea();

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
        jLabel1.setText("Instrucciones DidAnts:");
        greenPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 450, 80));

        jLabel2.setFont(new java.awt.Font("Futura", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 23, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIDANTS");
        greenPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 80));

        jLabel5.setBackground(new java.awt.Color(238, 237, 236));
        jLabel5.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(65, 23, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("-Ant Simulator");
        greenPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 50));

        moveTextButton.setBackground(new java.awt.Color(221, 228, 195));
        moveTextButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        moveTextButton.setForeground(new java.awt.Color(51, 46, 45));
        moveTextButton.setText("Siguiente");
        moveTextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moveTextButtonMouseClicked(evt);
            }
        });
        moveTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTextButtonActionPerformed(evt);
            }
        });
        greenPanel.add(moveTextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, 120, 50));

        atrasButton.setBackground(new java.awt.Color(221, 228, 195));
        atrasButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        atrasButton.setForeground(new java.awt.Color(51, 46, 45));
        atrasButton.setText("Menú");
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

        antPic.setText("ant");
        greenPanel.add(antPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 620));

        nombres.setEditable(false);
        nombres.setBackground(new java.awt.Color(97, 143, 74));
        nombres.setColumns(20);
        nombres.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        nombres.setForeground(new java.awt.Color(221, 228, 195));
        nombres.setRows(5);
        nombres.setText("\n\n\n\n   Después de cargar el hormiguero y crear el\n   grafo exitosamente podrá ir a la siguiente \n   página, donde tendrá que introducir los \n   valores iniciales de la simulación para que \n   pueda comenzar. La mayoría de valores \n   están colocados a conveniencia de la \n   simulación; sin embargo, son editables para\n   la nedesidad y gusto del usuario.\n\n     Gracias por usar DidAnts - Ant Simulator");
        nombres.setBorder(null);
        text2.setViewportView(nombres);

        greenPanel.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 520, 660));

        nombres1.setEditable(false);
        nombres1.setBackground(new java.awt.Color(97, 143, 74));
        nombres1.setColumns(20);
        nombres1.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        nombres1.setForeground(new java.awt.Color(221, 228, 195));
        nombres1.setRows(5);
        nombres1.setText("\n\n\n\n    Este es un programa que recrea un Sistema \n    Hormiga que tiene como objetivo resolver \n    el problema del viajero que consiste en \n   encontrar el camino hamiltoniano más \n   corto en un grafo completo.\n\n    Para comenzar el programa es necesario\n    seleccionar un archivo TXT con la \n    información del hormiguero que desea\n    simular, donde indica las ciudades y las \n    aristas que tiene el grafo. \n\n    Luego podra editarlo y guardar el grafo \n    editado.");
        nombres1.setBorder(null);
        text1.setViewportView(nombres1);

        greenPanel.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 520, 650));

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

    private void moveTextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveTextButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_moveTextButtonMouseClicked

    private void moveTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTextButtonActionPerformed
        
        if (this.seve){
            moveTextButton.setText("atrás");
            text2.setVisible(true);
            text1.setVisible(false);
            this.seve=false;
        }else{
        moveTextButton.setText("siguiente");
        text1.setVisible(true);
        text2.setVisible(false);
        this.seve=true;
        }
    }//GEN-LAST:event_moveTextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructions().setVisible(true);
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
    private javax.swing.JButton moveTextButton;
    private javax.swing.JTextArea nombres;
    private javax.swing.JTextArea nombres1;
    private javax.swing.JScrollPane text1;
    private javax.swing.JScrollPane text2;
    // End of variables declaration//GEN-END:variables
}