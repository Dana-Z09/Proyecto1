package interfacesGraficas;

import EDD.Grafo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Zambrano
 */
public class connectCity extends javax.swing.JFrame {
    public static Grafo mainGrafo= null;
    ImageIcon imageAnt = new ImageIcon("antie.png");
    /**
     * Creates new form connectCity
     */
    public connectCity(Grafo maingrafo) {
        initComponents();
        antPic.setIcon(imageAnt);
        antPic.setText("");
        this.mainGrafo=maingrafo;
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        for (int i = 0; i < mainGrafo.citiesQuantity(); i++) {
            cityA.addItem(String.valueOf(i+1));
            cityB.addItem(String.valueOf(i+1));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cityA = new javax.swing.JComboBox<>();
        cityB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        distance = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        addConection = new javax.swing.JButton();
        mainCity = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        antPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(997, 619));
        setMinimumSize(new java.awt.Dimension(997, 619));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 237, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DIDANTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, -1, 50));

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
        getContentPane().add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 35, 80, 40));

        jLabel6.setBackground(new java.awt.Color(238, 237, 236));
        jLabel6.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 237, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("-Ant Simulator");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 65, 200, 30));

        jPanel6.setBackground(new java.awt.Color(221, 228, 195));

        jLabel11.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 55));
        jLabel11.setText("Ciudad A");

        jLabel8.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 55));
        jLabel8.setText("Ciudad B");

        cityA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityAActionPerformed(evt);
            }
        });

        cityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityBActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Futura Lt BT", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 55));
        jLabel12.setText("Distancia entre ciudad A y ciudad B");

        distance.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        distance.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.1d, null, 1.0d));
        distance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Futura Bk BT", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 55));
        jLabel13.setText("Asignación de Conexiones");

        addConection.setBackground(new java.awt.Color(49, 114, 24));
        addConection.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        addConection.setForeground(new java.awt.Color(221, 228, 195));
        addConection.setText("Agregar Conexion");
        addConection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityA, 0, 163, Short.MAX_VALUE)
                            .addComponent(cityB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel12))
                .addGap(30, 30, 30))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(addConection, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cityA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cityB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(addConection)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 440, 450));

        mainCity.setFont(new java.awt.Font("Futura Bk BT", 3, 36)); // NOI18N
        mainCity.setText("Conexión de Ciudades");
        getContentPane().add(mainCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(97, 143, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        antPic.setText("jLabel2");
        jPanel1.add(antPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 490, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked

    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        editData editPage = new  editData(this.mainGrafo);
        editPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void cityAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityAActionPerformed

    private void cityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityBActionPerformed

    private void addConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConectionActionPerformed
        if (cityA.getItemCount()!=cityB.getItemCount()){
        }
        else{
            JOptionPane.showMessageDialog(null, "La ciudad A y la ciudad B no pueden ser la misma", "Error", 2);}
    }//GEN-LAST:event_addConectionActionPerformed

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
            java.util.logging.Logger.getLogger(connectCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(connectCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(connectCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(connectCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new connectCity(mainGrafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addConection;
    private javax.swing.JLabel antPic;
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> cityA;
    private javax.swing.JComboBox<String> cityB;
    private javax.swing.JSpinner distance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel mainCity;
    // End of variables declaration//GEN-END:variables
}