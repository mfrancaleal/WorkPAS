package com.myimage.controller;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/InicialController")
public class InicialController extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    public InicialController() {
        super();
    }
     
    private void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException {
         
        String action = request.getParameter("action");
 
        if (action == null) {
            throw new ServletException("No action specified.");
        } else if (action.equals("iniciar_criar_conta")) {
            irParaIniciarCriarConta(request, response);
        }
    }
 
    private void irParaIniciarCriarConta(HttpServletRequest request, HttpServletResponse response){
         
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("publica/criar_conta.jsp");
         
        try {
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }
}