<html>
<head>
<title>SQL insert program</title>
</head>
<body>
<center>
<h1>SQL Insert Operation</h1>
<form method="post">
Enter your first name : <input type="text" name="fname"><br><br>
Enter your last name : <input type="text" name="lname"><br><br>
Enter your class [FY/SY/TY] : <input type="text" name="class"><br><br>
Enter your age : <input type="text" name="age"><br><br>
Enter your marks : <input type="text" name="marks"><br><br>
<input type="submit" name="submit"><br>
</form>
</center>
</body>
</html>
<?php
$con=mysqli_connect("localhost","root","") or die(mysqli_error());
$db=mysqli_select_db($con,'student');
if(isset($_POST['submit']))
{
$fname=$_POST['fname'];
$lname=$_POST['lname'];
$class=$_POST['class'];
$age=$_POST['age'];
$marks=$_POST['marks'];
$st="INSERT INTO student(Fname,Lname,Class,Age,Marks) VALUES ('$fname','$lname','$class','$age','$marks')";
$res=mysqli_query($con,$st);
if($res)
{
echo "<center>Below Data Added Successfully</center><br>";
echo "<center>First name is <b>".$fname."</b></center>";
echo "<center>Last name is <b>".$lname."</b></center>";
echo "<center>Class is <b>".$class."</b></center>";
echo "<center>Age is <b>".$age."</b></center>";
echo "<center>Marks is <b>".$marks."</b></center>";
}
else
{echo "<center>There is a problem while inserting Data in database</center>";}
}
?>
