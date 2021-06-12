<html>
<head>
<title>Simple Dictionary</title>
</head>
<body>
<form action="dictionary.php">
                <select name="word">
                    <option>Happy</option>
                    <option>Sad</option>
                    <option>Remarkable</option>
					<option>Idea</option>
                </select>
	<input type="submit" value="submit" name="submit">
</form>
</body> 
</html>
<?php
if(isset($_GET["submit"])){

    $word = $_GET["word"];
    $dict = array(
"Happy"=>array("Delighted ","Pleased","Glad"),
"Sad"=>array("Unhappiness","Grief" ,"Sorrowful ","Mournful"),
"Remarkable"=>array("Conspicuously unusual", "Extra-ordinary"),
"Idea"=>array("Plan","Suggestion","Possible course of action")
);
                  function arr($arr, $dict)
	{
	echo "<b>".$arr." Means:</b><br>";
	foreach($dict[$arr] as $value)
	{
	echo $value;
	echo "<br>";
        	}
	}
	arr($word,$dict);
}
?>