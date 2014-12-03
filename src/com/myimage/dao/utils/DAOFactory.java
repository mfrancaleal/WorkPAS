package com.myimage.dao.utils;

import com.myimage.dao.UsuarioDao;
import com.myimage.dao.UsuarioImpl;
import com.myimage.dao.AutenticacaoDao;
import com.myimage.dao.AutenticacaoImpl;
 
public class DAOFactory {
 
    public static UsuarioDao criarUsuario(){
        UsuarioImpl usuarioImpl = new UsuarioImpl();
        usuarioImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioImpl;
    }
    
    public static AutenticacaoDao ConsultaUsuario(){
    	AutenticacaoImpl autenticacaoImpl = new AutenticacaoImpl();
    	autenticacaoImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return autenticacaoImpl;
    }
}