package com.myimage.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import com.myimage.model.Autenticacao;

public class AutenticacaoImpl implements AutenticacaoDao{
 
    private Session session;
   
 
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void buscarUsuario() {
    	
    	Autenticacao autentica = new Autenticacao();
    	
       Query query = session.createQuery("FROM Usuario");
       //query.setParameter("email", "teste");
       //query.setParameter("senha", "teste");
       int result = (int) query.getMaxResults();
       System.out.print(result); 
       
    }
 
}
