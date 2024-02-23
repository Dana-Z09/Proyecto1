package interfacesGraficas;

/**
 *
 * @author Daniela Zambrano
 */
public class editData extends javax.swing.JFrame {

    /**
     * Creates new form editData
     */
    public editData() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        addOptionCitys = new javax.swing.JComboBox<>();
        deleteOptionCitys = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        newGrafoButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cityA = new javax.swing.JComboBox<>();
        cityB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        distance = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        addConection = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        showAnthillButton = new javax.swing.JButton();
        updateTXTButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 143, 74));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 237, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DIDANTS");

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

        jPanel4.setBackground(new java.awt.Color(221, 228, 195));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Futura Bk BT", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 55));
        jLabel18.setText("Ciudades");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        addCity.setBackground(new java.awt.Color(49, 114, 24));
        addCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        addCity.setForeground(new java.awt.Color(221, 228, 195));
        addCity.setText("Agregar Nueva Ciudad");
        addCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityActionPerformed(evt);
            }
        });
        jPanel4.add(addCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 201, -1));

        numCitiesLabel.setFont(new java.awt.Font("Futura Lt BT", 3, 24)); // NOI18N
        numCitiesLabel.setForeground(new java.awt.Color(51, 51, 55));
        numCitiesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numCitiesLabel.setText("4");
        jPanel4.add(numCitiesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 70, 40));

        jLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Número de Cidades Actuales del Hormiguero:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, -1));

        deleteCity.setBackground(new java.awt.Color(49, 114, 24));
        deleteCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        deleteCity.setForeground(new java.awt.Color(221, 228, 195));
        deleteCity.setText("Eliminar Ciudad");
        deleteCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCityActionPerformed(evt);
            }
        });
        jPanel4.add(deleteCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 201, -1));

        addOptionCitys.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(addOptionCitys, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, 30));

        deleteOptionCitys.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(deleteOptionCitys, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 30));

        jLabel6.setBackground(new java.awt.Color(238, 237, 236));
        jLabel6.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 237, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("-Ant Simulator");

        newGrafoButton.setBackground(new java.awt.Color(49, 114, 24));
        newGrafoButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        newGrafoButton.setForeground(new java.awt.Color(221, 228, 195));
        newGrafoButton.setText("Actualización de Hormiguero");
        newGrafoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGrafoButtonActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(221, 228, 195));

        jLabel11.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 55));
        jLabel11.setText("Ciudad A");

        jLabel8.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
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

        jLabel12.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 55));
        jLabel12.setText("Distancia entre ciudad A y ciudad B");

        distance.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        distance.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.1d, null, 1.0d));
        distance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Futura Bk BT", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 55));
        jLabel13.setText("Asignación de Conexiones");

        addConection.setBackground(new java.awt.Color(49, 114, 24));
        addConection.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(cityB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(addConection, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cityA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cityB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addConection)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(49, 114, 24));

        jLabel14.setFont(new java.awt.Font("Futura Bk BT", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(221, 228, 195));
        jLabel14.setText("Información del Hormiguero");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(221, 228, 195));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Futura Lt BT", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 55));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        showAnthillButton.setBackground(new java.awt.Color(49, 114, 24));
        showAnthillButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        showAnthillButton.setForeground(new java.awt.Color(221, 228, 195));
        showAnthillButton.setText("Mostrar Información");
        showAnthillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAnthillButtonActionPerformed(evt);
            }
        });

        updateTXTButton.setBackground(new java.awt.Color(49, 114, 24));
        updateTXTButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 18)); // NOI18N
        updateTXTButton.setForeground(new java.awt.Color(221, 228, 195));
        updateTXTButton.setText("Guardar TXT");
        updateTXTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTXTButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(showAnthillButton)
                                .addGap(61, 61, 61)
                                .addComponent(updateTXTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAnthillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTXTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(611, Short.MAX_VALUE)
                .addComponent(newGrafoButton)
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(593, 593, 593)
                            .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(newGrafoButton)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked

    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        firstPage Menu = new  firstPage();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void addCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCityActionPerformed

    private void deleteCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCityActionPerformed

    private void newGrafoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGrafoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGrafoButtonActionPerformed

    private void cityAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityAActionPerformed

    private void cityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityBActionPerformed

    private void addConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addConectionActionPerformed

    private void showAnthillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAnthillButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showAnthillButtonActionPerformed

    private void updateTXTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTXTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTXTButtonActionPerformed

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
                new editData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCity;
    private javax.swing.JButton addConection;
    private javax.swing.JComboBox<String> addOptionCitys;
    private javax.swing.JButton atrasButton;
    private javax.swing.JComboBox<String> cityA;
    private javax.swing.JComboBox<String> cityB;
    private javax.swing.JButton deleteCity;
    private javax.swing.JComboBox<String> deleteOptionCitys;
    private javax.swing.JSpinner distance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton newGrafoButton;
    private javax.swing.JLabel numCitiesLabel;
    private javax.swing.JButton showAnthillButton;
    private javax.swing.JButton updateTXTButton;
    // End of variables declaration//GEN-END:variables
}
