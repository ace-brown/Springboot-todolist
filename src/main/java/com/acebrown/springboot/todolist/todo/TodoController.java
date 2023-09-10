package com.acebrown.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class TodoController {

	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todos-list")
	public String listTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("John");
		model.addAttribute("todos", todos);
		return "todosList";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String getAddTodo() {
		return "add-todo";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String postAddTodo(ModelMap model, Todo todo) {
		String username = (String)model.get("name");
		todoService.addTodo( username, todo.getDescription(), LocalDate.now(), false);
		return "redirect:todos-list";
	}
	
	
}
