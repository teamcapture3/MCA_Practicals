<%-- 
    Document   : calcjsp
    Created on : 14 Sep, 2021, 4:24:47 PM
    Author     : ninad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Operations</title>
    </head>
    <body>
        <form action="calcservlet" method="POST">
            <h1> Arithmetic Operations</h1><br>
            Enter First Number: 
            <input type="text" name="number1"><br><br><br>
            Enter Second Number: 
            <input type="text" name="number2"><br><br><br>
            Operation Type: <select name="operation">
                <option value="addition">Addition
                <option value="subtraction">Subtraction
                <option value="multiplication">Multiplication
                <option value="division">Division
                <option value="modulo">Modulo
            </select>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>
