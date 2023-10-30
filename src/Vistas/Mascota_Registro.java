/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_Base_de_Datos.ClienteData;
import Acceso_Base_de_Datos.MascotaData;
import Entidades.Cliente;
import Entidades.Mascota;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class Mascota_Registro extends javax.swing.JInternalFrame {

    private MascotaData mascotaData;
    private ClienteData clienteData;
    private Mascota mascotaP;

    /**
     * Creates new form RegistroDeMascota
     */
    public Mascota_Registro() {
        initComponents();
        mascotaP = null;
        mascotaData = new MascotaData();
        clienteData = new ClienteData();
        this.setTitle("Registro de mascotas ");
        cargarbox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jLNOMBRE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrMacho = new javax.swing.JRadioButton();
        jrHembra = new javax.swing.JRadioButton();
        jtEspecie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtRaza = new javax.swing.JTextField();
        jtColoDePelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcCliente = new javax.swing.JComboBox<>();
        jcEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setToolTipText("");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLNOMBRE.setText("NOMBRE");

        jLabel3.setText("SEXO");

        jLabel4.setText("ESPECIE");

        bgSexo.add(jrMacho);
        jrMacho.setText("MACHO");

        bgSexo.add(jrHembra);
        jrHembra.setText("HEMBRA");
        jrHembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrHembraActionPerformed(evt);
            }
        });

        jLabel5.setText("RAZA");

        jLabel6.setText("COLOR DE PELO");

        jLabel7.setText("FECHA DE NACIMIENTO");

        jdFechaNac.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdFechaNacAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel8.setText("ESTADO");

        jLabel9.setText("DUEÑO");

        jcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteActionPerformed(evt);
            }
        });

        jcEstado.setText("ACTIVO");

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlId.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNOMBRE, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jrMacho)
                                .addGap(44, 44, 44)
                                .addComponent(jrHembra))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtColoDePelo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(106, 106, 106)
                                        .addComponent(jcEstado))
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jlId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar))
                    .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId)
                            .addComponent(jbBuscar)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminar))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jcEstado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNOMBRE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jrMacho)
                            .addComponent(jrHembra))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtColoDePelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASCOTA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            int id = Integer.valueOf(jtId.getText());

            Mascota mascotaselec = mascotaData.BuscarMascota(id);
            if (mascotaselec==null) {
                seteo();
                mascotaP=null;
            } else {
                mascotaP=mascotaselec;
            }
        }  catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingresar un Numero");
        }try{
            
        if (mascotaP != null) {
            jcCliente.removeAllItems();
            jtNombre.setText(mascotaP.getNombreAlias());
            jcCliente.addItem(mascotaP.getcliente());
            jtColoDePelo.setText(mascotaP.getColorPelo());
            jtEspecie.setText(mascotaP.getEspecie());
            jtRaza.setText(mascotaP.getRaza());
            jcEstado.setSelected(mascotaP.isEstadoMascota());
            jdFechaNac.setDate(java.sql.Date.valueOf(mascotaP.getFechaNacimiento()));
            if (mascotaP.getSexo().equals("Hembra")) {
                jrHembra.setSelected(true);
            } else {
                jrMacho.setSelected(true);
            }
        }
 }catch (NullPointerException e) {
            System.out.println("----");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try {
            if(!(jtId.getText().isEmpty())){
            int id = Integer.valueOf(jtId.getText());
            mascotaP = mascotaData.BuscarMascota(id);
            }
            if (revisiondeNull() == false) {
                seteo();
            } else {

                String nombre = jtNombre.getText();
                String especie = jtEspecie.getText();
                String raza = jtRaza.getText();
                String colorPelo = jtColoDePelo.getText();
                LocalDate fechaNac = jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado = jcEstado.isSelected();
                Cliente cliente = (Cliente) jcCliente.getSelectedItem();
                // El símbolo ? se utiliza en una expresión condicional (también conocida como operador ternario).
                //Esta expresión condicional es una forma abreviada de escribir una estructura condicional if-else.
                String sexo = (jrMacho.isSelected()) ? "Macho" : "Hembra";

                if (mascotaP != null) {
                    // Modificar la mascota existente
                    mascotaP.setColorPelo(colorPelo);
                    mascotaP.setEspecie(especie);
                    mascotaP.setEstadoMascota(estado);
                    mascotaP.setFechaNacimiento(fechaNac);
                    mascotaP.setIdcliente(cliente);
                    mascotaP.setNombreAlias(nombre);
                    mascotaP.setRaza(raza);
                    mascotaP.setSexo(sexo);

                    mascotaData.ModificarMascota(mascotaP);

                } else {
                    // Crear una nueva mascota
                    Mascota mascota = new Mascota(nombre, sexo, especie, raza, colorPelo, fechaNac, estado, cliente);

                    mascotaData.GuardarMascota(mascota);

                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        seteo();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteActionPerformed

    }//GEN-LAST:event_jcClienteActionPerformed

    private void jrHembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrHembraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrHembraActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        seteo();
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jdFechaNacAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdFechaNacAncestorAdded


    }//GEN-LAST:event_jdFechaNacAncestorAdded

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Completar ID antes de Eliminar");
        }
        
        mascotaData.EliminarMascota(Integer.parseInt(jtId.getText()));
seteo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JLabel jLNOMBRE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<Cliente> jcCliente;
    private javax.swing.JCheckBox jcEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JLabel jlId;
    private javax.swing.JRadioButton jrHembra;
    private javax.swing.JRadioButton jrMacho;
    private javax.swing.JTextField jtColoDePelo;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtRaza;
    // End of variables declaration//GEN-END:variables
  private void cargarbox() {
        ClienteData clientD = new ClienteData();
        List<Cliente> clientes = clientD.listarClientes();
        jcCliente.removeAllItems();
        for (int i = 0; i < clientes.size(); i++) {
            jcCliente.addItem(clientes.get(i));

        }

    }
private void seteo(){
       jtNombre.setText("");
        jcCliente.removeAllItems();
        cargarbox();
        jtColoDePelo.setText("");
        jtEspecie.setText("");
        jtRaza.setText("");
        jcEstado.setSelected(false);
        jdFechaNac.setDate(null);
        bgSexo.clearSelection();
       mascotaP = null;
        jtId.setText("");
}
    private boolean revisiondeNull() {
        boolean revision = true;
        if (jtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar Nombre");
            revision = false;
        } else if (jtColoDePelo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar color de pelo");
            revision = false;
        } else if (jtEspecie.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar especie");
            revision = false;
        } else if (jtRaza.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar raza ");
            revision = false;
        } else if( jdFechaNac.getTreeLock() ==null){
            revision=false;
        }
        return revision;
    }
}
