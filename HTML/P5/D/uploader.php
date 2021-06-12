<?php
//PHP uploading File Script
	 $file_name=$_FILES['uploadFile']['name'];
	 $file_temp=$_FILES['uploadFile']['tmp_name'];
	 if(move_uploaded_file($file_temp,'Uploaded files/'.$file_name))
	 {
		 echo "File Uploaded Successfully";
	 }
	 else
	 {
		 echo "File is Not Uploaded";
	 }
	 ?>