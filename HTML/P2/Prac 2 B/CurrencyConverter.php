<html>
<head>
 <title>Currency Converter</title>
</head>
 
<body>

<form action="CurrencyConverter.php" method="post">
<h2>Currency Converter</h2><hr>
<p style="font-size: 20px;">
		Enter Amount:<input type="text" name="amount"><br><br>
From:<select name='cur1'>
	 <option value="AUD">Australian Dollor(AUD)</option>
	 <option value="USD" selected>US Dollar(USD)</option>
	 </select>
To:<select name='cur2'>
	 <option value="INR" selected >Indian Rupee(INR)</option>
	 <option value="JPY">Japanese Yen(JPY)</option>
	 <option value="PHP">Philippine Peso(PHP)</option>
	
	</select>
	</p>
<input type='submit' name='submit' value="Convert" style="font-size: 20px;"></center>
</form>

 <?php

	if(isset($_POST['submit']))
	{
		function calc()
		{
		$amount = $_POST['amount'];
		$cur1 = $_POST['cur1'];
		$cur2 = $_POST['cur2'];
 
		if($cur1=="AUD" AND $cur2=="JPY")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo "<u>".$amount*82.463."</u>";
		}
 
		if($cur1=="AUD" AND $cur2=="INR")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo "<u>".$amount* 51.09."</u>";
		}
	 
		if($cur1=="AUD" AND $cur2=="PHP")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo "<u>".$amount* 37.15."</u>";
		}
	 
		if($cur1=="USD" AND $cur2=="JPY")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo "<u>".$amount* 109.49."</u>";
		}
		 
		if($cur1=="USD" AND $cur2=="INR")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo "<u>".$amount* 67.83."</u>";
		}
	 
		if($cur1=="USD" AND $cur2=="PHP")
		{
			echo "<b>Your Converted Amount is:</b><br>";
			echo $amount*49.32."";
		}
	 	}calc(); 
	}
 
?>
 
</body>
</html>