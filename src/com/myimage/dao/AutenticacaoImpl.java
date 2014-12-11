package com.myimage.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;

import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;

import java.util.List;

public class AutenticacaoImpl implements AutenticacaoDao{
 
    private Session session;
    
    
    Usuario usuario;
    Autenticacao autentica;
    
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void buscarUsuario(Autenticacao autentica) {
    	

       Query consulta = session.createQuery("Select email as email, nome as nome FROM Usuario WHERE email=:email AND senha=:senha");
       consulta.setParameter("senha",autentica.getSenha());
       consulta.setParameter("email",autentica.getEmail());
       consulta.list();
       
       consulta.setResultTransformer(Transformers.aliasToBean(Usuario.class));
       
       List<Usuario> RelUser = consulta.list();
       
       if(RelUser.size()==0)
       {
    	   System.out.println("Nada");
       }
       else
       {
    	   System.out.println("Oba");
       }
       
    }
 
}
