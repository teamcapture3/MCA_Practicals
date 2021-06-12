<html>
<head>
<body>
<form method="POST">
<?php
if(isset($_POST['sub']))
{
	$x=$_POST['hidden'];
	$x=$x+1;
	echo "Counter Value is : ".$x;
}
else
{
	echo "Counter Value is : 0";
	$x=0;
}
?>
<input type="hidden" name="hidden" value="<?php echo $x;?>"><br>
<input type="submit" value="Submit" name="sub">
</form>
</body>
</html>
