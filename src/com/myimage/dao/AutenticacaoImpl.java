package com.myimage.dao;

import org.hibernate.Session;

import com.myimage.model.Autenticacao;
 
public class AutenticacaoImpl implements AutenticacaoDao{
 
    private Session session;
 
    public void setSession(Session session) {
        this.session = session;
    }
     
    @Override
    public void buscar(Autenticacao autenticacao) {
        session.saveOrUpdate(autenticacao);        
    }
 
}
