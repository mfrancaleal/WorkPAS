package com.myimage.controller;
 
import java.io.*;
import javax.servlet.*; 
import javax.servlet.annotation.*;
import javax.servlet.http.*;
 
import com.myimage.dao.UsuarioDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Usuario;
 
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    private UsuarioDao usuarioDao;
     
    public UsuarioController() {
        super();
        
    }
 
    private void processarRequisicao(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
 
        String action = request.getParameter("action");
 
        if (action == null) {
            throw new ServletException("Sem ação");
        } else if (action.equals("criar_conta")) {
            criarConta(request, response);
        }
    }
 
    private void criarConta(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
 
        String email = request.getParameter("email");
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        usuarioDao = DAOFactory.criarUsuario();
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setNome(nome);
        usuario.setSenha(senha);
        usuarioDao.salvar(usuario);
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