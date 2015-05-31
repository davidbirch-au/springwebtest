<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AAL Web tester</title>
</head>
<body>

<h1>Calculator</h1>

Current Calculator value : [${currentValue}] <br>
Operation history : [${operationHistory}]

<br><br>
New operation:
<br>
<form name="calculator" action="./calculatorAction" method="GET">

	Value : <input type="text" name="value" size="10"/> 
	
	Operation : <select name="operation">
			  <option value="ADD">Add</option>
			  <option value="SUBTRACT">Subtract</option>
			  <option value="CLEAR">Clear</option>			  
			</select>

	<input type="submit"/>

</form>

</body>
</html>