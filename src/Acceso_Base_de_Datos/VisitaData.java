/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author noelia
 */
public class VisitaData {
    
    Visita visita = new Visita();
    private Connection con=null;
    
    public VisitaData(){
        con=Conexion.getConexion();
    }
    public void RegistrarVisita(Visita visita){
        String sql="INSERT INTO `visita`( idMascota, fechaVisita, importe, peso, idTratamiento) VALUES (?,?,?,?,?) ";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setInt(3,visita.getImporte());
            ps.setDouble(4,visita.getPesoActual());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita Registrada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla visita "+ ex.getMessage());
        }
    }
    public void ModificarVisita(Visita visita){
        String sql= "UPDATE visita SET idMascota=?,fechaVisita=?,importe=?,peso=?,idTratamiento=? WHERE idVisita=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setInt(3, visita.getImporte());
            ps.setDouble(4,visita.getPesoActual());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setInt(6, visita.getIdVisita());
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La visita no se encuentra registrada");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla visita "+ ex.getMessage());
        }
    }
    public void eliminarVisita(int id){
        try{
            String sql="DELETE FROM `visita` WHERE idVisita=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila= ps.executeUpdate();
            if (fila==1){
                JOptionPane.showMessageDialog(null, "Se elimino la visita");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla visita "+ ex.getMessage());
        }
    }
    public List<Visita> listarVisitas() {
        List<Visita> visitas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM `visita` WHERE 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                visita = new Visita();
                Mascota mascota = new Mascota();
                Tratamiento tratamiento = new Tratamiento();
                MascotaData mascData = new MascotaData();
                TratamientoData tratData = new TratamientoData();
                tratamiento = tratData.buscarTratamiento(rs.getInt("idTratamiento")); //crear metodo para buscar el tratamiento
                mascota = mascData.buscarMascota(rs.getInt("idMascota")); //crear metodo buscar mascota
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setFechaVisita(rs.getDate("fechaVisiita").toLocalDate());
                visita.setImporte(rs.getInt("importe"));
                visita.setPesoActual(rs.getDouble("peso"));
                visita.setTratamiento(tratamiento);
                visitas.add(visita);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al acceder a la tabla visita " + ex.getMessage());
        }
        return visitas;
    }

    
}
