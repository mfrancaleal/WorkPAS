package com.myimage.dao;

import org.hibernate.Session;

import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;

public class AutenticacaoImpl implements AutenticacaoDao{
 
    private Session session;
 
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void buscarUsuario(Usuario usuario) {
        Query query = session.createQuery("from usuario where email = "+ usuario.getEmail() + "and senha =" +usuario.getSenha());
        
       
    }
 
}
