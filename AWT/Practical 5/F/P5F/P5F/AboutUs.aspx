<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="AboutUs.aspx.cs" Inherits="P5F.AboutUs" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="sideContent" runat="server">
    <asp:AdRotator BorderWidth="1"
ID="MyAds" runat="server" Width="200px"
Height="510px"
Style="text-align: center"
DataSourceID="adsOnWebsite" />
<asp:XmlDataSource ID="adsOnWebsite"
runat="server" DataFile="~/Advertisements.xml">
</asp:XmlDataSource>
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="mainContent" runat="server">
    <h2 align="center">ABOUT US</h2>
<hr />
<p align="justify">
Vivekanand Education Society was founded in 1959 by Shri. Hashu Advani, along with ten other members, who shared the dream of providing qualitative education to the youth of our country. In the beginning, Vivekanand Education Society
had a very modest launch, with just 256 students and six classrooms, in the humble barracks of Chembur Camp. But today, it proudly boast of having 3, 75, 000 sq. ft. land, housing 12 buildings and 28 Institutions, ranging from a crèche
to Ph.D. Centers. It has over 2000 teaching and non-teaching staff, and more than 18,000 students who pass through its hallowed portals each year.</p>
<p align="justify">
    <br />

Vivekanand Education Society’s Institute of Technology (VESIT) was established in 1984, with the aim of providing professional education in the field of Engineering. This institute is affiliated to the University of Mumbai and follows
the rules and regulations laid down by government, AICTE, and University for admission; 51% reserved for Sindhi Linguistic minority and 49% through CAP test. The management quota has been surrendered to DTE to make admission centralized.
The institute has a total of 189 faculties, of which 21 are Ph.D. holders and 29 faculty members are pursuing their Ph.D.
</p>
</asp:Content>
