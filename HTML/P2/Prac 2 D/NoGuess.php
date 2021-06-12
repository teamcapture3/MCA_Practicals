<head>
<title>Number Guessing game</title>
</head>
<body>
<form method="post" name="No">
Number Between 1 to 10
<input type="text" name="val" > <br>

<input Type="submit" name="sub">
</form>
</body>
</html>

<?php
   
if(isset($_POST['sub']))
{
    function guess()
    {
    $num=$_POST['val'];
    $x=rand(1,10);

    if($num==$x)
{
echo "You won!!";
}
else
{
echo "Try Again Later!!";
}
}
guess();
}
?>