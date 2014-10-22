package servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo_soap.*;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/addtask" })
public class ToDoAddServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String task = req.getParameter("task");
		String context = req.getParameter("context");
		String project = req.getParameter("project");
		int priority = 5;
		boolean error_priority = false;
		try{
			priority = Integer.parseInt(req.getParameter("priority"));
		}catch(NumberFormatException e){
			error_priority = true;
		}
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if(task.equals("")){
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body>"
					+ "<h2>Please enter a task name</h2>"
					+ "</body></html>");
		}
		else if(error_priority){
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body>"
					+ "<h2>Please enter valid priority (1-10)</h2>"
					+ "</body></html>");
		}else{
			ToDoWebServiceService twss = new ToDoWebServiceService();
			ToDoWebService tws = twss.getToDoWebServicePort();
			
			String res = tws.addToDo(task, context, project, priority);
			resp.setStatus(HttpServletResponse.SC_OK);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body>"
					+ "<b>"+ res + "</b>"
					+ "</body></html>");
		}
		
	}
}
