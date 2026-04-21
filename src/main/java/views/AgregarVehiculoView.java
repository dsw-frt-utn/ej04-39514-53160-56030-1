/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author emanu
 */
public class AgregarVehiculoView extends javax.swing.JFrame {

    public AgregarVehiculoView() {
        initComponents();
        agregarValidaciones();
    }
    
    private void agregarValidaciones() {
        CampoAnio.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("\\d{0,4}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoCapCarga.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("\\d*\\.?\\d{0,10}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoConsumoBase.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("\\d*\\.?\\d{0,10}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoKmPorLitro.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("\\d*\\.?\\d{0,10}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoLitrosExtra.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("\\d*\\.?\\d{0,10}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoMarca.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{0,50}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoPais.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]{0,50}")) {
                    super.insertString(offset, str, attr);
                }
            }
        });
        
        CampoModelo.setDocument(new javax.swing.text.PlainDocument() {
            @Override
            public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
                if (str == null) return;
                String current = getText(0, getLength());
                String newValue = current.substring(0, offset) + str + current.substring(offset);
                if (newValue.matches("[a-zA-Z0-9ñÑáéíóúÁÉÍÓÚ\\s\\-]{0,50}")) {
                    super.insertString(offset, str, attr);
                }
            }
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AgregarVehiculoPersistencia = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TipoComboBox = new javax.swing.JComboBox<>();
        CampoMarca = new javax.swing.JTextField();
        CampoModelo = new javax.swing.JTextField();
        CampoCapCarga = new javax.swing.JTextField();
        CampoPais = new javax.swing.JTextField();
        CampoAnio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CampoConsumoBase = new javax.swing.JTextField();
        CampoKmPorLitro = new javax.swing.JTextField();
        CampoLitrosExtra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SucursalComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPatenteActionPerformed(evt);
            }
        });

        jLabel2.setText("Patente");

        AgregarVehiculoPersistencia.setText("Aceptar");
        AgregarVehiculoPersistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoPersistenciaActionPerformed(evt);
            }
        });

        jLabel3.setText("Marca");

        jLabel4.setText("Pais");

        jLabel5.setText("Modelo");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Año");

        jLabel7.setText("Capacidad de Carga");

        jLabel8.setText("Tipo");

        TipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELECTRICO", "COMBUSTIBLE" }));
        TipoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboBoxActionPerformed(evt);
            }
        });

        CampoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMarcaActionPerformed(evt);
            }
        });

        CampoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoModeloActionPerformed(evt);
            }
        });

        CampoCapCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCapCargaActionPerformed(evt);
            }
        });

        CampoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPaisActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Consumo Base");

        jLabel14.setText("Km por Litro");

        jLabel15.setText("Litros extra");

        CampoConsumoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoConsumoBaseActionPerformed(evt);
            }
        });

        CampoKmPorLitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoKmPorLitroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoKmPorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoConsumoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CampoConsumoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CampoKmPorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CampoLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel1.setText("Sucursal");

        SucursalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUC01", "SUC02" }));
        SucursalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SucursalComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarVehiculoPersistencia)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCapCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SucursalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCapCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(SucursalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(AgregarVehiculoPersistencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPatenteActionPerformed

    private void AgregarVehiculoPersistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoPersistenciaActionPerformed
        String patente = CampoPatente.getText();
        String marca = CampoMarca.getText();
        String pais = CampoPais.getText();
        String modelo = CampoModelo.getText();
        int anio = Integer.parseInt(CampoAnio.getText());
        double capacidadCarga = Double.parseDouble(CampoCapCarga.getText());
        int indiceSucursal = SucursalComboBox.getSelectedIndex();
        String tipoVehiculo = (String) TipoComboBox.getSelectedItem();
        
        double consumoBase = 0;
        double kmPorLitro = 0;
        double litrosExtra = 0;
        
        if ("ELECTRICO".equals(tipoVehiculo)) {
            consumoBase = Double.parseDouble(CampoConsumoBase.getText());
        } else {
            kmPorLitro = Double.parseDouble(CampoKmPorLitro.getText());
            litrosExtra = Double.parseDouble(CampoLitrosExtra.getText());
        }
        
        data.Persistencia.guardarVehiculo(patente, marca, pais, modelo, anio, capacidadCarga, indiceSucursal, tipoVehiculo, consumoBase, kmPorLitro, litrosExtra);
        
        for (java.awt.Window window : java.awt.Window.getWindows()) {
            if (window instanceof ListarVehiculosView) {
                ((ListarVehiculosView) window).actualizarLista();
                break;
            }
        }
        
        this.dispose();
    }//GEN-LAST:event_AgregarVehiculoPersistenciaActionPerformed

    private void TipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboBoxActionPerformed
        boolean esElectrico = TipoComboBox.getSelectedItem().toString().equals("ELECTRICO");
        CampoConsumoBase.setEnabled(esElectrico);
        CampoKmPorLitro.setEnabled(!esElectrico);
        CampoLitrosExtra.setEnabled(!esElectrico);
    }//GEN-LAST:event_TipoComboBoxActionPerformed

    private void CampoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMarcaActionPerformed

    private void CampoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoModeloActionPerformed

    private void CampoCapCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCapCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCapCargaActionPerformed

    private void CampoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPaisActionPerformed

    private void campoConsumoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsumoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConsumoBaseActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSucursalActionPerformed

    private void CampoResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoResponsableActionPerformed

    private void CampoConsumoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoConsumoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoConsumoBaseActionPerformed

    private void CampoKmPorLitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoKmPorLitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoKmPorLitroActionPerformed

    private void SucursalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SucursalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SucursalComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVehiculoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVehiculoPersistencia;
    private javax.swing.JTextField CampoAnio;
    private javax.swing.JTextField CampoCapCarga;
    private javax.swing.JTextField CampoConsumoBase;
    private javax.swing.JTextField CampoKmPorLitro;
    private javax.swing.JTextField CampoLitrosExtra;
    private javax.swing.JTextField CampoMarca;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoPais;
    private javax.swing.JTextField CampoPatente;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> SucursalComboBox;
    private javax.swing.JComboBox<String> TipoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}