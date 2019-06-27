package daos;

import entities.Libro;
import interfaces.EntidadDao;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface LibroDao extends EntidadDao<Libro>{
    
    public List<Libro> findByAuthor(String autor);
}
