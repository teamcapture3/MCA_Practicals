<html>
<head><title>Database programs</title></head>
<body>
<center>
<form method='post'>
<h1>Student database aggregate functions</h1><br>
<b>Choose any of the following options from dropdown list</b><br><br>
<select name="ddl1">
<option name="Sum Of Marks">Sum Of Marks</option>
<option name="Average Of Marks">Average Of Marks</option>
<option name="Count Of Marks">Count Of Marks</option>
<option name="Maximum Marks">Maximum Marks</option>
<option name="Minimum Marks">Minimum Marks</option>
<option name="COUNT(DISTINCT)">Distinct Count Of Marks</option>
</select>
<input type="submit" name="submit">
</form>
<?php
$con=mysqli_connect("localhost","root","") or die(mysqli_error());
$db=mysqli_select_db($con,'student');
if (isset($_POST['submit'])) {
$ddl2=$_POST['ddl1'];
if ($ddl2=='Sum Of Marks') {
$st="SELECT SUM(Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Sum of marks is "."<b>".$value[0]."</b>";
}
if ($ddl2=='Average Of Marks') {
$st="SELECT AVG(Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Average of marks is "."<b>".$value[0]."</b>";
}
if ($ddl2=='Count Of Marks') {
$st="SELECT COUNT(Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Count of marks is "."<b>".$value[0]."</b>";
}
if ($ddl2=="Maximum Marks") {
$st="SELECT MAX(Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Maximum mark is "."<b>".$value[0]."</b>";
}
if ($ddl2=="Minimum Marks") {
$st="SELECT MIN(Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Minimum mark is "."<b>".$value[0]."</b>";
}
if ($ddl2=="Distinct Count Of Marks") {
$st="SELECT COUNT(DISTINCT Marks) FROM student_table";
$res=mysqli_query($con,$st);
$value=mysqli_fetch_array($res);
echo "Count of distinct marks is "."<b>".$value[0]."</b>";
}
}
?>
</center>
</body>
</html>
