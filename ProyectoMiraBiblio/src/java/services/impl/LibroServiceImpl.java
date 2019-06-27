/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import daos.LibroDao;
import daos.impl.DaoFactory;
import entities.Libro;
import java.util.List;
import services.LibroService;
import util.*;

/**
 *
 * @author Usuario
 */

public class LibroServiceImpl implements LibroService{
    private LibroDao dao;

    public LibroServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getLibroDao(Util.opc);
    }
    
    @Override
    public void grabar(Libro libro) {
        dao.create(libro);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Libro libro) {
        dao.update(libro);
    }

    @Override
    public Libro buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Libro> listar() {
        return dao.findAll();
    }
    
}
