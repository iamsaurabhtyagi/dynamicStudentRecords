package com.hibernate.dao.student;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentManagement {

	public static void listStudentRecord() {
		
	}
	public static void addStudentRecord(Map<String, String[]> parameters) {
		
		Session session=NewSession.getSession();
		System.out.println(session);
		Transaction tx=null;
		
		StudentDetail student=new StudentDetail();
		
		try {
			tx=session.beginTransaction();
			
			student.setStudentName(parameters.get("studentName")[0]);
			student.setFatherName(parameters.get("fatherName")[0]);
			student.setMotherName(parameters.get("motherName")[0]);
			student.setDob(parameters.get("dob")[0]);
			student.setDepartment(parameters.get("department")[0]);
			student.setBranch(parameters.get("branch")[0]);
			student.setYear(parameters.get("year")[0]);
			student.setSemester(parameters.get("semester")[0]);
			student.setLocalAddress(parameters.get("localAddress")[0]);
			student.setPermanentAddress(parameters.get("permanentAddress")[0]);
			
			session.save(student);
			
			tx.commit();
			System.out.println("Transaction Completed Successfully");
		}
		catch(HibernateException e) {
			session.close();
			e.printStackTrace();
		}
		finally {
			if(session!=null)
				session.close();
		}
	}
	public static void updateStudentRecord() {
		
	}
	public static void deleteStudentRecord() {
		
	}
	
	public static void main(String[] args) {
		
		Map<String, String[]> parameters=new HashMap<String, String[]>();
		StudentManagement.addStudentRecord(parameters);
	}

}
