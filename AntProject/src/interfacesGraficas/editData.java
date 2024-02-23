package interfacesGraficas;

import EDD.Grafo;

/**
 *
 * @author Daniela Zambrano
 */
public class editData extends javax.swing.JFrame {
    private static Grafo mainGrafo= null;
    /**
     * Creates new form editData
     */
    public editData(Grafo maingrafo) {
        initComponents();
        mainGrafo=maingrafo;
        this.setLocationRelativeTo(null);
        //showTextArea.setText(mainGrafo.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        addCity = new javax.swing.JButton();
        numCitiesLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteCity = new javax.swing.JButton();
        addConection = new javax.swing.JButton();
        deleteOptionCitys = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        updateTXTButton = new javax.swing.JButton();
        newGrafoButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        mainCity = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 143, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 237, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DIDANTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, -1, 50));

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
        jPanel1.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 35, 80, 40));

        jPanel4.setBackground(new java.awt.Color(221, 228, 195));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Futura Bk BT", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 55));
        jLabel18.setText("Ciudades");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        addCity.setBackground(new java.awt.Color(49, 114, 24));
        addCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        addCity.setForeground(new java.awt.Color(221, 228, 195));
        addCity.setText("Agregar Nueva Ciudad");
        addCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityActionPerformed(evt);
            }
        });
        jPanel4.add(addCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, -1));

        numCitiesLabel.setFont(new java.awt.Font("Futura Lt BT", 3, 36)); // NOI18N
        numCitiesLabel.setForeground(new java.awt.Color(51, 51, 55));
        numCitiesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numCitiesLabel.setText("4");
        jPanel4.add(numCitiesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 80, 40));

        jLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Elija la ciudad que desea eliminar:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 260, -1));

        deleteCity.setBackground(new java.awt.Color(49, 114, 24));
        deleteCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        deleteCity.setForeground(new java.awt.Color(221, 228, 195));
        deleteCity.setText("Eliminar Ciudad");
        deleteCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCityActionPerformed(evt);
            }
        });
        jPanel4.add(deleteCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 250, -1));

        addConection.setBackground(new java.awt.Color(49, 114, 24));
        addConection.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        addConection.setForeground(new java.awt.Color(221, 228, 195));
        addConection.setText("Agregar Conexion");
        addConection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConectionActionPerformed(evt);
            }
        });
        jPanel4.add(addConection, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, -1));

        deleteOptionCitys.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(deleteOptionCitys, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 40));

        jLabel4.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 55));
        jLabel4.setText("Número de Ciudades");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        jLabel5.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 55));
        jLabel5.setText("Actuales del Hormiguero:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 300, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 480));

        jLabel6.setBackground(new java.awt.Color(238, 237, 236));
        jLabel6.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 237, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("-Ant Simulator");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 65, 200, 30));

        jTextArea1.setBackground(new java.awt.Color(221, 228, 195));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Futura Bk BT", 2, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 55));
        jTextArea1.setRows(2);
        jTextArea1.setText("    \n    Al presionar Actualizar Hormiguero se actualizará el hormiguero en el \n    programa pero no se modificará el TXT");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 590, 90));

        updateTXTButton.setBackground(new java.awt.Color(49, 114, 24));
        updateTXTButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        updateTXTButton.setForeground(new java.awt.Color(221, 228, 195));
        updateTXTButton.setText("Guardar TXT");
        updateTXTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTXTButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateTXTButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 300, 40));

        newGrafoButton1.setBackground(new java.awt.Color(49, 114, 24));
        newGrafoButton1.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        newGrafoButton1.setForeground(new java.awt.Color(221, 228, 195));
        newGrafoButton1.setText("Actualizar Hormiguero");
        newGrafoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGrafoButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(newGrafoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 290, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(221, 228, 195));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Futura Bk BT", 2, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 55));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(2);
        jTextArea2.setTabSize(4);
        jTextArea2.setText("     \n    Al precionar Guardar TXT se actualizará el archivo TXT antes ingresado\n   con la información del nuevo hormiguero");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 590, 100));

        mainCity.setFont(new java.awt.Font("Futura Bk BT", 3, 36)); // NOI18N
        mainCity.setText("Edición del Hormiguero");
        jPanel1.add(mainCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        startButton.setBackground(new java.awt.Color(49, 114, 24));
        startButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        startButton.setText("Comenzar Simulación");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 617));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked

    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        uploadData dataPage = new  uploadData(mainGrafo);
        dataPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void addCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCityActionPerformed

    private void deleteCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCityActionPerformed

    private void addConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConectionActionPerformed
        connectCity connectPage = new connectCity(mainGrafo);
        connectPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addConectionActionPerformed

    private void updateTXTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTXTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTXTButtonActionPerformed

    private void newGrafoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGrafoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGrafoButton1ActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        valoresIniciales valorI = new  valoresIniciales(mainGrafo);
        valorI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

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
            java.util.logging.Logger.getLogger(editData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editData(mainGrafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCity;
    private javax.swing.JButton addConection;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton deleteCity;
    private javax.swing.JComboBox<String> deleteOptionCitys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel mainCity;
    private javax.swing.JButton newGrafoButton1;
    private javax.swing.JLabel numCitiesLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton updateTXTButton;
    // End of variables declaration//GEN-END:variables
}
