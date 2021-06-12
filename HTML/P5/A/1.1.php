<?php
$file="reignz.txt";
$write=" ,Today Is A Beautiful Day.";
file_put_contents($file,$write,FILE_APPEND);
$document=file_get_contents($file);
$line=explode("\n",$document); 
foreach($line as $newline)
{
echo $newline."<br>";
}
?>
