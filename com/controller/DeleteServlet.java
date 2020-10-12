package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Emplyoee;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   BLManager bl=new BLManager();
   Emplyoee e=new Emplyoee();
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		
		e = bl.serchById(id);
		bl.deleteRecords(e);
		
		response.sendRedirect("View.jsp");

   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
