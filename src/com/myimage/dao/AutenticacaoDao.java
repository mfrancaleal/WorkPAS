package com.myimage.dao;

import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;
import java.util.List;

public interface AutenticacaoDao {
    
    public List<Usuario> buscarUsuario(Autenticacao autentica);
 
}
