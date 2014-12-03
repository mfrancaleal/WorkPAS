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
public class AutenticacaoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    private AutenticacaoDao autenticacaoDao;
     
    public AutenticacaoController() {
        super();
        
    }
 
    private void processarRequisicao(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
 
        String action = request.getParameter("action");
 
        if (action == null) {
            throw new ServletException("Sem ação");
        } else if (action.equals("fazer_login")) {
            criarConta(request, response);
        }
    }
 
    private void criarConta(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
 
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        autenticacaoDao = DAOFactory.criarUsuario();
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.setEmail(email);
        autenticacao.setSenha(senha);
        autenticacaoDao.buscar(autenticacao);
        //ARMAZENO A SESSÃO PARA UTILIZAR EM CRIAR_CONTA
        HttpSession session = request.getSession();
        session.setAttribute("nome_usuario", nome);
        //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
        RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=novo");
        rd.forward(request,response);
    }
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }
 
}