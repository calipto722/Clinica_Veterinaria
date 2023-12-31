/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_Base_de_Datos.ProductoData;
import Entidades.Producto;
import static Vistas.Ventas.lbl_total;
import static Vistas.Ventas.model;
import static Vistas.Ventas.total;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elmsn
 */
public class ProductosporNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    
    

    /**
     * Creates new form BuscarProductos
     */
    public ProductosporNombre() {
        initComponents();
        armarTabla();
        cargaTabla();
        jbAgregar.setVisible(false);
        jlcant.setVisible(false);
        jtCant.setVisible(false);
        
    }
public void nuevaTabla(){
    modelo= new DefaultTableModel();
    jtProductos.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        jtNombreProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jlcant = new javax.swing.JLabel();
        jtCant = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Nombre del producto:");

        jtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreProductoActionPerformed(evt);
            }
        });
        jtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreProductoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Buscar Productos por nombre");

        jScrollPane1.setViewportView(jtProductos);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbAgregar.setText("AGREGAR");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jlcant.setText("CANT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(148, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlcant)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                                        .addComponent(jbAgregar))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAgregar)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlcant)
                                    .addComponent(jtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addComponent(jbSalir)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreProductoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreProductoKeyReleased
        borrarFilas();
        ProductoData prodData = new ProductoData();

        List<Producto> producto = prodData.ListarProductos();
        for (Producto prod : producto) {
            if (prod.getNombre().toLowerCase().startsWith(jtNombreProducto.getText().toLowerCase())) {
                modelo.addRow(new Object[]{
                    prod.getIdProducto(),
                    prod.getNombre(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getStock()
                });
            }
        }
    }//GEN-LAST:event_jtNombreProductoKeyReleased

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        int filselec = jtProductos.getSelectedRow();
        try {
            String id, nombre, descripcion,cant, precio, importe;
            int canti;
            double calcula;

            if (filselec == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar producto", "Advertancia", JOptionPane.WARNING_MESSAGE);// TODO add your handling code here:
            } else {
                if (jtCant.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingresar Cantidad", "Advertancia", JOptionPane.WARNING_MESSAGE);
                }
                modelo = (DefaultTableModel) jtProductos.getModel();
                id = jtProductos.getValueAt(filselec, 0).toString();
                nombre = jtProductos.getValueAt(filselec, 1).toString();
                descripcion = jtProductos.getValueAt(filselec, 2).toString();
                precio = jtProductos.getValueAt(filselec, 3).toString();
                cant = jtCant.getText();

                double x = (Double.parseDouble(precio) * Integer.parseInt(cant));
                importe = String.valueOf(x);
              

                
                modelo = (DefaultTableModel) Ventas.jtFactura.getModel();
                String filaElemento[]={id,nombre,descripcion,importe};
                model.addRow(filaElemento);
                ProductoData prod = new ProductoData();
                Producto producStock = prod.BuscarProductoPorId(Integer.parseInt(id));
                producStock.setStock(producStock.getStock() - Integer.parseInt(cant));
                prod.ModificarProducto(producStock);
                
                Ventas.total+= x;
                
                lbl_total.setText("$"+total);
                
                dispose();
            }
        } catch (Exception ex) {

        }

        
// TODO add your handling code here:
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    public javax.swing.JLabel jlcant;
    public javax.swing.JTextField jtCant;
    private javax.swing.JTextField jtNombreProducto;
    public javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
private void armarTabla() {
    modelo=new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("descripcion");
        modelo.addColumn("precio");
        modelo.addColumn("stock");

        jtProductos.setModel(modelo);

    }
private void cargaTabla(){
       ProductoData prodData = new ProductoData();

        List<Producto> producto = prodData.ListarProductos();
        for (Producto prod : producto) {
           
               modelo.addRow(new Object[]{
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
            modelo.removeRow(i);
        }
    }
}
