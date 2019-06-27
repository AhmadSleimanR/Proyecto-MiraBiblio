/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Administrador;
import java.util.List;

/**
 *
 * @author Profesor
 */
public interface AdministradorService {
    
     public Administrador validarLogin(String usuario, String clave);
     public void grabar(Administrador administrador);
     public void eliminar(int id);
     public void actualizar(Administrador administrador);
     public Administrador buscar(int id);
     public List<Administrador> listar();
}
