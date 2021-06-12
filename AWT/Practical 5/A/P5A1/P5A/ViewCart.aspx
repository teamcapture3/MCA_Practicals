<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ViewCart.aspx.cs" Inherits="P5A.ViewCart" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<title>View Cart</title>
</head>
<body>
<form id="form1" runat="server">
<asp:HyperLink ID="hlBack" runat="server" ForeColor="Blue" NavigateUrl="~/Cart.aspx">Go Back</asp:HyperLink>
<br />
<asp:Label ID="lblYourCartProducts" runat="server" Text="Your Cart Products : "></asp:Label>
<br />
<asp:ListBox ID="lbCart" runat="server" Rows="5"></asp:ListBox>
<asp:Button ID="btnRemove" runat="server" onclick="btnRemove_Click" Text="Remove Selected Product" />
<asp:Button ID="btnEmptyCart" runat="server" onclick="btnEmptyCart_Click" Text="Empty Cart" />
<br />
<asp:Label ID="lblCount" runat="server"></asp:Label>
</form>
</body>
</html>
