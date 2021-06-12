using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Label1.Visible = false;
        }

        protected void Login1_Authenticate(object sender, AuthenticateEventArgs e)
        {
            if (Login1.UserName == "Ninad" && Login1.Password == "1234")
            { Label1.Visible = true; Label1.Text = "Logged in Successfully!!"; }
            else
            { Label1.Visible = true; Label1.Text = "Unsuccessful login"; }
        }
    }
}