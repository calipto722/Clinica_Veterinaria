/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import Entidades.Visita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String sql="INSERT INTO `visita`( idMascota, fechaVisita, detalle, peso, idTratamiento) VALUES (?,?,?,?,?) ";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
