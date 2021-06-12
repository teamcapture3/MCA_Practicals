<?php
$num=$_GET["q"];
for($i=1;$i<=10;$i++)
{
$res=$num*$i;
echo $num."X".$i."=".$res."</br>";
}
?>
