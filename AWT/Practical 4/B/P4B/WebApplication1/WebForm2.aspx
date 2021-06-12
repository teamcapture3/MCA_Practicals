<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="WebApplication1.WebForm2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Advanced Web Server Controls</title>
</head>
<body>
    <form id="form1" runat="server">
    <h3>Login and Security Control Page</h3>
    <div>
    
        <asp:Login ID="Login1" runat="server" onauthenticate="Login1_Authenticate" 
            BackColor="#F7F6F3" BorderColor="#E6E2D8" BorderPadding="4" BorderStyle="Solid" 
            BorderWidth="1px" FailureText="" Font-Names="Verdana" Font-Size="0.8em" 
            ForeColor="#333333" Height="122px" RememberMeText="Remember Me" Width="332px">
            <InstructionTextStyle Font-Italic="True" ForeColor="Black" />
            <LoginButtonStyle BackColor="#FFFBFF" BorderColor="#CCCCCC" BorderStyle="Solid" 
                BorderWidth="1px" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#284775" />
            <TextBoxStyle Font-Size="0.8em" />
            <TitleTextStyle BackColor="#5D7B9D" Font-Bold="True" Font-Size="0.9em" 
                ForeColor="White" />
        </asp:Login>
        <br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="Show result"></asp:Label>
    
    </div>
    </form>
</body>
</html>
