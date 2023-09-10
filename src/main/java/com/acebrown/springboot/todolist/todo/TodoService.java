package com.acebrown.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int counter = 0;
	
	static {
		todos.add(new Todo(++counter, "John", "Learn Aws", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++counter, "John", "Learn Java", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++counter, "John", "Learn DevOps", LocalDate.now().plusYears(4), false));
		todos.add(new Todo(++counter, "John", "Learn Full Stack Dev", LocalDate.now().plusYears(7), false));		
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo( String username, String description,
						LocalDate dueDate, boolean finished) {
		Todo todo = new Todo( ++counter, username, description, dueDate, finished);
		todos.add(todo);
	}
	
}

