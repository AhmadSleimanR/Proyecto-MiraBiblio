package daos;

import entities.Descripcion_Libro;
import interfaces.EntidadDao;

/**
 *
 * @author Profesor
 */
public interface Descripcion_LibroDao extends EntidadDao<Descripcion_Libro>{
    
    public Descripcion_Libro findByLibro(int idLibro);
}
