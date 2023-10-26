/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Producto;
import Entidades.Tratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


/**
 *
 * @author noelia
 */
public class TratamientoData {

    Tratamiento tratamiento = new Tratamiento();
    private Connection con = null;

    public TratamientoData() {
        con = Conexion.getConexion();
    }

    public void GuardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO `tratamiento`(`descripcion`, `medicamento`, `importe`, `tipoTratamiento`, `activo`) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tratamiento.getDescripcion());
            ps.setInt(2, tratamiento.getProducto().getIdProducto());
            ps.setInt(3, tratamiento.getImporte());
            ps.setString(4, tratamiento.getTipoTratamiento());
            ps.setBoolean(5, tratamiento.isEstadoTratamiento());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla Tratamiento " + ex.getMessage());
        }
    }

    public void ModificarTratamiento(Tratamiento tratamiento) {
        String sql = "UPDATE tratamiento SET descripcion=?,idProducto=?,importe=?,tipoTratamiento=?,activo=? WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tratamiento.getDescripcion());
            ps.setInt(2, tratamiento.getProducto().getIdProducto());
            ps.setInt(3, tratamiento.getImporte());
            ps.setString(4, tratamiento.getTipoTratamiento());
            ps.setBoolean(5, tratamiento.isEstadoTratamiento());
            ps.setInt(6, tratamiento.getIdTratamiento());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "El tratamiento no existe. ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento " + ex.getMessage());
        }
    }

    public Tratamiento BuscarTratamiento(int id) {
        Tratamiento tratamiento = null;
        String sql = "SELECT * FROM `tratamiento` WHERE idTratamiento=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            //``, `medicamento`, `importe`, `tipoTratamiento`, ``
            if (rs.next()) {
                tratamiento = new Tratamiento();
                ProductoData productoData = new ProductoData();
                Producto producto = new Producto();
                producto = productoData.BuscarProductoPorId(rs.getInt("idProducto"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setEstadoTratamiento(rs.getBoolean("activo"));
                tratamiento.setIdTratamiento(id);
                tratamiento.setImporte(rs.getInt("importe"));
                tratamiento.setProducto(producto);
                tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Tratamiento");
                ps.close();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tratamiento " + ex.getMessage());
        }
        return tratamiento;
    }

    public void eliminarTratamiento(int id) {
        String sql = "UPDATE tratamiento set activo=0 WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino con exito el tratamiento.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla tratamiento" + ex.getMessage());

        }
    }

    public List<Tratamiento> ListarTratamiento() {
    List<Tratamiento> tratamientos = new ArrayList<>();
    String sql = "SELECT * FROM tratamiento";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            ProductoData productoData = new ProductoData();
                Producto producto = new Producto();
                producto = productoData.BuscarProductoPorId(rs.getInt("idProducto"));
            Tratamiento tratamiento = new Tratamiento();
            tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
            tratamiento.setDescripcion(rs.getString("descripcion"));
            tratamiento.setProducto(producto); 
            tratamiento.setImporte(rs.getInt("importe"));
            tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
            tratamiento.setEstadoTratamiento(rs.getBoolean("activo"));

            tratamientos.add(tratamiento);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR al listar tratamientos: " + ex.getMessage());
    }

    return tratamientos;
}

        public List<Tratamiento> ListarTratamientos() {
            List<Tratamiento> tratamientos = new ArrayList<>();
            String sql = "SELECT * FROM `tratamiento` WHERE 1";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Tratamiento tratamiento = new Tratamiento();
                    ProductoData productoData = new ProductoData();
                    Producto producto = new Producto();
                    producto = productoData.BuscarProductoPorId(rs.getInt("idProducto"));
                    tratamiento.setDescripcion(rs.getString("descripcion"));
                    tratamiento.setEstadoTratamiento(rs.getBoolean("activo"));
                    tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                    tratamiento.setImporte(rs.getInt("importe"));
                    tratamiento.setProducto(producto);
                    tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
                    tratamientos.add(tratamiento);

                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tratamiento " + ex.getMessage());
            }

            return tratamientos;
    }
         public Tratamiento BuscarTramientoPorNombre(String tipoTratamiento){
             Tratamiento tratamiento = null;
             String sql = "SELECT * FROM tratamiento  WHERE tipoTratamiento Like ?%";
             try {
                 PreparedStatement ps = con.prepareStatement(sql);
                 ps.setString(1, tipoTratamiento);
                 ResultSet rs = ps.executeQuery();
                 if (rs.next()) {
                     tratamiento = new Tratamiento();
                     ProductoData productoData=new ProductoData();
                     Producto producto= new Producto();
                     producto= productoData.BuscarProductoPorId(rs.getInt("idProducto"));
                     tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                     tratamiento.setDescripcion(rs.getString("descripcion"));
                     tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
                     tratamiento.setImporte(rs.getInt("importe"));
                     tratamiento.setProducto(producto);
                     tratamiento.setEstadoTratamiento(rs.getBoolean("activo"));
                 } else {
                     JOptionPane.showMessageDialog(null, "No existe el Tratamiento");
                 }
                 ps.close();
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"Problema con la tabla tratamiento "+ ex.getMessage());
             }
             return tratamiento;
   
    }
        

}
