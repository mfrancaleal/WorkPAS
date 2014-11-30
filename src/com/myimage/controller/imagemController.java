package com.myimage.controller;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
//import com.myimage.dao.ImagemDao;
//import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Imagem;
 
@WebServlet("/ImagemController")
public class ImagemController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    //private UsuarioDao usuarioDao;
     
    public ImagemController() {
        super();
        
    }
 
    private void processarRequisicao(HttpServletRequest request,
            HttpServletResponse response) throws ServletException {
 
        String action = request.getParameter("action");
 
        if (action == null) {
            throw new ServletException("Sem ação.");
        } else if (action.equals("criar_conta")) {
            criarConta(request, response);
        }
    }
 
    private void criarConta(HttpServletRequest request,
            HttpServletResponse response) {
 
        String email = request.getParameter("email");
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
      //  usuarioDao = DAOFactory.createUsuario();
        Imagem imagem = new Imagem();
        imagem.setEmail(email);
        imagem.setNome(nome);
        imagem.setSenha(senha);
     //   usuarioDao.save(usuario);
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