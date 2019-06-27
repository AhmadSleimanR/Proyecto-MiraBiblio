/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import daos.Descripcion_LibroDao;
import daos.impl.DaoFactory;
import entities.Descripcion_Libro;
import java.util.List;
import services.Descripcion_LibroService;
import util.*;

/**
 *
 * @author Usuario
 */

public class Descripcion_LibroServiceImpl implements Descripcion_LibroService{
    private Descripcion_LibroDao dao;

    public Descripcion_LibroServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getDescripcion_LibroDao(Util.opc);
    }

    @Override
    public void grabar(Descripcion_Libro descripcion_libro) {
        dao.create(descripcion_libro);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Descripcion_Libro descripcion_libro) {
        dao.update(descripcion_libro);
    }

    @Override
    public Descripcion_Libro buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Descripcion_Libro> listar() {
        return dao.findAll();
    }

    @Override
    public Descripcion_Libro buscarPorLibro(int idLibro) {
        return dao.findByLibro(idLibro);
    }

    
}
