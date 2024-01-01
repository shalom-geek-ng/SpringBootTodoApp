package com.in28mins.todoapp5.Todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class todo {
	private int id;
	private String name;
	private String description;
	private LocalDate date;
	private Boolean done;
	
//	COnstructors
	todo(){
		
	}



public todo(int id, String name, String description, LocalDate date, Boolean done) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.date = date;
	this.done = done;
}

// Getters

public int getId() {
	return id;
}

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

//Setters
public void setId(int id) {
	this.id = id;
}

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



@Override
public String toString() {
	return "todo [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", done=" + done
			+ "]";
}



	
	
	
	
	
}
