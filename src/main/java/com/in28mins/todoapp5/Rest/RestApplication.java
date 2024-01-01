package com.in28mins.todoapp5.Rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28mins.todoapp5.Authentication.AuthenticationService;
import com.in28mins.todoapp5.Todo.TodoService;
import com.in28mins.todoapp5.Todo.todo;

@Controller
@SessionAttributes("name")
public class RestApplication {
	@Autowired
	private TodoService todoList;
	@Autowired
	private AuthenticationService authenticateUser;
	
//	@RequestMapping("/Loggin")
//	@ResponseBody
//	public String loggin() {
//		return "loggin here";
//	}
	@RequestMapping(value="/login", method=RequestMethod.GET)

	public String loggin() {
	    return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String todo(@RequestParam String name, @RequestParam String password,
			ModelMap model) {
		if(authenticateUser.Authenticate(name, password)) {
		 List <todo> todo = todoList.todoMethod();
		 model.put("todo", todo);
		model.put("name", name);
		model.put("password", password);
		return "todo";
		}
		else {
			model.put("Error", "Your password or userName is incorrect");
			return "login";
		}
	}
	
	@RequestMapping(value="/addTodo", method=RequestMethod.GET)
	public String addTodo(){
		return "addmyTodo";
	}
	@RequestMapping(value="/addTodo", method=RequestMethod.POST)
	public String getTodo(ModelMap model, @RequestParam String description){
		 todoList.displayTodo((String)model.get("name"), description, LocalDate.now(), false);
		 List <todo> todo = todoList.todoMethod();
		 model.put("todo", todo);
		return "todo";
	}
	

}
