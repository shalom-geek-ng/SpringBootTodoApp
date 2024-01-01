package com.in28mins.todoapp5.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28mins.todoapp5.Todo.TodoService;
import com.in28mins.todoapp5.Todo.todo;

@Controller
public class RestApplication {
	@Autowired
	private TodoService todoList;
	
//	@RequestMapping("/Loggin")
//	@ResponseBody
//	public String loggin() {
//		return "loggin here";
//	}
	@RequestMapping(value="/loggin", method=RequestMethod.GET)

	public String loggin() {
	    return "login";
	}
	@RequestMapping(value="/loggin", method=RequestMethod.POST)
	public String todo(@RequestParam String name, @RequestParam String password,
			ModelMap model) {
		 List <todo> todo = todoList.todoMethod();
		 model.put("todo", todo);
		model.put("name", name);
		model.put("password", password);
		return "todo";
	}

}
