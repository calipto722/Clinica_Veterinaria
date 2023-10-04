/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class MascotaData {
    Mascota mascota= new Mascota();
    private Connection con= null;
    public MascotaData() {
        con =Conexion.getConexion();
    }
   public void GuardarMascota(Mascota mascota){
       String sql ="INSERT INTO `mascota`( `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `fechaNac`, `idCliente`, `activo`)"
               + " VALUES (?,?,?,?,?,?,?,?)";
       try {
           PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, mascota.getNombreAlias());
           ps.setString(2, mascota.getSexo());
           ps.setString(3, mascota.getEspecie());
           ps.setString(4, mascota.getRaza());
           ps.setString(5, mascota.getColorPelo());
           ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
           ps.setInt(7,mascota.getcliente().getIdCliente());
           ps.setBoolean(8, mascota.isEstadoMascota());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
               mascota.setIdMascota(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Mascota Añadida con exito");
           }
           ps.close();
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR al acceder a la tabla Mascota "+ ex.getMessage());
       }
   }
   public void ModificarMascota(Mascota mascota){
       
   }
}
