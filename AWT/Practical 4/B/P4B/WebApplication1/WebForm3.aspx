<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm3.aspx.cs" Inherits="WebApplication1.WebForm3" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<script runat="server">
void Page_Load(object sender, EventArgs e)
{
    Profile.UserCount += 1;
}
void btnGetProfileValues_Click(object sender, EventArgs e)
{
    lblName.Text = Profile.Name;
    lblUserCount.Text = Profile.UserCount.ToString();
}
void btnSetName_Click(object sender, EventArgs e)
{
    Profile.Name = txtName.Text;
}
</script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Advanced Web Server Controls</title>
</head>
<body>
    <form id="form1" runat="server">
    <h3>Personalization Control Page</h3>
    <div>
    Name : <asp:TextBox runat="server" ID="txtName" />
    <asp:Button runat="server" ID="btnSetName"
      Text="Set Name" OnClick="btnSetName_Click" /><br />
    <br/><br/>

    <asp:Button runat="server" ID="btnGetProfileValues"
        Text="Get Profile Values"
        OnClick="btnGetProfileValues_Click" />
      <br/> <br />
    Profile Values: <br /><br />
      UserName: <asp:Label runat="server" ID="lblName"/>
      <br/>
      UserCount: <asp:Label runat="server" ID="lblUserCount"/>
    </div>
    </form>
</body>
</html>
