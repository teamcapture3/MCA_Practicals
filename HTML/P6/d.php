<html><head>
<title>SQL insert program</title>
</head><body>
<center><form method="post">
<h1><font color="green">LOGIN FORM</font></h1>
Enter your username : <input type="text" name="fname"><br><br>
Enter your password : <input type="text" name="lname"><br><br>
<input type="submit" name="submit" value="Login"><br>
</form></center>
</body></html>
<?php
$con=mysqli_connect("localhost","root","") or die(mysqli_error());
$db=mysqli_select_db($con,'student');
$fname1=$lname1=$add=$age=$id=" ";
if(isset($_POST['submit']))
{
$fname1=$_POST['fname'];
$pass=$_POST['lname'];
$st="SELECT Fname,password FROM login WHERE Fname='$fname1' AND password='$pass' ";
$res=mysqli_query($con,$st);
$row=mysqli_fetch_assoc($res);
if($row["Fname"]==$fname1 && $row["password"]==$pass && (!empty($_POST['fname'])) && (!empty($_POST['fname'])))
{
echo "<center><b>Login Successful</b></center>";
}
else
{
echo "<center><b>There is a problem while login<br>".$st."<br>".$con->error."</b></center>";
}
}
?> 
