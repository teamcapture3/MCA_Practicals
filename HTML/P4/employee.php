<html>
<head>
<title>Employee Salary</title>
</head>
<body>
<form method="POST">
<h1>Enter Your Details Below</h1>
Enter Your ID : <input type="text" name="id" placeholder="Enter ID"><br><br>
Enter Years Of Experience : <input type="text" placeholder="Enter Experience" name="exp"><br><br>
Enter Average Salary : <input type="text" placeholder="Average Salary" name="sal"><br><br>
Employement Status: <select name="status">
<option name="employeed">Employeed</option>
<option name="unemployeed">Unemployeed</option>
</select><br><br>
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
<?php
if(isset($_POST['submit']))
{
$ddl=$_POST['status'];
if($ddl=="Employeed")
{
$salary=$_POST['sal'];
$cal=$salary*12;
echo '<label>Your Total Salary Earned Over The Years Is : </label>'.$cal;

}
else
{
echo 'You Are Not Employeed';
}
}
?>