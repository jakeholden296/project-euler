package uk.co.jakeholden.base;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ControllerBase extends HttpServlet 
{
	private static final long serialVersionUID = 5193204423597235630L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		req.setAttribute("version", getHelloWorldVersion());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	protected abstract String getHelloWorldVersion();
}
