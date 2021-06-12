using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

namespace P3B
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string con = "Data Source=NINAD\\SQLEXPRESS;Initial Catalog=Student;Integrated Security=True;Pooling=False";
            string sql = "Select * from MCA";
            SqlConnection scon = new SqlConnection(con);
            SqlCommand query = new SqlCommand(sql, scon);
            scon.Open();
            SqlDataAdapter sda = new SqlDataAdapter(query);
            DataSet ds = new DataSet();
            sda.Fill(ds);
            SqlDataReader dr = query.ExecuteReader();
            GridView1.DataSource = dr;
            GridView1.DataBind();
            GridView2.DataSource = ds;
            GridView2.DataBind();
            scon.Close();
        }
    }
}