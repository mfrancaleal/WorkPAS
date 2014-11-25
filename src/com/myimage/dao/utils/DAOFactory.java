package com.myimage.dao.utils;

import com.myimage.dao.UsuarioDao;
import com.myimage.dao.UsuarioImpl;
 
public class DAOFactory {
 
    public static UsuarioDao createUsuario(){
        UsuarioImpl usuarioImpl = new UsuarioImpl();
        usuarioImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioImpl;
    }
}