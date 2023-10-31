package Acceso_Base_de_Datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class UsuarioData {

    private Connection com = null;

    public UsuarioData() {
        com = Conexion.getConexion();
    }

    public Usuario verificarUsuario(String nombre) {
        String sql = "SELECT * FROM `usuario` WHERE nombre = ?";
        Usuario usuario = new Usuario();
        PreparedStatement ps = null;

        try {
            ps = com.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getString("password"));
                
            } else {
                JOptionPane.showMessageDialog(null, " Usuario no Registrado");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios " + ex.getMessage());
        }
        return usuario;
    }

    public boolean verificarPasswor(Usuario nombreUsuario, String pasword) {
       boolean correcto = nombreUsuario.getPassword().equals(pasword);
       
        if (!correcto) {
            JOptionPane.showMessageDialog(null, " Contraseña Incorrecta");
        }
       
return correcto;
    }
}
