package com.hibernate.dao.student;

import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddStudentRecord {

	public void add(Map<String, String[]> parameters){
		
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
			student.setGender(parameters.get("gender")[0]);
			student.setMaritalStatus(parameters.get("maritalStatus")[0]);
			
			student.setCourse(parameters.get("course")[0]);
			student.setBranch(parameters.get("branch")[0]);
			student.setYear(parameters.get("year")[0]);
			student.setSemester(parameters.get("semester")[0]);
			
			student.setEmailID(parameters.get("emailID")[0]);
			student.setMobile(parameters.get("mobile")[0]);
			
			student.setLocalAddress(parameters.get("localAddress")[0]);
			student.setLocalCity(parameters.get("localCity")[0]);
			student.setLocalState(parameters.get("localState")[0]);
			student.setLocalPinCode(parameters.get("localPinCode")[0]);
			
			student.setPermanentAddress(parameters.get("permanentAddress")[0]);
			student.setPermanentCity(parameters.get("permanentCity")[0]);
			student.setPermanentState(parameters.get("permanentState")[0]);
			student.setPermanentPinCode(parameters.get("permanentPinCode")[0]);
			
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
}
