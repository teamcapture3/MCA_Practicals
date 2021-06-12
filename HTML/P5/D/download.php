<?php
$filepath='Uploaded files/images.jpg';
if(file_exists($filepath))
{
	header('Content-Description:File Transfer');
	header('Content-Type:application/octet-stream');
	header ('Content-Dispostion:attachment; filename="'.basename($filepath).'"');
	header ('Expires:0');
	header('Cache-Control:must-revalidated');
	header('Progma:Public');
	header('Content-Length:'.filesize($filepath));
	flush();
	readfile($filepath);
	exit;
}
?>