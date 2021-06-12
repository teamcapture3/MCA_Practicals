<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Contact.aspx.cs" Inherits="P5F.Contact" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="sideContent" runat="server">
    <asp:AdRotator BorderWidth="1" ID="MyAds" runat="server" Width="200px" Height="510px" Style="text-align: center" DataSourceID="adsOnWebsite" />
<asp:XmlDataSource ID="adsOnWebsite" runat="server" DataFile="~/Advertisements.xml">
</asp:XmlDataSource>
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="mainContent" runat="server">
    <h2 align="center">
CONTACT US</h2>
<hr />
<p align="center">
<b>Vivekanand Education Society’s Institute of Technology</b><br />
<br />
<b>Address:</b> Hashu Advani Memorial Complex,<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Collector’s Colony,Chembur,<br />
&nbsp;&nbsp;
Mumbai – 400 074. India.<br />
<br />
<b>Tel.:</b> +91-22-61532510 / 27 (Admission)<br />
<br />
<b>Fax:</b> +91-22-61532555
<br />
<br />
<b>Email:</b> <a href="mailto:vesit@ves.ac.in">vesit@ves.ac.in</a><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="mailto:vesit.admission@ves.ac.in">vesit.admission@ves.ac.in</a><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="mailto:vesit.website@ves.ac.in">vesit.website@ves.ac.in</a></p>
</asp:Content>
