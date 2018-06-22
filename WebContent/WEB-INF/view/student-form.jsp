<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<br><br>
	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName"/>
		
		<br><br>
	
		Last name: <form:input path="lastName"/>
		
		<br><br>
		
		Country:
		<form:select path="country">
			<%-- <form:option value="Argentina" label="Argentina"/>
			<form:option value="India" label="India"/>
			<form:option value="Australia" label="Australia"/>
			<form:option value="US" label="US"/>  --%>
			
			<form:options items="${student.countryOptions}" />
			
		</form:select>
		
		<br><br>
		
		Favorite Language:
		C#<form:radiobutton path="favouriteLanguage" value="C#"/>
		PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
		C<form:radiobutton path="favouriteLanguage" value="C"/>
		Java<form:radiobutton path="favouriteLanguage" value="Java"/>
		
		<br><br>
		Operating Systems:
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Ubuntu<form:checkbox path="operatingSystems" value="Ubuntu"/>
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		Android<form:checkbox path="operatingSystems" value="Android"/>
		<br><br>
		
		<input type="submit" value="Submit"/>
	
	
	</form:form>

</body>
</html>