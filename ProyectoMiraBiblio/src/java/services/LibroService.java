/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Libro;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface LibroService {
    public void grabar(Libro libro);
    public void eliminar(int id);
    public void actualizar(Libro libro);
    public Libro buscar(int id);
    public List<Libro> listar();
}
