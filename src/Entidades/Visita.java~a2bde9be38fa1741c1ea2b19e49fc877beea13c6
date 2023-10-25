package Entidades;

import java.time.LocalDate;

public class Visita {

    private int idVisita;
    private LocalDate fechaVisita;
    private int importe;
    private Tratamiento tratamiento;
    private double pesoActual;
    private Mascota mascota;

    public Visita(int idVisita, LocalDate fechaVisita, int importe, Tratamiento tratamiento, double pesoActual, Mascota mascota) {
        this.idVisita = idVisita;
        this.fechaVisita = fechaVisita;
        this.importe = importe;
        this.tratamiento = tratamiento;
        this.pesoActual = pesoActual;
        this.mascota = mascota;
    }

    public Visita(LocalDate fechaVisita, int importe, Tratamiento tratamiento, double pesoActual, Mascota mascota) {
        this.fechaVisita = fechaVisita;
        this.importe = importe;
        this.tratamiento = tratamiento;
        this.pesoActual = pesoActual;
        this.mascota = mascota;
    }

    public Visita() {
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return  "Macota: "+mascota.getNombreAlias()+ ", fechaVisita=" + fechaVisita ;
    }
    
}
