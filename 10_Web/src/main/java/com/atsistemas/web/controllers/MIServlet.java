package com.atsistemas.web.controllers;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.atsistemas.web.services.Servicio;

/**
 * Servlet implementation class MIServlet
 */
@WebServlet(urlPatterns="/home")
public class MIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Servicio servicio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MIServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    	servicio = context.getBean(Servicio.class);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("id");
		//response.getWriter().append(servicio.metodo());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}
}
