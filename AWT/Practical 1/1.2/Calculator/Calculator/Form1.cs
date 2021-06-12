using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {
        Double n, n1;
        string output;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button1.Text;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button2.Text;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button3.Text;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button5.Text;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button6.Text;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button7.Text;
        }

        private void button9_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button9.Text;
        }

        private void button10_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button10.Text;
        }

        private void button11_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button11.Text;
        }

        private void button13_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button13.Text;
        }

        private void button17_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + button17.Text;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            n = Double.Parse(textBox1.Text);
            textBox1.Text = "";
            output = "+";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            n = Double.Parse(textBox1.Text);
            textBox1.Text = "";
            output = "-";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            n = Double.Parse(textBox1.Text);
            textBox1.Text = "";
            output = "*";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            n = Double.Parse(textBox1.Text);
            textBox1.Text = "";
            output = "/";
        }

        private void button14_Click(object sender, EventArgs e)
        {
            textBox1.Text = " ";
        }

        private void button15_Click(object sender, EventArgs e)
        {
            Double result;
            n1=Convert.ToDouble(textBox1.Text);

            if (output == "+")
            {
                result = (n + n1);
                textBox1.Text = Convert.ToString(result);
                n = result;
            }

            if (output == "-")
            {
                result = (n - n1);
                textBox1.Text = Convert.ToString(result);
                n = result;
            }

            if (output == "*")
            {
                result = (n * n1);
                textBox1.Text = Convert.ToString(result);
                n = result;
            }

            if (output == "/")
            {
                if (n == 0)
                {
                    textBox1.Text = "No";
                }
                else
                {
                    result = (n / n1);
                    textBox1.Text = Convert.ToString(result);
                    n = result;
                }
            }
        }

    }
}
