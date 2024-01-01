package com.in28mins.todoapp5.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	public static List<todo> mytodo = new ArrayList<todo>();
	private static int count=0;
	static {
	mytodo.add(new todo(++count,"Shalom","Code with springboot",LocalDate.now(),true));
	mytodo.add(new todo(++count,"Mason","Read todo",LocalDate.now().plusDays(2),false));
	}
	
	public List<todo> todoMethod(){
		return mytodo;
	}
}
