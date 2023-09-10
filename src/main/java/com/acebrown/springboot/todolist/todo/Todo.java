package com.acebrown.springboot.todolist.todo;

import java.time.LocalDate;

public class Todo {

	private int id;
	private String username;
	private String description;
	private LocalDate dueDate;
	private boolean finished;
	
	public Todo(int id, String username, String description, LocalDate dueDate, boolean finished) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.dueDate = dueDate;
		this.finished = finished;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", dueDate=" + dueDate
				+ ", finished=" + finished + "]";
	}
	
	
}
