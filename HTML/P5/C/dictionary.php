<!DOCTYPE html>
<html>
<head>
	<title>dictionary</title>
</head>
<body>

	<H2>Word Dictionary Finder</H2>

	<form method="post">

		Enter a word <input type="text" name="word" >
		<input type="submit" name="search" value="Search the Word">

	</form>

	<?php

	if(isset($_POST['search']))
	{
	$name = $_POST['word'];
	$w="";
	$n="";
	$flag=0;

	$file = file("word.txt");
	foreach ($file as $val) 
	{
		list($word,$mean) = explode("=",$val);
		if($word==$name)
		{
			$w=$word;
			$n=$mean;
			$flag=1;
			break;
		}
	}
	if($flag)
	{
		echo "<br>Meaning of the word is: $n";
	}
	else
	{
		echo "<br>Meaning not found";
	}

	}

	?>


</body>
</html>