/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class ClienteData {
    Cliente cliente= new Cliente();
    private Connection con=null;

    public ClienteData() {
        
        con=Conexion.getConexion();
    }
    
    public void GuardarCliente (Cliente cliente){
        String sql= "INSERT INTO cliente (dni,nombre,apellido,telefono,direccion,contactoAlternativo,activo)"+ "VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setInt(6, cliente.getNombreAlternativo());
            ps.setBoolean(7, cliente.isEstadoCLiente());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente guardado con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla cliente "+ ex.getMessage());
    }
}
    public void ModificarCliente (Cliente cliente){
        
    }
}
