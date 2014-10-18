package toDo_SOAP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.google.gson.Gson;

@WebService
public class ToDoWebService {
	
	public final static String DEFAULT_FILE_NAME = "todo_list.json";

	@WebMethod()
	public String addToDo(String task, String context, String project, int priority) {
		String filename = DEFAULT_FILE_NAME;
		String result = "";
		ToDoList list = new ToDoList();
		Gson gson = new Gson();
		ToDo t = new ToDo();
		t.setTask(task);
		t.setContext(context);
		t.setPriority(priority);
		t.setProject(project);
		// Read the existing ToDo list.
		try {
			list = gson.fromJson(new FileReader(filename),
					ToDoList.class);
		} catch (FileNotFoundException e) {
			System.out.println(filename
					+ ": File not found.  Creating a new file.");
		}

		// Add a ToDo.
		list.addToDo(t);

		// Write the new ToDo list back to disk.
		FileWriter output;
		try {
			output = new FileWriter(filename);
			output.write(gson.toJson(list));
			output.close();
			result = "Task sucessfully added";
		} catch (IOException e) {
			result = e.getMessage();
		}
		return result;
	}

	@WebMethod()
	public String removeToDo(String task) {
		String filename = DEFAULT_FILE_NAME;
		String result = "";
		ToDoList list = new ToDoList();
		Gson gson = new Gson();

		// Read the existing ToDo list.
		try {
			list = gson.fromJson(new FileReader(filename),
					ToDoList.class);
		} catch (FileNotFoundException e) {
			System.out.println(filename
					+ ": File not found.  Creating a new file.");
		}
		// Remove ToDo task
		if(list.removeToDo(task)){
			result = "Task succesfully removed";
		}
		else{
			result = "Task was not found";
		}

		// Write the new ToDo list back to disk.
		FileWriter output;
		try {
			output = new FileWriter(filename);
			output.write(gson.toJson(list));
			output.close();
		} catch (IOException e) {
			result = e.getMessage();
		}
		return result;
	}

	@WebMethod()
	public List<ToDo> listToDo() {
		String filename = DEFAULT_FILE_NAME;

		ToDoList list = new ToDoList();
		Gson gson = new Gson();

		// Read the existing ToDo list.
		try {
			list = gson.fromJson(new FileReader(filename),
					ToDoList.class);
		} catch (FileNotFoundException e) {
			System.out.println(filename
					+ ": File not found.  Creating a new file.");
		}
		return list.getList();
	}
}
