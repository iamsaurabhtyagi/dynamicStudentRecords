<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/CollectionMapping/form" method="get">
	
		Student Name:      <input type="text" name="studentName"><br><br>
		Father's Name:     <input type="text" name="fatherName" > <br><br>
		Mother's Name:     <input type="text" name="motherName" > <br><br>
		DOB:               <input type="text" name="dob" > <br><br>
		Department:        <input type="text" name="department" > <br><br>
		Branch:            <input type="text" name="branch" > <br><br>
		Year:              <input type="text" name="year" > <br><br>
		Semester:          <input type="text" name="semester" > <br><br>
		Local Address:     <input type="text" name="localAddress" > <br><br>
		Permanent Address: <input type="text" name="permanentAddress" > <br><br>  
		
		<input type="submit" name="studentDetail" value="SUBMIT">
		
	</form>
</body>
</html>