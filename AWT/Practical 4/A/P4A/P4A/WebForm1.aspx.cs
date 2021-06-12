using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace P4A
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Label6.Visible = false;
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (TextBox1.Value != "" && TextBox2.Value != "" && TextBox3.Text != "" && TextBox4.Text != "" && TextBox5.Text != "")
            {
                Label6.Text = "Data Submitted Successfully";
                Label6.Visible = true;
                TextBox1.Value = TextBox2.Value = TextBox3.Text = TextBox4.Text = TextBox5.Text = "";
            }
        }
    }
}