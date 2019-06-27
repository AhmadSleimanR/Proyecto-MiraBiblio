/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDate;

/**
 *
 * @author Ahmad
 */
public class Prestamo {
       private int id;
       private int id_libros;
       private int id_lector;
       private int id_administrador;
       private LocalDate fecha_peticion;
       private LocalDate fecha_cancelacion;
       private LocalDate fecha_entrega;
       private LocalDate fecha_devolucion;
       private LocalDate prorroga_prestamo;

       
    /** Constructor para insertar prestamos
     * @param id_libros id del libro asociado al rprestamo
     * @param id_lector id del lector asociado al prestamo es decir, el usuario
     * @param id_administrador id del administrador asociado al prestamo
     * @param fecha_peticion fecha de la peticion
     * @param fecha_cancelacion fecha cuando se cancela el prestamo
     * @param fecha_entrega fecha cuando se entrega el libro
     * @param fecha_devolucion fecha cuando se devuelve el libro
     * @param prorroga_prestamo fecha de prorroga del prestamo **/
    public Prestamo(int id_libros, int id_lector, int id_administrador, LocalDate fecha_peticion, LocalDate fecha_cancelacion, LocalDate fecha_entrega, LocalDate fecha_devolucion, LocalDate prorroga_prestamo) {
        this.id_libros = id_libros;
        this.id_lector = id_lector;
        this.id_administrador = id_administrador;
        this.fecha_peticion = fecha_peticion;
        this.fecha_cancelacion = fecha_cancelacion;
        this.fecha_entrega = fecha_entrega;
        this.fecha_devolucion = fecha_devolucion;
        this.prorroga_prestamo = prorroga_prestamo;
    }
    
    /** Constructor para actualizar prestamos
     * @param id id del prestamo
     * @param id_libros id del libro asociado al rprestamo
     * @param id_lector id del lector asociado al prestamo es decir, el usuario
     * @param id_administrador id del administrador asociado al prestamo
     * @param fecha_peticion fecha de la peticion
     * @param fecha_cancelacion fecha cuando se cancela el prestamo
     * @param fecha_entrega fecha cuando se entrega el libro
     * @param fecha_devolucion fecha cuando se devuelve el libro
     * @param prorroga_prestamo fecha de prorroga del prestamo **/
    public Prestamo(int id, int id_libros, int id_lector, int id_administrador, LocalDate fecha_peticion, LocalDate fecha_cancelacion, LocalDate fecha_entrega, LocalDate fecha_devolucion, LocalDate prorroga_prestamo) {
        this(id_libros, id_lector, id_administrador, fecha_peticion, fecha_cancelacion, fecha_entrega, fecha_devolucion, prorroga_prestamo);
        this.id = id;
    }

        /** Getters y setters necesarios
     * @return  retorna el id del Prestamo **/
    public int getId() {
        return id;
    }
    
    public int getId_libros() {
        return id_libros;
    }

    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }

    public int getId_lector() {
        return id_lector;
    }

    public void setId_lector(int id_lector) {
        this.id_lector = id_lector;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public LocalDate getFecha_peticion() {
        return fecha_peticion;
    }

    public void setFecha_peticion(LocalDate fecha_peticion) {
        this.fecha_peticion = fecha_peticion;
    }

    public LocalDate getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(LocalDate fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public LocalDate getProrroga_prestamo() {
        return prorroga_prestamo;
    }

    public void setProrroga_prestamo(LocalDate prorroga_prestamo) {
        this.prorroga_prestamo = prorroga_prestamo;
    }

       
}
