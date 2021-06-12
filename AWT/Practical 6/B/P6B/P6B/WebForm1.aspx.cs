using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;
using P6B.ServiceReference1;
using System.Data;

namespace P6B
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        ServiceReference1.Service1Client client = new ServiceReference1.Service1Client();
        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.FetchData data = new ServiceReference1.FetchData();
            data = client.GetData();
            DataTable dt = new DataTable();
            dt = data.table;
            GridView1.DataSource = dt;
            GridView1.DataBind();
        }
    }
}