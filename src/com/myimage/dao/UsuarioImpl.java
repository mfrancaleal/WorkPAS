package com.myimage.dao;

import org.hibernate.Session;

import com.myimage.model.Usuario;
 
public class UsuarioImpl implements UsuarioDao{
 
    private Session session;
 
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void save(Usuario usuario) {
        session.saveOrUpdate(usuario);        
    }
 
}
