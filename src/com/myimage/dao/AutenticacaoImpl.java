package com.myimage.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;

import java.util.List;

public class AutenticacaoImpl implements AutenticacaoDao{
 
    private Session session;
    
    List<Usuario> list = null;
    Usuario usuario;
    Autenticacao autentica;
    
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void buscarUsuario(Autenticacao autentica) {
    	

       list = session.createQuery("FROM Usuario WHERE email=:email AND senha=:senha")
    		   .setParameter("senha",autentica.getSenha())
    		   .setParameter("email",autentica.getEmail())
    		   .list();
       
       for(Usuario usuario : list){
    	   System.out.println("Nome "+usuario.getNome());
    	   System.out.println("Email "+usuario.getEmail());
       }
       
       
    }
 
}
