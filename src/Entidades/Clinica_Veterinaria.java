/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Acceso_Base_de_Datos.ClienteData;
import Acceso_Base_de_Datos.Conexion;

/**
 *
 * @author noelia
 */
public class Clinica_Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.getConexion();
        
        ClienteData clientD= new ClienteData();
        Cliente client=new Cliente(30215231, "Maria ","Juarez ", 1133220432, 22334589, "calle 14 n 4568", true);
        clientD.GuardarCliente(client);
    
}
}