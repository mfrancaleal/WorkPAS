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
            throw new ServletException("Sem ação.");
        } else if (action.equals("novo")) {
            irParaIniciarCriarConta(request, response);
        }else if(action.equals("index")){
        	irParaPaginaInicial(request, response);
        }else if(action.equals("upload")){
        	irParaUploadImage(request, response);
        }else if(action.equals("login")){
        	irParaFazerLogin(request, response);
        }
        
    }
 
    private void irParaFazerLogin(HttpServletRequest request, HttpServletResponse response){
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("publica/fazer_login.jsp");
         
        try {
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
    
    private void irParaPaginaInicial(HttpServletRequest request, HttpServletResponse response){
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("publica/index.jsp");
         
        try {
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void irParaUploadImage(HttpServletRequest request, HttpServletResponse response){
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("publica/uploadImage.jsp");
         
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