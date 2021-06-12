<html>
<head>
</head>
<body>
<form method="post">
<label for="num">Enter a numbers to sort</label>
<input type="text" name="data" id="num"/>
<br>
</br>
<input type="submit" value="sort"/>
</form>
<?php
if(isset($_POST['data']))
{
$arr= $_POST['data'];
$num= explode(' ', $arr);
sort($num);
echo "<br>array in ascending order be like: ";
for($x=0;$x<count($num);$x++)
{
	echo $num[$x]." ";
}
echo "</br>";
rsort($num);
echo "<br>array in descending order be like: ";
for($x=0;$x<count($num);$x++)
{
	echo $num[$x]." ";
}
}
?>
