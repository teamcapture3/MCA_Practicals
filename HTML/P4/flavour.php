<html>
<head>
<title>Choose Flavours For Customizing IceCreams</title>
    </head>
    <body>
    <form method="get">
        Enter First Flaovur:<br><input type="text" name="flav1" id="fla2"><br>
        Enter Second Flaovur:<br><input type="text" name="flav2" id="fla3"><br>
        Enter Third Flaovur:<br><input type="text" name="flav3" id="fla4"><br>
        Enter Fourth Flaovur:<br><input type="text" name="flav4" id="fla4"><br>
        <input type="Submit" name="submit">
        </form>
    </body>
</html>
<?php
if(isset($_GET['submit']))
{
    $p1=$_GET['flav1'];
    $p2=$_GET['flav2'];
    $p3=$_GET['flav3'];
    $p4=$_GET['flav4'];
    $flavour=array();
    array_push($flavour,$p1,$p2,$p3,$p4);
    function sortflav($arr)
    {
        sort($arr);
        echo "<h4> The Flavour Are:</h4>";
        echo implode("<br>",$arr);
    }
    sortflav($flavour);
}
?>