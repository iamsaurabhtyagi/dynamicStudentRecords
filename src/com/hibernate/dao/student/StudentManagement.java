package com.hibernate.dao.student;

import java.util.HashMap;
import java.util.Map;


public class StudentManagement {

	public static void listStudentRecord() {
		
		
	}
	public static void addRequest(Map<String, String[]> parameters) {
		
		AddStudentRecord obj=new AddStudentRecord();
		
		obj.add(parameters);
	}
	public static void updateStudentRecord() {
		
		
	}
	public static void deleteStudentRecord() {
		
		
	}
	
	public static void main(String[] args){
		
		Map<String, String[]> parameters=new HashMap<String, String[]>();
		parameters.put("studentName", new String[]{"ABC"});
		parameters.put("fatherName", new String[]{"XYZ"});
		parameters.put("motherName", new String[]{"ABCXYZ"});
		parameters.put("dob", new String[]{"123456"});
		parameters.put("gender", new String[]{"Male"});
		parameters.put("maritalStatus", new String[]{"Single"});
		
		parameters.put("course", new String[]{"MCA"});
		parameters.put("branch", new String[]{"MCA"});
		parameters.put("year", new String[]{"2010"});
		parameters.put("semester", new String[]{"1"});
		
		parameters.put("emailID", new String[]{"iamsaurabhtyagi@gmail.com"});
		parameters.put("mobile", new String[]{"7837769606"});
		
		parameters.put("localAddress", new String[]{"GZB"});
		parameters.put("localCity", new String[]{"GZB"});
		parameters.put("localState", new String[]{"UP"});
		parameters.put("localPinCode", new String[]{"123456"});
		
		parameters.put("permanentAddress", new String[]{"Bijnor"});
		parameters.put("permanentCity", new String[]{"Nehtaure"});
		parameters.put("permanentState", new String[]{"UP"});
		parameters.put("permanentPinCode", new String[]{"246733"});
		
		StudentManagement.addRequest(parameters);
	}

}
