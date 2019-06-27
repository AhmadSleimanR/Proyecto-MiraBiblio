/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Prestamo;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface PrestamoService {
    public void grabar(Prestamo prestamo);
    public void eliminar(int id);
    public void actualizar(Prestamo prestamo);
    public Prestamo buscar(int id);
    public List<Prestamo> listar();
}
