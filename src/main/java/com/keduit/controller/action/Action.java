package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
//	doget,dopost와 같음 execute 이름으로 만들어줌 서블릿역할
	public void execute(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
}
