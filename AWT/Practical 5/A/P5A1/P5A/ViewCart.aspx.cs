using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;

namespace P5A
{
    public partial class ViewCart : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["cart"] == null)
                lblCount.Text = "Cart is Empty...";
            else
            {
                ArrayList arr = (ArrayList)Session["cart"];
                if (arr.Count > 0)
                {
                    lblCount.Text = "Cart has " + arr.Count + " products";
                    for (int i = 0; i < arr.Count; i++)
                        lbCart.Items.Add(arr[i].ToString());
                }
                else
                    lblCount.Text = "Cart is Empty...";
            }
        }
        protected void btnEmptyCart_Click(object sender, EventArgs e)
        {
            ArrayList arr = new ArrayList();
            Session["cart"] = arr;
            Response.Redirect("ViewCart.aspx");
        }
        protected void btnRemove_Click(object sender, EventArgs e)
        {
            ArrayList arr = new ArrayList();
            if (Session["cart"] != null)
            {
                arr = (ArrayList)Session["cart"];
                arr.Remove(lbCart.SelectedItem.Text);
                lbCart.Items.Remove(lbCart.SelectedItem.Text);
                Session["cart"] = arr;
                Response.Redirect("ViewCart.aspx");
            }
            else
                lblCount.Text = "Cart is Empty...";
        }
    }
}