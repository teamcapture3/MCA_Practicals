using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;

namespace P5A
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
        }
        protected void ddlProduct_SelectedIndexChanged(object sender, EventArgs e)
        {
        }
        protected void btnAdd_Click(object sender, EventArgs e)
        {
            if (ddlProduct.SelectedIndex > 0)
            {
                ArrayList arr = new ArrayList();
                if (Session["cart"] != null)
                {
                    arr = (ArrayList)Session["cart"];
                    if (arr.Count > 4)
                        Response.Write("<script>alert('You can add only 5 items in cart')</script>");
                    else
                    {
                        arr.Add(ddlProduct.SelectedItem.Text);
                        Session["cart"] = arr;
                    }
                }
                else
                {
                    arr.Add(ddlProduct.SelectedItem.Text);
                    Session["cart"] = arr;
                }
            }
        }
        protected void btnView_Click(object sender, EventArgs e)
        {
            Response.Redirect("ViewCart.aspx");
        }
    }
}