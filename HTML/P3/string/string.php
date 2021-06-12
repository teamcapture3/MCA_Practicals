<!DOCTYPE html>
<html>
<head>
<title>String Manipulation</title>
</head>
<body>
<form method="POST">
Enter the First String:<input type="text" name="string1"><br>
Enter the Second String:<input type="text" name="string2"><br>
Select your Choice:<select name="list">
<option value="len">Length</option>
<option value="con">Concatenation</option>
<option value="comp">Comparison</option>
<option value="paline">Palindrome</option>
</select>
<br><input type="submit" value="Submit">
</form>
<?php
$stringone=$_POST["string1"];
$stringtwo=$_POST["string2"];
$choices=$_POST["list"];

switch($choices)
{
	case 'con':
	$con=$stringone.$stringtwo;
	echo "New string &nbsp;&nbsp;".$con;
	break;
	case 'len':
	$firststrlen=strlen($stringone);
	$secondstrlen=strlen($stringtwo);
	echo "Length of first string is ".$firststrlen." and the value of second string is ".$secondstrlen;
	break;
	case 'comp':
	compareString($stringone,$stringtwo);
	break;
	case 'paline':
	palinedrome($stringone);
	break;
	default:
	break;
}
function compareString($stringone,$stringtwo)
	{
	if($stringone == $stringtwo)
		{
			echo"Both are equal.";
		}
		else
		{
			echo"Both are not equal";
		}
}
function palinedrome($takeStringone)
{
	if(strrev($takeStringone)==$takeStringone)
	{
		echo "String is palindrome";
	}
	else
	{
		echo"<br>String is not palindrome";
	}
}
?>
</body>
</html>