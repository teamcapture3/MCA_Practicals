using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication2
{
    public partial class Form1 : Form
    {
        int ex;
        public Form1()
        {
            InitializeComponent();
        }

        public class square_rootException : Exception
        {
            public square_rootException()
            {
                MessageBox.Show("Cannot Find the Square Root of a negative number");
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double num = double.Parse(textBox1.Text);
            try
            {
                if (num < 0)
                {
                    throw new square_rootException();
                }
                else
                {
                    double sq = Math.Sqrt(num);
                    textBox2.Text = sq.ToString();
                }
            }
            catch (square_rootException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        private void textBox2_TextChanged(object sender, EventArgs e)
        {
        }
    }
}
