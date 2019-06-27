/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import daos.UsuarioDao;
import daos.impl.DaoFactory;
import entities.Usuario;
import java.util.List;
import services.UsuarioService;
import util.Util;

/**
 *
 * @author Usuario
 */

public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioDao dao;

    public UsuarioServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getUsuarioDao(Util.opc);
    }
    
    @Override
    public Usuario validarLogin(String usuario, String clave) {
        return dao.validar(usuario, clave);
    }
    
    @Override
    public void grabar(Usuario usuario) {
        dao.create(usuario);
    }

    @Override
    public void eliminar(int id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Usuario usuario) {
        dao.update(usuario);
    }

    @Override
    public Usuario buscar(int id) {
        return dao.find(id);
    }

    @Override
    public List<Usuario> listar() {
        return dao.findAll();
    }
    
}
