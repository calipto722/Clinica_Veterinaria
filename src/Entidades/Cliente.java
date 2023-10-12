package Entidades;


public class Cliente {

    private int idCliente;
    private int Dni;
    private String nombre;
    private String apellido;
    private int telefono;
   private String nombreAlternativo;
    private String direccion;
    private boolean estadoCLiente;

    public Cliente(int idCliente, int Dni, String nombre, String apellido, int telefono, String contactoAlternativo, String direccion, boolean estadoCLiente) {
        this.idCliente = idCliente;
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nombreAlternativo = contactoAlternativo;
        this.direccion = direccion;
        this.estadoCLiente = estadoCLiente;
    }

    public Cliente(int Dni, String nombre, String apellido, int telefono, String contactoAlternativo, String direccion, boolean estadoCLiente) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nombreAlternativo = contactoAlternativo;
        this.direccion = direccion;
        this.estadoCLiente = estadoCLiente;
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

    public String getNombreAlternativo() {
        return nombreAlternativo;
    }

    public void setNombreAlternativo(String contactoAlternativo) {
        this.nombreAlternativo = contactoAlternativo;
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

    @Override
    public String toString() {
        return   nombre + " "+ apellido+ ", Dni=" + Dni  ;
    }

    

}