package daos;

import entities.Usuario;
import interfaces.EntidadDao;

/**
 *
 * @author Profesor
 */
public interface UsuarioDao extends EntidadDao<Usuario>{
    
    public Usuario validar(String usuario, String clave);
}
