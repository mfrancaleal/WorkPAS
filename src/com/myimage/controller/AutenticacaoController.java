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
import com.myimage.model.Usuario;

@WebServlet("/AutenticacaoController") 
public class AutenticacaoController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	 
    private AutenticacaoDao autenticacaoDao;
     
    public AutenticacaoController() {
        super();
        
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse
         response) throws ServletException, IOException {
        
         try{

              String email = request.getParameter("email");
              String senha = request.getParameter("senha");
              
              if(senha == null || email ==null){
            	  request.getSession().setAttribute("msgBranco", "Campos(s) vazios(s)!");
            	  response.sendRedirect("/InicialController?action=login");
              }
              else{
            	  autenticacaoDao = DAOFactory.buscarUsuario();
                  Usuario usuario = new Usuario();
                  usuario.setEmail(email);
                  usuario.setSenha(senha);
                  autenticacaoDao.buscarUsuario(usuario);
                  //ARMAZENO A SESSÃO PARA UTILIZAR EM CRIAR_CONTA
                  HttpSession session = request.getSession();
                  session.setAttribute("nome_usuario", nome);
                  //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                  RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=novo");
                  rd.forward(request,response);
              }

         }catch(Exception e){

              throw new ServletException(e);

         }
      
     }

}