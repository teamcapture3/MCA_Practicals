using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Bank
{    
    public partial class Form1 : Form
    {
        int balance = 0;
        int a;     

        public Form1()
        {
            InitializeComponent();
            label3.Visible = false;
            label4.Visible = false;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            label3.Visible = false;
            label4.Visible = false;
            try
            {
                a = Convert.ToInt32(textBox2.Text);
                if (textBox1.Text == "8097230640" && a >= 100)
                {
                    balance = balance + a;
                    label4.Text = Convert.ToString(balance);
                    MessageBox.Show("Successfully deposited amount into the bank");
                }
                else
                {
                    MessageBox.Show("Wrong A/C No entered or amount is less than 100");
                }
            }
            catch(Exception)
            {
                MessageBox.Show("Please enter numeric values only");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label3.Visible = false;
            label4.Visible = false;
            try
            {
                try
                {
                    a = Convert.ToInt32(textBox2.Text);
                }
                catch (Exception) { MessageBox.Show("Please enter numeric values"); }
                if (textBox1.Text == "8097230640" && a%100==0)
                {                    
                    if((balance-a)<100) 
                    {
                        throw (new MINBALException("Current balance will be less than 100. \nHence transaction cannot be performed."));
                    }
                    else
                    {
                        balance = balance - a;
                        label4.Text = Convert.ToString(balance);
                        MessageBox.Show("Successfully withdrawn from banks");
                    }
                }
                else
                {
                    MessageBox.Show("Wrong A/C No entered or amount is not a multiple of 100");
                }                
            }
            catch (MINBALException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                long x = Convert.ToInt64(textBox1.Text);
                if (x == 8097230640)
                {
                    label3.Visible = true;
                    label4.Visible = true;
                }
                else {
                    label3.Visible = false;
                    label4.Visible = false;
                    MessageBox.Show("Entered account does not exist"); 
                }
            }
            catch (Exception)
            {
                label3.Visible = false;
                label4.Visible = false; 
                MessageBox.Show("Please enter numeric values");
            }
        }
    }    
}

public class MINBALException : Exception
{
    public MINBALException(string message)
        : base(message)
    {
    }
}