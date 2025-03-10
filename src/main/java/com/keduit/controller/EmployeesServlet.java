package com.keduit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;

/**
 * Servlet implementation class employeesServlet
 */
@WebServlet("/EmployeesServlet")
public class EmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String command = request.getParameter("command");
	System.out.println("employeesServlet에서 요청을 받음 : " + command);
	ActionFactory af = ActionFactory.getInstance();
	Action action = af.getAction(command);
	
	if(action != null) {
		action.execute(request, response);
	}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
