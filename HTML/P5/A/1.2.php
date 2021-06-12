<?php
$list= array ("Rno,Name,Branch", "33,Ninad,MCA");
$file=fopen("reignz.csv","w");
foreach($list as $line)
{
fputcsv($file,explode(',',$line));
}
$file=fopen("reignz.csv","r");
while(!feof($file))
{
print_r(fgetcsv($file));
}
fclose($file);
?>
