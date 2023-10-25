/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_Base_de_Datos.Conexion;
import Acceso_Base_de_Datos.MascotaData;
import Acceso_Base_de_Datos.VisitaData;
import Entidades.Mascota;
import Entidades.Visita;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author noelia
 */
public class Mascota_HistorialClinico extends javax.swing.JInternalFrame {
private DefaultTableModel modelo= new DefaultTableModel();
    private Connection con=null;
     
    public Mascota_HistorialClinico() {
        initComponents();
        cargarbox();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PesoPromedio = new javax.swing.JLabel();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Historial Clinico");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox1KeyReleased(evt);
            }
        });

        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso Promedio");

        PesoPromedio.setText("--------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 249, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesoPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    con=Conexion.getConexion();
       
        Mascota masp = (Mascota) jComboBox1.getSelectedItem();
    
        try {
            JasperReport report =null;
            String dir = "src\\RECURSOS\\Historial_Clinico.jasper";
         report = (JasperReport) JRLoader.loadObjectFromFile(dir);
        Map parametro = new HashMap();
        parametro.put("Mascota", masp.getNombreAlias());
            JasperPrint jprint= JasperFillManager.fillReport(report,parametro,con);
            JasperViewer view =new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
        Logger.getLogger(Mascota_HistorialClinico.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyReleased
   
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 borrarFilas();
        VisitaData visitaData = new VisitaData();
    List<Visita> visitas= visitaData.listarVisitas();
    Mascota masp = (Mascota) jComboBox1.getSelectedItem();
        for (int i = 0; i < 10; i++) {
             if (visitas.get(i).getMascota().getIdMascota()==(masp.getIdMascota())) {
                modelo.addRow(new Object[]{
                    visitas.get(i).getFechaVisita(),
                    visitas.get(i).getTratamiento().getTipoTratamiento(),
                    visitas.get(i).getPesoActual()
                });
        }
 {
       
           
            }
        } 
        PesoPromedio.setText(pesopromed(jTable1));// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PesoPromedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Mascota> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
     private void cargarbox() {
         MascotaData mascotaD = new MascotaData();
        List<Mascota> mascotas = mascotaD.listarMascota();
        jComboBox1.removeAllItems();
       
        for (int i = 0; i <mascotas.size() ; i++) {
            jComboBox1.addItem(mascotas.get(i));

        }

    }
private void armarTabla(){
    modelo.addColumn("Fecha visita");
    modelo.addColumn("Tratamiento");
   modelo.addColumn("Peso");
    
    jTable1.setModel(modelo);
    
}
private void borrarFilas(){
    int f=jTable1.getRowCount()-1;
    
    for(int i=f; i>=0;i--){
        modelo.removeRow(i);
    }
}
private String pesopromed(JTable jTable){
    int pesosuma=0;
    double pesoprod = 0;
    for (int i = 0; i <jTable.getRowCount(); i++) {
        
        pesosuma= (int) (pesosuma+ Double.parseDouble(jTable1.getValueAt(i,2).toString()));
            pesoprod= pesosuma/jTable.getRowCount();
        
    }
    return pesoprod+"";
    }
   

                

}
