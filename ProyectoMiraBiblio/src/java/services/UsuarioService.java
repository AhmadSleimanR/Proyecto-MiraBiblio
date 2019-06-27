/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Usuario;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface UsuarioService {
    
    public Usuario validarLogin(String usuario, String clave);
    public void grabar(Usuario usuario);
    public void eliminar(int id);
    public void actualizar(Usuario usuario);
    public Usuario buscar(int id);
    public List<Usuario> listar();
}
