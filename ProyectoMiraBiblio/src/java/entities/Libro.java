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
public class Libro {
    private int id;
    private int id_descripcion_libros;
    private LocalDate fecha_adquisicion;
    private short  cantidad_ejemplares;

    
    /** Constructor para insertar Libros
     * @param id_descripcion_libros id de la descripcion de la instancia del libro
     * @param fecha_adquisicion fecha de adquisición del libro para la biblioteca
     * @param cantidad_ejemplares cantidad de ejemplares con los que cuenta la biblioteca **/
    public Libro(int id_descripcion_libros, LocalDate fecha_adquisicion, short cantidad_ejemplares) {
        this.id_descripcion_libros = id_descripcion_libros;
        this.fecha_adquisicion = fecha_adquisicion;
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

    /** Constructor para actualizar libros **/
    public Libro(int id, int id_descripcion_libros, LocalDate fecha_adquisicion, short cantidad_ejemplares) {
        this(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares);
        this.id = id;
    }
    
    
    /** Getters y setters necesarios **/
    public int getId() {
        return id;
    }

    public int getId_descripcion_libros() {
        return id_descripcion_libros;
    }

    public void setId_descripcion_libros(int id_descripcion_libros) {
        this.id_descripcion_libros = id_descripcion_libros;
    }

    public LocalDate getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(LocalDate fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public short getCantidad_ejemplares() {
        return cantidad_ejemplares;
    }

    public void setCantidad_ejemplares(short cantidad_ejemplares) {
        //No deberian de haber menos de 0 libros.
        if(cantidad_ejemplares >= 0)
            this.cantidad_ejemplares = cantidad_ejemplares;
        else
            this.cantidad_ejemplares = 0;
    }
    
    
}
