package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Emplyoee;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	Emplyoee e=new Emplyoee();
	BLManager bl=new BLManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		
		
		e = bl.serchById(id);
		HttpSession ses = request.getSession();
		ses.setAttribute("list", e);
		
		response.sendRedirect("Update.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String mobile =request.getParameter("mobile");
		String dateofbirth =request.getParameter("dateofbirth");
		String address =request.getParameter("address");
		String salary =request.getParameter("salary"); 
		
		e.setAddress(address);
		e.setDateofbirth(dateofbirth);
		e.setEmail(email);
		e.setMobile(mobile);
		e.setName(name);
		e.setSalary(salary);
		
		bl.updateRecords(e);
		
		response.sendRedirect("View.jsp");
	}

}
