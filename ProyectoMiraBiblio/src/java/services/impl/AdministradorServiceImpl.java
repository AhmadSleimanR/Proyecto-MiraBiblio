/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import daos.AdministradorDao;
import daos.impl.DaoFactory;
import entities.Administrador;
import java.util.List;
import services.AdministradorService;
import util.Util;

/**
 *
 * @author Usuario
 */

public class AdministradorServiceImpl implements AdministradorService{
    private AdministradorDao dao;

    public AdministradorServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getAdministradorDao(Util.opc);
    }
    
    @Override
    public Administrador validarLogin(String usuario, String clave) {
        return dao.validar(usuario, clave);
    }

    @Override
    public void grabar(Administrador administrador) {
        dao.create(administrador);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Administrador administrador) {
        dao.update(administrador);
    }

    @Override
    public Administrador buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Administrador> listar() {
        return dao.findAll();
    }
    
}
