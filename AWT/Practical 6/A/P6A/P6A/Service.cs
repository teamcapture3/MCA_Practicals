using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace P6A
{
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    public class Service : System.Web.Services.WebService
    {
        public Service()
        {
            //InitializeComponent();
        }
        private static double balance = 60000;
        [WebMethod]
        public void Deposit(double amount)
        {
            balance += amount;
            setBalance(balance);
        }
        [WebMethod]
        public void Withdraw(double amount)
        {
            if (balance < amount)
                throw new Exception("Balance is not sufficient");
            else
            {
                balance -= amount;
                setBalance(balance);
            }
        }
        [WebMethod]
        public double getBalance()
        {
            return balance;
        }
        private void setBalance(double bal)
        {
            balance = bal;
        }
    }
}