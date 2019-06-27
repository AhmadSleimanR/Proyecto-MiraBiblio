/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import daos.PrestamoDao;
import daos.impl.DaoFactory;
import entities.Prestamo;
import java.util.List;
import services.PrestamoService;
import util.*;

/**
 *
 * @author Usuario
 */

public class PrestamoServiceImpl implements PrestamoService{
    private PrestamoDao dao;

    public PrestamoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getPrestamoDao(Util.opc);
    }

    @Override
    public void grabar(Prestamo prestamo) {
        dao.create(prestamo);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Prestamo prestamo) {
        dao.update(prestamo);
    }

    @Override
    public Prestamo buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Prestamo> listar() {
        return dao.findAll();
    }
    
}
