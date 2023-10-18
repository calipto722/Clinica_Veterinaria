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
import Acceso_Base_de_Datos.TratamientoData;
import Acceso_Base_de_Datos.VisitaData;
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
//       ClienteData clientD= new ClienteData();
//       Cliente cliente= new Cliente();
     //  Cliente client=new Cliente(302240234, "Mar","Juzco ", 1332444092, "2244552", "calle 24 n 4668", true);
    //  clientD.GuardarCliente(client);
      //  Cliente clienM= new Cliente(1, 30215231,"Maria juanita ","Juarez ", 1135298799,22334589,"calle 14 n 3368", true);
     //  clientD.ModificarCliente(clienM);
     // clientD.eliminarCliente(1);
        //System.out.println(clientD.listarClientes());

       // cliente=clientD.buscarCliente(1);
//        System.out.println(clientD.buscarCliente(1));
   // Mascota mascota= new Mascota();
////       
 // Mascota masc=   mascotaData.BuscarMascota(2);
//        System.out.println(masc);
//    Producto producto=new Producto("shampoo","para el perro",800, 10);
//       ProductoData pd=new ProductoData();
//  Producto producto= new Producto();
////  pd.GuardarProducto(producto);
//     producto=pd.BuscarProductoPorId(3);
//        System.out.println(pd.BuscarProductoPorId(1));
//////        List<Producto> productos=pd.ListarProductos();
//////        System.out.println("-------Listado-----");
//////        for (Producto producto1 : productos) {
//////            System.out.println(producto1);
////   // }
////
//////            cliente=clientD.buscarCliente(1);
//////            
//////            System.out.println(cliente);
//////        Mascota mascota= new Mascota("Cachi", "Macho","gato","Mestizo", "blanco", LocalDate.of(2019, Month.MARCH,5), true, cliente);
//////       
//////       mascotaData.GuardarMascota(mascota);
//Tratamiento tratamiento=new Tratamiento();
//Tratamiento tratamiento=new Tratamiento(6,"Baño", "Bañar perro y quitarles las garrapatas", producto, 4500, true);
//TratamientoData tratData=new TratamientoData();
////tratData.ModificarTratamiento(tratamiento);
////tratData.eliminarTratamiento();
//
////    //tratData.GuardarTratamiento(tratamiento);
//
////      //  System.out.println(tratamiento);
////        tratamiento=tratData.BuscarTratamiento(6);
// VisitaData visitData= new VisitaData();
////// 
//// Visita visita = new Visita(LocalDate.of(2023, Month.JUNE, 15), 6000, tratamiento, 20, masc);
//// visitData.GuardarVisita(visita); 
////System.out.println(visitData.listarVisitas());
// List<Visita> visitas= visitData.listarVisitas();
//        for (Visita visita : visitas) {
//            System.out.println(visita);
//        }
////            
//        }
//Mascota masc= mascotaData.BuscarMascotaPorNombre("Cielo");
Mascota masp = mascotaData.BuscarMascota(2);
//        System.out.println(masc);
        System.err.println(masp);
        /*consultar 
        Registro mascota linea 348
        */
        VisitaData visitaData= new VisitaData();
        List<Visita> visitas=visitaData.listarVisitas();
        for (Visita visita : visitas) {
            if(visita.getMascota().getIdMascota()==(masp.getIdMascota()))
             System.out.println(visita);   
            }
            
        }
    }


