package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Emplyoee;

@WebServlet("/EmplyoeeServlet")
public class EmplyoeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmplyoeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String mobile =request.getParameter("mobile");
		String dateofbirth =request.getParameter("dateofbirth");
		String address =request.getParameter("address");
		String salary =request.getParameter("salary");
	
		Emplyoee e=new Emplyoee();
		BLManager b=new BLManager();
		
		e.setAddress(address);
		e.setDateofbirth(dateofbirth);
		e.setEmail(email);
		e.setMobile(mobile);
		e.setName(name);
		e.setSalary(salary);
		
		
		b.saveEmp(e);
		response.sendRedirect("Index.jsp");
	}

}
