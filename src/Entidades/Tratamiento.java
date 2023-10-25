package Entidades;

public class Tratamiento {

    private int idTratamiento;
    private String tipoTratamiento;
    private String descripcion;
    private Producto producto;
    private int importe;
    private boolean estadoTratamiento;

    public Tratamiento(int idTratamiento, String tipoTratamiento, String descripcion, Producto producto, int importe, boolean estadoTratamiento) {
        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.producto = producto;
        this.importe = importe;
        this.estadoTratamiento = estadoTratamiento;
    }

    public Tratamiento(String tipoTratamiento, String descripcion, Producto producto,int importe, boolean estadoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.producto = producto;
        this.estadoTratamiento = estadoTratamiento;
        this.importe= importe;
    }

    public Tratamiento() {
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
        return  "idTratamiento=" + idTratamiento ;
    }
    
}
