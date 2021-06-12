<html>
<head><title>String Manipulation</title></head>
<body>
	<form method="post">
		Enter The First String :<input type="text" name="f_name"><br>
		Enter the Second String :<input type="text" name="s_name"><br>
		Select the Choice:
		<select name="choice">
			<option value="le">Length</option>
			<option value="concat">Concatenation</option>
			<option value="comp">Comparison</option>
			<option value="plndm">Palindrome</option>
		</select><br><input type="submit" name="submit" value="Submit">
	</form>
	<?php
	function length_cal($str_one)
		{
			$s = $str_one;
			$i=0;
			while(@$s[$i] !='') 
			{
			$i++;
			}
			print $i;
		}
		function concate($str_one,$str_tow)
		{
			echo "$str_one"."$str_tow";
		}
		function compare($str_one,$str_tow)
		{
			if($str_one==$str_tow)
			{
				echo "Both strings are same";
			}
			else
			{
				echo "Both strings are not same";
			}
		}
		function palindrome($str_one)
		{
			$s = $str_one;
			$i=0;
			while (@$s[$i] !='') 
			{
				$i++;
			}
			$strlength=$i;
			$reversed_string='';
			for ($i=$strlength; $i>-1 ; $i--)
			{ 
				$reversed_string.=@$s[$i];
			}
			if($s==$reversed_string)
			{
				echo "String is Palindrome";
			}
			else
			{
				echo "String is not a Palindrome";
			}
		}
		if(isset($_POST["submit"]))
		{
			$str_one=$_POST["f_name"];
			$str_tow=$_POST["s_name"];
			$selection=$_POST["choice"];
			switch ($selection) 
		{	
			case 'le':
			length_cal($str_one);
			break;
			case 'concat':
		    concate($str_one,$str_tow);
			break;
			case 'comp':
			compare($str_one,$str_tow);
			break;
			case 'plndm':
			palindrome($str_one);
			break;
			default:
			echo "select valid chioce";
			break;
		}
	}
?>
</body>
</html>