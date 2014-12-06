package com.myimage.controller;
 
import java.io.IOException;
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import com.myimage.dao.AutenticacaoDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Autenticacao;

@WebServlet("/AutenticacaoController") 
public class AutenticacaoController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	 
    private AutenticacaoDao autenticacaoDao;
  
     
    public AutenticacaoController() {
        super();
        
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse
         response) throws ServletException, IOException {
    	 		
    	 		Autenticacao autentica = new Autenticacao();
    	 		
    	 		String email = (String) request.getParameter("email");
    	 		String senha = (String) request.getParameter("senha");
    	 		
    	 		autentica.setEmail(email);
    	 		autentica.setSenha(senha);

             	autenticacaoDao = DAOFactory.buscarUsuario();
             	  
             	  
                autenticacaoDao.buscarUsuario();
                  //ARMAZENO A SESSÃO PARA UTILIZAR EM CRIAR_CONTA
                  //HttpSession session = request.getSession();
                  //session.setAttribute("nome_usuario", nome);
                  //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                  //RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=novo");
                  
            	  //System.out.print(request.getParameter("email") +" "+request.getParameter("senha"));
                  //rd.forward(request,response);
      
     }

}