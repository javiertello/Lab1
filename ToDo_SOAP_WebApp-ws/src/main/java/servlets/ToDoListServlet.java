package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo_soap.*;

@WebServlet(urlPatterns = { "/listtasks" })
public class ToDoListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		ToDoWebServiceService twss = new ToDoWebServiceService();
		ToDoWebService tws = twss.getToDoWebServicePort();
		
		List<ToDo> list = tws.listToDo();
		String lista = "";
		for(ToDo t : list){
			lista = addToToDoList(lista, t);
		}
		
		if (lista.equals("")){
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.println("<html><head><title>Error</title></head>"
					+ "<body>"
					+ "<h2>SOAP Server was not found any task</h2>"
					+ "</body></html>");
		}else{
			resp.setStatus(HttpServletResponse.SC_OK);
			out.println("<html><head><title>ToDo SOAP WebApp</title></head>"
					+ "<body><h1>Tasks list</h1><br/>"
					 + lista
					+ "</body></html>");
		}
	}

	private String addToToDoList(String list, ToDo todo) {
		list +=   "<b>Task: </b>" + todo.getTask()
				+ "<br/><b>Context: </b>" + todo.getContext()
				+ "<br/><b>Project: </b>" +  todo.getProject()
				+ "<br/><b>Priority (1-10): </b>" + todo.getPriority() + "<br/><hr>";	
		return list;
	}

}
