/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/";
    private static final String Db = "veterinario";
    private static final String usuario = "root";
    private static String password = "";
    private static Connection connection;

    public Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Statement");

                // Setup the connection with the DB
                connection = DriverManager.getConnection(url + Db + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
                System.out.println("Conexion con Exito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            }

        }
        return connection;

    }
}
