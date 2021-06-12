<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="P4C.WebForm1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
<title>Online Grocery Shop</title>
<script type="text/javascript">
function popup() {
alert("Order placed successfully!");
}
</script>
</head>
<body>
<form id="form1" runat="server">
<div>
<table>
<tr>
<td>
<asp:Label ID="Label1" runat="server" Text="Enter your name"></asp:Label>
</td> <td>
<asp:TextBox ID="txtName" runat="server" AutoPostBack="True"></asp:TextBox>
</td> </tr> <tr> <td>
<asp:Label ID="Label2" runat="server" Text="Enter your mobile"></asp:Label>
</td> <td>
<asp:TextBox ID="txtMobile" runat="server" AutoPostBack="True"></asp:TextBox>
</td> </tr> <tr> <td>
<asp:Label ID="Label3" runat="server" Text="Enter your address"></asp:Label>
</td> <td>
<asp:TextBox ID="txtAddress" runat="server" TextMode="MultiLine"></asp:TextBox>
</td> </tr> <tr> <td>
<asp:Label ID="Label4" runat="server" Text="Select Category"></asp:Label>
</td> <td>
<asp:DropDownList ID="ddlCategory" runat="server" AutoPostBack="True">
<asp:ListItem>Select Category</asp:ListItem>
<asp:ListItem>Snacks</asp:ListItem>
<asp:ListItem>Staples</asp:ListItem>
<asp:ListItem>Foods</asp:ListItem>
<asp:ListItem>Beverages</asp:ListItem>
</asp:DropDownList>
</td> </tr> <tr> <td>
<asp:Label ID="Label5" runat="server" Text="Select Sub Category"></asp:Label> </td>
<td>
<asp:DropDownList ID="ddlSubCategory" runat="server" AutoPostBack="True">
<asp:ListItem>Select Sub Category</asp:ListItem>
<asp:ListItem>Chip</asp:ListItem>
<asp:ListItem>Daal</asp:ListItem>
<asp:ListItem>Noodles</asp:ListItem>
<asp:ListItem>Coke</asp:ListItem>
</asp:DropDownList>
</td>
<tr> <td>
<asp:Label ID="Label6" runat="server" Text="Enter Quantity"></asp:Label></td>
<td><asp:TextBox ID="txtQuantity" runat="server" TextMode="Number"></asp:TextBox></td>
</tr>
<tr> <td> </td> <td>
<asp:Button ID="Button1" runat="server" Text="Order" onclick="Button1_Click" PostBackUrl="~/order.aspx" />
</td> </tr>
</table>
</div>
</form>
</body>
</html>