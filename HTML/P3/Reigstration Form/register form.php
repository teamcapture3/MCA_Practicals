<html>
<head>REGISTRATION FORM<br><br>
<body>
<form method="POST">
NAME:<input type="text" name="fname"><br><br>
CONTACT NUMBER:<input type="tel" id="phone" name="phone"><br><br>
ADDRESS:<textarea name="add" placeholder="Enter Address"></textarea><br><br>
E-mail: <input type="email" name="e"><br><br>
GENDER:	<input type="radio" name="g" value="Male"> Male
		<input type="radio" name="g" value="Female"> Female
		<input type="radio" name="g" value="Other"> Other<br><br>
		<input type="submit" name="submit">
</form>
<?php

if(isset($_POST["submit"]))
{
	$name=$_POST['fname'];
	if(empty($_POST["fname"])) 
	{
		echo "Enter Your Full Name.<br>";
    }
	else
	{
		echo $name."<br>";
    }
	$cont=$_POST['phone'];
	if(!preg_match('/^[0-9]{10}$/', $_POST['phone']))
    {
		echo 'Invalid Phone Number.<br>';
    }
	else
	{
		echo $cont."<br>";
	}
	$add=$_POST['add'];
	if(empty($_POST["add"]))
	{
        echo "Enter Your Address.<br>";
    }
	else
	{
		echo $add."<br>";
    }
	$mail=$_POST['e'];
	if(filter_var($mail, FILTER_VALIDATE_EMAIL))
	{
		echo $mail;
	}
	else
	{
		echo ("Invalid Email Address.<br>");
	}
	if(empty($_POST["g"]))
	{
		echo "Select Your Gender.<br>";
	}
	else
	{
		echo "<br>";
		echo $_POST['g'];
	}
}
?>
</body>
</html>
