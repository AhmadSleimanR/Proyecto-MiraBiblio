/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import daos.AdministradorDao;
import daos.Descripcion_LibroDao;
import daos.LibroDao;
import daos.PrestamoDao;
import daos.UsuarioDao;
import static util.Util.JDBC;
import static util.Util.JPA;

/**
 *
 * @author Profesor
 */
public class DaoFactory {
    
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {

        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public AdministradorDao getAdministradorDao(int opcion){
        AdministradorDao dao=null;
        switch(opcion){
            case JDBC: return new AdministradorDaoImplJdbc();
            case JPA: break;
        }
        return dao;
    }
    
    public LibroDao getLibroDao(int opcion){
        LibroDao dao=null;
        switch(opcion){
            case JDBC: return new LibroDaoImplJdbc();
            case JPA: break;
        }
        return dao;
    }
    
    public PrestamoDao getPrestamoDao(int opcion){
        PrestamoDao dao=null;
        switch(opcion){
            case JDBC: return new PrestamoDaoImplJdbc();
            case JPA: break;
        }
        return dao;
    }
    
    public Descripcion_LibroDao getDescripcion_LibroDao(int opcion){
        Descripcion_LibroDao dao=null;
        switch(opcion){
            case JDBC: return new Descripcion_LibroDaoImplJdbc();
            case JPA: break;
        }
        return dao;
    }
    
    public UsuarioDao getUsuarioDao(int opcion){
        UsuarioDao dao=null;
        switch(opcion){
            case JDBC: return new UsuarioDaoImplJdbc();
            case JPA: break;
        }
        return dao;
    }
    
}
