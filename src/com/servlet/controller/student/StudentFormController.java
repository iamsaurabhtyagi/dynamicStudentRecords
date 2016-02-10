package com.servlet.controller.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

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
		// TODO Auto-generated method stub
		
		/*String name=request.getParameter("studentName");
		String fName=request.getParameter("fattherName");
		String mName=request.getParameter("motherName");
		String dob=request.getParameter("dob");
		String dept=request.getParameter("department");
		String branch=request.getParameter("branch");
		String year=request.getParameter("year");
		String sem=request.getParameter("semester");
		String localAddress=request.getParameter("localAddress");
		String permanentAddress=request.getParameter("permanentAddress");*/
		
		Map<String, String[]> parameters=request.getParameterMap();
		
		System.out.println(parameters);
		StudentManagement.addStudentRecord(parameters);
		/*try{
			StudentManagement.addStudentRecord(parameters);
		}
		catch(HibernateException e){
			e.printStackTrace();
		}*/
		
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
