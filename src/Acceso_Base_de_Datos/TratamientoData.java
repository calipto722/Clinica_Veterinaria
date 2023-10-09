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
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;

/**
 *
 * @author noelia
 */
public class TratamientoData {
    Tratamiento tratamiento =new Tratamiento();
    private Connection con =null;
    public TratamientoData(){
    con=Conexion.getConexion();
}
    public void GuardarTratamiento(Tratamiento tratamiento){
        String sql= "INSERT INTO `tratamiento`(`descripcion`, `medicamento`, `importe`, `tipoTratamiento`, `activo`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tratamiento.getDescripcion());
            ps.setInt(2, tratamiento.getProducto().getIdProducto());
            ps.setInt(3,tratamiento.getImporte());
            ps.setString(4, tratamiento.getTipoTratamiento());
            ps.setBoolean(5,tratamiento.isEstadoTratamiento());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1)); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al acceder a la tabla Tratamiento "+ ex.getMessage());
        }
    }
    
    public void ModificarTratamiento(Tratamiento tratamiento){
        String sql= "";
    }
    public Tratamiento BuscarTratamiento (int id){
        Tratamiento tratamiento =null;
        String sql="SELECT * FROM `tratamiento` WHERE idTratamiento=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            //``, `medicamento`, `importe`, `tipoTratamiento`, ``
            if (rs.next()) {
                 tratamiento= new Tratamiento();
                 ProductoData productoData=new ProductoData();
                 Producto producto = new Producto();
                 producto=productoData.BuscarProductoPorId(rs.getInt("medicamento"));
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
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tratamiento "+ ex.getMessage());
        }
      return tratamiento;  
    }
}
