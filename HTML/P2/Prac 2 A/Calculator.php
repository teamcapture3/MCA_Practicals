<html>
	<head>
		<title>Calculator</title>
	</head>
	<body>
	<form method="post" action="Calculator.php">
		<table cellspacing=5 cellpadding=5>
			<tr>
				<td>Enter First number : </td>
				<td><input type="text" name="num1"></td></hr>
			</tr>
			<tr>
				<td>Enter second number : </td>
				<td><input type="text" name="num2"></td></hr>
			</tr>
			<tr>
				<td>Select your choice : </td>
				<td>
					<input type="radio" name="calc"  value="1" checked="true">+
					&emsp;<input type="radio" name="calc"  value="2">-
					&emsp;<input type="radio" name="calc" value="3">*
					&emsp;<input type="radio" name="calc"  value="4"> /
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="calc1" value="Submit"></td>
			</tr>
		</table>
	</form>
	</body>
</html>
<?php
if(isset($_POST['calc1']))
{
	
	function calculate()
	{
	$x = $_POST['num1'];
	$y = $_POST['num2'];
	$op = $_POST['calc'];
	if(is_numeric($x) && is_numeric($y))
	{
		
		if($op != "")
		{
			switch($op)
			{
				case '1':
					echo "Addition : ".($x+$y);
					break;
				case '2' :
					echo "Subtraction : ".($x-$y);
					break;
				case '3' :
					echo "Multiplication : ".($x*$y);
					break;
				case '4' :
					echo "Division : ".($x/$y);
					break;
				default :
					echo "Wrong choice";
			}
		}
		else
		{
			echo "<script>alert('Please select an operation');</script>";
		}
	
	
	}
	
		else
		{
			echo "<script>alert('Please enter number values');</script>";
		}
	}
	calculate();
}
?>