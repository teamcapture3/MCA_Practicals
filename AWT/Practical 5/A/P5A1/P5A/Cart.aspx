<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Cart.aspx.cs" Inherits="P5A.WebForm1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<title>Cart</title>
</head>
<body>
<form id="form1" runat="server">
<asp:Label ID="lblSelect" runat="server" Text="Select Product : "></asp:Label>
<asp:DropDownList ID="ddlProduct" runat="server" onselectedindexchanged="ddlProduct_SelectedIndexChanged">
<asp:ListItem Selected="True">Select Product</asp:ListItem>
<asp:ListItem Value="13500">Monitor</asp:ListItem>
<asp:ListItem Value="500">Keyboard</asp:ListItem>
<asp:ListItem Value="350">Mouse</asp:ListItem>
<asp:ListItem Value="4300">External Hard Disk</asp:ListItem>
<asp:ListItem Value="18000">Smartphone</asp:ListItem>
<asp:ListItem Value="25000">Smart TV</asp:ListItem>
</asp:DropDownList>
<asp:Button ID="btnAdd" runat="server" onclick="btnAdd_Click" Text="Add to Cart" />
<asp:Button ID="btnView" runat="server" Onclick="btnView_Click" Text="View Cart" />
</form>
</body>
</html>