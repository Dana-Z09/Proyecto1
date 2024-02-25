package interfacesGraficas;

import EDD.Grafo;
import EDD.ListaSimple;
import Funciones.uploadTXT;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniela Zambrano
 */
public class uploadData extends javax.swing.JFrame {
    String mainFileText;
    public  static Grafo mainGrafo;
    
    /**
     * Creates new form uploadGrafo
     * @param firstpage
     */
    public uploadData() {
        initComponents();
        mainGrafo=null;
        this.setLocationRelativeTo(null);
        this.startButton.setVisible(false);
        this.editGrafoButton.setVisible(false);
        this.deleteAntHill.setVisible(false);
        this.saveAntHill.setVisible(false);
        
    }
    public uploadData(Grafo maingrafo) {
        
        initComponents();
        this.mainGrafo=maingrafo;
        jTextArea1.setText(mainGrafo.toString());
        this.setLocationRelativeTo(null);
        
        if (mainGrafo!=null){
            saveAntHill.setVisible(false);
            selectTXT.setVisible(false);
            filePathTextField.setVisible(false);
            this.startButton.setVisible(true);
            this.editGrafoButton.setVisible(true);}
        filePathTextField.setText("");
        
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        filePathTextField = new javax.swing.JTextField();
        selectTXT = new javax.swing.JButton();
        deleteAntHill = new javax.swing.JButton();
        editGrafoButton = new javax.swing.JButton();
        mainCity = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveAntHill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(996, 617));
        setMinimumSize(new java.awt.Dimension(996, 617));
        setPreferredSize(new java.awt.Dimension(996, 617));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 143, 74));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 237, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DIDANTS");

        atrasButton.setBackground(new java.awt.Color(221, 228, 195));
        atrasButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 20)); // NOI18N
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

        jLabel6.setBackground(new java.awt.Color(238, 237, 236));
        jLabel6.setFont(new java.awt.Font("Futura", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 237, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("-Ant Simulator");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(221, 228, 195));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Futura Lt BT", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 55));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        startButton.setBackground(new java.awt.Color(49, 114, 24));
        startButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        startButton.setText("Comenzar Simulación");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        filePathTextField.setEditable(false);
        filePathTextField.setBackground(new java.awt.Color(221, 228, 195));
        filePathTextField.setFont(new java.awt.Font("Futura Lt BT", 0, 16)); // NOI18N
        filePathTextField.setForeground(new java.awt.Color(51, 51, 55));
        filePathTextField.setText("  Archivo");
        filePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathTextFieldActionPerformed(evt);
            }
        });

        selectTXT.setBackground(new java.awt.Color(49, 114, 24));
        selectTXT.setFont(new java.awt.Font("MAXWELL BOLD", 0, 16)); // NOI18N
        selectTXT.setText("Buscar Archivo");
        selectTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTXTActionPerformed(evt);
            }
        });

        deleteAntHill.setBackground(new java.awt.Color(49, 114, 24));
        deleteAntHill.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        deleteAntHill.setText("Borrar Hormiguero");
        deleteAntHill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAntHillActionPerformed(evt);
            }
        });

        editGrafoButton.setBackground(new java.awt.Color(49, 114, 24));
        editGrafoButton.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        editGrafoButton.setText("Editar Hormiguero");
        editGrafoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGrafoButtonActionPerformed(evt);
            }
        });

        mainCity.setFont(new java.awt.Font("Futura Bk BT", 3, 36)); // NOI18N
        mainCity.setText("Elegir Hormiguero");

        jLabel2.setFont(new java.awt.Font("Futura Lt BT", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 228, 195));
        jLabel2.setText("Información del Hormiguero elegido");

        saveAntHill.setBackground(new java.awt.Color(49, 114, 24));
        saveAntHill.setFont(new java.awt.Font("MAXWELL BOLD", 0, 24)); // NOI18N
        saveAntHill.setText("Guardar Hormiguero");
        saveAntHill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAntHillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(mainCity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteAntHill, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startButton)
                                    .addComponent(editGrafoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveAntHill, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mainCity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveAntHill)
                        .addGap(29, 29, 29)
                        .addComponent(deleteAntHill)
                        .addGap(27, 27, 27)
                        .addComponent(editGrafoButton)
                        .addGap(27, 27, 27)
                        .addComponent(startButton)
                        .addGap(38, 38, 38)
                        .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked
        
    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        firstPage fPage = new  firstPage();
        fPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        valoresIniciales valorI = new  valoresIniciales(mainGrafo);
        valorI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void filePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filePathTextFieldActionPerformed

    private void selectTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTXTActionPerformed
        //mainGrafo=null;
        JFileChooser fileChooser = new JFileChooser(); //Se crea elobjeto Jfilechooser
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt");
        String fileText="";
        File antHill;
        
        fileChooser.setFileFilter(filter);
        
        int selected = fileChooser.showOpenDialog(this);
        
        if(selected==JFileChooser.APPROVE_OPTION){
            antHill = fileChooser.getSelectedFile();
            
            this.filePathTextField.setText(antHill.getAbsolutePath());  
        
            try(FileReader filereader = new FileReader(antHill)){
                int value = filereader.read();
                while(value!= -1){
                    fileText = fileText+ (char) value;
                    value = filereader.read();}
            
                this.jTextArea1.setText(fileText);
                this.mainFileText=fileText;
                this.saveAntHill.setVisible(true);
                
            }catch(IOException ex){
                ex.printStackTrace();}
        }
        else{JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún Archivo.", "Info", JOptionPane.INFORMATION_MESSAGE);}
      
    }//GEN-LAST:event_selectTXTActionPerformed

    private void deleteAntHillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAntHillActionPerformed
        selectTXT.setVisible(true);
        saveAntHill.setVisible(true);
        filePathTextField.setVisible(true);
        
        if (mainGrafo!=null){
        mainGrafo=null;
        mainFileText=null;
        JOptionPane.showMessageDialog(rootPane, "Se ha borrado el hormiguero exitosamente", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún Archivo.", "Info", JOptionPane.INFORMATION_MESSAGE);}

        filePathTextField.setText("");
        jTextArea1.setText("");
        this.startButton.setVisible(false);
        this.editGrafoButton.setVisible(false);
        
        
    }//GEN-LAST:event_deleteAntHillActionPerformed

    private void editGrafoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGrafoButtonActionPerformed
        editData pageEdit = new editData(mainGrafo);
        pageEdit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editGrafoButtonActionPerformed

    private void saveAntHillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAntHillActionPerformed
        uploadTXT uploadData = new uploadTXT();
        selectTXT.setVisible(false);
        filePathTextField.setVisible(false);
        if (mainFileText!=null){    
            this.mainGrafo= uploadData.convertString(jTextArea1.getText());
            this.deleteAntHill.setVisible(true);
            this.saveAntHill.setVisible(false);
            //System.out.println(mainGrafo.toString());
        }
        
        else{ JOptionPane.showMessageDialog(rootPane, "No se puede guardar nada porque no se ha seleccionado ningun Archivo TXT", "Aviso", WARNING_MESSAGE);
            saveAntHill.setVisible(true);
        }
        
        if (mainGrafo!=null){
            this.startButton.setVisible(true);
            this.editGrafoButton.setVisible(true);}
    }//GEN-LAST:event_saveAntHillActionPerformed

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
            java.util.logging.Logger.getLogger(uploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uploadData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton deleteAntHill;
    private javax.swing.JButton editGrafoButton;
    private javax.swing.JTextField filePathTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mainCity;
    private javax.swing.JButton saveAntHill;
    private javax.swing.JButton selectTXT;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
