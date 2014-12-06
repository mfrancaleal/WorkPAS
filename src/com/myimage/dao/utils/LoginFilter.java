package com.myimage.dao.utils;
 
import java.io.IOException;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import com.myimage.dao.AutenticacaoDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;
import org.hibernate.SessionFactory;

public class LoginFilter implements Filter{
 
	private SessionFactory sessionFactory;
	
    public void destroy() {
         
    }
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        try {
        	
        	String email = request.getParameter("email");
        	String senha = request.getParameter("senha");
        	
        	//ESSE CÓDIGO SERÁ PROCESSADO NA IDA
            if(email != null || senha != null){
            	chain.doFilter(request, response);
            }
            else
            {
<<<<<<< HEAD
            	//this.sessionFactoryHttpSession session = request.getSession();
            	//session.setAttribute("mensagem_erro", "Campo(s) em branco");
                //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                //RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=login");
                //rd.forward(request,response);
            	System.out.println("Fez login");
            	
=======
            	this.sessionFactoryHttpSession session = request.getSession();
            	session.setAttribute("mensagem_erro", "Campo(s) em branco");
                //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=login");
                rd.forward(request,response);
>>>>>>> origin/inHome
            }
        } catch (Throwable ex) {
           ex.printStackTrace();
        }
    }
 
    public void init(FilterConfig arg0) throws ServletException {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
}