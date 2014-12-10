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
                autenticacaoDao.buscarUsuario(autentica);
                  //ARMAZENO A SESSÃO PARA UTILIZAR EM CRIAR_CONTA
                  //HttpSession session = request.getSession();
                  //session.setAttribute("nome_usuario", nome);
                  //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                  //RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=novo");
                  
            	  //System.out.print(request.getParameter("email") +" "+request.getParameter("senha"));
                  //rd.forward(request,response);
     }
     
     protected void doGet(HttpServletRequest request, HttpServletResponse
             response) throws ServletException, IOException {
     }
     
     protected void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	 String action = request.getParameter("action");
    	 
         if (action == null) {
             throw new ServletException("Sem ação.");
         } else if (action.equals("logout")) {
        	 fazLogof(request, response);
         }
     }
     
     protected void fazLogof(HttpServletRequest request,
             HttpServletResponse response) throws ServletException, IOException{
    	 /*
    	  * IMPLEMENTE AQUI
    	  * */
    	 
    	 
    	 
    	 /*SE FIZER O LOGOUT EXECUTA ISTO
    	  *
    	  * RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=index");
    	 rd.forward(request,response);
    	  * */
    	 
    	 /*SE NÃO, EXECUTA AQUI
    	  *
    	  * RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=upload");
    	 rd.forward(request,response);
    	  * */
    	 
    	 
     }

}