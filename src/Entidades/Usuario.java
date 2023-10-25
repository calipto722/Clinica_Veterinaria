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
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String password;

    public Usuario(int idUsuario, String nombre, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "idUsuario=" + idUsuario + ", nombre=" + nombre + ", password=" + password;
    }
    
}
