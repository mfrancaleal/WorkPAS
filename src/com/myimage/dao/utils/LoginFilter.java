package com.myimage.dao.utils;
 
import java.io.*;
 
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


import com.myimage.dao.AutenticacaoDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Autenticacao;
import com.myimage.model.Usuario;
import org.hibernate.SessionFactory;

public class LoginFilter implements Filter{
 
	private SessionFactory sessionFactory;
	private HttpServletRequest sessao;
	
    public void destroy() {
         
    }
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        try {
        	
        	String email = request.getParameter("email");
        	String senha = request.getParameter("senha");
        	
        	//ESSE CÓDIGO SERÁ PROCESSADO NA IDA
            if(!email.equals("") || !senha.equals("")){
            	chain.doFilter(request, response);
            }
            else
            {
            	//HttpSession session = this.sessao.getSession();
            	//session.setAttribute("mensagem_erro", "Campo(s) em branco");
                //APÓS A EXECUÇÃO DIRECIONO O USUÁRIO PARA A PÁGINA CRIAR_CONTA
                RequestDispatcher rd = request.getRequestDispatcher("/InicialController?action=login");
                rd.forward(request,response);

            }
        } catch (Throwable ex) {
           ex.printStackTrace();
        }
    }
 
    public void init(FilterConfig arg0) throws ServletException {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
}