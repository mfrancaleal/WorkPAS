package com.myimage.dao;

import com.kizna.servletunit.*;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import java.io.*;
import junit.framework.*;
import com.myimage.controller.AutenticacaoController;
import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;
import junit.framework.TestCase;
import java.util.List;

public class teste extends TestCase {

	public void testDoPost()  throws Exception {
	                HttpServletRequestSimulator req = new HttpServletRequestSimulator();
	                HttpServletResponseSimulator res = new HttpServletResponseSimulator();
	                AutenticacaoImpl servlet = new AutenticacaoImpl();
	                
	                //ENVIANDO VALORES PARA DOPOST
	                Autenticacao autentica = new Autenticacao();
	                autentica.setEmail("teste");
	                autentica.setSenha("teste");
	                servlet.buscarUsuario(autentica);
	        
	                //TESTEANDO A SAIDA
	                //TRAZENDO DA SAIDA
	                String result=  res.getWriterBuffer().toString();

	                // Instantiate the expected data
	                String expected = "Ola";
	                
	                // Check if the result is the same as expected
	               assertEquals(getClass(), result);
	        }

}
