using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Collections;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        ArrayList arr;
        public Form1()
        {
            InitializeComponent();
            textBox1.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            arr = new ArrayList();
            arr.Add("Hyundai");
            arr.Add("Renualt");
            arr.Add("Kia");
            arr.Add("Toyata");
            arr.Add("Maruti Suzuki");
            arr.Add("Tata");
            arr.Add("Honda");
            arr.Add("Mahindra");
            arr.Add("Audi");
            arr.Add("BMW");
            listBox1.DataSource = null;
            listBox1.DataSource = arr;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Visible = true;
            int c = 0;
            foreach (string a in listBox1.Items)
            {
                c++;
                if (a == textBox1.Text) { MessageBox.Show(a + " found at index " + c); }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            listBox1.DataSource = null;
            arr.Sort();
            listBox1.DataSource = arr;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Visible = false;
            listBox1.DataSource = null;
            arr.Clear();
            listBox1.DataSource = arr;
        }
    }
}
