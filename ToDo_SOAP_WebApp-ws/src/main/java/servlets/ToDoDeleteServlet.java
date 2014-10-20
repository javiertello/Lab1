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
@WebServlet(urlPatterns = { "/deletetask" })
public class ToDoDeleteServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String task = req.getParameter("task");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if(task.equals("")){
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body>"
					+ "<h2>Please enter a task name</h2>"
					+ "</body></html>");
		}else{
			ToDoWebServiceService twss = new ToDoWebServiceService();
			ToDoWebService tws = twss.getToDoWebServicePort();
			
			String res = tws.removeToDo(task);
			resp.setStatus(HttpServletResponse.SC_OK);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body>"
					+ "<b>"+ res + "</b>"
					+ "</body></html>");
		}
		
	}
}
