using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace fileio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string name = @"E:\" + textBox1.Text;
            string[] lines = File.ReadAllLines(@name);
            if(lines.Length <= 10)
            {
                for(int i = 0;i < lines.Length;i++)
                {
                    richTextBox1.Text+=lines[i];
                }
                label3.Text = "Displaying complete file.";
            }
            else if(lines.Length>=10)
            {
                for(int i = 0;i < 10;i++)
                {
                    richTextBox1.Text += lines[i];
                }
                label3.Text = "Displaying only 10 lines from the file.";
            }
            richTextBox1.Visible = true;
            label3.Visible = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            richTextBox1.Clear();
        }
    }
}