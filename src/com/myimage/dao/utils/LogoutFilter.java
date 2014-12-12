package com.myimage.dao.utils;
 
import java.io.IOException;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
 
import org.hibernate.SessionFactory;
 
public class LogoutFilter implements Filter {
 
    private SessionFactory sessionFactory;
 
    public void destroy() { }
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        try {
        	//ESSE CÓDIGO SERÁ PROCESSADO NA IDA
        	if(this.sessionFactory.getCurrentSession().isConnected())
        	{
        		this.sessionFactory.getCurrentSession().disconnect().close();
        	}
            chain.doFilter(request, response);
            //ESSE CÓDIGO SERÁ PROCESSADO NA VOLTA
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
 
    public void init(FilterConfig arg0) throws ServletException {    }
}