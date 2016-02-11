package com.servlet.controller.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hibernate.dao.student.StudentManagement;

/**
 * Servlet implementation class StudentFormController
 */
@WebServlet(name = "StudentFormController", urlPatterns = { "/form" })
public class StudentFormController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		
		Map<String, String[]> parameters=request.getParameterMap();
		
		System.out.println(parameters);
		session.setAttribute("newStudent", parameters);
		
		StudentManagement.addRequest(parameters);
		
		
		PrintWriter pw=response.getWriter();
		pw.print("Record Inserted Successfully");
		pw.print("<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
