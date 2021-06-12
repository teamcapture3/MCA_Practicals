using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace P4C
{
    public partial class order : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (PreviousPage != null && PreviousPage.IsCrossPagePostBack)
            {
                TextBox txtName = (TextBox)PreviousPage.FindControl("txtName");
                Label1.Text = "Your Name is: " + txtName.Text;
                TextBox txtMobile = (TextBox)PreviousPage.FindControl("txtMobile");
                Label2.Text = "Your mobile no is: " + txtMobile.Text;
                TextBox txtAddress = (TextBox)PreviousPage.FindControl("txtAddress");
                Label3.Text = "Your Address is: " + txtAddress.Text;
                DropDownList ddlCategory = (DropDownList)PreviousPage.FindControl("ddlCategory");
                Label4.Text = "Category is: " + ddlCategory.Text;
                DropDownList ddlSubCategory = (DropDownList)PreviousPage.FindControl("ddlSubCategory");
                Label5.Text = "Sub Category is: " + ddlSubCategory.Text;
                TextBox txtQuantity = (TextBox)PreviousPage.FindControl("txtQuantity");
                Label6.Text = "Ordered quantity is: " + txtQuantity.Text;
            }
        }
    }
}