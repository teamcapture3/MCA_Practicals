using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace P6A
{
    public partial class Account : System.Web.UI.Page
    {
        double amount = 0.00;
        Service bank;
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            bank = new Service();
            Label2.Text = "Available Balance = Rs " + bank.getBalance().ToString();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            bank = new Service();
            amount = Convert.ToDouble(TextBox1.Text);
            bank.Deposit(amount);
            Label2.Text = "Rs " + amount + " Successfully deposited";
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            bank = new Service();
            amount = Convert.ToDouble(TextBox1.Text);
            bank.Withdraw(amount);
            Label2.Text = "Rs " + amount + " Successfully withdrawn";
        }
    }
}