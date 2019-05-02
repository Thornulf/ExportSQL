/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.boundaries;

import fr.dao.Globales;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Joke-
 */
public class ImportJIF extends javax.swing.JInternalFrame {

    private final Connection cn;
    
    public ImportJIF() {
        initComponents();
        
        jLabelMessage.setText("");

        cn = Globales.getConnection();

        setTitle("Import");
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFileChoose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomDuFichier = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNomDuChemin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNameTable = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButtonImport = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButtonFileChoose.setText("Choisir Document");
        jButtonFileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileChooseActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Nom du fichier choisi");

        jLabelNomDuFichier.setText("Nom du fichier");

        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Chemin du fichier choisi");

        jLabelNomDuChemin.setText("Nom du chemin");

        jLabel5.setText("Nom de la table");

        jRadioButton1.setText("CSV");

        jRadioButton2.setText("XML");

        jRadioButton3.setText("JSON");

        jButtonImport.setText("Importer");

        jLabelMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jButtonFileChoose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabelNomDuFichier, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(80, 80, 80))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMessage)
                                            .addComponent(jLabel5))
                                        .addGap(108, 108, 108)))
                                .addComponent(jTextFieldNameTable, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNomDuChemin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton1)
                                .addComponent(jLabel3)))))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(104, 104, 104)
                        .addComponent(jRadioButton3)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonImport)
                        .addGap(254, 254, 254))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonFileChoose)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomDuFichier)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomDuChemin)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNameTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(41, 41, 41)
                .addComponent(jButtonImport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabelMessage)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileChooseActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filtreCSV = new FileNameExtensionFilter("CSV", "csv");
        FileNameExtensionFilter filtreXML = new FileNameExtensionFilter("XML", "xml");
        FileNameExtensionFilter filtreJSON = new FileNameExtensionFilter("JSON", "json");

        fileChooser.addChoosableFileFilter(filtreCSV);
        fileChooser.addChoosableFileFilter(filtreXML);
        fileChooser.addChoosableFileFilter(filtreJSON);

        int liRetour = fileChooser.showOpenDialog(this);

        if (liRetour == JFileChooser.APPROVE_OPTION) {
            jLabelNomDuFichier.setText(fileChooser.getSelectedFile().getName());
            jLabelNomDuChemin.setText(fileChooser.getCurrentDirectory().getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonFileChooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFileChoose;
    private javax.swing.JButton jButtonImport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNomDuChemin;
    private javax.swing.JLabel jLabelNomDuFichier;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextFieldNameTable;
    // End of variables declaration//GEN-END:variables
}
