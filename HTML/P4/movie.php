<html>
<head>
	<title>Movie Program</title>
</head>
<body>
	<form method="post">
	Enter Movie Name:<input type="text" name="M_name">
	<select name="choice">
		<option value="delete">Delete The Movie</option>
		<option value="year">Display Realising date</option>
		<option value="desc">Movie Name in descending order</option>
		
	</select><br><br>
	<input type="submit" name="submit" value="Submit"><br><br>
	</form>
	<?php
		$movies_name= array('Dark Phoenix' =>2019 , 'The Avengers'=>2012, 'Deadpool'=>2016,'The Wolverine'=>2013,'Spider-Man'=>2002,'Avengers: Endgame'=>2019);
		if(isset($_POST["submit"]))
		{
			$choice=$_POST["choice"];
			$Mo_name=$_POST["M_name"];
			switch ($choice)
			 {
				case 'delete':
				if(array_key_exists($Mo_name,$movies_name))
				{
					unset($movies_name[$Mo_name]); 
					echo "Movie " .$Mo_name. "  Deleted succesfully <br>";
					foreach ($movies_name as $key => $value) 
				{
					echo $key."<br>";
				}
				}
				else 
				{
					echo $Mo_name." Movie is not Present in the Array ";
				}
					break;
				case 'year':

					if(array_key_exists($Mo_name,$movies_name))
				{
					echo $Mo_name."is released on ".$movies_name[$Mo_name];
				}
				else 
				{
					echo $Mo_name." Movie is not Present in the Array ";	# code...
				}
				    break;
				case 'desc':
				arsort($movies_name);
				foreach ($movies_name as $key => $value) 
				{
					echo $key."<br>";
				}
					break;		
				default:
					break;
			}
		}
	?>
</body>
</html>