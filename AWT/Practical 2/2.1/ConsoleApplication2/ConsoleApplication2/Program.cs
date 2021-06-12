using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace inheritance
{
    interface Manager
    {
        void McarAllow();
        void MBonus();
    }
    abstract class Emp : Manager
    {
        public Int32 eid,bonus,allowance;
        public String ename, edept;
        public Double ebasicSal;
        public virtual void EmpPutData()
        {
        }
        public virtual void EmpGetData()
        {
        }
        public void McarAllow()
        {
        }
        public void MBonus()
        {
        }
    }
    class A : Emp
    {
        const String Cname="1";
        static Int32 licenseno;
        public virtual void EmpPutData()
        {
            Console.WriteLine("Company Name : " + Program.Cname);
            Console.WriteLine("Licence No : " + Program.licenseno);
            Console.WriteLine("\nEnter Employee ID");
            eid = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Employee Name");
            ename = (Console.ReadLine());
            Console.WriteLine("Enter Employee Department");
            edept = (Console.ReadLine());
            Console.WriteLine("Enter Employee Basic Salary");
            ebasicSal = Convert.ToDouble(Console.ReadLine());
        }
        public virtual void EmpGetData()
        {
            Console.WriteLine("\nEmployee ID: " + eid);
            Console.WriteLine("Employee Name: " + ename);
            Console.WriteLine("Employee Department: " + edept);
            Console.WriteLine("Employee Basic Salary: " + ebasicSal);
        }
        public void mallow()
        {
            Console.WriteLine("Enter The Allowance");
            allowance = Convert.ToInt32(Console.ReadLine());
        }
        public void mbonus()
        {
            Console.WriteLine("Enter The Bonus");
            bonus = Convert.ToInt32(Console.ReadLine());
        }
        public void Mana()
        {
            Console.WriteLine("Emplyee Car Allowance is " + allowance);
            Console.WriteLine("Employee Bonus is " + bonus);
        }
    }
    public class Program
    {
        public const string Cname = "Oracle";
        public static string licenseno = "Oracle 2021";
        public static void Main(string[] args)
        {
            String cond; A a=new A();
            a.EmpPutData();
            Console.WriteLine("Are you a manager? (Yes/No)");
            cond = Console.ReadLine();
            if (cond == "Yes")
            {
                a.mallow();
                a.mbonus();
                a.EmpGetData();
                a.Mana();
                Console.ReadLine();
            }
            else
            {
                a.EmpGetData(); Console.ReadLine();
            }
        }
    }
}
