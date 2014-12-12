package com.myimage.controller;
 
import java.io.IOException;
import javax.servlet.*; 
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.util.List;

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
    	 		
    	 		Autenticacao autentica = new Autenticacao();
    	 		
    	 		String email = (String) request.getParameter("email");
    	 		String senha = (String) request.getParameter("senha");
    	 		
    	 		autentica.setEmail(email);
    	 		autentica.setSenha(senha);
    	 		//VALIDA OS DADOS DO USUÁRIO
             	autenticacaoDao = DAOFactory.buscarUsuario();
                List<Usuario> RelUser = autenticacaoDao.buscarUsuario(autentica);
                //INICIANDO SESSÃO
                HttpSession session = request.getSession();
                //CONFIRME SE HOUVE RETORNO DE INFORMAÇÕES
                
                if(RelUser.size()==0){
                	//ARMAZENO A SESSÃO PARA UTILIZAR EM FAZ_LOGIN
                	session.setAttribute("mensagem_erro", "Dados inválidos");
                	//APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                	RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=login");
                	rd.forward(request,response);
                }  
                else if(RelUser.size()==1){
<<<<<<< HEAD
                	String nome = null;
                	for(Usuario usuario : RelUser){
                		nome = usuario.getNome().substring(0,1).toUpperCase().concat(usuario.getNome().substring(1));
                	}
               
                	//ArrayList<Usuario> 
                	//ARMAZENO A SESSÃO PARA UTILIZAR EM FAZ_LOGIN
                	session.setAttribute("mensagem_login", "Login feito com sucesso");
                	session.setAttribute("nome_usuario", nome);
=======
                	
                	Usuario[] arrayUser =  RelUser.toArray(new Usuario[RelUser.size()]);
                
                	//ArrayList<Usuario> 
                	//ARMAZENO A SESSÃO PARA UTILIZAR EM FAZ_LOGIN
                	session.setAttribute("mensagem_login", "Login feito com sucesso");
                	session.setAttribute("nome_usuario", arrayUser);
>>>>>>> origin/inHome
                	//APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                	RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=upload");
                	rd.forward(request,response);
                }
                
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