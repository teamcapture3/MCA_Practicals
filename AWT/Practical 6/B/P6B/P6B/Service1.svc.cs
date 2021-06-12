using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Data.SqlClient;
using System.Data;

namespace P6B
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    public class Service1 : IService1
    {
        public FetchData GetData()
        {
            FetchData data = new FetchData();
            SqlConnection con = new SqlConnection(@"Data Source=NINAD\SQLEXPRESS;Initial Catalog=student;Integrated Security=True");
            con.Open();
            SqlCommand cmd = new SqlCommand("Select * from EMP", con);
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable("mytab");
            da.Fill(dt);
            data.table = dt;
            return data;
        }
    }
}
