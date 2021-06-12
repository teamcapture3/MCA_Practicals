<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="P4A.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Technical Event</title>
    <script language="javascript" type="text/javascript">
    function Reset1_onclick()
    {
        TextBox1.Value = "";
        TextBox2.Value = "";
        TextBox3.Text = "";
        TextBox4.Text = "";
        TextBox5.Text = "";
    }
    </script>
</head>
<body>
    <p>
        Online Registration Form</p>
        <form id="form2" runat="server">
        <div>
        <asp:Label ID="Label1" runat="server" Text="First Name :"></asp:Label>
        &nbsp;
        <input id="TextBox1" type="text" runat="server"/>
        <br /><br />
        <asp:Label ID="Label2" runat="server" Text="Last Name :"></asp:Label>
        &nbsp;
        <input id="TextBox2" type="text" runat="server"/>
        <br /><br />
        <asp:Label ID="Label3" runat="server" Text="Mobile No :"></asp:Label>
        &nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        &nbsp;
        <asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" ControlToValidate="TextBox3" ErrorMessage="Invalid Mobile Number" ValidationExpression="^[789]\d{9}$" ForeColor="Red"></asp:RegularExpressionValidator>
        &nbsp;&nbsp;
        <br /><br />
        <asp:Label ID="Label4" runat="server" Text="Email Id :"></asp:Label>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
        &nbsp;
        <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="TextBox4" ErrorMessage="Invalid Email Id" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*" ForeColor="Red"></asp:RegularExpressionValidator>
        <br /><br />
        <asp:Label ID="Label5" runat="server" Text="Branch :"></asp:Label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
        &nbsp;
        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="TextBox5" ErrorMessage="RequiredFieldValidator" ForeColor="Red"></asp:RequiredFieldValidator>
        <br /><br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Submit" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input id="Button2" type="reset" value="Reset" onclick="return Reset1_onclick()" />
        <br /><br />
        <asp:Label ID="Label6" runat="server" Text="Result here"></asp:Label>
        </div>
        </form>
</body>
</html>