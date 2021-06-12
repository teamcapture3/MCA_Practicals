using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {
            int day, month, year;
            if (int.TryParse(textBox1.Text, out month))
            {
                if (int.TryParse(textBox2.Text, out day))
                {
                    year = Convert.ToInt32(textBox3.Text);
                    int result = month * day;
                    if (result == year)
                    {
                        MessageBox.Show("This is a magic date");
                    }
                    else
                    {
                        MessageBox.Show("This is not a magic date");
                    }
                }
            }
        }
    }
}
