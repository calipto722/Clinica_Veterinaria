/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class ProductoData {

    Producto producto = new Producto();
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }

    public void GuardarProducto(Producto propucto) {
        String sql = "INSERT INTO `producto`( `idProducto`,`nombre`, `descripcion`, `precio`, `stock`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, propucto.getIdProducto());
            ps.setString(2, propucto.getNombre());
            ps.setString(3, propucto.getDescripcion());
            ps.setInt(4, propucto.getPrecio());
            ps.setInt(5, propucto.getStock());
            int exito=ps.executeUpdate();
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Producto Añadida con exito");
            }else {
                JOptionPane.showMessageDialog(null, "El Producto existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla Producto " + ex.getMessage());
        }

    }

    public void ModificarProducto(Producto producto) {
        String sql = "UPDATE `producto` SET `nombre`=?,`descripcion`=?,`precio`=?,`stock`=? WHERE idProducto=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getIdProducto());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //preguntar tipo de eliminado
    public void EliminarProducto(int id) {
        // String sql= ""
    }

    public List<Producto> ListarProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM `producto` WHERE 1";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }

        return productos;
    }

    public Producto BuscarProductoPorId(int id) {
        Producto producto = null;
        String sql = "SELECT  `nombre`, `descripcion`, `precio`, `stock` FROM `producto` WHERE `idProducto`=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto=new Producto();
                producto.setIdProducto(id);
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
            } else {
                  JOptionPane.showMessageDialog(null,"No existe el Producto"); 
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
return producto;
    }
    public Producto BuscarProductoPorNombre(String nombre){
        Producto producto=null;
        String sql= "SELECT * FROM producto  WHERE nombre Like ?%";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
            } else {
                  JOptionPane.showMessageDialog(null,"No existe el Producto"); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problema con la tabla producto " + ex.getMessage());
        }
return producto;
   
    }
}
