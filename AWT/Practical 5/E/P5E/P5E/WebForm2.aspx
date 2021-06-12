<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="P5E.WebForm2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
<h3>Displaying rainbow colors every half a second</h3>
    <form id="form1" runat="server">
    <div>
    <asp:ScriptManager ID="ScriptManager1" runat="server"/>
    <asp:Timer ID="Timer1" Interval="500" runat="server"/>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
    <Triggers>
    <asp:AsyncPostBackTrigger ControlID="Timer1" EventName="Tick" />
    </Triggers>
    <ContentTemplate>
    <asp:AdRotator ID="AdRotator1" runat="server" AdvertisementFile="XMLFile2.xml" />
    </ContentTemplate>
    </asp:UpdatePanel>
    </div>
    </form>
</body>
</html>
