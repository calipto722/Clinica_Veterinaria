/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_Base_de_Datos.ClienteData;
import Acceso_Base_de_Datos.MascotaData;
import Acceso_Base_de_Datos.ProductoData;
import Acceso_Base_de_Datos.VisitaData;
import Entidades.Cliente;
import Entidades.Mascota;

import static Vistas.MenuPrincipal.Escritorio;

import Entidades.Producto;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author noelia
 */
public class Visita_Registrar extends javax.swing.JInternalFrame {

    private DefaultTableModel m = new DefaultTableModel();
    public static Tratamiento tratamientodeVisita;
    DefaultListModel<String>model = new DefaultListModel<>();
    int importeVisita=500;
    public Visita_Registrar() {
        initComponents();
        cargarbox();
        this.setTitle("Registro de visita");
        armarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPRoducto = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtCantidad = new javax.swing.JTextField();
        jbAddDialogo = new javax.swing.JButton();
        jdTRatamiento = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtProductos1 = new javax.swing.JTable();
        jbAddDialogo1 = new javax.swing.JButton();
        jtCantidad1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateFechaVisita = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcMascotaselec = new javax.swing.JComboBox<>();
        jtPesoActual = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtProductos);

        jLabel4.setText("cantidad");

        jbAddDialogo.setText("agregar");
        jbAddDialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddDialogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdPRoductoLayout = new javax.swing.GroupLayout(jdPRoducto.getContentPane());
        jdPRoducto.getContentPane().setLayout(jdPRoductoLayout);
        jdPRoductoLayout.setHorizontalGroup(
            jdPRoductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(jdPRoductoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAddDialogo)
                .addContainerGap())
        );
        jdPRoductoLayout.setVerticalGroup(
            jdPRoductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdPRoductoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jdPRoductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddDialogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jLabel10.setText("cantidad");

        jtProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jtProductos1);

        jbAddDialogo1.setText("agregar");
        jbAddDialogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddDialogo1ActionPerformed(evt);
            }
        });

        jLabel11.setText("jLabel11");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        javax.swing.GroupLayout jdTRatamientoLayout = new javax.swing.GroupLayout(jdTRatamiento.getContentPane());
        jdTRatamiento.getContentPane().setLayout(jdTRatamientoLayout);
        jdTRatamientoLayout.setHorizontalGroup(
            jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdTRatamientoLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jdTRatamientoLayout.createSequentialGroup()
                .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdTRatamientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAddDialogo1))
                    .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jdTRatamientoLayout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdTRatamientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6))
        );
        jdTRatamientoLayout.setVerticalGroup(
            jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdTRatamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdTRatamientoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdTRatamientoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jdTRatamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddDialogo1)
                    .addComponent(jtCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(19, 19, 19))
        );

        setClosable(true);
        setTitle("Registrar Visita");

        jLabel1.setText("Fecha");

        jLabel5.setText("PESO ACTUAL");

        jLabel6.setText("MASCOTA");

        jcMascotaselec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMascotaselecActionPerformed(evt);
            }
        });

        jtPesoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesoActualActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar Tratamiento");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcMascotaselec, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(198, 198, 198)
                                    .addComponent(jButton4))))))
                .addGap(46, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcMascotaselec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPesoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesoActualActionPerformed

    private void jcMascotaselecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMascotaselecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMascotaselecActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Tratamiento_Registrar rgt = new Tratamiento_Registrar();
        Escritorio.add(rgt);
        rgt.toFront();
        rgt.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
     // falta buscar la forma de que abra el panel para registrar el tratamiento
    
       
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
      try{
          
      
        LocalDate fecha= jDateFechaVisita.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       Mascota masp= (Mascota) jcMascotaselec.getSelectedItem();
        String peso= jtPesoActual.getText();
        VisitaData visitd =new VisitaData();
        if (casillasVacias()==true) {
          Visita visita= new Visita(fecha,importeVisita, tratamientodeVisita,Double.valueOf(peso), masp);
        visitd.GuardarVisita(visita); 
        // agregar un limpiar
        }
      }catch (NullPointerException npe){
          JOptionPane.showMessageDialog(this,"Error en el formato de fecha");
      }catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(this, "Ingrese el formato de peso correcto");
      }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbAddDialogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddDialogo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddDialogo1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbAddDialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddDialogoActionPerformed
      
    }//GEN-LAST:event_jbAddDialogoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateFechaVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbAddDialogo;
    private javax.swing.JButton jbAddDialogo1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Mascota> jcMascotaselec;
    private javax.swing.JDialog jdPRoducto;
    private javax.swing.JDialog jdTRatamiento;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtCantidad1;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTable jtProductos1;
    // End of variables declaration//GEN-END:variables
  private void cargarbox() {
        MascotaData mascD = new MascotaData();
        List<Mascota> mascotas = mascD.ListarMascota();
        jcMascotaselec.removeAllItems();
        for (int i = 0; i < mascotas.size(); i++) {
            jcMascotaselec.addItem(mascotas.get(i));

        }
    }

    private void armarTabla() {
        m.addColumn("id");
        m.addColumn("nombre");
        m.addColumn("descripcion");
        m.addColumn("precio");
        m.addColumn("stock");

        jtProductos.setModel(m);

        borrarFilas();
        ProductoData prodData = new ProductoData();

        List<Producto> producto = prodData.ListarProductos();
        for (Producto prod : producto) {

            m.addRow(new Object[]{
                prod.getIdProducto(),
                prod.getNombre(),
                prod.getDescripcion(),
                prod.getPrecio(),
                prod.getStock()
            });
        }
    }

    private void borrarFilas() {
        int f = jtProductos.getRowCount() - 1;

        for (int i = f; i >= 0; i--) {
            m.removeRow(i);
        }
    }
    private boolean casillasVacias(){
        boolean revision= true;
        if (this.jDateFechaVisita.getTreeLock()==null) {
            JOptionPane.showMessageDialog(this, "Falta Elegir Fecha");
            revision=false;
        }else if (jtPesoActual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta completar Peso");
            revision=false;
        }else if (tratamientodeVisita.getDescripcion().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta Elegir Tratamiento");
            revision=false;
        }else if (jcMascotaselec.getSelectedIndex()== -1) {
           JOptionPane.showMessageDialog(this, "Falta Elegir Mascota");
           revision= false;
        }
      return revision;
    }
}
