package interfaces;

import java.util.List;

/**
 *
 * @author emaravi
 * @param <T>
 */
public interface EntidadDao <T> {
    public void create(T t);
    public void update(T t);
    public void delete(int id);
    public T find(int id);
    public List<T> findAll();
}
