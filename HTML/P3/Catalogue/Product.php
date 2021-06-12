<html>
<head>
<title>Product Details</title>
</head>
<body>
<form method="post">
<h1>Product Catalog Sorting</h1>
<h2>Electronics</h2>
Product 1: <input type="text" name="product1"><br><br>
Product 2: <input type="text" name="product2"><br><br>
Product 3: <input type="text" name="product3"><br><br>
<br>
<h2>Home Essentials</h2>
Product 1: <input type="text" name="product4"><br><br>
Product 2: <input type="text" name="product5"><br><br>
Product 3: <input type="text" name="product6"><br><br>
<br>
<h2>Clothing</h2>
Product 1: <input type="text" name="product7"><br><br>
Product 2: <input type="text" name="product8"><br><br>
Product 3: <input type="text" name="product9"><br><br>
<br>
<input type="submit" name="submit">
</form>
</body>
</html>
<?php
$p1=$_POST["product1"];
$p2=$_POST["product2"];
$p3=$_POST["product3"];
$p4=$_POST["product4"];
$p5=$_POST["product5"];
$p6=$_POST["product6"];
$p7=$_POST["product7"];
$p8=$_POST["product8"];
$p9=$_POST["product9"];
$electronics=array();
array_push($electronics,$p1,$p2,$p3);
sort($electronics);
$he=array();
array_push($he,$p4,$p5,$p6);
sort($he);
$clothing=array();
array_push($clothing,$p7,$p8,$p9);
sort($clothing);
if(isset($_POST['submit']))
{
	foreach($electronics as $value)
	{
		echo"$value<br>";
	}
	echo "<br>";
	foreach($he as $value)
	{
		echo"$value<br>";
	}
	echo "<br>";
	foreach($clothing as $value)
	{
		echo"$value<br>";
	}
	echo "<br>";
}
?>