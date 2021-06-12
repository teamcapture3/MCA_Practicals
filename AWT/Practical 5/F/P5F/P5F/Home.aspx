<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Home.aspx.cs" Inherits="P5F.Home" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="sideContent" runat="server">
<asp:AdRotator BorderWidth="1" ID="MyAds" runat="server" Width="200px" Height="510px" Style="text-align: center" DataSourceID="adsOnWebsite" />
<asp:XmlDataSource ID="adsOnWebsite" runat="server" DataFile="~/Advertisements.xml">
</asp:XmlDataSource>
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="mainContent" runat="server">
<p align="justify">
<b>Departments : </b>
<br />
<li><strong>AI and Data Science :</strong><br />
    Artificial Intelligence, known as AI, and Data Science as DS, has become the two 
    most important sought after technologies in today’s time. Artificial 
    Intelligence and Data Science is everywhere and there is almost an urgent need 
    to collect and preserve any data that is being generated. The department offers 
    Bachelor of Engineering (B.E) program affiliated to Mumbai University. <br /><br />
    <li><strong>Electronics Engineering :</strong><br />
    The field related to the study of electronic devices and circuits their and 
    their applications to solve real life problems effectively and efficiently. The 
    department offers Bachelor of Engineering (B.E) program affiliated to Mumbai 
    University. <br /><br />
    <li><strong>Computer Engineering :</strong><br />
    The department is committed towards imparting quality education and developing 
    future technocrats in the stream of computers. The department offers Bachelor of 
    Engineering (B.E) program affiliated to Mumbai University. <br /><br />
    <li><strong>Instrumentation Engineering :</strong><br />
    Field of Instrumentation is a rapidly expanding its boundaries to cater to the demanding applications.
    The scope of instrumentation has been further advanced by recent developments in field of MEMS and nanotechnology. <br /><br />
    <li><strong>Electronics and Telecommunication Engineering :</strong><br />
    The field is related to the application of electronics in the area to 
    telecommunications. It aims to improve the overall efficiency at the same time 
    reduce the cost associated with communication. The Department offers Bachelor of 
    Engineering (B.E) and Master of Engineering (M.E.) programs affiliated to Mumbai 
    University. <br /><br />
    <li><strong>Information Technology :</strong><br />
    With fast changing technology certain changes are essential. Considering these aspects,
    the Department of Information Technology aims at training the students to adapt themselves to the fast changing technology.
    The department offers Bachelor of Engineering (B.E) and Master of Engineering (M.E.) programs affiliated to Mumbai University. <br /><br />
    <li><strong>Masters in Computer Application :</strong><br />
    It is Three year Post-Graduate programme which focuses on advanced front line 
    technology in the domain of Computer Application along with the required 
    professional skill. MCA program is affiliated to the University of Mumbai.<br /><br />
    <strong>V. E. S. Institute of Technology is also a recognized Ph.D. Centre to the University of Mumbai for faculty of Technology in Electronics Engineering.</strong></p>
</asp:Content>
