/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Acceso_Base_de_Datos.ClienteData;
import Acceso_Base_de_Datos.Conexion;
import Acceso_Base_de_Datos.MascotaData;
import Acceso_Base_de_Datos.ProductoData;
import com.sun.javafx.font.PrismFontFile;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
        MascotaData mascotaData= new MascotaData();
       ClienteData clientD= new ClienteData();
       Cliente cliente= new Cliente();
//       Cliente client=new Cliente(30215220, "Maria ","Juarez ", 133220432, "2334589", "calle 14 n 4568", true);
//       clientD.GuardarCliente(client);
      //  Cliente clienM= new Cliente(1, 30215231,"Maria juanita ","Juarez ", 1135298799,22334589,"calle 14 n 3368", true);
      // clientD.ModificarCliente(clienM);
     // clientD.eliminarCliente(1);
        //System.out.println(clientD.listarClientes());

//        Cliente cliente=clientD.buscarCliente(1);
//        Mascota mascota= new Mascota("Cielo", "Hembra","Perro","Callejera", "Negro", LocalDate.of(2022, Month.MARCH,12), true, cliente);
//       
//      mascotaData.GuardarMascota(mascota);

Producto producto=new Producto("Sepillo","Peine para perro",600, 2);
        ProductoData pd=new ProductoData();
        pd.GuardarProducto(producto);
        System.out.println(pd.BuscarProductoPorId(1));
        List<Producto> productos=pd.ListarProductos();
        System.out.println("-------Listado-----");
        for (Producto producto1 : productos) {
            System.out.println(producto1);
        }

//            cliente=clientD.buscarCliente(1);
//            
//            System.out.println(cliente);
//        Mascota mascota= new Mascota("Cachi", "Macho","gato","Mestizo", "blanco", LocalDate.of(2019, Month.MARCH,5), true, cliente);
//       
//       mascotaData.GuardarMascota(mascota);

}
}