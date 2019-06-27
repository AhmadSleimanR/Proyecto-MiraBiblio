/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Descripcion_Libro;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface Descripcion_LibroService {
    public void grabar(Descripcion_Libro descripcion_libro);
    public void eliminar(int id);
    public void actualizar(Descripcion_Libro descripcion_libro);
    public Descripcion_Libro buscar(int id);
    public Descripcion_Libro buscarPorLibro(int idLibro);
    public List<Descripcion_Libro> listar();
}
