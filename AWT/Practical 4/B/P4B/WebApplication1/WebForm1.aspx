<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Advanced Web Server Controls</title>
</head>
<body>
    <form id="form1" runat="server">
    <h3>Navigation Control Page</h3>
    <div>
    
        <asp:TreeView ID="TreeView1" runat="server" 
            onselectednodechanged="TreeView1_SelectedNodeChanged" ShowLines="True">
            <Nodes>
                <asp:TreeNode Expanded="False" SelectAction="Expand" Text="Actions" 
                    Value="Actions">
                    <asp:TreeNode NavigateUrl="~/WebForm2.aspx" Text="Login" Value="Login">
                    </asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/WebForm3.aspx" Text="Personalization" Value="Personalization">
                    </asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/WebForm4.aspx" Text="Rich Control" Value="Rich Control">
                    </asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/WebForm5.aspx" Text="Data View & Data Source" 
                    Value="Data View & Data Source">
                    </asp:TreeNode>
                </asp:TreeNode>
            </Nodes>
        
        </asp:TreeView>
    
        <br />
    
    </div>
    </form>
</body>
</html>
