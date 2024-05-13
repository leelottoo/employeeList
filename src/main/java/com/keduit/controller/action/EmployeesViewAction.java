package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeesDAO;
import com.keduit.dto.EmployeesVO;

public class EmployeesViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "employees/employeesView.jsp";
		String id = request.getParameter("id");
		EmployeesDAO eDAO = EmployeesDAO.getInstance();
		
//		나중에 조회수 업뎃하는거 적기
		
		EmployeesVO eVO = eDAO.selectOne(id);
		request.setAttribute("employees", eVO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		

	}

}
