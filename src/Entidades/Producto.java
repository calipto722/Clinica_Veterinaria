/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author noelia
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;

    public Producto(int idProducto, String nombre,String descripcion, int precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion=descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre,String descripcion, int precio, int stock) {
        this.nombre = nombre;
        this.descripcion=descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock ;
    }
    
    
}
