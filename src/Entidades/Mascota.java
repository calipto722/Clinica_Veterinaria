package Entidades;

import java.time.LocalDate;

public class Mascota {

    private int idMascota;

    private String nombreAlias;

    private String sexo;

    private String especie;

    private String raza;

    private String colorPelo;

    private LocalDate fechaNacimiento;

    private boolean estadoMascota;

    private Cliente idcliente;

    public Mascota(int idMascota, String nombreAlias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNacimiento, boolean estadoMascota, Cliente idcliente) {
        this.idMascota = idMascota;
        this.nombreAlias = nombreAlias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoMascota = estadoMascota;
        this.idcliente = idcliente;
    }

    public Mascota(String nombreAlias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNacimiento, boolean estadoMascota, Cliente idcliente) {
        this.nombreAlias = nombreAlias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoMascota = estadoMascota;
        this.idcliente = idcliente;
    }

    public Mascota() {
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreAlias() {
        return nombreAlias;
    }

    public void setNombreAlias(String nombreAlias) {
        this.nombreAlias = nombreAlias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(boolean estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return "idMascota=" + idMascota + ", nombreAlias=" + nombreAlias ;
    }
    
    
    
}
