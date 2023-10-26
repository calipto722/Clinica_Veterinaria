/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author noelia
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuPrincipal() {
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
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jmGestionClientes = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMmascotas = new javax.swing.JMenu();
        jMGestionMascotas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jmBuscarProductosNombre = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmRegistroProducto = new javax.swing.JMenuItem();
        jMenuVisita = new javax.swing.JMenu();
        jmRegistrarVisita = new javax.swing.JMenuItem();
        jListarTratamiento = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSMSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuClientes.setText("Clientes");

        jmGestionClientes.setText("Gestion Clientes");
        jMenuClientes.add(jmGestionClientes);

        jMenuItem7.setText("Mascotas de cliente");
        jMenuClientes.add(jMenuItem7);

        jMenuBar1.add(jMenuClientes);

        jMmascotas.setText("Mascotas");

        jMGestionMascotas.setText("Gestion Mascota");
        jMGestionMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGestionMascotasActionPerformed(evt);
            }
        });
        jMmascotas.add(jMGestionMascotas);

        jMenuItem3.setText("Historial Clinico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMmascotas.add(jMenuItem3);

        jMenuBar1.add(jMmascotas);

        jMenuProductos.setText("Productos");

        jmBuscarProductosNombre.setText("Productos por nombre");
        jmBuscarProductosNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarProductosNombreActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmBuscarProductosNombre);

        jMenuItem6.setText("Stock");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItem6);

        jmRegistroProducto.setText("Ingreso de Productos");
        jmRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmRegistroProducto);

        jMenuBar1.add(jMenuProductos);

        jMenuVisita.setText("Visita");

        jmRegistrarVisita.setText("Registrar visita");
        jmRegistrarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarVisitaActionPerformed(evt);
            }
        });
        jMenuVisita.add(jmRegistrarVisita);

        jListarTratamiento.setText("Lista Tratamientos");
        jListarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarTratamientoActionPerformed(evt);
            }
        });
        jMenuVisita.add(jListarTratamiento);

        jMenuBar1.add(jMenuVisita);

        jMenu1.setText("Contabilidad");

        jMenuItem1.setText("Factura");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Salir");

        jMenuItem8.setText("Cerrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jSMSalir.setText("Salir");
        jSMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSMSalirActionPerformed(evt);
            }
        });
        jMenu5.add(jSMSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMGestionMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGestionMascotasActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        Mascota_Registro rdm = new Mascota_Registro();
        rdm.setVisible(true);
        Escritorio.add(rdm);
        Escritorio.moveToFront(rdm);
        
    }//GEN-LAST:event_jMGestionMascotasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Escritorio.removeAll();
    Escritorio.repaint();
    Mascota_HistorialClinico historialClinico= new Mascota_HistorialClinico();
historialClinico.setVisible(true);
Escritorio.add(historialClinico);
Escritorio.moveToFront(historialClinico);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmBuscarProductosNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarProductosNombreActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       ProductosporNombre bpn= new ProductosporNombre();
       bpn.setVisible(true);
       Escritorio.add(bpn);
       Escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jmBuscarProductosNombreActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
Escritorio.removeAll();
       Escritorio.repaint();
       Producto_Stock stockProducto= new Producto_Stock();
       stockProducto.setVisible(true);
       Escritorio.add(stockProducto);
       Escritorio.moveToFront(stockProducto);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jSMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSMSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jSMSalirActionPerformed

    private void jmRegistrarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarVisitaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Visita_Registrar rgv = new Visita_Registrar();
        rgv.setVisible(true);
        Escritorio.add(rgv);
        Escritorio.moveToFront(rgv);
// TODO add your handling code here:
    }//GEN-LAST:event_jmRegistrarVisitaActionPerformed

    private void jmRegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroProductoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Productos_Ingresos ipd= new Productos_Ingresos();
        ipd.setVisible(true);
        Escritorio.add(ipd);
        Escritorio.moveToFront(ipd);
    }//GEN-LAST:event_jmRegistroProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     Escritorio.removeAll();
        Escritorio.repaint();
        Ventas ventas =new Ventas();
        
        ventas.setVisible(true);
        Escritorio.add(ventas);
        Escritorio.moveToFront(ventas);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jListarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarTratamientoActionPerformed
      Escritorio.removeAll();
        Escritorio.repaint();
        Tratamiento_Listar tratamiento_Listar= new Tratamiento_Listar();
        
        tratamiento_Listar.setVisible(true);
        Escritorio.add(tratamiento_Listar);
        Escritorio.moveToFront(tratamiento_Listar);    // TODO add your handling code here:
    }//GEN-LAST:event_jListarTratamientoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem jListarTratamiento;
    private javax.swing.JMenuItem jMGestionMascotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuVisita;
    private javax.swing.JMenu jMmascotas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jSMSalir;
    private javax.swing.JMenuItem jmBuscarProductosNombre;
    private javax.swing.JMenuItem jmGestionClientes;
    private javax.swing.JMenuItem jmRegistrarVisita;
    private javax.swing.JMenuItem jmRegistroProducto;
    // End of variables declaration//GEN-END:variables
}
