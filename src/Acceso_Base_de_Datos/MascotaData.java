/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Cliente;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MascotaData {

    Mascota mascota = new Mascota();
    private Connection con = null;

    public MascotaData() {
        con = Conexion.getConexion();
    }

    public void GuardarMascota(Mascota mascota) {

        try {
            String sql = "INSERT INTO `mascota`( `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `fechaNac`, `idCliente`, `activo`,pesoPromedio)"
                    + " VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mascota.getNombreAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
            ps.setInt(7, mascota.getcliente().getIdCliente());
            ps.setBoolean(8, mascota.isEstadoMascota());
            ps.setDouble(9, mascota.getPesoprod());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mascota Añadida con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla Mascota " + ex.getMessage());
        }
    }

    public void ModificarMascota(Mascota mascota) {
        String sql = "UPDATE `mascota` SET `alias`=?,`sexo`=?,`especie`=?,`raza`=?,`colorPelo`=?,`fechaNac`=?,`idCliente`=?,`activo`=?, pesoPromedio= ?WHERE `idMascota`=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mascota.getNombreAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNacimiento()));
            ps.setInt(7, mascota.getcliente().getIdCliente());
            ps.setBoolean(8, mascota.isEstadoMascota());
            ps.setDouble(9, mascota.getPesoprod());
            ps.setInt(10, mascota.getIdMascota());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente. ");
            } else {
                JOptionPane.showMessageDialog(null, "La Mascota no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota" + JOptionPane.ERROR_MESSAGE + ex.getMessage());
        }

    }

    public void EliminarMascota(int id) {
        String sql = "UPDATE `mascota` SET `activo`=0 WHERE `idMascota`=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino la Mascota. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla Mascota " + ex.getMessage());

        }

    }

    public List<Mascota> ListarMascota() {
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT*FROM mascota WHERE activo=1 ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mascota mascota = new Mascota();
                Cliente cliente = new Cliente();
                ClienteData clienteData = new ClienteData();
                cliente = clienteData.buscarCliente(rs.getInt("idCliente"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setEstadoMascota(rs.getBoolean("activo"));
                mascota.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setNombreAlias(rs.getString("alias"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setIdcliente(cliente);
                mascota.setSexo(rs.getString("sexo"));
                mascota.setPesoprod(rs.getDouble("pesoPromedio"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mascotas;
    }

    public Mascota BuscarMascota(int id) {
        Mascota mascota = null;
        String sql = "SELECT* FROM  mascota WHERE  idMascota=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                ClienteData clienteData = new ClienteData();
                Cliente cliente = new Cliente();
                cliente = clienteData.buscarCliente(rs.getInt("idCliente"));
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setEstadoMascota(rs.getBoolean("activo"));
                mascota.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                mascota.setIdcliente(cliente);
                mascota.setNombreAlias(rs.getString("alias"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setPesoprod(rs.getDouble("pesoPromedio"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe La Mascota");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota " + ex.getMessage());
        }
        return mascota;
    }

    public Mascota BuscarMascotaPorNombre(String nombre) {
        Mascota mascota = null;
        String sql = "SELECT* FROM  mascota WHERE  alias LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                ClienteData clienteData = new ClienteData();
                Cliente cliente = new Cliente();
                cliente = clienteData.buscarCliente(rs.getInt("idCliente"));
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setEstadoMascota(rs.getBoolean("activo"));
                mascota.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                mascota.setIdcliente(cliente);
                mascota.setNombreAlias(rs.getString("alias"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setPesoprod(rs.getDouble("pesoPromedio"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe La Mascota");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota " + ex.getMessage());
        }

        return mascota;
    }

    public void ModificarPesoMascota(Mascota mascota) {
        String sql = "UPDATE `mascota` SET pesoPromedio=? WHERE `idMascota`=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1,mascota.getPesoprod());
            ps.setInt(2, mascota.getIdMascota());
            int exito = ps.executeUpdate();
            if (exito != 1) {

                JOptionPane.showMessageDialog(null, "La Mascota no existe");
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota" + JOptionPane.ERROR_MESSAGE + ex.getMessage());
        }
    }
}
