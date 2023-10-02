package Entidades;

public class Tratamiento {

    private int idTratamiento;

    private String nombre;

    private Tipo_Tratamiento tipoTratamiento;

    private String descripcion;

    private String medicamento;

    private int importe;

    private boolean estadoTratamiento;

    public Tratamiento(int idTratamiento, String nombre, Tipo_Tratamiento tipoTratamiento, String descripcion, String medicamento, int importe, boolean estadoTratamiento) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.estadoTratamiento = estadoTratamiento;
    }

    public Tratamiento(String nombre, Tipo_Tratamiento tipoTratamiento, String descripcion, String medicamento, int importe, boolean estadoTratamiento) {
        this.nombre = nombre;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.estadoTratamiento = estadoTratamiento;
    }

    public Tratamiento() {
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_Tratamiento getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(Tipo_Tratamiento tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public boolean isEstadoTratamiento() {
        return estadoTratamiento;
    }

    public void setEstadoTratamiento(boolean estadoTratamiento) {
        this.estadoTratamiento = estadoTratamiento;
    }

    @Override
    public String toString() {
        return  "idTratamiento=" + idTratamiento + ", nombre=" + nombre ;
    }
    
}
