package com.keduit.controller;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.EmployeesWriteFormAction;
import com.keduit.controller.action.EmployeesListAction;
import com.keduit.controller.action.EmployeesViewAction;
import com.keduit.controller.action.EmployeesWriteAction;

public class ActionFactory {
	
	private ActionFactory() {}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+command);
		
		if(command.equals("employees_list")) {
			action = new EmployeesListAction();
		}else if(command.equals("employees_write_form")) {
			action = new EmployeesWriteFormAction();
		}else if(command.equals("employees_write")) {
			action = new EmployeesWriteAction();
		}else if(command.equals("employees_view")) {
			action = new EmployeesViewAction();
		}
		return action;
	}

}
