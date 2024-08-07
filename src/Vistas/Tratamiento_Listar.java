/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_Base_de_Datos.ProductoData;
import Acceso_Base_de_Datos.TratamientoData;
import Entidades.Producto;
import Entidades.Tratamiento;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author noelia
 */
public class Tratamiento_Listar extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private TratamientoData tratamientoData;
    /**
     * Creates new form Tratamiento_Listar
     */
    public Tratamiento_Listar() {
        
        initComponents();
        armarTabla();
        cargarTabla();
        jbAgregar.setVisible(false);
        tratamientoData= new TratamientoData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTratamientos = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jtTratamientos.setBackground(new java.awt.Color(204, 255, 255));
        jtTratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTratamientos);

        jbAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("KodchiangUPC", 2, 48)); // NOI18N
        jLabel1.setText("Tratamientos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        int filselec = jtTratamientos.getSelectedRow();
        ProductoData prod = new ProductoData();
        Producto prodselec = new Producto();
        String tipo, descripcion,descripcionprod, importe;
        boolean estado;
        int idTratamiento, idProducto;
        if (filselec == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar producto", "Advertancia", JOptionPane.WARNING_MESSAGE);// TODO add your handling code here:
        } else {
            modelo = (DefaultTableModel) jtTratamientos.getModel();
            idTratamiento= Integer.parseInt(jtTratamientos.getValueAt(filselec,0).toString());
            System.out.println(idTratamiento);
            tipo = jtTratamientos.getValueAt(filselec, 1).toString();
            descripcion = jtTratamientos.getValueAt(filselec, 2).toString();
            idProducto = Integer.parseInt( jtTratamientos.getValueAt(filselec, 3).toString());
            prodselec = prod.BuscarProductoPorId(idProducto);
            descripcionprod = jtTratamientos.getValueAt(filselec, 4).toString();
            estado = jtTratamientos.getValueAt(filselec, 5).toString().equals("true");
            importe = jtTratamientos.getValueAt(filselec, 6).toString();
            System.out.println(tratamientoData.BuscarTratamiento(idTratamiento));
            Tratamiento trataselec = tratamientoData.BuscarTratamiento(idTratamiento);
            Tratamiento_Registrar.tratamientoP=trataselec;        
            Tratamiento_Registrar.jtDescripcion.setText(descripcion);
            Tratamiento_Registrar.jtTipo.setText(tipo);
            Tratamiento_Registrar.jcProducto.removeAllItems();
            Tratamiento_Registrar.jcProducto.addItem(prodselec);
            Tratamiento_Registrar.jcheckEstado.setSelected(estado);
            Tratamiento_Registrar.jtImporte.setText(importe);
            dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarActionPerformed
  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbAgregar;
    private javax.swing.JTable jtTratamientos;
    // End of variables declaration//GEN-END:variables
private void armarTabla() {
        modelo.addColumn("Id Tratamiento");
        modelo.addColumn("tipo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("id");
        modelo.addColumn("Producto");
        modelo.addColumn("Estado");
        modelo.addColumn("Importe");
        jtTratamientos.setModel(modelo);
    }

    private void cargarTabla() {
        TratamientoData tratamientoData = new TratamientoData();
        List<Tratamiento> tratamientos = tratamientoData.ListarTratamiento();
       
        for (Tratamiento tratamiento : tratamientos) {
           
            modelo.addRow(new Object[]{
                tratamiento.getIdTratamiento(),
                tratamiento.getTipoTratamiento(),
                tratamiento.getDescripcion(),
                tratamiento.getProducto().getIdProducto(),
                tratamiento.getProducto().getNombre(),
                tratamiento.isEstadoTratamiento(),
                tratamiento.getImporte()

            });

        }
    }
    
}

