using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication4
{
    public partial class Form1 : Form
    {
        String d, cd;
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            int age;
            d = textBox1.Text;
            cd = textBox2.Text;
            DateTime d1 = DateTime.ParseExact(d, "dd/mm/yyyy", null);
            DateTime cd1 = DateTime.ParseExact(cd, "dd/MM/yyyy", null);
            age = DateTime.Now.Year - d1.Year;
            DateTime now = DateTime.Now;
            if (d1.Month > now.Month)
            {
                label3.Text = "Your Current Age is: " + age + " years";
            }
            else
            {
                age = age - 1;
                label3.Text = "Your Current Age is: " + age + " years";    
            }
        }
    }
}
