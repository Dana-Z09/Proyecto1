package interfacesGraficas;

import EDD.City;
import EDD.Grafo;
import EDD.ListaSimple;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Daniela Zambrano
 */
public class editData extends javax.swing.JFrame {
    public static Grafo mainGrafo;
    /**
     * Creates new form editData
     */
    public editData(Grafo maingrafo) {
        initComponents();
        this.setLocationRelativeTo(null);
        editData.mainGrafo=maingrafo;
        numCitiesLabel.setText(String.valueOf(mainGrafo.citiesQuantity()));
        showTextArea.setText(mainGrafo.toString());
        
        ListaSimple citiesList=mainGrafo.getCities();
        for (int i = 0; i < citiesList.getSize(); i++) {
            City auxCity = (City) citiesList.getContentByIndex(i);
            int numcity= auxCity.getNumCity();
            this.deleteOptionCitys.addItem(String.valueOf(numcity));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addCity = new javax.swing.JButton();
        numCitiesLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteCity = new javax.swing.JButton();
        addConection = new javax.swing.JButton();
        deleteOptionCitys = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        updateTXTButton = new javax.swing.JButton();
        newGrafoButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        mainCity = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTextArea = new javax.swing.JTextArea();
        updateAnthillStringView = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(996, 619));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 143, 74));
        jPanel1.setMaximumSize(new java.awt.Dimension(996, 619));
        jPanel1.setMinimumSize(new java.awt.Dimension(996, 619));
        jPanel1.setPreferredSize(new java.awt.Dimension(996, 619));
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

        addCity.setBackground(new java.awt.Color(49, 114, 24));
        addCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        addCity.setForeground(new java.awt.Color(221, 228, 195));
        addCity.setText("Agregar Nueva Ciudad");
        addCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityActionPerformed(evt);
            }
        });

        numCitiesLabel.setFont(new java.awt.Font("Futura Lt BT", 3, 36)); // NOI18N
        numCitiesLabel.setForeground(new java.awt.Color(51, 51, 55));
        numCitiesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numCitiesLabel.setText("4");

        jLabel3.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Elija la ciudad que desea eliminar:");

        deleteCity.setBackground(new java.awt.Color(49, 114, 24));
        deleteCity.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        deleteCity.setForeground(new java.awt.Color(221, 228, 195));
        deleteCity.setText("Eliminar Ciudad");
        deleteCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCityActionPerformed(evt);
            }
        });

        addConection.setBackground(new java.awt.Color(49, 114, 24));
        addConection.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        addConection.setForeground(new java.awt.Color(221, 228, 195));
        addConection.setText("Agregar Conexion");
        addConection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConectionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 55));
        jLabel4.setText("Número de Ciudades");

        jLabel5.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 55));
        jLabel5.setText("Actuales del Hormiguero:");

        jLabel19.setFont(new java.awt.Font("Futura Bk BT", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 55));
        jLabel19.setText("Ciudades");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(numCitiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addConection, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(deleteOptionCitys, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(deleteCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addComponent(numCitiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(addCity)
                .addGap(36, 36, 36)
                .addComponent(addConection)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(deleteOptionCitys, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(deleteCity))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 310, 480));

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
        jTextArea1.setText("    \n  Al presionar Actualizar Hormiguero \n  se actualizará el hormiguero en el \n  programa, pero no se modificará \n  el TXT");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 310, 150));

        updateTXTButton.setBackground(new java.awt.Color(49, 114, 24));
        updateTXTButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        updateTXTButton.setForeground(new java.awt.Color(221, 228, 195));
        updateTXTButton.setText("Guardar TXT");
        updateTXTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTXTButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateTXTButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 290, 40));

        newGrafoButton1.setBackground(new java.awt.Color(49, 114, 24));
        newGrafoButton1.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        newGrafoButton1.setForeground(new java.awt.Color(221, 228, 195));
        newGrafoButton1.setText("Actualizar Hormiguero");
        newGrafoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGrafoButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(newGrafoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 310, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(221, 228, 195));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Futura Bk BT", 2, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 55));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(2);
        jTextArea2.setTabSize(4);
        jTextArea2.setText("     \n   Al presionar Guardar TXT se\n  actualizará el archivo TXT antes\n  ingresado con la información\n  del nuevo hormiguero");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 290, 150));

        mainCity.setFont(new java.awt.Font("Futura Bk BT", 3, 36)); // NOI18N
        mainCity.setForeground(new java.awt.Color(221, 228, 195));
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
        jPanel1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, 50));

        jLabel20.setFont(new java.awt.Font("Futura Bk BT", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(221, 228, 195));
        jLabel20.setText("Visualización");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Futura Bk BT", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(221, 228, 195));
        jLabel18.setText("Actual");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        showTextArea.setBackground(new java.awt.Color(221, 228, 195));
        showTextArea.setColumns(20);
        showTextArea.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        showTextArea.setForeground(new java.awt.Color(51, 51, 55));
        showTextArea.setRows(5);
        showTextArea.setBorder(null);
        jScrollPane1.setViewportView(showTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 370, 230));

        updateAnthillStringView.setBackground(new java.awt.Color(49, 114, 24));
        updateAnthillStringView.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
        updateAnthillStringView.setText("Actualizar Visualización");
        updateAnthillStringView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAnthillStringViewActionPerformed(evt);
            }
        });
        jPanel1.add(updateAnthillStringView, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        jLabel21.setFont(new java.awt.Font("Futura Bk BT", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(221, 228, 195));
        jLabel21.setText("Hormiguero");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

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
        if(deleteOptionCitys.getItemCount()>4){
        //eliminar ciudad
        String deleteOp= deleteOptionCitys.getSelectedItem().toString();
        int cityNum = Integer.parseInt(deleteOp);
        System.out.println(deleteOp);
        deleteOptionCitys.removeAllItems();
        ListaSimple citiesList=mainGrafo.getCities();
        for (int i = 0; i < citiesList.getSize(); i++) {
            City auxCity = (City) citiesList.getContentByIndex(i);
            int numcity= auxCity.getNumCity();
            this.deleteOptionCitys.addItem(String.valueOf(numcity));}
        }
        else{
                JOptionPane.showMessageDialog(null, "Es necesario tener al menos 4 ciudades para que el simulador funcione,\n si quiere eliminar el hormiguero lo puede realizar desde la pagina de 'Elegir Hormiguero' y cargar un nuevo hormiguero", "Error", WARNING_MESSAGE);
                }
        
    }//GEN-LAST:event_deleteCityActionPerformed

    private void addConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConectionActionPerformed
        connectCity connectPage = new connectCity(mainGrafo);
        connectPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addConectionActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        valoresIniciales valorI = new  valoresIniciales(mainGrafo);
        valorI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void updateAnthillStringViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAnthillStringViewActionPerformed
        showTextArea.setText(mainGrafo.toString());
    }//GEN-LAST:event_updateAnthillStringViewActionPerformed

    private void newGrafoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGrafoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGrafoButton1ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel mainCity;
    private javax.swing.JButton newGrafoButton1;
    private javax.swing.JLabel numCitiesLabel;
    private javax.swing.JTextArea showTextArea;
    private javax.swing.JButton startButton;
    private javax.swing.JButton updateAnthillStringView;
    private javax.swing.JButton updateTXTButton;
    // End of variables declaration//GEN-END:variables
}
