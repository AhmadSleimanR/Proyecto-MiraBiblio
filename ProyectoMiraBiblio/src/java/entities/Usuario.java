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
public class Usuario {
       private int id;
       private String nombre;
       private String apellido;
       private String usuario;
       private String correo;
       private String clave;
       private String direccion;
       private String distrito;
       private String numeroTelefonico;
       private boolean estado;

       /** Constructor para insertar **/ 
    public Usuario(String nombre, String apellido, String usuario, String correo, String clave, String direccion, String distrito, String numeroTelefonico, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido; 
        this.usuario = usuario;
        this.correo = correo;
        this.clave = clave;
        this.direccion = direccion;
        this.distrito = distrito;
        this.numeroTelefonico = numeroTelefonico;
        this.estado = estado;
    }

    /** Constructor para actualizar **/
    
    public Usuario(int id, String nombre, String apellido, String usuario, String correo, String clave, String direccion, String distrito, String numeroTelefonico, boolean estado) {
        this(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado);
        this.id = id;
    }
    
    /** Constructor Default**/
    public Usuario() {
    }
    
    
    /** Getters y setters necesarios
     * @return  te devuelve el id del usuario **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
       
       
}
