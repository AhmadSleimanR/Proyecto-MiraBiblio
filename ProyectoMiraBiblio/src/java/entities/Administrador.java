/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Ahmad
 */
public class Administrador {
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private boolean tipo;

    /** Constructor para insertar  administradores
     * @param nombre nombre del administrador
     * @param apellido apellido del administrador
     * @param usuario usuario del administrador
     * @param clave clave del administrador
     * @param tipo tipo del administrador, es decir activo es 1 y no activo es 0 **/
    public Administrador(String nombre, String apellido, String usuario, String clave, boolean tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
    }

    /** Constructor para actualizar  administradores
     * @param id id del administrador
     * @param nombre nombre del administrador
     * @param apellido apellido del administrador
     * @param usuario usuario del administrador
     * @param clave clave del administrador
     * @param tipo tipo del administrador, es decir activo es 1 y no activo es 0 **/
    public Administrador(int id, String nombre, String apellido, String usuario, String clave, boolean tipo) {
        this(nombre, apellido, usuario, clave, tipo);
        this.id = id;
    }

    /** Getters y setters necesarios
     * @return  retorna id del administrador**/
    public int getId() {
        return id;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    
}
