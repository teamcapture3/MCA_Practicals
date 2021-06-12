<html>
<head>
<title>SQL insert program</title>
</head>
<body>
<center>
<form method="post">
<h1><font color="green">REGISTRATION FORM</font></h1>
Enter your first name : <input type="text" name="fname"><br><br>
Enter your last name : <input type="text" name="lname"><br><br>
Enter your address : <input type="textarea" name="ta"><br><br>
Enter your age : <input type="text" name="age"><br><br>
Enter your email-id : <input type="text" name="eid"><br><br>
<input type="submit" name="submit"><br><br>
</form>
</center>
</body>
</html>
<?php
$con=mysqli_connect("localhost","root","") or die(mysqli_error());
$db=mysqli_select_db($con,'student');
$fname1=$lname1=$add=$age=$id=" ";
if(isset($_POST['submit']))
{
if(empty($_POST['fname']))
{
echo "<center><b>First name is mandatory!!!</b></center>";
}
if(empty($_POST['lname']))
{
echo "<center><b>Last name is mandatory!!!</b></center>";
}
if(empty($_POST['ta']))
{
echo "<center><b>Address is mandatory!!!</b></center>";
}
if(empty($_POST['age']))
{
echo "<center><b>Age is mandatory!!!</b></center>";
}
if(empty($_POST['eid']))
{
echo "<center><b>Email id is mandatory!!!</b></center>";
}
if(!filter_var($_POST['eid'],FILTER_VALIDATE_EMAIL))
{
echo "<center><b>Invalid mail format</b></center>";
}
$fname1=$_POST['fname'];
$lname1=$_POST['lname'];
$add=$_POST['ta'];
$age=$_POST['age'];
$id=$_POST['eid'];
$st="INSERT INTO registration(Fname,Lname,Address,Age,EmailId) VALUES ('$fname1','$lname1','$add','$age','$id')";
$res=mysqli_query($con,$st);
if(($con->query($st)==TRUE) && (!empty($_POST['fname'])) && (!empty($_POST['lname'])) && (!empty($_POST['ta'])) && (!empty($_POST['age'])) && (!empty($_POST['eid'])) && (filter_var($_POST['eid'],FILTER_VALIDATE_EMAIL)))
{
echo "<center><b>You Registered Successfully</b></center>";
}
else
{
echo "<center><b>There is a problem while inserting data in database<br>".$con->error."</b></center>";
}
}
?>
