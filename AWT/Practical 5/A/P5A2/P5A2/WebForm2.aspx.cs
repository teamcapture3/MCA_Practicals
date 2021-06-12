using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace P5A2
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            try
            {
                string s = Request.Cookies["MyCookie"]["a"];
                string ss = Request.Cookies["MyCookie"]["b"];
                Response.Write("CookieUser : <b>" + s + "</b> <br/>CookiePassword : <b>" + ss + "</b><br/><br/>");
            }
            catch (Exception ex)
            {
                Response.Write("<script>alert('Cookies are empty !!')</script>");
            }
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            try
            {
                HttpCookie cookie = Request.Cookies["MyCookie"];
                cookie.Expires = DateTime.Now.AddMilliseconds(-10);
                Response.Cookies.Add(cookie);
            }
            catch (Exception ex)
            {
                Response.Write("<script>alert('Cookies already expired !!!!!!')</script>");
            }
        }
    }
}