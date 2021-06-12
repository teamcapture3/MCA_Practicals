using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Image i = Image.FromFile("C:\\Users\\Ninad\\Documents\\Visual Studio 2010\\Projects\\WindowsFormsApplication6\\marvel.jpg");
            pictureBox1.Image = i;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            progressBar1.Minimum = 0;
            progressBar1.Maximum = 200;

            for (int i = 0; i <= 80; i++)
            {
                progressBar1.Value = i;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            TreeNode node = treeView1.Nodes.Add("first", "Marvel Cinematic Universe");
            TreeNode subnode1 = node.Nodes.Add("second", "Marvel Movies");
            TreeNode subnode2 = node.Nodes.Add("third", "Marvel Webseries");
            subnode1.Nodes.Add("CA", "Captain America - Civil War");
            subnode1.Nodes.Add("IRON", "Iron Man 3");
            subnode1.Nodes.Add("AV", "Avengers: End Game");
            subnode2.Nodes.Add("WV", "Wanda Vision");
            subnode2.Nodes.Add("LOKI", "Loki");
            subnode2.Nodes.Add("FW", "The Falcon And The Winter Soldier");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label2.Visible = true;
            label2.Text = dateTimePicker1.Text;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = null;
            progressBar1.Value = 0;
            treeView1.Nodes.Clear();
            label2.Visible = false;
        }
    }
}
