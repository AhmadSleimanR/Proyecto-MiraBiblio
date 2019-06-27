/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import daos.UsuarioDao;
import entities.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConn;

/**
 *
 * @author Usuario
 */
public class UsuarioDaoImplJdbc implements UsuarioDao{
    private Connection con;
    private CallableStatement  cst;
    private ResultSet  rs;
    
    @Override
    public Usuario validar(String usuario, String clave) {
       Usuario _usuario = null;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{exec sp_validar_usuario ?,?}");
           cst.setString(1,usuario);
           cst.setString(2,clave);
           rs = cst.executeQuery();
           if(rs.next()){
               _usuario = new Usuario();
               _usuario.setId(rs.getInt(1));
               _usuario.setNombre(rs.getString(2));
               _usuario.setApellido(rs.getString(3));
               _usuario.setUsuario(rs.getString(4));
               _usuario.setClave(rs.getString(5));
               _usuario.setDireccion(rs.getString(6));
               _usuario.setDistrito(rs.getString(7));
               _usuario.setNumeroTelefonico(rs.getString(8));
               _usuario.setEstado(rs.getBoolean(9));
           }
           con.close();
        }catch(SQLException ex){
            System.out.println("no se encontro usuario por:"+ex.getMessage());
        }
        return _usuario;
    }

    @Override
    public void create(Usuario t) {
    try {
            String sql= "{exec sp_insert_usuario ?,?,?,?,?,?,?,?,?}";
            con = DBConn.getConnection();
            cst = con.prepareCall(sql);
            cst.setString(1,t.getNombre());
            cst.setString(2,t.getApellido());
            cst.setString(3,t.getUsuario());
            cst.setString(4,t.getCorreo());
            cst.setString(5,t.getClave());
            cst.setString(6,t.getDireccion());
            cst.setString(7,t.getDistrito());
            cst.setString(8,t.getNumeroTelefonico());
            cst.setBoolean(9,t.isEstado());
            cst.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("no se hizo el insert por:"+ex.getMessage());
        }
    }

    @Override
    public void update(Usuario t) {
        try {
            String sql= "{exec sp_update_usuario ?,?,?,?,?,?,?,?,?,?}" ;
            con = DBConn.getConnection();
            cst = con.prepareCall(sql);
            cst.setInt(1, t.getId());
            cst.setString(2,t.getNombre());
            cst.setString(3,t.getApellido());
            cst.setString(4,t.getUsuario());
            cst.setString(5,t.getCorreo());
            cst.setString(6,t.getClave());
            cst.setString(7,t.getDireccion());
            cst.setString(8,t.getDistrito());
            cst.setString(9,t.getNumeroTelefonico());
            cst.setBoolean(10,t.isEstado());
            cst.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("no se hizo el update por:"+ex.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try {
            String sql= "{exec sp_delete_usuario ?}";
            con = DBConn.getConnection();
            cst = con.prepareCall(sql);
            cst.setInt(1,id);
            cst.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("no se hizo la actualización de estado por:"+ex.getMessage());
        }
    }

    @Override
    public Usuario find(int id) {
        Usuario _usuario = null;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{exec sp_find_usuario ?}");
           cst.setInt(1, id);
           rs = cst.executeQuery();
           if(rs.next()){
               _usuario=new Usuario();
               _usuario.setId(rs.getInt(1));
               _usuario.setNombre(rs.getString(2));
               _usuario.setApellido(rs.getString(3));
               _usuario.setUsuario(rs.getString(4));
               _usuario.setCorreo(rs.getString(5));
               _usuario.setClave(rs.getString(6));
               _usuario.setDireccion(rs.getString(7));
               _usuario.setDistrito(rs.getString(8));
               _usuario.setNumeroTelefonico(rs.getString(9));
               _usuario.setEstado(rs.getBoolean(10));
           }
           con.close();
        }catch(SQLException ex){
            System.out.println("no se encontro usuario por:"+ex.getMessage());
        }
        return _usuario;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> lUsuario = new ArrayList<>();
        Usuario _usuario;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{exec sp_findAll_usuario}");
           rs = cst.executeQuery();
           while(rs.next()){
               _usuario=new Usuario();
               _usuario.setId(rs.getInt(1));
               _usuario.setNombre(rs.getString(2));
               _usuario.setApellido(rs.getString(3));
               _usuario.setUsuario(rs.getString(4));
               _usuario.setCorreo(rs.getString(5));
               _usuario.setClave(rs.getString(6));
               _usuario.setDireccion(rs.getString(7));
               _usuario.setDistrito(rs.getString(8));
               _usuario.setNumeroTelefonico(rs.getString(9));
               _usuario.setEstado(rs.getBoolean(10));
               lUsuario.add(_usuario);
           }
           con.close();
        }catch(SQLException ex){
            System.out.println("no se pudo listar por:"+ex.getMessage());
        }
        return lUsuario;
    }
    
}
