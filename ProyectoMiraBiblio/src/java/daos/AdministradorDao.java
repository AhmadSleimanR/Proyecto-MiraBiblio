package daos;

import entities.Administrador;
import interfaces.EntidadDao;

/**
 *
 * @author Profesor
 */
public interface AdministradorDao extends EntidadDao<Administrador>{
    
    public Administrador validar(String usuario, String clave);
}
