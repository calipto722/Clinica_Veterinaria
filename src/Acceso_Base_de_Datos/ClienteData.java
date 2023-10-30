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
import java.util.ArrayList;
import java.util.List;
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
        String sql= "INSERT INTO cliente (dni,nombre,apellido,telefono,direccion,contactoAlternativo,activo)"
                +"VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAlternativo());
            ps.setBoolean(7, cliente.isEstadoCLiente());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente guardado con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al acceder a la tabla cliente "+ ex.getMessage());
    }
}
    public void ModificarCliente (Cliente cliente){
        String sql= "UPDATE cliente SET dni=?,nombre=?, apellido=?,telefono=?,direccion=?,contactoAlternativo=?,activo=? WHERE idCliente=?";
        PreparedStatement ps=null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getNombreAlternativo());
            ps.setBoolean(7, cliente.isEstadoCLiente());
            ps.setInt(8, cliente.getIdCliente());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no se encuentra en la base de datos ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla Cliente" + ex.getMessage());
        }
    }

    public void eliminarCliente(int id) {
        try {
            String sql = "UPDATE cliente set activo=0 WHERE idCliente =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el cliente. ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al acceder a la tabla cliente "+ ex.getMessage());
        }

    }
    
    public List <Cliente> listarClientes(){
        List<Cliente> clientes= new ArrayList<>();
        
        try{
            String sql= "SELECT*FROM cliente WHERE activo=1 ";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Cliente cliente= new Cliente ();
                
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAlternativo(rs.getString("contactoAlternativo"));
                cliente.setEstadoCLiente(rs.getBoolean("activo"));
                clientes.add(cliente);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROR al acceder a la tabla cliente "+ ex.getMessage());
        }
        
        return clientes;
        
    }
    public Cliente buscarCliente(int id){
       cliente= null;
        String sql= "SELECT* FROM cliente WHERE idCliente=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            if (rs.next()) {                
                 cliente= new Cliente ();
                
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setNombreAlternativo(rs.getString("contactoAlternativo"));
                cliente.setEstadoCLiente(rs.getBoolean("activo"));
            }else{
                  JOptionPane.showMessageDialog(null, "No existe el Cliente");
                
            }
           ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente "+ ex.getMessage());
        }
        return cliente;
    }
}
