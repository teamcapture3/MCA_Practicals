<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="P5D2.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <title>JQUERY and Database Connectivity</title>
</head>
<script type="text/javascript">
    $(document).ready(function () {
        $.ajax({
            url: 'WebService1.asmx/GetAllEmployee',
            dataType: "json",
            method: 'post',
            success: function (data) {
                var employeeTable = $('#tblEmployee tbody');
                employeeTable.empty();
                $(data).each(function (index, emp) {
                    employeeTable.append('<tr><td>' + emp.EmpId + '</td><td>'
                            + emp.EmpName + '</td><td>' + emp.EmpSal + '</td><td>' + emp.EmpJob
                            + '</td><td>' + emp.EmpDeptNo + '</td></tr>');
                });
            },
            error: function (err) {
                alert(err);
            }
        });
    });  
    </script>  
<body>
    <form id="form1" runat="server">
        <div class="container">  
            <h3 class="text-uppercase text-center">Employee Details</h3>  
            <table id="tblEmployee" class="table table-bordered">  
                <thead class="bg-dark text-white">  
                    <tr>  
                        <th>Employee ID</th>
                        <th>Employee Name</th>
                        <th>Employee Salary</th>
                        <th>Employee Job</th>
                        <th>Employee DeptNo</th>
                    </tr>  
                </thead>  
                <tbody></tbody>  
            </table>  
        </div>  
    </form>  
</body>  
</html>
