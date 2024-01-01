package com.in28mins.todoapp5.Todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class todo {
	private String name;
	private String description;
	private LocalDate date;
	private Boolean done;
	
//	COnstructors
	todo(){
		
	}

	public todo(String name, String description, LocalDate date, Boolean done) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
		this.done = done;
	}

//	Getters
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDate() {
		return date;
	}

	public Boolean getDone() {
		return done;
	}
//	Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

//	ToString
	@Override
	public String toString() {
		return "todo [name=" + name + ", description=" + description + ", date=" + date + ", done=" + done + "]";
	}
	
	
	
	
}
