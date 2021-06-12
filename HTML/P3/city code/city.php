<html>
<body>
<form>
<h2>Select Country:</h2>
<select name="country">
<option value="IND">India</option>
<option value="AUS">Australia</option>
<option value="USA">United States</option>
</select>
<input type="submit" value="Submit" name="submit">
</form>

<?php
if(isset($_GET["submit"]))
{
    $country = $_GET["country"];
    $countryArr = array(
                    "IND" => array("Maharashtra","Karnataka","Kerala","Jammu and Kashmir","Goa","Uttar Pradesh"),
                    "AUS" => array("New South Wales", "Victoria", "Tasmania","Western Australia","Queensland"),
                    "USA" => array("Florida", "Alabama", "California","Hawaii","Washington D.C","Texas"),
                );
                  function arr($arr, $countryArr)
{
	echo "<b>".$arr."</b><br>";
	foreach($countryArr[$arr] as $value)
	{
	echo $value;
	echo "<br>";
        	}
	}
	arr($country,$countryArr);
}
?>
</body>
</html>
