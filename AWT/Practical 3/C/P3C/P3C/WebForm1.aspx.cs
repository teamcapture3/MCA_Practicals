using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;

namespace P3C
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            var data = getdata();
            var query = from Employee employee in data
                        where employee.Name == "Ninad"
                        select employee;
            GridView1.DataSource = query;
            GridView1.DataBind();

        }

        public ArrayList getdata()
        {
            ArrayList arrList = new ArrayList();
            arrList.Add(
                new Employee
                {
                    Name = "Ninad",
                    Department = "IT",
                    ID = "20133",
                    Salary = "50000"
                });
            arrList.Add(
                new Employee
                {
                    Name = "Arindam",
                    Department = "HR",
                    ID = "20131",
                    Salary = "30000"
                });
            arrList.Add(
                new Employee
                {
                    Name = "Sarath",
                    Department = "Sales",
                    ID = "20132",
                    Salary = "20000"
                });
            arrList.Add(
                new Employee
                {
                    Name = "Amit",
                    Department = "Marketing",
                    ID = "20134",
                    Salary = "250000"
                });

            return arrList;
        }
        public class Employee
        {
            public string Name { get; set; }
            public string Department { get; set; }
            public string ID { get; set; }
            public string Salary { get; set; }
        }
        protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}