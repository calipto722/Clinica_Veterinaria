package Entidades;

import java.util.ArrayList;

public class Cliente {

    private int idCliente;

    private int Dni;

    private String nombre;

    private String apellido;

    private int telefono;

    private int nombreAlternativo;

    private String direccion;

    private boolean estadoCLiente;

    private ArrayList Mascota;

    public Cliente(int idCliente, int Dni, String nombre, String apellido, int telefono, int nombreAlternativo, String direccion, boolean estadoCLiente, ArrayList Mascota) {
        this.idCliente = idCliente;
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nombreAlternativo = nombreAlternativo;
        this.direccion = direccion;
        this.estadoCLiente = estadoCLiente;
        this.Mascota = Mascota;
    }

    public Cliente(int Dni, String nombre, String apellido, int telefono, int nombreAlternativo, String direccion, boolean estadoCLiente, ArrayList Mascota) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nombreAlternativo = nombreAlternativo;
        this.direccion = direccion;
        this.estadoCLiente = estadoCLiente;
        this.Mascota = Mascota;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNombreAlternativo() {
        return nombreAlternativo;
    }

    public void setNombreAlternativo(int nombreAlternativo) {
        this.nombreAlternativo = nombreAlternativo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstadoCLiente() {
        return estadoCLiente;
    }

    public void setEstadoCLiente(boolean estadoCLiente) {
        this.estadoCLiente = estadoCLiente;
    }

    public ArrayList getMascota() {
        return Mascota;
    }

    public void setMascota(ArrayList Mascota) {
        this.Mascota = Mascota;
    }

    @Override
    public String toString() {
        return  "idCliente= " + idCliente + ", nombre= " + nombre + ", apellido= " + apellido ;
    }
    
    
    
}
